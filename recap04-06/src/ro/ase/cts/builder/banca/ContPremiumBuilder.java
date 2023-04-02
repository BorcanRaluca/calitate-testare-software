package ro.ase.cts.builder.banca;

public class ContPremiumBuilder implements ContBuilder {
    Cont cont = new ContPremium();
    @Override
    public void buildCardAtasat() {
        this.cont.setCardAtasat(false);
    }

    @Override
    public void buildInternetBanking() {
        this.cont.setInternetBanking(false);
    }

    public void buildAbonamentSala() {
        ((ContPremium)this.cont).setAbonamentSala(false);
    }

    @Override
    public Cont getCont() {
        return this.cont;
    }
}
