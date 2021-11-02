package CoreJavaVolume.generic;

import java.time.LocalDate;
import java.util.Date;

public class DateInterval extends Pair<LocalDate> {
    public void setSecond(LocalDate value){
        System.out.println("method in subclass");
    }

    public static void main(String[] args) {
        DateInterval datapair = new DateInterval();
        LocalDate date = LocalDate.now();
        datapair.setSecond(date);
    }
}
