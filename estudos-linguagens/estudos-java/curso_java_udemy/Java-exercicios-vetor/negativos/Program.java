import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){
        
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i<n; i++){

        sc.nextLine();
        System.out.print("Digite um número: ");
        vect[i] = sc.nextInt();

        }
        System.out.println("Números Negativos: ");
        for(int i = 0; i < n; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
        }
    }
}