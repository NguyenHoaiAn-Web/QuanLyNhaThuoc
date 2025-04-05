package GUI;

import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import java.awt.*;

public class Test extends JFrame {

    public Test(String title) {
        super(title);
        
        // Tạo dataset
        DefaultCategoryDataset dataset = createDataset();
        
        // Tạo biểu đồ
        JFreeChart chart = ChartFactory.createLineChart(
            "BIỂU ĐỒ DOANH THU THEO THÁNG NĂM 2023", // Tiêu đề
            "Tháng", // Nhãn trục X
            "Doanh thu (triệu VNĐ)", // Nhãn trục Y
            dataset // Dữ liệu
        );
        
        // Cấu hình toàn bộ biểu đồ
        customizeChart(chart);
        
        // Tạo panel để hiển thị biểu đồ
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(900, 650));
        chartPanel.setMouseZoomable(true);
        setContentPane(chartPanel);
    }

    private void customizeChart(JFreeChart chart) {
        // Cấu hình nền
        chart.setBackgroundPaint(Color.WHITE);
        
        // Lấy plot để tùy chỉnh
        CategoryPlot plot = chart.getCategoryPlot();
        
        // Cấu hình nền plot
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(new Color(200, 200, 200)); // Màu grid line ngang
        plot.setDomainGridlinePaint(new Color(200, 200, 200)); // Màu grid line dọc
        plot.setRangeGridlinesVisible(true); // Hiển thị đường lưới ngang
        plot.setDomainGridlinesVisible(true); // Hiển thị đường lưới dọc
        
        // Cấu hình renderer (đường line)
        LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, new Color(50, 120, 200)); // Màu đường line
        renderer.setSeriesStroke(0, new BasicStroke(3.0f)); // Độ dày đường line
        renderer.setSeriesShapesVisible(0, true); // Hiển thị điểm đánh dấu
        renderer.setSeriesShape(0, new java.awt.geom.Ellipse2D.Double(-4, -4, 8, 8)); // Hình dạng điểm
        
        // Cấu hình trục Y (doanh thu)
        plot.getRangeAxis().setAxisLinePaint(new Color(100, 100, 100));
        plot.getRangeAxis().setTickMarkPaint(new Color(100, 100, 100));
        
        // Cấu hình trục X (tháng)
        plot.getDomainAxis().setAxisLinePaint(new Color(100, 100, 100));
        plot.getDomainAxis().setTickMarkPaint(new Color(100, 100, 100));
        
        // Bật anti-aliasing để làm mượt đồ thị
        chart.setTextAntiAlias(true);
        chart.setAntiAlias(true);
        
        // Cấu hình tiêu đề
        chart.getTitle().setPaint(new Color(50, 50, 50));
        chart.getTitle().setFont(new Font("Arial", Font.BOLD, 18));
        
        // Cấu hình label trục
        plot.getDomainAxis().setLabelFont(new Font("Arial", Font.PLAIN, 12));
        plot.getRangeAxis().setLabelFont(new Font("Arial", Font.PLAIN, 12));
        
        // Thêm số liệu trên các điểm
        renderer.setDefaultItemLabelsVisible(true);
        renderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setDefaultItemLabelFont(new Font("Arial", Font.PLAIN, 10));
        renderer.setDefaultItemLabelPaint(Color.DARK_GRAY);
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        // Thêm dữ liệu doanh thu (đơn vị: triệu VNĐ)
        dataset.addValue(150, "Doanh thu", "1");
        dataset.addValue(180, "Doanh thu", "2");
        dataset.addValue(210, "Doanh thu", "3");
        dataset.addValue(190, "Doanh thu", "4");
        dataset.addValue(230, "Doanh thu", "5");
        dataset.addValue(250, "Doanh thu", "6");
        dataset.addValue(280, "Doanh thu", "7");
        dataset.addValue(300, "Doanh thu", "8");
        dataset.addValue(320, "Doanh thu", "9");
        dataset.addValue(350, "Doanh thu", "10");
        dataset.addValue(380, "Doanh thu", "11");
        dataset.addValue(420, "Doanh thu", "12");
        
        return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Test example = new Test("Biểu đồ Doanh Thu");
            example.setSize(900, 650);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}