package Semana2.Validacao;

public class Validacao {
    public String nome;
    public int idade;
    private String atributo;

    public Validacao(){
    }
    public Validacao(String nome, int idade, String atributo){
        this.nome = nome;
        this.idade = idade;
        this.atributo = atributo;
    }

    public void pessoa(String nome){
        System.out.println("Nome: " + nome);
        this.nome = nome;
    }

    public void pidade(int idade){
        System.out.println("Idade: " + idade);
        this.idade = idade;
    }

    //Espaçamento
    public String getatributo() {
        return atributo;
    }
    public void setatributo(String atributo) {
        this.atributo = atributo;
    }

    public void pessoas(){
        System.out.println(nome);
    }
    public void info(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Atributo: " + atributo);


    }





}
