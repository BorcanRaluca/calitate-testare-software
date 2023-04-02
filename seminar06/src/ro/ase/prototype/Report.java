package ro.ase.prototype;

public interface Report extends Cloneable{
    void setData(String data);
    void setFormat(String format);
    void generateReport();
    Report clone() throws CloneNotSupportedException;
}
