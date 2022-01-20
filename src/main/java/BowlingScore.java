public class BowlingScore {
    public int getScore(String gameDetail) {
        int totalScore = 0;
        char[] rolls = gameDetail.toCharArray();

        for (char roll : rolls)
        {
            if (Character.isDigit(roll))
            {
                totalScore += Character.getNumericValue(roll);
            }
        }
        return totalScore;
    }
}
