import entities.Person;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){
        System.out.print("How many rooms will be rented?");
        int n = sc.nextInt();
        Person[] vect = new Person[10];

        for (int i = 0; i<n; i++){
            System.out.println("Rent #" + (i+1));
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            if(vect[room] != null){
                System.out.println("busy room!");
            } else {
                vect[room] = new Person(name, email);
            }
        }
        System.out.println();
        System.out.println("Busy rooms: ");
        for(int i = 0; i<vect.length; i++){
            if(vect[i] != null){
                System.out.println((i+1) + ": " + vect[i]);
            } 
        }
        
    }
}
}