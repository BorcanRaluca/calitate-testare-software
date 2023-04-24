package ro.ase.cts.adapter;// adapter
// de obiecte --> 'has a' (generic)
// de clase --> 'is a' (parser)

import ro.ase.cts.adapter.generic.Adaptee;
import ro.ase.cts.adapter.generic.Adapter;
import ro.ase.cts.adapter.generic.Target;

public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}