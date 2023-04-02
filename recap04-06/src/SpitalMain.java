import ro.ase.cts.builder.spital.Pacient;
import ro.ase.cts.builder.spital.PacientBuilder;
import ro.ase.cts.builder.spital.PacientStandardBuilder;
import ro.ase.cts.builder.spital.PacientDirector;
import ro.ase.cts.factory.spital.AsistentFactory;
import ro.ase.cts.factory.spital.MedicFactory;
import ro.ase.cts.factory.spital.Personal;
import ro.ase.cts.factory.spital.PersonalFactory;
import ro.ase.cts.prototype.spital.Laborator;
import ro.ase.cts.prototype.spital.Reteta;
import ro.ase.cts.singleton.spital.Spital;

public class SpitalMain {
    public static void main(String[] args) {
        // SINGLETON SPITAL
        // Un spital care monitorizeaza pacientii sai si personalul
        // din cadrul spitalului. Sistemul trebuie sa
        // asigure adaugarea si modificarea datelor despre acestia. Programatorii
        // trebuie sa se asigure ca sistemul nu va putea fi replicat si ca toate
        // datele vor fi manageriate prin intermediul unui singur obiect ce exista la nivel
        // de aplicatie.
        Spital spital = Spital.getInstance();

        // FACTORY SPITAL
        // În cadrul aplicatiei personalul spitalului este de mai multe
        // tipuri: Brancardier, Asistent, Medic. Sa se implementeze modulul care pune la
        // dispozitie crearea de obiecte din familia obiectelor PersonalSpital. Modulul
        // trebuie realizat, astfel încât pentru adaugari de noi tipuri de personal sa
        // nu fie necesare modificari în codul existent.
        PersonalFactory factory = new AsistentFactory();
        Personal personal = factory.createPersonal();
        spital.addPersonal(personal);

        factory = new MedicFactory();
        personal = factory.createPersonal();
        spital.addPersonal(personal);

        Spital spitalNou = Spital.getInstance();
        spitalNou.showPersonal();

        // BUILDER SPITAL
        // Atunci când un pacient este internat in cadrul aplicatiei
        // se face salvarea acestuia. Fiecare pacient are posibilitatea sa
        // plateasca extra pentru anumite facilitate precum: pat rabatabil,
        // mic dejun inclus, papuci de camera, halat pentru interior.
        // In cazul in care pacientul nu alege aceste facilita.i extra,
        // in cadrul aplica.iei sunt setate cu false. Sa se dezvolte modulul
        // care asigura crearea de obiecte de tipul pacient cu optiuni extra.
        PacientBuilder pacientBuilder = new PacientStandardBuilder();
        PacientDirector pacientDirector = new PacientDirector(pacientBuilder);
        pacientDirector.buildFacilitatiPacient();

        Pacient pacient1 = pacientDirector.getFacilitati();
        pacient1.setPapuci(true);
        pacient1.setHalatInterior(true);

        pacientBuilder = new PacientStandardBuilder();
        pacientDirector = new PacientDirector(pacientBuilder);
        pacientDirector.buildFacilitatiPacient();
        Pacient pacient2 = pacientDirector.getFacilitati();
        pacient2.setMicDejun(true);

        // PROTOTYPE SPITAL - MEDICAMENT
        // Spitalul are în dotare și un laborator în care mai mulți chimiști
        // produc diferite rețete pentru medicamente. În momentul în care o
        // rețetă este produsă trebuie ținut cont de cantitățile din soluțiile
        // care sunt folosite. Dacă o rețetă este creată este recomandat să fie
        // folosită pentru crearea viitoarelor medicamente fără a se trece prin
        // procesul de creare al rețetei. Să se implementeze modulul care facilitează
        // crearea de noi obiecte de rețete fără a fi nevoie de apelul constructorului.
        Laborator laborator = new Laborator();
        Reteta reteta = laborator.generateReteta("theraflu", "paracetamol", 50);
        reteta.showDetails();
    }
}