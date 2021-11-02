package CoreJavaVolume.objectAnalyzer;

import java.util.ArrayList;

public class ArrayAlg {
    public static <T extends Comparable> T min(T[] a){
        T smallest = a[0];
        for(int i=0;i<a.length;i++){
            if (a[i].compareTo(smallest)<0) {
                smallest = a[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        ArrayAlg test = new ArrayAlg();
        String[] array = {"jwx","wyz","gyj"};
        String a = test.<String>min(array);
        System.out.println(a);
    }
}
