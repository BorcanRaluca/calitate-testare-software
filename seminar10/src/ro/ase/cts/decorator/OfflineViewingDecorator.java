package ro.ase.cts.decorator;

// decorator pentru adaugarea de optiun de vizioanare offline
public class OfflineViewingDecorator extends SubscriptionDecorator {

    public OfflineViewingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", vizionare offline";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5.0;
    }
}
