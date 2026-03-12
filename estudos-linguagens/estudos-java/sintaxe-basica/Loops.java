import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            for (int i = 1; i <= 3; i++){
                System.out.println("Aluno número: " + i);
                System.out.println("Qual seu nome?");
                String nomeDigitado = leitor.nextLine();
                System.out.println("Você faz faculdade?");
                String faculdade = leitor.nextLine();
                // equalsIgnoreCase = serve para ignorar se ela é escrita em maiúscula ou minúscula
                if (faculdade.equalsIgnoreCase("sim")) {
                    System.out.println("Qual curso?");
                    String curso = leitor.nextLine();
                    System.out.println("Otima escolha, "+ nomeDigitado + " o curso de " + curso + " é a porta de entrada para o seu futuro!. Como diz minha autora favorita, Jane Austen \"Nunca é tarde para ser aquilo que você poderia ter sido. <3\"");
                } else {
                    System.out.println(nomeDigitado + ", Como diz minha autora favorita, Jane Austen. \"A perseverança é o segredo do sucesso, mesmo quando o coração está cansado.\"");
                }
            }
        }
    }
}
