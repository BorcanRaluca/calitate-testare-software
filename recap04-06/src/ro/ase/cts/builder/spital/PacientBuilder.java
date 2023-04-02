package ro.ase.cts.builder.spital;

public interface PacientBuilder {
    public void buildPatRabatabil(boolean eRabatabil);

    public void buildMicDejun(boolean eInclus);

    public void buildPapuci(boolean arePapuci);
    public void buildHalatInterior(boolean areHalat);

    public Pacient getFacilitatiPacient();
}
