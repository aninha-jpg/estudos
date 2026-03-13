import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try(Scanner leitor = new Scanner(System.in)){
            System.out.println("------------- Adivinhe o Número! -------------");
            System.out.println("\n Escolha a Dificuldade: \n 1. Fácil \n 2. Médio. \n 3. Difícil.");
            int dificuldade = leitor.nextInt();
            leitor.nextLine();
            Random gerador = new Random();
            int numeroSecreto = gerador.nextInt(100) + 1;
            int limiteTentativas = 0;

            int palpite;
            boolean acertou = false;

            switch (dificuldade) {
                case 1 -> {
                    limiteTentativas = 10;
                }
                case 2 -> {
                    limiteTentativas = 7;
                }

                case 3 -> {
                    limiteTentativas = 3;
                }
            }

            do { 
                System.out.println("Tentativas restantes: " + limiteTentativas);
                System.out.println("Digite seu palpite: ");
                palpite = leitor.nextInt();
                leitor.nextLine();

                if (palpite == numeroSecreto){
                    System.out.println("------------- Parabéns!! Você acertou o número! -------------");
                    acertou = true;
                } else if (numeroSecreto > palpite) {
                    System.out.println("O Número Secreto é Maior que: " + palpite);
                } else {
                    System.out.println("O Número Secreto é Menor que: " + palpite);
                }

                limiteTentativas--;
            } while (!acertou && limiteTentativas > 0);
            if (limiteTentativas == 0 && !acertou){
                System.out.println("Que pena! suas tentativas acabaram! o número era: " + numeroSecreto);
            }

        }
    }
}