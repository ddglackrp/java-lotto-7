package lotto.view;

import java.util.List;
import lotto.dto.LottoResponse;
import lotto.dto.LottoResultResponse;

public class OutputView {

    public static void priceOutPutView(){
        System.out.println("구입금액을 입력해 주세요.");
    }

    public static void purchaseCountOutPutView(Integer purchaseCount){
        System.out.printf("\n%d개를 구매했습니다.\n", purchaseCount);
    }

    public static void purchaseLottos(List<LottoResponse> lottos){
        for (LottoResponse lotto : lottos) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(String.join(", ", lotto.lottoNumberResponse()));
            sb.append("]");
            System.out.println(sb);
        }
        System.out.println();
    }

    public static void winningNumberOutPutView(){
        System.out.println("당첨 번호를 입력해 주세요.");
    }

    public static void pleaseInputBonusNumber(){
        System.out.println("보너스 번호를 입력해 주세요.");
    }

    public static void lottoResult(LottoResultResponse lottoResultResponse){
        System.out.println();
        System.out.println("당첨 통계");
        System.out.println("---");
        for (String lottoResult : lottoResultResponse.lottoResultResponse()) {
            System.out.println(lottoResult);
        }
    }

    public static void totalReturnOfRate(Double rate){
        System.out.printf("총 수익률은 %.1f%%입니다.", rate);

    }
}
