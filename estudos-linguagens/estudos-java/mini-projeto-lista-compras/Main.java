import java.util.ArrayList;
import java.util.Scanner;

// Gerenciador de lista de compras
public class Main {
    public static void main(String[] args) {
        // usando try para não esquecer de fechar o scanner kkk
        try (Scanner leitor = new Scanner(System.in)) {

            System.out.println("Quanto você tem para gastar hoje?");
            int valorAtual = leitor.nextInt();
            leitor.nextLine();
            // cria um array para armazenar os itens
            ArrayList<Item> listaDeCompras = new ArrayList<>();

            int escolha = 0;
            // loop do menu
            while (escolha != 4) {
                System.out.println("\n 1. Adicionar Item \n 2. Ver Carrinho \n 3. Finalizar Compra \n 4. Sair");
                escolha = leitor.nextInt();
                leitor.nextLine();

                switch (escolha){
                    case 1 -> {
                        System.out.println("Qual o nome do Item?");
                        String nomeItemDigitado = leitor.nextLine();

                        System.out.println("Qual o Preço do Item?");
                        double precoItemDigitado = leitor.nextDouble();
                        leitor.nextLine();

                        System.out.println("Qual a Quantidade do Item?");
                        int quantidadeItemDigitado = leitor.nextInt();
                        leitor.nextLine();
                        // se o saldo for maior que 0 e o resultado da multiplicação do valor do item pela quantidade for menor ou igual ao saldo ele adiciona o item e subtrai do saldo
                        if(valorAtual > 0 && (precoItemDigitado * quantidadeItemDigitado) <= valorAtual){
                            Item novoItem = new Item(nomeItemDigitado, precoItemDigitado, quantidadeItemDigitado);
                            listaDeCompras.add(novoItem);

                            valorAtual -= (precoItemDigitado * quantidadeItemDigitado);

                            System.out.println("\n Item Adicionado! \n Saldo restante: R$: " + valorAtual);
                        } else {
                            System.out.println("\n Você não tem Saldo Disponível para essa compra!.");
                        }
                    }
                    case 2 -> {
                        for (Item i: listaDeCompras){
                                System.out.printf("Produto: %s | Preço: %.2f | Quantidade: %d%n", i.nomeItem, i.precoItem, i.quantidadeItem);
                            }
                    }
                    case 3 -> {
                        System.out.println("\n Deseja finalizar sua compra?\n 1. Sim \n 2. Não");
                        escolha = leitor.nextInt();
                        leitor.nextLine();

                        if(escolha == 1){
                            double totalDaCompra = 0;
                            // for para somar a lista de compras
                            for (Item i: listaDeCompras){
                                System.out.printf("Produto: %s | Preço: %.2f | Quantidade: %d%n", i.nomeItem, i.precoItem, i.quantidadeItem);

                                totalDaCompra += (i.precoItem * i.quantidadeItem);
                            }
                            System.out.printf("Valor Total: %.2f%n", totalDaCompra);
                            System.out.println("Saldo restante: R$: " + valorAtual);
                            escolha = 4;
                            } else {
                                System.out.println("\n Retornando ao menu...");
                        }
                    }
                }
            }
        }
    }
}
