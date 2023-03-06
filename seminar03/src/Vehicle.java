public class Vehicle {
    private double value;
    public void printDetails() {
        System.out.println("This vehicle has a value of" + this.value);
    }
    public double calculateValue() {
        return this.value * 0.5;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
}
