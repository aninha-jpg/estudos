import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Quantos números vai ter o vetor?");
        int n = sc.nextInt();

        double[] vect = new double[n];

        double soma = 0;

        for(int i = 0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();

            soma += vect[i];
        }

        double media = soma / n;

        System.out.printf("Media do vetor: %.3f%n", media);
        System.out.println("Elementos abaixo da média: ");
        for(int i = 0; i<n; i++){
            if(vect[i] < media){
                System.out.println(vect[i]);
            }
        }
        }
    }
}