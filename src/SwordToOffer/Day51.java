package SwordToOffer;

public class Day51 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
            int length = matrix.length;
            int width = matrix[0].length;
            int i=length-1;
            int j=width-1;
            while (i>=0){
                int temp = matrix[i][j];
                if(temp>target){
                    int left=0;
                    int right = width-1;
                    while (left<=right)
                    {
                        int mid = (left+right)/2;
                        if(matrix[i][mid]>target){
                            right = mid-1;
                        }
                        else if(matrix[i][mid]<target){
                            left=mid+1;
                        }
                        else{
                            return true;
                        }
                    }
                    i--;
                }
                else if(temp<target){
                    return false;
                }
                else
                {
                    return true;
                }
            }

            return  false;
    }
}
