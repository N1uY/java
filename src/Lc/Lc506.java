package Lc;

import java.util.Arrays;
import java.util.HashMap;

public class Lc506 {

    public String[] findRelativeRanks(int[] score) {
        int[] sortedScore = score.clone();
        Arrays.sort(sortedScore);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int scoreIndex = 0; scoreIndex < score.length; scoreIndex++) {
            hashMap.put(score[scoreIndex], scoreIndex);
        }
        String[] result = new String[score.length];
        for (int sortedScoreIndex = 0; sortedScoreIndex < sortedScore.length; sortedScoreIndex++) {
            if (sortedScore.length - sortedScoreIndex == 1) {
                result[hashMap.get(sortedScore[sortedScoreIndex])] = "Gold Medal";
            } else if (sortedScore.length - sortedScoreIndex == 2) {
                result[hashMap.get(sortedScore[sortedScoreIndex])] = "Silver Medal";
            } else if (sortedScore.length - sortedScoreIndex == 3) {
                result[hashMap.get(sortedScore[sortedScoreIndex])] = "Bronze Medal";
            } else {
                result[hashMap.get(sortedScore[sortedScoreIndex])] = String.valueOf(sortedScore.length - sortedScoreIndex);
            }

        }
        return result;
    }
}
