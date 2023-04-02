package ro.ase.builder.burger;

public class Restaurant {
    private BurgerBuilder burgerBuilder;

    public Restaurant(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public void buildBurger() {
        this.burgerBuilder.buildCarne();
        this.burgerBuilder.buildChifla();
        this.burgerBuilder.buildCondimente();
        this.burgerBuilder.buildLegume();
        this.burgerBuilder.buildSos();

        if(burgerBuilder instanceof BurgerExtraBuilder) {
            ((BurgerExtraBuilder)this.burgerBuilder).buildMuraturi();
        }
    }

    public Burger getBurger() {
        return this.burgerBuilder.getBurger();
    }
}
