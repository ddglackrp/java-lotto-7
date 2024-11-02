package lotto.model;

public enum LottoRank {
    FIRST(6, false, 2_000_000_000, "6개 일치 (2,000,000,000원)"),
    SECOND(5, true, 30_000_000, "5개 일치, 보너스 볼 일치 (30,000,000원)"),
    THIRD(5, false, 1_500_000, "5개 일치 (1,500,000원)"),
    FOURTH(4, false, 50_000, "4개 일치 (50,000원)"),
    FIFTH(3, false, 5_000, "3개 일치 (5,000원)"),
    NONE(0, false, 0, "당첨되지 않음");

    private final int matchingCount;
    private final boolean bonusNumberMatching;
    private final int prize;
    private final String description;

    LottoRank(int matchingCount, boolean bonusNumberMatching, int prize, String description) {
        this.matchingCount = matchingCount;
        this.bonusNumberMatching = bonusNumberMatching;
        this.prize = prize;
        this.description = description;
    }

    public int getPrize() {
        return prize;
    }

    public String getDescription() {
        return description;
    }

    public static LottoRank valueOf(int matchingCount, boolean matchBonus) {
        for (LottoRank rank : values()) {
            if (rank.matchingCount == matchingCount && rank.bonusNumberMatching == matchBonus) {
                return rank;
            }
        }
        return NONE;
    }
}
