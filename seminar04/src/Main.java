import ro.ase.cts.singleton.Car;
import ro.ase.cts.singleton.CarManufacturer;
import ro.ase.cts.singleton.Server;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Server server = Server.getInstance();
//        System.out.println(server.showStatus());
//        System.out.println();

        Server server2 = Server.getInstance(8085, "cts4.2");
//        System.out.println(server.showStatus());
//        System.out.println(server2.showStatus());
//        System.out.println();

        Server server3 = Server.getInstance(8085, "cts_seminar4");
//        System.out.println(server.showStatus());
//        System.out.println(server2.showStatus());
//        System.out.println(server3.showStatus());
//        System.out.println();

        // TEMA - implementare singleton
        // O fabrica de masini care implementeaza un sistem centralizat de monitorizare a productiei.
        // Sistemul trebuie sa asigure adaugarea si modificarea datelor despre masinile fabricate la nivelul sediului
        // central, intr-un mediu securizat (sistemul va exista sub forma unui server dispus in datacenter-ul din HQ)
        // Programatorii trebuie sa se asigure ca sistemul nu va putea fi replicat si ca toate datele vor fi
        // manageriate prin intermediul singurului server mentionat anterior.
        CarManufacturer carManufacturer1 = CarManufacturer.getInstance();

        Car car1 = new Car("Golf4", new Date(), 2000);
        Car car2 = new Car("masina lui ronald mcdonald", new Date(), 15000);
        Car car3 = new Car("matiz", new Date(), 1500);

        carManufacturer1.addCar(car1);
        carManufacturer1.addCar(car2);

        CarManufacturer carManufacturer2 = CarManufacturer.getInstance();
        carManufacturer2.printCars();
        System.out.println();

        carManufacturer2.addCar(car3);
        carManufacturer2.deleteCar(car2);

        carManufacturer1.printCars();
        System.out.println();
    }
}