package Training.Bank;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Bank bank;

    System.out.print("Enter account number: ");
    int number = sc.nextInt();
    System.out.print("Enter account holder: ");
    sc.nextLine();
    String holder = sc.nextLine();
    System.out.print("Is there an initial deposit? [Y/N]: ");
    char option = sc.next().charAt(0);
    if (option == 'Y') {
      System.out.print("Enter initial deposit value: ");
      double initialDeposit = sc.nextDouble();
      bank = new Bank(number, holder, initialDeposit);
    } else {
      bank = new Bank(number, holder);
    }

    System.out.println();
    System.out.println("Account data:");
    System.out.print(bank);

    System.out.println();
    System.out.print("Enter a deposit value: ");
    double depositValue = sc.nextDouble();
    bank.depositMoney(depositValue);
    System.out.println("Updated account data: " + bank);

    System.out.println();
    System.out.print("Enter a withdraw value: ");
    double withdrawValue = sc.nextDouble();
    bank.withdrawMoney(withdrawValue);
    System.out.println("Updated account data: " + bank);

    sc.close();
  }
}
