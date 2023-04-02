package ro.ase.cts.prototype.spital;

import java.util.HashMap;
import java.util.Map;

public class Laborator {
    private Map<String, Reteta> retete = new HashMap<>();

    public Laborator() {
        retete.put("theraflu", new RetetaTheraflu());
    }

    public Reteta generateReteta(String tipReteta, String substantaActiva, int dozaj) {
        Reteta reteta = null;
        try {
            reteta = retete.get(tipReteta).clone();
            reteta.setSubstantaActiva(substantaActiva);
            reteta.setDozaj(dozaj);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return reteta;
    }
}
