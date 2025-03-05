package GUI;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class TestChart {

    public static ChartPanel createSampleChartPanel() {
        // Create a dataset (replace with your actual data)
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "Series 1", "Category 1");
        dataset.addValue(15, "Series 1", "Category 2");
        dataset.addValue(8, "Series 1", "Category 3");

        // Create the chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Sample Chart",       // Chart title
                "Category",           // Domain axis label
                "Value",              // Range axis label
                dataset,              // Data
                PlotOrientation.VERTICAL, // Orientation
                true,                 // Include legend
                true,                 // Tooltips
                false                 // URLs
        );

        // Create and return the chart panel
        return new ChartPanel(chart);
    }
}