package ro.ase.cts.singleton;

// 1 instanta unica in aplicatie
// exemplu: crearea unui server
// public class Server {
//      int portNumber;
//  	String name;
//
//	!!
//	private static Server instance;
//
//	!!
//	private Server() {
//	}
//
//	!!
//	public static Server getInstance() {
//		verific daca instanta a fost accesata anterior (by default il fac null si verific daca
// e diferit de null)
//		daca este prima accesare --> Server.instance = new Server();
//		daca nu este prima accesare --> nu se intampla nimic
//		return Server.instance
// 	 }
// }
// instanta trebuie sa fie statica si privata (referinta la clasa)
// - nu creem obiecte => metoda getInstance este statica => n-avem acces la this => campul trebuie
// sa fie static
// - also din moment ce nu se creeaza obiecte, instanta trebuie sa fie la nivel de clasa, nu la
// nivel de obiect
//
// - mi-am creat instanta si vreau sa apelez o alta metoda => trebuie sa controlez crearea instantei pt
// a nu-si face de cap clasa => o metoda de preluare a instantei => getInstance() (metoda statica)

public class Server {
    private static Server instance = null;
    private int port;
    private String name;

    private Server(int port, String name) {
        this.port = port;
        this.name = name;
    }

    private Server() {
        this.port = 0;
        this.name = "";
    }

    public static Server getInstance(int port, String name) {
        if(Server.instance == null) {
            Server.instance = new Server(port, name);
        }
        if(port != instance.getPort()) {
            instance.setPort(port);
        }
        if(!name.equals(instance.getName())) {
            instance.setName(name);
        }

        return  Server.instance;
    }

    public static Server getInstance() {
        if(Server.instance == null) {
            Server.instance = new Server();
        }

        return Server.instance;
    }

    public String showStatus() {
        return "Server-ul " + this.name + " ruleaza pe portul " + this.port + "!";
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public String getName() {
        return name;
    }
}
