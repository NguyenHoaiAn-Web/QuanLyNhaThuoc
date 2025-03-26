package GUI;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.*;

public class LineChart {

    public static ChartPanel createSampleChartPanel() {
        // Tạo dataset với nhiều dữ liệu hơn
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        // Thêm nhiều dữ liệu cho Series 1
        dataset.addValue(10, "Series 1", "Tháng 1");
        dataset.addValue(15, "Series 1", "Tháng 2");
        dataset.addValue(8, "Series 1", "Tháng 3");
        dataset.addValue(12, "Series 1", "Tháng 4");
        dataset.addValue(20, "Series 1", "Tháng 5");
        dataset.addValue(18, "Series 1", "Tháng 6");
        
        // Thêm Series 2 để so sánh
        dataset.addValue(5, "Series 2", "Tháng 1");
        dataset.addValue(10, "Series 2", "Tháng 2");
        dataset.addValue(12, "Series 2", "Tháng 3");
        dataset.addValue(8, "Series 2", "Tháng 4");
        dataset.addValue(15, "Series 2", "Tháng 5");
        dataset.addValue(10, "Series 2", "Tháng 6");

        // Tạo biểu đồ đường
        JFreeChart chart = ChartFactory.createLineChart(
                "BIỂU ĐỒ DỮ LIỆU THEO THÁNG", // Tiêu đề
                "Tháng",                        // Nhãn trục X
                "Giá trị",                      // Nhãn trục Y
                dataset,                        // Dữ liệu
                PlotOrientation.VERTICAL,        // Hướng biểu đồ
                true,                           // Hiển thị chú thích
                true,                           // Hiển thị tooltip
                false                           // Hiển thị URL
        );

        // Cấu hình giao diện biểu đồ
        CategoryPlot plot = chart.getCategoryPlot();
        
        // 1. Đặt background trắng
        plot.setBackgroundPaint(Color.WHITE);
        chart.setBackgroundPaint(Color.WHITE);
        
        // 2. Thêm đường kẻ phân cách
        plot.setDomainGridlinePaint(Color.LIGHT_GRAY);  // Đường kẻ dọc
        plot.setRangeGridlinePaint(Color.LIGHT_GRAY);   // Đường kẻ ngang
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);
        
        // 3. Đặt màu xanh dương cho đường dữ liệu
        LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, new Color(0, 0, 255)); // Xanh dương cho Series 1
        renderer.setSeriesPaint(1, new Color(255, 0, 0)); // Đỏ cho Series 2 (để so sánh)
        
        // 4. Tăng độ dày đường line
        renderer.setSeriesStroke(0, new BasicStroke(2.5f));
        renderer.setSeriesStroke(1, new BasicStroke(2.5f));
        
        // 5. Hiển thị điểm dữ liệu (shape)
        renderer.setSeriesShapesVisible(0, true);
        renderer.setSeriesShapesVisible(1, true);

        return new ChartPanel(chart);
    }
}