package GUI;

import javax.swing.*;
import java.awt.*;

public class DashboardDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("3D Dashboard Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 400);
            frame.setLayout(new GridLayout(1, 3, 20, 20));
            frame.getContentPane().setBackground(new Color(240, 240, 240));
            
            // Panel 1 - Blue 3D effect
            DashboardPanel panel1 = new DashboardPanel(
                "sheet table", 
                "$3388880", 
                "average key 50%", 
                new Color(100, 150, 255),  // Light blue (top)
                new Color(0, 50, 150),     // Dark blue (bottom)
                true                       // 3D effect enabled
            );
            
            // Panel 2 - Green 3D effect
            DashboardPanel panel2 = new DashboardPanel(
                "tabs.py set", 
                "$338880", 
                "template file 21%", 
                new Color(150, 255, 150), // Light green
                new Color(0, 150, 0),     // Dark green
                true
            );
            
            // Panel 3 - Purple 3D effect
            DashboardPanel panel3 = new DashboardPanel(
                "images settings", 
                "$1281000", 
                "average key 10%", 
                new Color(220, 150, 255),  // Light purple
                new Color(100, 0, 150),    // Dark purple
                true
            );
            
            frame.add(panel1);
            frame.add(panel2);
            frame.add(panel3);
            
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}