package ro.ase.cts.proxy;

public class RealInternet implements Internet {
    @Override
    public void connect(String url) {
        System.out.println("Connecting to " + url + "....");
    }
}