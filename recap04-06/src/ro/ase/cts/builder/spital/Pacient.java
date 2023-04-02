package ro.ase.cts.builder.spital;

public interface Pacient {
    public void setPatRabatabil(boolean eRabatabil);

    public void setMicDejun(boolean eInclus);

    public void setPapuci(boolean arePapuci);
    public void setHalatInterior(boolean areHalat);

    public void showDetails();
}
