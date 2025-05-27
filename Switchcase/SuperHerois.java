import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SuperHerois {
    String nome;

    int forca;
    int velocidade;
    int inteligencia;
    int poder;

    public SuperHerois(String nome, int forca, int velocidade, int inteligencia,int poder) {
        this.nome = nome;
        this.forca = forca;
        this.velocidade = velocidade;
        this.inteligencia = inteligencia;
        this.poder = poder;
    }
    public void informacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Forca: " + forca);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("");

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SuperHerois> lista = new ArrayList<>();

        System.out.println("Bem vindo aos mundo de super herois!");

        int opcao=0;
        while(opcao!=5) {
            System.out.println("--- Menu ---");
            System.out.println("1. Listar Super Herois");
            System.out.println("2. Adicionar Super Herois");
            System.out.println("3. Comparar Super Herois");
            System.out.println("5. Sair");
            System.out.print("Opção:");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Lista de Super Herois");
                    for (SuperHerois h : lista) {
                        h.informacoes();
                    }
                    break;
                case 2:
                    System.out.println("Adicionar Super Herois");

                    System.out.println("nome do herói: ");
                    String nome = sc.next();

                    System.out.println("forca: ");
                    int forca = sc.nextInt();

                    System.out.println("velocidade: ");
                    int velocidade = sc.nextInt();

                    System.out.println("inteligencia: ");
                    int inteligencia = sc.nextInt();

                    int poder = ((inteligencia+velocidade+forca)*2)/3;

                    SuperHerois herois = new SuperHerois(nome, forca, velocidade, inteligencia, poder);
                    lista.add(herois);
                    System.out.println("Heroi adicionado com sucesso!");
                    break;
                   case 3:
                       if (lista.isEmpty()||lista.size()<2) {
                           System.out.println("Lista não possui dois super herois!");
                           break;
                       }

                       System.out.println("Escolha o numero do 1° heroi");
                       for (int i=0; i<lista.size(); i++) {
                           System.out.println((i+1)+ ". "+ lista.get(i).nome);
                       }
                       int h1 = sc.nextInt()-1;

                       System.out.println("Escolha o numero do 2° heroi");
                       int h2 = sc.nextInt()-1;

                       SuperHerois heroi1 = lista.get(h1);
                       SuperHerois heroi2 = lista.get(h2);
                       System.out.println("Informações do heroi: ");
                       heroi1.informacoes();
                       System.out.println("Informações do heroi: ");
                       heroi2.informacoes();

                       if (heroi1.poder>heroi2.poder) {
                           System.out.println(heroi1.nome+" é mais forte que o "+heroi2.nome);
                       } else if (heroi1.poder<heroi2.poder) {
                           System.out.println(heroi2.nome+" é mais forte que o "+heroi1.nome);
                       }else {
                           System.out.println("é um empate!");
                       }

            }
        }


    }
}