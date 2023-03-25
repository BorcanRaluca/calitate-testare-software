import ro.ase.cts.singleton.Server;

public class Main {
    public static void main(String[] args) {
        Server server = Server.getInstance();
        System.out.println(server.showStatus());
        System.out.println();

        Server server2 = Server.getInstance(8085, "cts4.2");
        System.out.println(server.showStatus());
        System.out.println(server2.showStatus());
        System.out.println();

        Server server3 = Server.getInstance(8085, "cts_seminar4");
        System.out.println(server.showStatus());
        System.out.println(server2.showStatus());
        System.out.println(server3.showStatus());
        System.out.println();

        // TEMA - implementare singleton
        // O fabrica de masini care implementeaza un sistem centralizat de monitorizare a productiei.
        // Sistemul trebuie sa asigure adaugarea si modificarea datelor despre masinile fabricate la nivelul sediului
        // central, intr-un mediu securizat (sistemul va exista sub forma unui server dispus in datacenter-ul din HQ)
        // Programatorii trebuie sa se asigure ca sistemul nu va putea fi replicat si ca toate datele vor fi
        // manageriate prin intermediul singurului server mentionat anterior.
    }
}