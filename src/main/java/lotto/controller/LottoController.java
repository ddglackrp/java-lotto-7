package lotto.controller;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lotto.Lotto;
import lotto.dto.LottoResponse;
import lotto.dto.LottoResultResponse;
import lotto.model.BonusNumber;
import lotto.model.LottoManger;
import lotto.model.LottoRank;
import lotto.model.LottoResult;
import lotto.model.Money;
import lotto.model.WinningLotto;
import lotto.utils.LottoGenerator;
import lotto.utils.Utils;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {

    public void run(){
        OutputView.priceOutPutView();
        String inputPrice = InputView.inputPrice();
        ControllerValidation.inputPriceValidation(inputPrice);

        Money money = new Money(Integer.valueOf(inputPrice));
        OutputView.purchaseCountOutPutView(money.getBuyLottoCount());

        List<Lotto> lottos = LottoGenerator.lottoGenerator(money.getBuyLottoCount());

        List<LottoResponse> lottoResponses = lottos.stream()
                .map(LottoResponse::from)
                .collect(Collectors.toList());
        OutputView.purchaseLottos(lottoResponses);

        OutputView.winningNumberOutPutView();
        String inputWinningNumber = InputView.inputWinningNumber();
        String[] splitedWinningNumber = Utils.winningNumberSpliter(inputWinningNumber);
        List<Integer> winningNumbers = Utils.changeWinningNumberStringToInteger(splitedWinningNumber);
        Lotto lotto = new Lotto(winningNumbers);

        OutputView.pleaseInputBonusNumber();
        String inputBonusNumber = InputView.inputBonusNumber();
        ControllerValidation.inputBonusNumberValidation(inputBonusNumber);
        BonusNumber bonusNumber = new BonusNumber(Integer.valueOf(inputBonusNumber));

        WinningLotto winningLotto = new WinningLotto(lotto, bonusNumber);
        LottoManger lottoManger = new LottoManger(money, lottos, winningLotto);
        List<LottoRank> lottoRanks = lottoManger.checkLottoResult();
        LottoResult lottoResult = new LottoResult(lottoRanks);
        OutputView.lottoResult(LottoResultResponse.from(lottoResult));

        OutputView.totalReturnOfRate(lottoManger.calculateRateOfReturn(lottoResult.calculateTotalIncome()));
    }
}
