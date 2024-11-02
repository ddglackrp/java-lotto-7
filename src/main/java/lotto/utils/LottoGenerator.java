package lotto.utils;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import lotto.Lotto;

public class LottoGenerator{
    public static List<Lotto> lottoGenerator(Integer lottoAmount){
        List<Lotto> lottos = new ArrayList<>();
        for(int i = 0; i<lottoAmount; i++){
            List<Integer> lottoNumber = lottoNumberGenerator();
            Lotto lotto = new Lotto(lottoNumber);
            lottos.add(lotto);
        }
        return lottos;
    }

    private static List<Integer> lottoNumberGenerator(){
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }
}
