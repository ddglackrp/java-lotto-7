package lotto.controller;

public class ControllerValidation {

    public static void inputPriceValidation(String inputPrice){
        try{
            Integer price = Integer.valueOf(inputPrice);
            if(price < 0){
                throw new IllegalArgumentException("[ERROR] 구입 금액은 양의 정수여야 합니다.");
            }
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("[ERROR] 구입 금액은 양의 정수여야 합니다.");
        }
    }

    public static void inputBonusNumberValidation(String inputBonusNumber){
        try{
            Integer bonusNumber = Integer.valueOf(inputBonusNumber);
            if(bonusNumber < 0){
                throw new IllegalArgumentException("[ERROR] 보너스 번호는 양의 정수여야 합니다.");
            }
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("[ERROR] 보너스 번호는 양의 정수여야 합니다.");
        }
    }
}
