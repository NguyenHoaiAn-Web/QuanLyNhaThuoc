package PanelDashboard;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.*;

public class LineChartAdvanced {

    private DefaultCategoryDataset dataset;
    private String chartTitle;
    private String xAxisLabel;
    private String yAxisLabel;

    // Constructor với tham số để truyền dữ liệu
    public LineChartAdvanced(DefaultCategoryDataset dataset, String chartTitle, String xAxisLabel, String yAxisLabel) {
        this.dataset = dataset != null ? dataset : new DefaultCategoryDataset();
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
        customizeChartAppearance(chart);

        return new ChartPanel(chart);
    }

    // Phương thức cấu hình giao diện biểu đồ
    private void customizeChartAppearance(JFreeChart chart) {
        CategoryPlot plot = chart.getCategoryPlot();
        
        // 1. Đặt background trắng
        plot.setBackgroundPaint(Color.WHITE);
        chart.setBackgroundPaint(Color.WHITE);
        
        // 2. Thêm đường kẻ phân cách
        plot.setDomainGridlinePaint(Color.LIGHT_GRAY);  // Đường kẻ dọc
        plot.setRangeGridlinePaint(Color.LIGHT_GRAY);   // Đường kẻ ngang
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);
        
        // 3. Đặt màu và style cho các đường dữ liệu
        LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        
        // Đặt màu tự động cho các series
        for (int i = 0; i < this.dataset.getRowCount(); i++) {
            renderer.setSeriesPaint(i, getSeriesColor(i));
            renderer.setSeriesStroke(i, new BasicStroke(2.5f));
            renderer.setSeriesShapesVisible(i, true);
        }
    }

    // Phương thức tạo màu tự động cho các series
    private Color getSeriesColor(int seriesIndex) {
        Color[] colors = {
            new Color(0, 0, 255),    // Xanh dương
            new Color(255, 0, 0),    // Đỏ
            new Color(0, 128, 0),    // Xanh lá
            new Color(128, 0, 128),  // Tím
            new Color(255, 165, 0),  // Cam
            new Color(0, 128, 128),  // Xanh ngọc
            new Color(128, 128, 0),  // Olive
            new Color(255, 0, 255),  // Hồng
            new Color(0, 255, 255), // Cyan
            new Color(128, 0, 0)    // Nâu đỏ
        };
        return colors[seriesIndex % colors.length];
    }

    // Phương thức thêm dữ liệu vào dataset
    public void addData(String seriesName, String category, double value) {
        this.dataset.addValue(value, seriesName, category);
    }

    // Phương thức xóa tất cả dữ liệu
    public void clearData() {
        this.dataset.clear();
    }

    // Phương thức tạo mẫu (có thể bỏ nếu không cần)
    public static ChartPanel createSampleChartPanel() {
        DefaultCategoryDataset sampleDataset = new DefaultCategoryDataset();
        
        // Thêm dữ liệu mẫu với 5 series
        String[] months = {"Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6"};
        
        for (int i = 1; i <= 5; i++) {
            String seriesName = "Dữ liệu " + i;
            for (int j = 0; j < months.length; j++) {
                sampleDataset.addValue(10 + (i * 5) + (Math.random() * 10), seriesName, months[j]);
            }
        }

        LineChartAdvanced chart = new LineChartAdvanced(
            sampleDataset,
            "BIỂU ĐỒ DỮ LIỆU THEO THÁNG",
            "Tháng",
            "Giá trị"
        );
        
        return chart.createChartPanel();
    }
}