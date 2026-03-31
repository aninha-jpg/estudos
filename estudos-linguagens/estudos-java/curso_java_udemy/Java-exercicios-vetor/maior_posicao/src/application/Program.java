package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Quantos números você vai digitar? ");
            int n = sc.nextInt(); 

            double[] vect = new double[n];

            for(int i = 0; i<n;i++){
                System.out.print("Digite um número: ");
                vect[i] = sc.nextDouble();
            }

            int indMaior = 0;
            double maiorValor = vect[0];
            for(int i = 0; i<vect.length;i++){
                if(vect[i] > maiorValor){
                    maiorValor = vect[i];
                    indMaior = i;
                }
            }
            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Posição maior valor: " + indMaior);

        }
    }
}
