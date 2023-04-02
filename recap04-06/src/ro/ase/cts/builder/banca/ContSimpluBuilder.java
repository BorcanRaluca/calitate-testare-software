package ro.ase.cts.builder.banca;

public class ContSimpluBuilder implements ContBuilder {
    private Cont cont = new ContSimplu();
    @Override
    public void buildCardAtasat() {
        this.cont.setCardAtasat(false);
    }

    @Override
    public void buildInternetBanking() {
        this.cont.setInternetBanking(false);
    }

    @Override
    public Cont getCont() {
        return this.cont;
    }
}
