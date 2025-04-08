package PanelDashboard;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import java.awt.*;

public class PieChartThongKe {

    private DefaultPieDataset dataset;
    private String chartTitle;

    // Constructor với tham số để truyền dữ liệu
    public PieChartThongKe(DefaultPieDataset dataset, String chartTitle) {
        this.dataset = dataset;
        this.chartTitle = chartTitle;
    }

    // Phương thức tạo ChartPanel từ dữ liệu đã được truyền vào
    public ChartPanel createChartPanel() {
        // Tạo biểu đồ tròn
        JFreeChart chart = ChartFactory.createPieChart(
                this.chartTitle,    // Tiêu đề
                this.dataset,      // Dữ liệu
                true,             // Hiển thị chú thích
                true,            // Hiển thị tooltip
                false           // Hiển thị URL
        );

        // Cấu hình giao diện biểu đồ
        PiePlot plot = (PiePlot) chart.getPlot();
        
        // 1. Đặt background trắng
        plot.setBackgroundPaint(Color.WHITE);
        chart.setBackgroundPaint(Color.WHITE);
        
        // 2. Đặt màu tự động cho các phần
        setPieColors(plot);
        
        // 3. Hiển thị phần trăm
        plot.setLabelGenerator(new org.jfree.chart.labels.StandardPieSectionLabelGenerator(
            "{0}: {1} ({2})",  // {0} = tên, {1} = giá trị, {2} = phần trăm
            new java.text.DecimalFormat("0"), 
            new java.text.DecimalFormat("0%"))
        );
        
        // 4. Đặt góc khởi đầu (12h)
        plot.setStartAngle(90);
        
        // 5. Hiển thị đường nối
        plot.setLabelLinksVisible(true);
        plot.setLabelLinkPaint(Color.BLACK);

        return new ChartPanel(chart);
    }

    // Phương thức đặt màu tự động cho các phần
    private void setPieColors(PiePlot plot) {
        Color[] colors = {
            new Color(79, 129, 189),   // Xanh dương
            new Color(192, 80, 77),    // Đỏ
            new Color(155, 187, 89),   // Xanh lá
            new Color(128, 100, 162), // Tím
            new Color(247, 150, 70),   // Cam
            new Color(75, 172, 198)    // Xanh ngọc
        };
        
        for (int i = 0; i < this.dataset.getItemCount(); i++) {
            plot.setSectionPaint(this.dataset.getKey(i), colors[i % colors.length]);
        }
    }

    // Phương thức tạo mẫu (giữ lại để tương thích nếu cần)
    public static ChartPanel createSampleChartPanel() {
        DefaultPieDataset sampleDataset = new DefaultPieDataset();
        
        // Thêm dữ liệu mẫu
        sampleDataset.setValue("iPhone", 45);
        sampleDataset.setValue("Samsung", 30);
        sampleDataset.setValue("Xiaomi", 15);
        sampleDataset.setValue("Khác", 10);

        PieChartThongKe chart = new PieChartThongKe(
            sampleDataset,
            "THỊ PHẦN ĐIỆN THOẠI THÔNG MINH"
        );
        
        return chart.createChartPanel();
    }
}