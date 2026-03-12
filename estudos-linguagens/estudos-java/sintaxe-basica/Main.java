import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

        System.out.println("Qual é o seu nome?");
        String nomeDigitado = leitor.nextLine();

        System.out.println("E qual é sua idade?");
        int idadeDigitada = leitor.nextInt();
        System.out.println("valor?");
        String valor = leitor.nextLine();
        // Ele vai pular essa pergunta, sempre após um nextInt()/nextDouble(), colocar um NextLine() em branco....

        System.out.println("Muito prazer " + nomeDigitado + "!");
        System.out.println("Você tem: " + idadeDigitada + " anos."  + valor);
        System.out.println("Eu sou a Ana, este é meu início oficial na linguagem Java!!");
    }

    }
}

