import ro.ase.cts.composite.Button;
import ro.ase.cts.composite.Component;
import ro.ase.cts.composite.Panel;
import ro.ase.cts.composite.TextField;
import ro.ase.cts.flyweight.Shape;
import ro.ase.cts.flyweight.ShapeFactory;
import ro.ase.cts.proxy.FilteredInternet;
import ro.ase.cts.proxy.Internet;
import ro.ase.cts.strategy.BubbleSortStrategy;
import ro.ase.cts.strategy.QuickSortStrategy;
import ro.ase.cts.strategy.SortManager;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // flyweight
        // obtinerea formelor cu proprietati similare
        Shape redCircle = ShapeFactory.getShape("red-circle", Color.RED, 1);
        Shape redCircle2 = ShapeFactory.getShape("red-circle", Color.RED, 1);
        Shape blueCircle = ShapeFactory.getShape("blue-circle", Color.BLUE, 2);

        // desenarea formelor la diferite pozitii
        redCircle.draw(10, 10);
        redCircle2.draw(20, 20);
        blueCircle.draw(30, 30);


        // proxy
        Internet internet = new FilteredInternet();
        internet.connect("https://www.example.com");
        internet.connect("https://www.somesocialmedia.com");


        // composite
        Component button1 = new Button();
        Component button2 = new Button();
        Component campText = new TextField();

        Component panou = new Panel();
        ((Panel)panou).adaugaComponenta(button1);
        ((Panel)panou).adaugaComponenta(button2);
        ((Panel)panou).adaugaComponenta(campText);
        panou.render();


        // strategy
        SortManager sortManager = new SortManager();

        int[] array1 = {5, 2, 9, 1, 3};
        sortManager.setSortingStrategy(new BubbleSortStrategy());
        sortManager.sortArray(array1);

        System.out.println("Sorted array: " + Arrays.toString(array1));

        int[] array2 = {7, 4, 8, 2, 1};
        sortManager.setSortingStrategy(new QuickSortStrategy());
        sortManager.sortArray(array2);

        System.out.println("Sorted array: " + Arrays.toString(array2));
    }
}