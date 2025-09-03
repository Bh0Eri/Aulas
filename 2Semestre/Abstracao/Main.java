package Abstracao;


public class Main {
    public static void main(String[] args) {

        SerVivo dog = new Cachorro();
        Humano h = new Humano();
        dog.setCor(Cores.AZUL);



        for (Cores cor : Cores.values()) {
            System.out.println(cor+" "+cor.getI());
        }
    }
}
