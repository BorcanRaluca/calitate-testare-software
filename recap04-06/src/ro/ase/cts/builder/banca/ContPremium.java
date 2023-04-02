package ro.ase.cts.builder.banca;

public class ContPremium implements Cont {
    private boolean cardAtasat;
    private boolean internetBanking;
    private boolean abonamentSala;
    @Override
    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    @Override
    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    public void setAbonamentSala(boolean abonamentSala) {
        this.abonamentSala = abonamentSala;
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
        if(this.abonamentSala) {
            System.out.println("***** abonament sala redus(?) *****");
        }
    }
}
