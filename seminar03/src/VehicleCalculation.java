public class VehicleCalculation {
    public double calculateValue(Vehicle v) {
        if (v instanceof Car) {
            return v.getValue() * 0.8;
        }
        if (v instanceof Truck) {
            return v.getValue() * 0.5;
        }
        return v.getValue();
    }
}
