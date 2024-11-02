package lotto.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoResult {

    private final Map<LottoRank, Integer> lottoResults = new HashMap<>();

    public LottoResult(List<LottoRank> lottoRanks) {
        lottoResultsInitialize();
        lottoResultSetUp(lottoRanks);
    }

    private void lottoResultsInitialize(){
        lottoResults.put(LottoRank.NONE, 0);
        lottoResults.put(LottoRank.FIFTH, 0);
        lottoResults.put(LottoRank.FOURTH, 0);
        lottoResults.put(LottoRank.THIRD, 0);
        lottoResults.put(LottoRank.SECOND, 0);
        lottoResults.put(LottoRank.FIRST, 0);
    }

    private void lottoResultSetUp(List<LottoRank> lottoRanks){
        for (LottoRank lottoRank : lottoRanks) {
            increaseLottoResultCount(lottoRank);
        }
    }

    private void increaseLottoResultCount(LottoRank lottoRank){
        Integer lottoResultCount = lottoResults.get(lottoRank);
        lottoResults.replace(lottoRank, lottoResultCount+1);
    }

    public Map<LottoRank, Integer> getLottoResults() {
        return Map.copyOf(lottoResults);
    }

    public Integer calculateTotalIncome(){
        Integer totalIncome = 0;

        for (LottoRank lottoRank : lottoResults.keySet()) {
            totalIncome += lottoResults.get(lottoRank) * lottoRank.getPrize();
        }

        return totalIncome;
    }
}
