public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setValue(55);

        System.out.println(vehicle.calculateValue());

        vehicle = new Truck();
        vehicle.setValue(55);
        System.out.println(vehicle.calculateValue());

        vehicle = new Car();
        vehicle.setValue(55);
        System.out.println(vehicle.calculateValue());
    }
}
