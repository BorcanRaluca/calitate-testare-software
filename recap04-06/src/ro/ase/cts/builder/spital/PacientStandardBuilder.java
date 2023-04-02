package ro.ase.cts.builder.spital;

public class PacientStandardBuilder implements PacientBuilder {
    Pacient pacient;

    public PacientStandardBuilder() {
        this.pacient = new PacientStandard();
    }

    @Override
    public void buildPatRabatabil(boolean eRabatabil) {
        this.pacient.setPatRabatabil(eRabatabil);
    }

    @Override
    public void buildMicDejun(boolean eInclus) {
        this.pacient.setMicDejun(eInclus);
    }

    @Override
    public void buildPapuci(boolean arePapuci) {
        this.pacient.setPapuci(arePapuci);
    }

    @Override
    public void buildHalatInterior(boolean areHalat) {
        this.pacient.setHalatInterior(areHalat);
    }

    @Override
    public Pacient getFacilitatiPacient() {
        return this.pacient;
    }
}
