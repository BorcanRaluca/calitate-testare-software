package ro.ase.cts.unittestslab;

public class BankAccount {
    // Format: LLCCLLLL################
    // Primele 2 litere - cod de tara, CC - doua cifre de control, LLLL - codeul bancii
    private String ibanCode;
    private double amount;
    //Format: LLL (Ex.: RON, EUR, USD)
    private String currency;
    private boolean blocked;

    public BankAccount() {
        this.ibanCode = null;
        this.amount = 0.0;
        this.currency = null;
        this.blocked = false;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void block() {
        this.blocked = true;
    }

    public void unblock() {
        this.blocked = false;
    }

    public String getIbanCode() {
        return ibanCode;
    }

    public void setIbanCode(String ibanCode) {
        if(ibanCode.matches("[A-Z]{2}[0-9]{2}[A-Z]{4}.{16}")) {
            this.ibanCode = ibanCode;
        } else {
            this.ibanCode = "";
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        if(currency.matches("[A-Z]{3}")) {
            this.currency = currency;
        } else {
            this.currency = "";
        }
    }
}
