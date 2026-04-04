import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){
            
            System.out.printf("How many employess will be registered?");
            int n = sc.nextInt();

            List<Employee> listEmployee = new ArrayList<>();

            for(int i = 0; i<n; i++){
                System.out.println("Employee #" + (i+1));
                sc.nextLine();
                System.out.print("ID: ");
                int id = sc.nextInt();
                while (hasId(listEmployee, id)){
                    System.out.print("ID already taken!, try again. ID: ");
                    id = sc.nextInt();
                }
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                Employee emp = new Employee(name, id, salary);

                listEmployee.add(emp);
               
            }

            System.out.print("Enter the employee ID that will have salary increase: ");
            int idTemp = sc.nextInt();

            Employee result = listEmployee.stream()
                .filter(Employee -> Employee.getId() == idTemp)
                .findFirst().orElse(null);
            if(result == null){
                System.out.println("This id does not exist");
            } else {
                System.out.print("Enter the percentage: ");
                double tempPercentage = sc.nextDouble();

                result.increaseSalary(tempPercentage);
            }

            System.out.print("Enter the percentage: ");
            System.out.println("List of employees:");
            for (Employee obj : listEmployee){
                System.out.println(obj);
            }

        }
    }

    public static boolean hasId(List<Employee> listEmployee, int id){
        Employee result = listEmployee.stream()
            .filter(Employee -> Employee.getId() == id)
            .findFirst().orElse(null);
                return result != null;
    }
}
