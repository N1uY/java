package CoreJavaVolume;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class EmployeeTest {
   public int hhh;
    private void justtest(){
        System.out.println("only this class can use this method");
        Employee wx = new Employee("wx",0,2020,9,26);

    }
    public static void main(String[] args) {
        Employee wx = new Employee("wx",0,2020,9,26);
        wx.punish(100);
        System.out.println("after punish,the salary of "+ wx.getName()+" is "+ wx.getSalary());
        EmployeeTest tt = new EmployeeTest();
        tt.justtest();
    }

}
