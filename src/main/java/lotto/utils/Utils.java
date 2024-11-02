package lotto.utils;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static String[] winningNumberSpliter(String inputWinningNumber){
        return inputWinningNumber.split(",");
    }

    public static List<Integer> changeWinningNumberStringToInteger(String[] winningNumberString){
        List<Integer> winningNumbers = new ArrayList<>();
        for (String winningNumber : winningNumberString) {
            try{
                winningNumbers.add(Integer.valueOf(winningNumber));
            }catch (NumberFormatException e){
                throw new IllegalArgumentException("[ERROR] 당첨 번호는 숫자만 가능합니다. 입력 형식을 확인해 주세요");
            }
        }

        return winningNumbers;
    }
}
