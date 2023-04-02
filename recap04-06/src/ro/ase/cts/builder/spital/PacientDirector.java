package ro.ase.cts.builder.spital;

public class PacientDirector {
    PacientBuilder pacientBuilder;

    public PacientDirector(PacientBuilder pacientBuilder) {
        this.pacientBuilder = pacientBuilder;
    }

    public void buildFacilitatiPacient() {
        this.pacientBuilder.buildPapuci(false);
        this.pacientBuilder.buildMicDejun(false);
        this.pacientBuilder.buildPatRabatabil(false);
        this.pacientBuilder.buildHalatInterior(false);
    }

    public Pacient getFacilitati() {
        return this.pacientBuilder.getFacilitatiPacient();
    }
}
