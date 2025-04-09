package PanelDashboard;

import org.jfree.data.general.DefaultPieDataset;
import PanelDashboard.PieChartThongKe;
import javax.swing.*;

public class TestChart {
    public static void main(String[] args) {
        // Tạo dataset từ dữ liệu của bạn
        DefaultPieDataset dataset = new DefaultPieDataset();
        
        // Thêm dữ liệu (ví dụ)
        dataset.setValue("Quý 1", 25);
        dataset.setValue("Quý 2", 35);
        dataset.setValue("Quý 3", 20);
        dataset.setValue("Quý 4", 40);

        // Tạo biểu đồ với dữ liệu tùy chỉnh
        PieChartThongKe pieChart = new PieChartThongKe(
            dataset,
            "TỶ LỆ DOANH THU THEO QUÝ"
        );
        
        // Tạo frame để hiển thị
        JFrame frame = new JFrame("Biểu đồ tròn");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(pieChart.createChartPanel());
        frame.pack();
        frame.setVisible(true);
    }
}


