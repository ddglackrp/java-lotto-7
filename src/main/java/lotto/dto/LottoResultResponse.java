package lotto.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lotto.model.LottoRank;
import lotto.model.LottoResult;

public record LottoResultResponse(
        List<String> lottoResultResponse
)
{
    public static LottoResultResponse from(LottoResult lottoResult){
        Map<LottoRank, Integer> lottoRanks = lottoResult.getLottoResults();
        List<String> lottoResultResponse = new ArrayList<>();

        String fifth = LottoRank.FIFTH.getDescription() + " - " + lottoRanks.get(LottoRank.FIFTH);
        String fourth = LottoRank.FOURTH.getDescription() + " - " + lottoRanks.get(LottoRank.FOURTH);
        String third = LottoRank.THIRD.getDescription() + " - " + lottoRanks.get(LottoRank.THIRD);
        String second = LottoRank.SECOND.getDescription() + " - " + lottoRanks.get(LottoRank.SECOND);
        String first = LottoRank.FIRST.getDescription() + " - " + lottoRanks.get(LottoRank.FIRST);

        lottoResultResponse.add(fifth);
        lottoResultResponse.add(fourth);
        lottoResultResponse.add(third);
        lottoResultResponse.add(second);
        lottoResultResponse.add(first);

        return new LottoResultResponse(lottoResultResponse);
    }
}
