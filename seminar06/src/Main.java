import ro.ase.builder.burger.*;
import ro.ase.builder.car.*;
import ro.ase.prototype.*;
// ex:
// avem de implementat o aplicatie pt constructia mai
// multor biciclete: clasice, electrice, tricilete etc
//
// pt fiecare bicicleta tb specificat tipul rotilor,
// dim pt roti, dim cadru si viteza maxima
// alte proprietati sunt: tipul de sa,
// culoare, design, accesorii etc

// clase de implementat pt builder:
// interfata/clasa abstracta Bike cu metodele
// setWheelType, setWheelDim, setCadru etc.
// interfata/clasa abstracta BikeBuilder in care punem
// buildWheelType, buildWheelDim, buildCadru etc.
// si getBike
// + un director = asigura partea de constructie a bicicletei
// si apeleaza metodele builder-ului

// to do??
// Să se implementeze un builder pentru crearea unui obiect
// de tip Burger, având câmpurile "tip de chiflă", "carne",
// "sos", "legume" și "condimente". Builderul trebuie să
// ofere metode pentru a seta fiecare câmp în parte,
// respectiv "setChifla(String)", "setCarne(String)",
// "setSos(String)", "setLegume(String)" și
// "setCondimente(String)". De asemenea, builderul trebuie
// să ofere o metodă "build()" pentru a crea obiectul Burger
// cu valorile setate în câmpuri. Trebuie să se asigure că
// obiectul Burger creat are toate câmpurile setate corect.
public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new ElectricCarBuilder();
        CarEngineer inginer = new CarEngineer(builder);
        inginer.buildCar();
        Car masina = inginer.getCar();
        System.out.println(masina.showDetails());

        builder = new RegularCarBuilder();
        inginer = new CarEngineer(builder);
        inginer.buildCar();
        masina = inginer.getCar();
        System.out.println(masina.showDetails());

        ReportGenerator reportGenerator = new ReportGenerator();
        Report salesReport = reportGenerator.generateReport("sales", "Sales data", "PDF");
        Report marketingReport = reportGenerator.generateReport("marketing", "Marketing data", "Excel");

        BurgerBuilder burgerBuilder = new BurgerSimpluBuilder();
        Restaurant restaurant = new Restaurant(burgerBuilder);
        restaurant.buildBurger();

        Burger burger = restaurant.getBurger();

        burgerBuilder = new BurgerExtraBuilder();
        restaurant = new Restaurant(burgerBuilder);
        restaurant.buildBurger();
        burger = restaurant.getBurger();
    }
}