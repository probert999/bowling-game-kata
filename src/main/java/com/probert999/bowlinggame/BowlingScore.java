package com.probert999.bowlinggame;

public class BowlingScore {

  private static final int MAX_FRAMES = 10;
  private static final int MAX_FRAME_SCORE = 10;
  private static final char STRIKE = 'X';
  private static final char SPARE = '/';

  public static int getScore(String gameDetail) {

    char[] rolls = gameDetail.replaceAll(" ", "").toCharArray();
    int[] rollValues = new int[rolls.length];

    int rollIndex = 0;
    for (char roll : rolls)
    {
      if (Character.isDigit(roll))
      {
        rollValues[rollIndex] = Character.getNumericValue(roll);
      } else
      {
        switch (roll)
        {
          case STRIKE:
          {
              rollValues[rollIndex] = MAX_FRAME_SCORE; break;
          }
          case SPARE:
          {
              rollValues[rollIndex] = MAX_FRAME_SCORE - rollValues[rollIndex - 1]; break;
          }
          default:
          {
              rollValues[rollIndex] = 0;
          }
        }

      }
      rollIndex++;
    }

    int totalScore = 0;
    rollIndex = 0;

    for (int frame = 1; frame <= MAX_FRAMES; frame++) {

      if (rollValues[rollIndex] == MAX_FRAME_SCORE) {
        totalScore += MAX_FRAME_SCORE + rollValues[rollIndex + 1] + rollValues[rollIndex + 2];
        rollIndex++;
      }
      else if (rollValues[rollIndex] + rollValues[rollIndex + 1] == MAX_FRAME_SCORE) {
        totalScore += MAX_FRAME_SCORE + rollValues[rollIndex + 2];
        rollIndex += 2;
      }
      else {
        totalScore += rollValues[rollIndex] + rollValues[rollIndex + 1];
        rollIndex += 2;
      }
    }
    return totalScore;
  }
}
