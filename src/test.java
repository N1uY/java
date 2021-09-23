import SwordToOffer.Node;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
//Java的传值引用真的离谱。。。。。。。。。。。。。。。。
public class test {
//    public int[] a;
    private Node n = new Node(100);
    private  void changeNode(Node test){
        n = test;
    }
public static void main (String[] args) {
//        LocalDate date = LocalDate.now();
//        System.out.println(date);
//        int month  = date.getMonthValue();
//        int today = date.getDayOfMonth();
//        System.out.println(date.minusDays(today-1));
//          String s = "7e69e";
//          s = s.trim();
//          String [] temp;
//          temp = s.split("e");
//          System.out.println(temp.length);
//            int a = 12258;
//            System.out.println(String.valueOf(a).charAt(3));
//    test t = new test();
//    Node x = t.n;
//    System.out.println(x.val);
//    t.changeNode(t.n);
//    x = t.n;
//    System.out.println(x.val);
    int[] test = {0,1,2,3,4};
   int[] newtest = Arrays.copyOfRange(test,0,2);
   for(int t:newtest){
       System.out.println(t);
   }
}
}
