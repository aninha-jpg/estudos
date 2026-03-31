import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Quantos números vai ter o vetor?");
        int n = sc.nextInt();

        int[] vect = new int[n];

        int soma = 0;
        int media;
        int numerosPares = 0;

        for(int i = 0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();

            if(vect[i] % 2 == 0){
                soma += vect[i];
                numerosPares++;
            }
        }

        if(numerosPares == 0){
            System.out.println("Nenhum número par");
        }else{
            media = soma / numerosPares;
            System.out.print("Média dos pares: " + media);
        }
        }
    }
}