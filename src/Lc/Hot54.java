package Lc;

import java.util.ArrayList;
import java.util.List;

public class Hot54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int leftBound = 0;
        int rightBound = matrix[0].length-1;
        int upBound = 0;
        int downBound = matrix.length-1;
        int row = 0;
        int col = 0;
        while (rightBound - leftBound + 1 > 0 && downBound - upBound + 1 > 0) {
            //----->>>>>>
            while (col <= rightBound) {

                result.add(matrix[row][col]);
                col++;
            }
            col--;
            if(row+1>downBound){
                break;
            }
            row++;
            //    down
            while (row <= downBound) {
                result.add(matrix[row][col]);
                row++;
            }
            row--;
            if (col - 1 < leftBound) {
                break;
            }
            col--;
            //<<<<<-------
            while (col >= leftBound) {
                result.add(matrix[row][col]);
                col--;
            }
            col++;
            if (row - 1 <=upBound) {
                break;
            }
            row--;
            //up
            while (row > upBound) {
                result.add(matrix[row][col]);
                row--;
            }
            row++;
            col++;
            //  update boundary
            leftBound++;
            rightBound--;
            upBound++;
            downBound--;
        }
        return  result;
    }
}
