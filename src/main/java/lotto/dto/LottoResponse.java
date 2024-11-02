package lotto.dto;

import java.util.List;
import java.util.stream.Collectors;
import lotto.Lotto;

public record LottoResponse(
        List<String> lottoNumberResponse
) {
    public static LottoResponse from(Lotto lotto){
        List<String> stringLottoNumber = lotto.getNumbers().stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        return new LottoResponse(stringLottoNumber);
    }
}
