package CadastroBanco;

public class Cadastro {
    private String nome;
    private int id;
    private int idade;
    public Cadastro() {}
    public Cadastro(String nome, int id, int idade) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;

    }

    public int getId() {
        return id;
    }
    public int setId(int id) {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return " " +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", idade=" + idade;
    }
    public void Cache(){
        System.out.println("Cadastro Cache");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Id: " + id);
    }
}
