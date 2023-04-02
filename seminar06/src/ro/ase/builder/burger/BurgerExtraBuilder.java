package ro.ase.builder.burger;

public class BurgerExtraBuilder implements BurgerBuilder {
    private Burger burger;

    public BurgerExtraBuilder() {
        this.burger = new BurgerExtra();
    }


    @Override
    public void buildChifla() {
        this.burger.setChifla("Chifla simpla");
    }

    @Override
    public void buildCarne() {
        this.burger.setCarne("Carne de pui");
    }

    @Override
    public void buildSos() {
        this.burger.setSos("Maioneza idk");
    }

    @Override
    public void buildLegume() {
        this.burger.setLegume("Salata si rosii");
    }

    @Override
    public void buildCondimente() {
        this.burger.setCondimente("sare si piper");
    }

    public void buildMuraturi() {
        ((BurgerExtra)this.burger).setMuraturi("Castraveti murati");
    }

    @Override
    public Burger getBurger() {
        return this.burger;
    }
}
