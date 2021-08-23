package SwordToOffer;

import java.util.Arrays;

public class Day52 {
    //这题思路和那个二分查找缺失数字一样的。。。一个升序数组+另一个升序数组，，查找第二个数组的开始下标
    public int minArray(int[] numbers) {
            int i=0;
            int j=numbers.length-1;
            while (i<j){
                int mid = (i+j)/2;
                if(numbers[mid]<numbers[j]){
                    j = mid;
                }
                else if(numbers[mid]>numbers[j]){
                    i = mid+1;
                }
                else{
                    j=j-1;
                }

            }
        return  numbers[j];
    }
}
