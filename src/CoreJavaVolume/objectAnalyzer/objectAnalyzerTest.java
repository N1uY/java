package CoreJavaVolume.objectAnalyzer;

import java.util.ArrayList;

public class objectAnalyzerTest {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3};
        String test2 = "hhh";
        ArrayList<Integer> arrayList = new ArrayList<>();
        objectAnalyzer objectAnalyzer = new objectAnalyzer();
        System.out.println(objectAnalyzer.toString(test1));
        System.out.println(objectAnalyzer.toString(test2));
        System.out.println(objectAnalyzer.toString(arrayList));


    }
}
