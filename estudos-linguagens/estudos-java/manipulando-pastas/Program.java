import entities.Produto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        
            System.out.println("Coloque o caminho do arquivo: ");
            String file = sc.nextLine();

            File caminho = new File(file);

            String sourceFile = caminho.getParent();
            boolean success = new File(sourceFile + "/out").mkdir();
            if(success){
                System.out.println("Pasta criada!");
            }
            String target = sourceFile + "/out/summary.csv";


            Produto produto;

            List<Produto> list = new ArrayList<>();
        
            try (BufferedReader br = new BufferedReader(new FileReader(file))){

                String line = br.readLine();

                while(line != null){

                    String[] path = line.split(",");

                    String nome = path[0].trim();
                    double preco = Double.parseDouble(path[1].trim());
                    int quantidade = Integer.parseInt(path[2].trim());


                    produto = new Produto(nome, preco, quantidade);

                    list.add(produto);
                    line = br.readLine();
                
                }
                // pega do file, cria no objeto e depois cria o summary 
                
            } catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(target))){

                for(Produto produtos : list){
                    bw.write(produtos.toString());
                }
            }
                // para cada objeto em produto, cria uma nova linha, escrever um for passando eles pro bw.writer?

                //usar .split(",")
                // no while cria um objeto enquanto houver linhas
                
            catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}