package ro.ase.builder.burger;

public class BurgerSimpluBuilder implements BurgerBuilder {
    private Burger burger;

    public BurgerSimpluBuilder() {
        this.burger = new BurgerSimplu();
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

    @Override
    public Burger getBurger() {
        return this.burger;
    }
}
