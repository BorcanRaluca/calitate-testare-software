package ro.ase.cts.builder.banca;

public class ContSimplu implements Cont {
    private boolean cardAtasat;
    private boolean internetBanking;
    @Override
    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    @Override
    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public void showDetails() {
        System.out.println("Cont simplu cu urm. facilitati:");
        if(this.internetBanking) {
            System.out.println("** internet banking **");
        }
        if(this.cardAtasat) {
            System.out.println("** card atasat **");
        }
    }
}
