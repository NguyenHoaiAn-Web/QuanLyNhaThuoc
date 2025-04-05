package PanelDashboard;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class PanelThongKeThuoc extends JPanel {
    private JLabel titleLabel;
    private JLabel valueLabel;
    private JLabel descriptionLabel;
    private Color topColor;
    private Color bottomColor;
    private boolean raised3DEffect;
    
    public PanelThongKeThuoc(String title, String value, String description, 
                        Color topColor, Color bottomColor, boolean raised3DEffect) {
        this.topColor = topColor;
        this.bottomColor = bottomColor;
        this.raised3DEffect = raised3DEffect;
        
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        setOpaque(false); // Important for custom painting
        
        // Create components
        titleLabel = new JLabel(title, SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(Color.BLACK);
        
        valueLabel = new JLabel(value, SwingConstants.CENTER);
        valueLabel.setFont(new Font("Arial", Font.BOLD, 24));
        valueLabel.setForeground(Color.BLACK);
        
        descriptionLabel = new JLabel(description, SwingConstants.CENTER);
        descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        descriptionLabel.setForeground(Color.BLACK);
        
        // Add components to panel
        add(titleLabel, BorderLayout.NORTH);
        add(valueLabel, BorderLayout.CENTER);
        add(descriptionLabel, BorderLayout.SOUTH);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        
        // Enable anti-aliasing for smoother edges
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                            RenderingHints.VALUE_ANTIALIAS_ON);
        
        int width = getWidth();
        int height = getHeight();
        
        // Create gradient paint for 3D effect
        GradientPaint gradient = new GradientPaint(
            0, 0, topColor, 
            0, height, bottomColor);
        
        g2d.setPaint(gradient);
        
        // Draw rounded rectangle with gradient
        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(
            0, 0, width, height, 20, 20);
        g2d.fill(roundedRectangle);
        
        // Add 3D border effect
        if (raised3DEffect) {
            g2d.setColor(new Color(255, 255, 255, 100));
            g2d.drawRoundRect(1, 1, width-3, height-3, 20, 20);
            
            g2d.setColor(new Color(0, 0, 0, 50));
            g2d.drawRoundRect(0, 0, width-1, height-1, 20, 20);
        }
        
        g2d.dispose();
    }
    
    // Getters and setters
    public void setColors(Color topColor, Color bottomColor) {
        this.topColor = topColor;
        this.bottomColor = bottomColor;
        repaint();
    }
    
    public void set3DEffect(boolean raised) {
        this.raised3DEffect = raised;
        repaint();
    }
    
    // ... (keep other existing methods)
}