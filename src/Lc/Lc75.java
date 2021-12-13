package Lc;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lc75 {
    // 000 111 2222222    202110
    public void sortColors(int[] nums) {
        int redNumber = 0;
        int whiteNumber = 0;
        int blueNumber = 0;
        for (int num : nums) {
            if (num == 0) {
                redNumber++;
            } else if (num == 1) {
                whiteNumber++;
            }else {
                blueNumber++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i <= redNumber - 1) {
                if (nums[i] != 0) {
                    for (int j = redNumber; j < nums.length; j++) {
                        if (nums[j] == 0) {
                            nums[i] = nums[j] ^ nums[i];
                            nums[j] = nums[i] ^ nums[j];
                            nums[i] = nums[j] ^ nums[i];
                        }
                    }
                }
            } else if (i >= redNumber && i < redNumber + whiteNumber) {
                if (nums[i] != 1) {
                    for (int j = redNumber + whiteNumber; j < nums.length; j++) {
                        if (nums[j] == 1) {
                            nums[i] = nums[j] ^ nums[i];
                            nums[j] = nums[i] ^ nums[j];
                            nums[i] = nums[j] ^ nums[i];
                        }
                    }
                }
            }
        }
        return;
    }
}
