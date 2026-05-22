import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class  Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the number of employees: ");
            int n = sc.nextInt();

            List<Employee> employees = new ArrayList<>();

            for(int i = 0; i < n; i++){
                System.out.println("Employee #" + (1 + i) + " data: ");
                sc.nextLine();
                System.out.print("Outsourced (y/n)? ");
                char option = sc.next().charAt(0);
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                sc.nextLine();
                System.out.print("Value Per Hour: ");
                Double valuePerHour = sc.nextDouble();

                if(option == 'y'){
                    System.out.print("Addition Charge: ");
                    Double additionalCharge = sc.nextDouble();
                    employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

                } else {
                    employees.add(new Employee(name, hours, valuePerHour));
                }
            }

            System.out.println();
                System.out.println("PAYMENTS: ");
                
                for(Employee emp: employees){
                    System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
                }



        }
    }
}