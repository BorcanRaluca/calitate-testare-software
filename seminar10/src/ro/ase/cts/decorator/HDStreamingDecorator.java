package ro.ase.cts.decorator;

public class HDStreamingDecorator extends SubscriptionDecorator {
    public HDStreamingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", vizionare in calitate HD";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3.0;
    }
}
