package CoreJavaVolume;



import SwordToOffer.ListNode;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    public String name;
    private float salary;
    private LocalDate hireDay;
    public  Employee(String n,float s,int year,int month,int day){   //构造器是不写返回值的
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }
    public void punish(int punishment){
        salary-=punishment;
    }
    private void reward(int rewardment){
        salary+=rewardment;
    }

    public String getName() {
        return name;
    }
    public void setOtherName(Employee other){

        other.name = name;
        other.reward(100);
    }
    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public float getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("ny",1000000,2020,9,26);
        Employee e2 = new Employee("cfl",100000,2020,9,26);

        System.out.println(e1.getName());
        e2.setOtherName(e1);
        System.out.println(e1.getName());
        EmployeeTest t1 = new EmployeeTest();

    }
}
