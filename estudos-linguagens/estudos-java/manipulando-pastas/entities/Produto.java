package entities;

public class Produto {
    private String nome;
    private Double preco;
    private int quantidade;


    public Produto(){

    }

    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double valorTotal(Double preco, int quantidade){
        return preco * quantidade;
    }

    @Override
    public String toString(){
        return  getNome() + "," + String.format("%.2f" + valorTotal(preco, quantidade)) + "\n";
    }

}
