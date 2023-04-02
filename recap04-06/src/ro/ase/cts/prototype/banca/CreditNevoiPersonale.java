package ro.ase.cts.prototype.banca;

public class CreditNevoiPersonale implements Credit {
    private float sumaImprumut = 0;
    @Override
    public void setSumaImprumut(float suma) {
        this.sumaImprumut = suma;
    }

    @Override
    public void showDetails() {
        System.out.println("Credit de nevoi personale");
    }

    @Override
    public Credit clone() throws CloneNotSupportedException {
        return (CreditNevoiPersonale)super.clone();
    }
}
