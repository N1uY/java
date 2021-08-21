package SwordToOffer;

public class Day42 {
    //stupid method
    public int search(int[] nums, int target) {
            int count = 0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]<target){
                    continue;
                }
                else if(nums[i]==target)
                {
                    count++;
                }
                else if(nums[i]==(target+1))
                {
                    break;
                }
            }
            return  count;
    }
    //二分法查找最后一个出现的target,然后向前找即可。。。。下为二分查找最后一个target的函数
    static  int Dividesearch(int[] nums, int target) {
            int n = nums.length;
            int l = 0;
            int r = n-1;
            while (l<r){
                int mid = (l+r+1)/2; ///这里加1的作用是为了l+r除2然后向上取整，在区间上表现为除二得奇数时向右取点
                if(nums[mid]<=target){
                    l = mid;
                }
                else {
                    r = mid-1;
                }

            }
            return  r;
    }
    static  int bettersearch(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        //查找最后一个target
        while(l<r){
            int mid = (l+r+1)/2;
            if(nums[mid]<=target){
                l=mid;
            }
            else
            {
                r = mid-1;
            }
        }
        int b = r;
        if(nums[b]!=target){
            return 0;
        }
        l=0;
        r=b;
        while (l<r){
            int mid = (l+r)/2;
            if(nums[mid]>=target){
                r = mid;
            }
            else {
                l = mid+1;
            }
        }
        int a = l;
        return b-a+1;
    }
    public static void main(String[] args) {
        int[] test = {5,7,7,8,8,10};
        System.out.println(Dividesearch(test,8));
    }
}

