package ro.ase.cts.prototype.banca;

import java.util.HashMap;
import java.util.Map;

public class CreditClient {
    private Map<String, Credit> credite = new HashMap<>();

    public CreditClient() {
        credite.put("nevoi", new CreditNevoiPersonale());
        credite.put("ipotecar", new CreditIpotecar());
    }

    public Credit generateCredit(String tip, float sumaImprumut) {
        Credit credit = null;

        try {
            credit = credite.get(tip).clone();
            credit.setSumaImprumut(sumaImprumut);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return credit;
    }
}
