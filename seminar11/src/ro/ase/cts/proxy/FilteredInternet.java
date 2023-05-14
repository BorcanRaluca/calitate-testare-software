package ro.ase.cts.proxy;

// the actual proxy
public class FilteredInternet implements Internet {
    private Internet internet;

    @Override
    public void connect(String url) {
        if(isAllowed(url)) {
            if(internet == null) {
                internet = new RealInternet();
            }
            internet.connect(url);
        } else {
            System.out.println("Access to " + url + " is blocked");
        }
    }

    private boolean isAllowed(String url) {
        // verificare a url-urilor blocate
        // aici - blocat orice url care contine socialmedia
        return !url.contains("socialmedia");
    }
}
