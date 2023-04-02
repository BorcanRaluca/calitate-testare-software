package ro.ase.cts.prototype.banca;

public class CreditIpotecar implements Credit {
    private float sumaImprumut = 0;
    @Override
    public void setSumaImprumut(float suma) {
        this.sumaImprumut = suma;
    }

    @Override
    public void showDetails() {
        System.out.println("Credit ipotecar");
    }

    @Override
    public Credit clone() throws CloneNotSupportedException {
        return (CreditIpotecar) super.clone();
    }
}
