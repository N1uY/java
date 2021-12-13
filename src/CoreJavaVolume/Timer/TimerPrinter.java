package CoreJavaVolume.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TimerPrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone,the time is "+ Instant.ofEpochMilli(e.getWhen()));
    }
}
