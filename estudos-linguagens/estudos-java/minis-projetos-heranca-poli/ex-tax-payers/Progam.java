import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Payers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the number of tax payers: ");
            int n = sc.nextInt();
            sc.nextLine();
            List<Payers> pys = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                System.out.println("Tax payer #" + (i + 1) + " data: ");
                System.out.print("Individual or company (i/c)? ");
                char option = sc.next().toLowerCase().charAt(0);
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual Income: ");
                Double currentIncome = sc.nextDouble();

                if(option == 'c'){
                    System.out.print("Number of employees: ");
                    Integer employeeNumber = sc.nextInt();
                    sc.nextLine();

                    Payers py = new LegalPerson(name, currentIncome, employeeNumber);

                    pys.add(py);

                }

                if(option == 'i'){
                    System.out.print("Health expenditures: ");
                    Double healthcare = sc.nextDouble();

                    Payers py = new NaturalPerson(name, currentIncome, healthcare);

                    pys.add(py);

                }


            }

            System.out.println();
            System.out.println("TAXES PAID: ");
            Double sum = 0.0;
            for(Payers p : pys){
                System.out.print(p.getName() + ": $ " + String.format("%.2f", p.tax()));
            }

            for(Payers p: pys){
                sum += p.tax();
            }
            System.out.printf("TOTAL TAXES: $%.2f", sum);

        }
    }
}