package PanelDashboard;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.*;

public class LineChartThongKe {

    private DefaultCategoryDataset dataset;
    private String chartTitle;
    private String xAxisLabel;
    private String yAxisLabel;

    // Constructor với tham số để truyền dữ liệu
    public LineChartThongKe(DefaultCategoryDataset dataset, String chartTitle, String xAxisLabel, String yAxisLabel) {
        this.dataset = dataset;
        this.chartTitle = chartTitle;
        this.xAxisLabel = xAxisLabel;
        this.yAxisLabel = yAxisLabel;
    }

    // Phương thức tạo ChartPanel từ dữ liệu đã được truyền vào
    public ChartPanel createChartPanel() {
        // Tạo biểu đồ đường
        JFreeChart chart = ChartFactory.createLineChart(
                this.chartTitle,                // Tiêu đề
                this.xAxisLabel,               // Nhãn trục X
                this.yAxisLabel,               // Nhãn trục Y
                this.dataset,                  // Dữ liệu
                PlotOrientation.VERTICAL,      // Hướng biểu đồ
                true,                         // Hiển thị chú thích
                true,                         // Hiển thị tooltip
                false                         // Hiển thị URL
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
        
        // 3. Đặt màu cho các đường dữ liệu
        LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        
        // Đặt màu tự động cho các series
        for (int i = 0; i < this.dataset.getRowCount(); i++) {
            renderer.setSeriesPaint(i, getSeriesColor(i));
            renderer.setSeriesStroke(i, new BasicStroke(2.5f));
            renderer.setSeriesShapesVisible(i, true);
        }

        return new ChartPanel(chart);
    }

    // Phương thức tạo màu tự động cho các series
    private Color getSeriesColor(int seriesIndex) {
        Color[] colors = {
            new Color(0, 0, 255),    // Xanh dương
            new Color(255, 0, 0),    // Đỏ
            new Color(0, 128, 0),    // Xanh lá
            new Color(128, 0, 128),  // Tím
            new Color(255, 165, 0),  // Cam
            new Color(0, 128, 128)   // Xanh ngọc
        };
        return colors[seriesIndex % colors.length];
    }

    // Phương thức tạo mẫu (giữ lại để tương thích nếu cần)
    public static ChartPanel createSampleChartPanel() {
        DefaultCategoryDataset sampleDataset = new DefaultCategoryDataset();
        
        // Thêm dữ liệu mẫu
        sampleDataset.addValue(10, "Series 1", "Tháng 1");
        sampleDataset.addValue(15, "Series 1", "Tháng 2");
        sampleDataset.addValue(8, "Series 1", "Tháng 3");
        sampleDataset.addValue(12, "Series 1", "Tháng 4");
        sampleDataset.addValue(20, "Series 1", "Tháng 5");
        sampleDataset.addValue(18, "Series 1", "Tháng 6");
        
        sampleDataset.addValue(5, "Series 2", "Tháng 1");
        sampleDataset.addValue(10, "Series 2", "Tháng 2");
        sampleDataset.addValue(12, "Series 2", "Tháng 3");
        sampleDataset.addValue(8, "Series 2", "Tháng 4");
        sampleDataset.addValue(15, "Series 2", "Tháng 5");
        sampleDataset.addValue(10, "Series 2", "Tháng 6");

        LineChartThongKe chart = new LineChartThongKe(
            sampleDataset,
            "BIỂU ĐỒ DỮ LIỆU THEO THÁNG",
            "Tháng",
            "Giá trị"
        );
        
        return chart.createChartPanel();
    }
}