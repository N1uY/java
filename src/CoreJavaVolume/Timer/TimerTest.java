package CoreJavaVolume.Timer;

import javax.xml.bind.Unmarshaller;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.*;
public class TimerTest {
    public static void main(String[] args) {
        TimerPrinter listener = new TimerPrinter();
        Timer timer = new Timer(1000, listener);
        timer.start();
        JOptionPane.showMessageDialog(null,"Quit?");
        System.exit(0);
    }
}
