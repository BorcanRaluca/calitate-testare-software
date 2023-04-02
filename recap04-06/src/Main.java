import ro.ase.cts.factory.spital.AsistentFactory;
import ro.ase.cts.factory.spital.MedicFactory;
import ro.ase.cts.factory.spital.Personal;
import ro.ase.cts.factory.spital.PersonalFactory;
import ro.ase.cts.singleton.spital.Spital;

public class Main {
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
        // În cadrul aplicatiei personalul spitalului este de mai multe tipuri.
        // Acestea sunt salvate într-un enum { Brancardier, Asistent, Medic}. Sa se implementeze
        // modulul care pune la dispozitie crearea de obiecte din familia obiectelor
        // PersonalSpital in functie de tipul primit ca parametru. - implemenntat ca factory method,
        // nu ca simple factory.
        PersonalFactory factory = new AsistentFactory();
        Personal personal = factory.createPersonal();
        spital.addPersonal(personal);

        factory = new MedicFactory();
        personal = factory.createPersonal();
        spital.addPersonal(personal);

        Spital spitalNou = Spital.getInstance();
        spitalNou.showPersonal();
    }
}