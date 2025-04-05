package PanelDashboard;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class BarChartThongKe extends JPanel {
    private Map<String, Integer> data;
    private String title;
    private Color barColor;
    private int maxValue;

    public BarChartThongKe(Map<String, Integer> data, String title) {
        this(data, title, new Color(79, 129, 189)); // Màu xanh mặc định
    }

    public BarChartThongKe(Map<String, Integer> data, String title, Color barColor) {
        this.data = data;
        this.title = title;
        this.barColor = barColor;
        this.maxValue = calculateMaxValue();
        setPreferredSize(new Dimension(600, 400));
        setBackground(Color.WHITE);
    }

    private int calculateMaxValue() {
        return data.values().stream().max(Integer::compare).orElse(0);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        drawTitle(g2d);
        drawBars(g2d);
        drawAxes(g2d);
    }

    private void drawTitle(Graphics2D g2d) {
        g2d.setFont(new Font("Arial", Font.BOLD, 18));
        FontMetrics fm = g2d.getFontMetrics();
        int titleWidth = fm.stringWidth(title);
        int x = (getWidth() - titleWidth) / 2;
        g2d.drawString(title, x, 30);
    }

    private void drawBars(Graphics2D g2d) {
        if (data.isEmpty()) return;

        int barCount = data.size();
        int padding = 50;
        int labelPadding = 40;
        int availableWidth = getWidth() - 2 * padding;
        int barWidth = availableWidth / barCount;
        int maxBarHeight = getHeight() - 2 * padding - labelPadding;

        int i = 0;
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            int barHeight = (int) ((double) entry.getValue() / maxValue * maxBarHeight);
            int x = padding + i * barWidth;
            int y = getHeight() - padding - labelPadding - barHeight;

            // Vẽ cột
            g2d.setColor(barColor);
            g2d.fillRect(x, y, barWidth - 10, barHeight);

            // Vẽ giá trị trên cột
            g2d.setColor(Color.BLACK);
            String valueStr = String.valueOf(entry.getValue());
            FontMetrics fm = g2d.getFontMetrics();
            int valueWidth = fm.stringWidth(valueStr);
            g2d.drawString(valueStr, x + (barWidth - 10 - valueWidth) / 2, y - 5);

            // Vẽ nhãn trục X
            g2d.setFont(new Font("Arial", Font.PLAIN, 12));
            fm = g2d.getFontMetrics();
            int labelWidth = fm.stringWidth(entry.getKey());
            g2d.drawString(entry.getKey(), x + (barWidth - labelWidth) / 2, getHeight() - padding - 10);

            i++;
        }
    }

    private void drawAxes(Graphics2D g2d) {
        int padding = 50;
        int labelPadding = 40;

        // Vẽ trục Y
        g2d.setColor(Color.BLACK);
        g2d.drawLine(padding, getHeight() - padding - labelPadding, padding, padding);

        // Vẽ trục X
        g2d.drawLine(padding, getHeight() - padding - labelPadding, getWidth() - padding, getHeight() - padding - labelPadding);

        // Vẽ các giá trị trên trục Y
        g2d.setFont(new Font("Arial", Font.PLAIN, 12));
        int yTickCount = 5;
        for (int i = 0; i <= yTickCount; i++) {
            int y = getHeight() - padding - labelPadding - (i * (getHeight() - 2 * padding - labelPadding) / yTickCount);
            g2d.drawLine(padding - 5, y, padding, y);
            String value = String.valueOf((int) (maxValue * ((double) i / yTickCount)));
            FontMetrics fm = g2d.getFontMetrics();
            int valueWidth = fm.stringWidth(value);
            g2d.drawString(value, padding - 10 - valueWidth, y + (fm.getAscent() / 2));
        }
    }
}