package ro.ase.cts.singleton;

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
