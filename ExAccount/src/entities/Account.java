package entities;

public class Account {

    public int number;
    public String name;
    private double saldo;
    public double initialDeposit;

    public Account(int number, String name, double initialDeposit) { 
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }

    public Account(int number, String name) { 
        this.number = number;
        this.name = name;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void deposit(double amount) {
        this.saldo += amount;
    }

    public void withdraw(double amount) {
        this.saldo -= (amount + 5);
    }
	
}
