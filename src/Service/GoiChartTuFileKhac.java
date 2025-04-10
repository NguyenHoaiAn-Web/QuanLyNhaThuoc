package Service;

import org.jfree.data.category.DefaultCategoryDataset;
import PanelDashboard.LineChartThongKe;
import javax.swing.*;

public class GoiChartTuFileKhac {
    public static void main(String[] args) {
        // Tạo dataset từ dữ liệu của bạn
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        // Thêm dữ liệu (ví dụ)
        dataset.addValue(150, "Doanh thu", "Quý 1");
        dataset.addValue(200, "Doanh thu", "Quý 2");
        dataset.addValue(180, "Doanh thu", "Quý 3");
        dataset.addValue(250, "Doanh thu", "Quý 4");
        
        dataset.addValue(100, "Chi phí", "Quý 1");
        dataset.addValue(120, "Chi phí", "Quý 2");
        dataset.addValue(110, "Chi phí", "Quý 3");
        dataset.addValue(130, "Chi phí", "Quý 4");

        // Tạo biểu đồ với dữ liệu tùy chỉnh
        LineChartThongKe lineChart = new LineChartThongKe(
            dataset,
            "BIỂU ĐỒ DOANH THU VÀ CHI PHÍ THEO QUÝ",
            "Quý",
            "Triệu đồng"
        );
        
        // Tạo frame để hiển thị
        JFrame frame = new JFrame("Biểu đồ đường");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(lineChart.createChartPanel());
        frame.pack();
        frame.setVisible(true);
    }
}