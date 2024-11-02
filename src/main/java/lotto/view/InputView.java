package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String inputPrice(){
        return consoleInput();
    }

    public static String inputWinningNumber(){
        return consoleInput();
    }

    public static String inputBonusNumber(){
        return consoleInput();
    }

    private static String consoleInput(){
        return Console.readLine();
    }
}
