package ro.ase.cts.singleton;

import java.util.Date;

public class Car {
    private String name;
    private Date productionDate;
    private float price;

    public Car() {
        this.name = "Logan";
        this.productionDate = new Date();
        this.price = 10000.0f;
    }

    public Car(String brand, Date productionDate, int price) {
        this.name = brand;
        this.productionDate = productionDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", productionDate=" + productionDate +
                ", price=" + price +
                '}';
    }
}
