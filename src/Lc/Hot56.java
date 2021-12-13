package Lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Hot56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        List<int[]> result = new ArrayList<>();
        for (int intervalsIndex = 0; intervalsIndex < intervals.length; intervalsIndex++) {
            if (intervals[intervalsIndex][0] == -1) {
                continue;
            } else {
                for (int arrayToCombineIndex = intervalsIndex + 1; arrayToCombineIndex < intervals.length; arrayToCombineIndex++) {
                    if (intervals[arrayToCombineIndex][0] >= intervals[intervalsIndex][0] && intervals[arrayToCombineIndex][0] <= intervals[intervalsIndex][1]) {
                        intervals[intervalsIndex][1]=Math.max(intervals[intervalsIndex][1],intervals[arrayToCombineIndex][1]);
                        intervals[arrayToCombineIndex][0]=-1;
                    }
                }
                result.add(intervals[intervalsIndex]);
            }
        }
        return  result.toArray(new int[result.size()][]);
    }

}
