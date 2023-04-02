package ro.ase.cts.builder.banca;

public class ContDirector {
    private ContBuilder contBuilder;

    public ContDirector(ContBuilder contBuilder) {
        this.contBuilder = contBuilder;
    }

    public void buildCont() {
        this.contBuilder.buildCardAtasat();
        this.contBuilder.buildInternetBanking();

        if(this.contBuilder instanceof ContPremiumBuilder) {
            ((ContPremiumBuilder)this.contBuilder).buildAbonamentSala();
        }
    }
    public Cont getCont() {
        return this.contBuilder.getCont();
    }

}
