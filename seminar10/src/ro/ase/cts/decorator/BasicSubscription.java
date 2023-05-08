package ro.ase.cts.decorator;

// implementarea de baza a unui abonament
public class BasicSubscription implements Subscription {
    @Override
    public String getDescription() {
        return "Abonament de baza";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
