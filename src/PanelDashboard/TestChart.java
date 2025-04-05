package PanelDashboard;

import javax.swing.*;

import org.jfree.chart.ChartPanel;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

// cách gọi và truyền dữ liệu vào barchart từ file khác

public class TestChart {
    public static void main(String[] args) {
        // Tạo dữ liệu cho biểu đồ
        Map<String, Integer> salesData = new HashMap<>();
        salesData.put("Tháng 1", 150);
        salesData.put("Tháng 2", 200);
        salesData.put("Tháng 3", 180);
        salesData.put("Tháng 4", 300);
        salesData.put("Tháng 5", 250);

        // Tạo frame chính
        JFrame frame = new JFrame("Biểu Đồ Cột - Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Tạo và thêm ChartPanel vào frame
        BarChartThongKe chartPanel = new BarChartThongKe(salesData, "Doanh Số Bán Hàng Theo Tháng", new Color(75, 192, 192));
        frame.add(chartPanel, BorderLayout.CENTER);

        // Hiển thị frame
        frame.setVisible(true);
    }
}