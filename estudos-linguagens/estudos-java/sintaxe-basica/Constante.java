import java.util.Scanner;

public class Constante {
    public static void main(String[] args) {
        final int maioridade = 18;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Qual é a sua idade?");
            int idadeDigitada = leitor.nextInt();
            leitor.nextLine();
            System.out.println("Seu objetivo estudando Java?");
            String objetivo = leitor.nextLine();

            if (idadeDigitada >= maioridade) {
                System.out.println("Acesso Liberado!");
            } else {
                System.out.println("Acesso Negado!");
            }

            System.out.println("Foco no objetivo: " + objetivo);
        }
    }
}
