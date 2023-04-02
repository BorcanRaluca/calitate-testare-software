package ro.ase.builder.burger;

public class BurgerExtra implements Burger {
    private String chifla;
    private String carne;
    private String sos;
    private String legume;
    private String condimente;
    private String muraturi;
    @Override
    public void setChifla(String chifla) {
        this.chifla = chifla;
    }

    @Override
    public void setCarne(String carne) {
        this.carne = carne;
    }

    @Override
    public void setSos(String sos) {
        this.sos = sos;
    }

    @Override
    public void setLegume(String legume) {
        this.legume = legume;
    }

    @Override
    public void setCondimente(String condimente) {
        this.condimente = condimente;
    }

    public void setMuraturi(String muraturi) {
        this.muraturi = muraturi;
    }
}
