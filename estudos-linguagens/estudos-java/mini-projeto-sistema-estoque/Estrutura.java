import entities.Produto;
import java.util.Locale;
import java.util.Scanner;

public class Estrutura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Entre com os dados:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            Produto produto = new Produto(nome, preco);

            System.out.println();
            System.out.println("Dados do Produto: " + produto);
            System.out.println();

            int escolha = 0;

            while (escolha != 3) {

                System.out.println("Escolha uma opção: \n 1. Adicionar Produtos \n 2. Remover Produtos \n 3. Fim");
                escolha = sc.nextInt();

                if (escolha == 1){
                    System.out.println("Entre com o número de produtos para ser adicionado no estoque: ");
                    int quantidade = sc.nextInt();
                    if (quantidade <= 0){
                        System.out.println("Quantidade Inválida. Tente Novamente");
                    } else {
                        produto.addProduto(quantidade);
                        System.out.println();
                        System.out.println("Dados Atualizados do Produto: " + produto);
                    }

                } else if (escolha == 2){
                        System.out.println("Entre com o número de produtos para ser removidos do estoque: ");
                        int quantidade = sc.nextInt();
                    if (quantidade < 0 || quantidade > produto.getQuantidade()){
                        System.out.println("Quantidade Inválida. Tente Novamente");
                    } else {
                        produto.removeEstoque(quantidade);
                        System.out.println();
                        System.out.println("Dados Atualizados do Produto: " + produto);
                    }
                    
                }
            }
            System.out.println("Sistema Finalizado!");
    }
    }
    

} 
