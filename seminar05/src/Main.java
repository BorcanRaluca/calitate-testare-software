import cts.ase.factory.abstractf.*;
import cts.ase.factory.method.*;
import cts.ase.factory.simple.Pizza;
import cts.ase.factory.simple.PizzaFactory;
import cts.ase.factory.simple.PizzaType;

// simple factory
// - cu enum (varianta elenganta?)
// - nu avem un nou nivel de abstractizare
// - de fiecare data avem un nou tip ar trebui sa modificam clasa (un nou elem in enum + un nou if) - incalca un principiu solid
// factory method
// - nivel de abstractizare la nivel de fabrica
// - clasa abstracta fabrica + clase pt fiecare tip pe care vrem sa-l implementam
// abstract factory
// factory method vs abstract factory:
// -
public class Main {
    public static void main(String[] args) {
        // implementare simple factory - exemplu
        Pizza pizza = PizzaFactory.createPizza(PizzaType.CHEESE);
        pizza.cookPizza();

        pizza = PizzaFactory.createPizza(PizzaType.PEPPERONI);
        pizza.cookPizza();

        pizza = PizzaFactory.createPizza(PizzaType.TUNA);
        pizza.cookPizza();

        System.out.println();

        // implementare factory method - exemplu
        AnimalFactory animalFactory = new DogFactory();
        Animal animal = animalFactory.createAnimal();
        animal.makeSound();

        animalFactory = new CatFactory();
        animal = animalFactory.createAnimal();
        animal.makeSound();

        animalFactory = new FishFactory();
        animal = animalFactory.createAnimal();
        animal.makeSound();

        System.out.println();

        // implementare abstract factory - exemplu
        GUIFactory guiFactory = new WindowsGUIFactory();
        Button button = guiFactory.createButton();
        Menu menu = guiFactory.createMenu();

        button.paint();
        menu.paint();

        guiFactory = new MacGUIFactory();
        button = guiFactory.createButton();
        menu = guiFactory.createMenu();

        button.paint();
        menu.paint();
    }
}