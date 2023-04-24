package ro.ase.cts.facade.example2;

public class DealerAuto {
    private MasinaFamilie masinaFamilie;
    private MasinaElectrica masinaElectrica;
    private MasinaSport masinaSport;
    public DealerAuto() {
        this.masinaElectrica = new MasinaElectrica("Aceasta este o masina electrica");
        this.masinaSport = new MasinaSport("Aceasta este o masina sport");
        this.masinaFamilie = new MasinaFamilie("Aceasta este o masina familie");
    }

    public String getDescriereMasinaSport() {
        return this.masinaSport.getDescriere();
    }
    public String getDescriereMasinaElectrica() {
        return this.masinaElectrica.getDescriere();
    }
    public String getDescriereMasinaFamilie() {
        return this.masinaFamilie.getDescriere();
    }
}
