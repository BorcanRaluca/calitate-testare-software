package ro.ase.cts.solid;

public class Square extends Rectangle {
    // nu se respecta liskov substitution principle
    // square are constrangeri suplimentare (are inaltimea si latimea egale)
    // solutie: implementarea unei interfete
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}
