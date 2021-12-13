package Lc;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class Hot48 {
    public void rotate(int[][] matrix) {
        for (int cycle = 0; cycle <= matrix.length / 2; cycle++) {
            for (int col = cycle; col < matrix[0].length-1-cycle; col++) {
                int tmp = matrix[cycle][col];
                int length = matrix.length-1;
                matrix[cycle][col] = matrix[length - col][cycle];
                matrix[length - col][cycle] = matrix[length-cycle][length - col];
                matrix[length-cycle][length - col] = matrix[col][length-cycle];
                matrix[col][length-cycle] = tmp;
            }
        }

        }
    }

