package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

// composite
public class Panel implements Component {
    private List<Component> componente = new ArrayList<>();

    public void adaugaComponenta(Component componenta) {
        this.componente.add(componenta);
    }

    public void eliminaComponenta(Component componenta) {
        this.componente.remove(componenta);
    }
    @Override
    public void render() {
        System.out.println("Se afiseaza panoul...");

        for(Component componenta: componente) {
            componenta.render();
        }
    }
}
