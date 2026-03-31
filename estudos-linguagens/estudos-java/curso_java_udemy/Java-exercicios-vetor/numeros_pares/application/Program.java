package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Quantos números você vai digitar? ");
            int n = sc.nextInt(); 

            int[] vect = new int[n];

            for(int i = 0; i<n;i++){
                System.out.print("Digite um número: ");
                vect[i] = sc.nextInt();
            }

            int count = 0;
            System.out.print("Números pares: ");
            for(int i = 0; i<vect.length;i++){
                if(vect[i] % 2 == 0){
                    System.out.print(vect[i] + " - ");
                    count++;
                }
            }
            System.out.print("quantidade de pares: " + count);


        }



    }
}
