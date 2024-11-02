package lotto.model;

import java.util.ArrayList;
import java.util.List;
import lotto.Lotto;

public class LottoManger {
    private final Money money;
    private final List<Lotto> lottos;
    private final WinningLotto winningLotto;

    public LottoManger(Money money, List<Lotto> lottos, WinningLotto winningLotto) {
        this.money = money;
        this.lottos = lottos;
        this.winningLotto = winningLotto;
    }

    public List<LottoRank> checkLottoResult(){
        List<LottoRank> lottoRanks = new ArrayList<>();
        for (Lotto lotto : lottos) {
            LottoRank lottoRank = checkLottoRank(lotto);
            lottoRanks.add(lottoRank);
        }
        return lottoRanks;
    }

    private LottoRank checkLottoRank(Lotto lotto) {
        List<Integer> lottoNumbers = lotto.getNumbers();

        Integer lottoMachingNumber = 0;
        Boolean bonusNumberMaching = Boolean.FALSE;

        for (Integer lottoNumber : lottoNumbers) {
            if(winningLotto.getWinningLotto().contains(lottoNumber)){
                lottoMachingNumber += 1;
            }

            if(winningLotto.getBonusNumber().equals(lottoNumber)){
                bonusNumberMaching = Boolean.TRUE;
            }
        }

        return LottoRank.valueOf(lottoMachingNumber, bonusNumberMaching);
    }

    public Double calculateRateOfReturn(Integer totalIncome){
        return ((double)totalIncome / (money.getMoney()))* 100;
    }
}
