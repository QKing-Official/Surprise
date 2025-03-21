import java.awt.*;
import java.io.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class Surprise {
    public static void main(String[] args) {
        // Create a minimal window and make it invisible
        JFrame frame = new JFrame();
        frame.setSize(1, 1);
        frame.setLocation(-10, -10); // Position off-screen
        frame.setUndecorated(true); // No window decorations
        frame.setType(javax.swing.JFrame.Type.UTILITY); // Won't show in taskbar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        // Set up a timer to run the task every minute (60000 milliseconds)
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    // Use ProcessBuilder to run cmd without inheritIO to ensure it appears
                    ProcessBuilder processBuilder = new ProcessBuilder(
                        "cmd.exe", 
                        "/c", 
                        "start cmd.exe /c \"echo Hello, World! && timeout /t 3\""
                    );
                    processBuilder.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 60000); // Run immediately and then every minute
    }
}