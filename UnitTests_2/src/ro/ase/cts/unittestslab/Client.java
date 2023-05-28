package ro.ase.cts.unittestslab;

import java.util.ArrayList;
import java.util.List;

public class Client {
    //Minim 5 caractere, trebuie sa contina cel putin un spatiu (Ex.:Nume Prenume)
    private String name;
    //CNP valid
    private String id;
    private List<BankAccount> accounts;

    public Client() {
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 5 && name.contains(" ")) {
            this.name = name;
        } else {
            this.name = "";
        }
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.matches("[0-9]{13}")) {
            int s = Integer.parseInt(String.valueOf(id.charAt(0)));
//            int year = Integer.parseInt(id.substring(1, 3));
            int month = Integer.parseInt(id.substring(3, 5));
            int day = Integer.parseInt(id.substring(5, 7));
            if((s > 0 && s < 9) && (month > 0 && month <= 12) && (day > 0 && day <= 31)) {
                this.id = id;
            } else {
                this.id = "";
            }
        } else {
            this.id = "";
        }
    }

    public void addAccount(BankAccount bankAccount)
    {
        this.accounts.add(bankAccount);
    }
}
