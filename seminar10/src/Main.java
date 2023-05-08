import ro.ase.cts.decorator.BasicSubscription;
import ro.ase.cts.decorator.HDStreamingDecorator;
import ro.ase.cts.decorator.OfflineViewingDecorator;
import ro.ase.cts.decorator.Subscription;

public class Main {
    public static void main(String[] args) {
        // codul client

        // creeaza un abonament de baza
        Subscription subscription = new BasicSubscription();

        // adauga optiune de vizionare offline
        subscription = new OfflineViewingDecorator(subscription);

        // adauga optiune de vizionare in calitate HD
        subscription = new HDStreamingDecorator(subscription);

        // afiseaza descrierea si pretul final al abonamentului
        System.out.println("Descriere: " + subscription.getDescription());
        System.out.println("Pret: " + subscription.getPrice());
    }
}