package ro.ase.cts.factory.banca;

public class PersoanaFizica implements Client {
    private String nume;
    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void showDetails() {
        System.out.println("Persoana Fizica");
    }
}
