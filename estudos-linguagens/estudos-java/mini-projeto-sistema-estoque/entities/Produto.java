package entities;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){
    }

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
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

