package SwordToOffer;

public class Day171 {
    //快速选择
//    public int[] getLeastNumbers(int[] arr, int k) {
//
//
//
//    }
//    private dfs(int[] ar,int k){
//        int f = ar[0];
//        partition(ar,f);
//
//    }
    public void partition(int[] arr,int flag){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]<flag){i++;continue;}
            if(arr[j]>flag){j--;continue;}
            int tmp;
            tmp=arr[i];
            arr[i] = arr[j];
            arr[j]=tmp;
            i++;
            j--;
        }
        arr[j]=flag;
    }

    public static void main(String[] args) {
        Day171 day171 = new Day171();
        int[] arrs = {5,4,8,2,5,3,9,6};
        day171.partition(arrs,arrs[0]);
        for(int arr:arrs){
            System.out.println(arr);
        }
    }
}
