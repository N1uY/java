package SwordToOffer;

public class Day221 {
    public int[] singleNumbers(int[] nums) {
        int[] rel = new int[2];
        int r = 0;
        for(int num:nums){
            r ^= num;
    }
        int i=0;
        int m = 1;
        while ((r&(1<<i))==0){
            m = m<<1;
            i++;
        }
        int relNumber1 = 0;
        int relNumber2 = 0;
        for(int nu:nums){
            if((nu&m)==0){
                relNumber1 ^=nu;
            }
            else{
                relNumber2 ^=nu;
            }
        }
        rel[0] = relNumber1;
        rel[1] = relNumber2;
        return  rel;
}
}
