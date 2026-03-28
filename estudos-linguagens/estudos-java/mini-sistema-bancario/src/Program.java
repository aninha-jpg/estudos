import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){

        System.out.println("╭── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ──╮");
        System.out.println("        Welcome");
        System.out.println("╰── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ──╯");

        System.out.print("✿ Enter account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();
        System.out.print("✿ Enter account holder: ");
        String name = sc.nextLine();
        
        System.out.print("✿ Is there na initial deposit (y/n)?");
        char aux = sc.next().charAt(0);

        Account account;

        if(aux != 'n'){
            System.out.print("✿ Enter initial deposit value: ");
            double value = sc.nextDouble();
            account = new Account(name, numberAccount, value);
        } else {
            account = new Account(name, numberAccount);
        }

        System.out.println("╭── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ──╮");
        System.out.println("      Account Data");
        System.out.println("╰── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ──╯");

        System.out.printf("✿ Account %s%n✿ Holder: %s%n✿ Balance: %.2f%n", account.getNumberAccount(), account.getName(), account.getValue());

        int choice = 0;

        while (choice != 3){
            System.out.println("⋅ ⋅ ── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ── ⋅ ⋅");
            System.out.println("✿ 1. Make a deposit \n ✿ 2. Withdraw Money \n ✿ 3. End \n");
            choice = sc.nextInt();

            if(choice == 1){
                System.out.println("✿ Enter a deposit value: ");
                double value = sc.nextDouble();

                if(value > 0){
                account.addValue(value);
                System.out.println("╭── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ──╮");
                System.out.println("   Update Account Data");
                System.out.println("╰── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ──╯");

                System.out.printf("✿ Account %s%n✿ Holder: %s%n✿ Balance: %.2f%n", account.getNumberAccount(), account.getName(), account.getValue());

                } else {
                    System.out.println("✿ Enter a valid value.");
            }
        }

            if(choice == 2){
                System.out.println("✿ Enter a withdraw value: ");
                double value = sc.nextDouble();

                if(value <= account.getValue() && value >= 0 && account.getValue() > 0){
                    account.removeValue(value);
                    System.out.println("╭── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ──╮");
                    System.out.println(" Update Account Data");
                    System.out.println("╰── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ──╯");

                    System.out.printf("✿ Account %s%n✿ Holder: %s%n✿ Balance: %.2f%n", account.getNumberAccount(), account.getName(), account.getValue());

                } else {
                    System.out.println("✿ Enter a valid value.");
                }

            }
        }
        System.out.println("╭── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ──╮");
        System.out.println("          End");
        System.out.println("╰── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ──╯");
        }
    }
}
