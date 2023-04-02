package ro.ase.builder.burger;

public interface BurgerBuilder {
    public void buildChifla();
    public void buildCarne();
    public void buildSos();
    public void buildLegume();
    public void buildCondimente();

    public Burger getBurger();
}
