package ro.ase.prototype;

import java.util.HashMap;
import java.util.Map;

public class ReportGenerator {
    private Map<String, Report> reports = new HashMap<>();

    public ReportGenerator() {
        reports.put("sales", new SalesReport());
        reports.put("marketing", new MarketingReport());
    }

    public Report generateReport(String department, String data, String format) {
        try {
            Report report = reports.get(department).clone();
            report.setData(data);
            report.setFormat(format);
            report.generateReport();
            return report;
        } catch (CloneNotSupportedException e) {
            System.out.println("Error cloning report prototype: " + e.getMessage());
            return null;
        }
    }
}