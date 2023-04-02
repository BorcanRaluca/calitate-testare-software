import ro.ase.cts.factory.banca.ClientFactory;
import ro.ase.cts.factory.banca.PersoanaFizicaFactory;
import ro.ase.cts.factory.banca.PersoanaJuridicaFactory;
import ro.ase.cts.singleton.banca.Banca;

public class BancaMain {
    public static void main(String[] args) {
        // SINGLETON BANCA
        // O banca ce gestioneaza clientii sai.
        // Sistemul trebuie sa asigure adaugarea si modificarea datelor
        // despre acestia. Sistemul nu va putea fi replicat si toate
        // datele vor fi manageriate prin intermediul unui singur obiect ce exista la nivel
        // de aplicatie.
        Banca banca1 = Banca.getInstance();

        // FACTORY BANCA
        // Banca ofera servicii pentru persoane juridice .i pentru persoane fizice. Sa se implementeze
        // modulul care construie.te obiecte din familia de clien.i ai bancii. Modulul trebuie realizat, astfel
        // încât pentru adaugari de noi tipuri de clien.i sa nu fie necesare modificari în codul existent.
        ClientFactory clientFactory = new PersoanaFizicaFactory();
        banca1.addClient(clientFactory.createClient());

        clientFactory = new PersoanaJuridicaFactory();
        banca1.addClient(clientFactory.createClient());

        Banca banca2 = Banca.getInstance();
        banca2.addClient(clientFactory.createClient());
        banca2.showClienti();

        // BUILDER BANCA

        // PROTOTYPE BANCA
    }
}
