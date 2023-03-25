package ro.ase.cts.singleton;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;

public class CarManufacturer {
    private static CarManufacturer instance = null;
    private List<Car> cars = null;

    private CarManufacturer() {
        this.cars = new ArrayList<>();
    }

    public static CarManufacturer getInstance() {
        if(CarManufacturer.instance == null) {
            CarManufacturer.instance = new CarManufacturer();
        }

        return CarManufacturer.instance;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void deleteCar(Car car) {
        this.cars.remove(car);
    }

    public Car getCar(int index) {
        if(index >= 0 && index < this.cars.size()) {
            return this.cars.get(index);
        }

        return null;
    }

    public int getCarsNo() {
        return this.cars.size();
    }

    public void printCars() {
        for(Car car: this.cars) {
            System.out.println(car.toString());
        }
    }
}
