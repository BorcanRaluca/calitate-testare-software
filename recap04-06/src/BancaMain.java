import ro.ase.cts.builder.banca.*;
import ro.ase.cts.factory.banca.Client;
import ro.ase.cts.factory.banca.ClientFactory;
import ro.ase.cts.factory.banca.PersoanaFizicaFactory;
import ro.ase.cts.factory.banca.PersoanaJuridicaFactory;
import ro.ase.cts.prototype.banca.CreditClient;
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
        Client client1 = clientFactory.createClient();
        banca1.addClient(client1);

        clientFactory = new PersoanaJuridicaFactory();
        Client client2 = clientFactory.createClient();
        banca1.addClient(client2);

        Banca banca2 = Banca.getInstance();
        banca2.addClient(clientFactory.createClient());
        banca2.showClienti();

        // BUILDER BANCA
        // Banca pune la dispoziția clienților posibilitatea de creare de conturi pentru care dacă un client
        // dorește poate să seteze să fie contul în care să primească salariul, să fie cu card atașat sau să
        // aibă internet banking. În cazul în care clientul nu setează aceste informații, contul
        // este creat fără aceste facilități.
        // DIRECTORUL --> CLASA CLIENT
        ContSimpluBuilder contSimpluBuilder = new ContSimpluBuilder();
        ContDirector director = new ContDirector(contSimpluBuilder);
        director.buildCont();
        ContSimplu contSimplu = (ContSimplu) director.getCont();
        contSimplu.setCardAtasat(true);
        contSimplu.showDetails();

        ContPremiumBuilder contPremiumBuilder = new ContPremiumBuilder();
        director = new ContDirector(contPremiumBuilder);
        director.buildCont();
        ContPremium contPremium = (ContPremium) director.getCont();
        contPremium.setAbonamentSala(true);
        contPremium.setInternetBanking(true);
        contPremium.setCardAtasat(true);
        contPremium.showDetails();

        // PROTOTYPE BANCA
        // Banca oferă clienților pachete pentru realizarea de credite de nevoie
        // personale sau credite ipotecare. Să se implementeze modulul de construire de obiecte
        // din familia creditelor astfel incat sa nu se piarda mult timp pe construirea unui cont.
        CreditClient credite = new CreditClient();
        banca1.addCredit(credite.generateCredit("nevoi", 5000));
        banca1.addCredit(credite.generateCredit("ipotecar", 150000));
        banca1.addCredit(credite.generateCredit("nevoi", 7500));
        banca1.showCredite();
    }
}
