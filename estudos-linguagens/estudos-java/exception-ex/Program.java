import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.entities.DomainException;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){

            try {

                System.out.println("Enter Account data: ");
                System.out.print("Number: ");
                int number = sc.nextInt();
                sc.nextLine();
                System.out.print("Holder: ");
                String holder = sc.nextLine();
                System.out.print("Initial balance: ");
                Double balance = sc.nextDouble();
                System.out.print("Withdraw Limit: ");
                Double withdrawLimit = sc.nextDouble();


                Account account = new Account(number, holder, balance, withdrawLimit);


                System.out.print("Enter amount for withdraw: ");
                Double amount = sc.nextDouble();
                account.withdraw(amount);
                System.out.println("New balance: " + account.getBalance());


            }
            catch(DomainException e){
                System.out.println("Withdraw error: " + e.getMessage());
            }


        }
    }
}
