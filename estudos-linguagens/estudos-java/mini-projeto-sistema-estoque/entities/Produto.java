package entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double precoTotal(){
        return quantidade * preco;
    }

    public void addProduto(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome 
            + ", R$ " 
            + String.format("%.2f", preco)
            + ", " 
            + quantidade 
            + " unidades, Total: " 
            + String.format("%.2f", precoTotal());
    }

}  

