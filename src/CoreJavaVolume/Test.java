package CoreJavaVolume;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public class Test {
    public enum Size{
        Small,Medium,Large;
        private String description;

        private void setDescription(String description){
            this.description = description;
        }
        private String getDescription(){
            return this.description;
        }
        public int calculata(int a,int b){
            return a+b;
        }
        public void out(int a,int b){
            System.out.println(calculata(a,b));
        }
    }
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee("jwx",30,1980,2,11);
    }

}
