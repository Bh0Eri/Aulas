package Mercadinho;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }
    public Produto() {}
    public double desconto(double sale) {
        return preco - (preco * (sale / 100));
    }

    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String toString() {return nome;}

    public void lista(){
        System.out.print("Produto:"+nome+" R$"+preco+"\n");
    }

}
