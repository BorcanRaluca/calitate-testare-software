package ro.ase.cts.facade;

// ascunsa interfata mai complexa ca sa nu se observe operatiile din spate

import ro.ase.cts.facade.example1.ShapeMaker;
import ro.ase.cts.facade.example2.DealerAuto;

public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        DealerAuto dealerAuto = new DealerAuto();
        String descriere = dealerAuto.getDescriereMasinaSport();
        System.out.println(descriere);

        descriere = dealerAuto.getDescriereMasinaElectrica();
        System.out.println(descriere);

        descriere = dealerAuto.getDescriereMasinaFamilie();
        System.out.println(descriere);
    }
}
