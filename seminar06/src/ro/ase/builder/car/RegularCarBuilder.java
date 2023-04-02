package ro.ase.builder.car;

public class RegularCarBuilder implements CarBuilder {
    private Car m;
    public RegularCarBuilder()
    {
        this.m = new RegularCar();
    }

    @Override
    public void buildChassis() {
        this.m.setChassis("Sasiu de masina clasica");
    }

    @Override
    public void buildWheels() {
        this.m.setWheels("Roti cu capace de masina clasica");
    }

    @Override
    public void buildInteriorDesign() {
        this.m.setInsideDesign("Interior masina clasica");
    }

    @Override
    public void buildEngine() {
        this.m.setEngine("Motor diesel");
    }

    public void buildAdditives() {
        ((RegularCar)m).setAdditives("AdBlue Diesel");
    }
    @Override
    public Car getCar() {
        return this.m;
    }

}
