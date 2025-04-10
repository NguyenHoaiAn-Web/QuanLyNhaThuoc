package PanelDashboard;

import javax.swing.*;
import org.jfree.data.category.DefaultCategoryDataset;
import PanelDashboard.LineChartThongKe;

public class TestChart {
    public static void main(String[] args) {
        // Tạo dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Thêm dữ liệu cho 5 đường (Series 1 đến Series 5)
        String[] categories = {"Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6"};

        // Series 1: Dữ liệu tăng dần
        for (int i = 0; i < categories.length; i++) {
            dataset.addValue(10 + i * 5, "Khu vực A", categories[i]);
        }

        // Series 2: Dữ liệu giảm dần
        for (int i = 0; i < categories.length; i++) {
            dataset.addValue(50 - i * 5, "Khu vực B", categories[i]);
        }

        // Series 3: Dữ liệu dao động
        dataset.addValue(20, "Khu vực C", categories[0]);
        dataset.addValue(35, "Khu vực C", categories[1]);
        dataset.addValue(15, "Khu vực C", categories[2]);
        dataset.addValue(40, "Khu vực C", categories[3]);
        dataset.addValue(10, "Khu vực C", categories[4]);
        dataset.addValue(30, "Khu vực C", categories[5]);

        // Series 4: Dữ liệu ngẫu nhiên
        for (int i = 0; i < categories.length; i++) {
            dataset.addValue(10 + Math.random() * 30, "Khu vực D", categories[i]);
        }

        // Series 5: Dữ liệu ổn định
        for (int i = 0; i < categories.length; i++) {
            dataset.addValue(25, "Khu vực E", categories[i]);
        }

        // Tạo biểu đồ
        LineChartThongKe lineChart = new LineChartThongKe(
            dataset,
            "DOANH SỐ BÁN HÀNG THEO KHU VỰC (2023)",
            "Tháng",
            "Doanh số (triệu VND)"
        );

        // Hiển thị biểu đồ trong JFrame
        JFrame frame = new JFrame("Biểu đồ đường - 5 khu vực");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(lineChart.createChartPanel());
        frame.setVisible(true);
    }
}