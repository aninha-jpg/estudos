import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Quantos números você vai digitar?");
            int n = sc.nextInt();

            double[] vect = new double[n];

            for(int i=0;i<n;i++){
                sc.nextLine();
                System.out.print("Digite um número: ");
                vect[i] = sc.nextDouble();
            }

            double sum = 0.0;
            for(int i=0;i<n;i++){
                sum += vect[i];
            }
            System.out.print("Valores: ");
            for(int i = 0; i<n; i++){
                System.out.print(vect[i] + " - ");
            }
            System.out.println();
            double media = sum / n;
            System.out.printf("Soma: %.2f%n", sum);
            System.out.printf("Média: %.2f%n", media);


        }
    }

}
