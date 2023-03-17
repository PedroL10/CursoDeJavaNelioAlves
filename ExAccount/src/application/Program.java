package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = null;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there a initial deposit: (y/n)");
        char resp = sc.next().charAt(0);

        if(resp == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            acc = new Account(number, name, initialDeposit);
        } else {
            acc = new Account(number, name);
        }


        System.out.println();
        System.out.println("Account data");
        System.out.println("Account: " + acc.number + "| Holder: " + acc.name + " | Balance: " + acc.getSaldo());

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        acc.deposit(deposit);



        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        acc.withdraw(withdraw);

        System.out.println("Updated account data");
        System.out.println("Account: " + acc.number + " | Holder: " + acc.name + " | Balance: " + acc.getSaldo());

	}

}
