package ro.ase.prototype;

public class SalesReport implements Report {
    private String data;
    private String format;

    public void setData(String data) {
        this.data = data;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void generateReport() {
        System.out.println("Generating Sales Report with data: " + data + " and format: " + format);
        // Actual report generation code here
    }

    public Report clone() throws CloneNotSupportedException {
        return (SalesReport) super.clone();
    }
}