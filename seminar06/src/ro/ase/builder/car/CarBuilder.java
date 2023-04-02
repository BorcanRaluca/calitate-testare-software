package ro.ase.builder.car;

public interface CarBuilder {
    public void buildChassis();
    public void buildWheels();
    public void buildInteriorDesign();
    public void buildEngine();

    public Car getCar();
}
