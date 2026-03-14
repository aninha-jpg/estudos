import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
        *  Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

        Entrada
        Leia três valores de ponto flutuante (double) A, B e C.

        Saída
        Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem. nombre de la clase debe ser "Main" para que su solución ejecutar

        delta = b² -4.a.c 

        bhaskara = -b+- raiz2 delta / 2.a

        x1 = +
        x2 = -
 */
public class Bhaskara {
 
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)){

            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();

            double delta = (B * B)-(4 * A * C);

            if (delta < 0 || A == 0) {
                System.out.println("Impossivel calcular");
                return;
            }

            double raizQuadradaDelta = Math.sqrt(delta);

            double bNegativo = B * -1;

            double x1 = (bNegativo + raizQuadradaDelta) / (2 * A);

            double x2 = (bNegativo - raizQuadradaDelta) / (2 * A);
            
            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);

        }
 
    }
 
}