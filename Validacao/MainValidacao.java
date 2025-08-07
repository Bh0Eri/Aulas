package Semana2.Validacao;

import java.util.ArrayList;
import java.util.Scanner;

public class MainValidacao {
    public static void main(String[] args) {

        Validacao vl = new Validacao();
        Scanner sc = new Scanner(System.in);
        ArrayList<Validacao> lista = new ArrayList<>();

        int opcao=0,qnt=0,popcao;



        while(true){
            System.out.print("Bem vindo a nossa lista de pessoas\nEscolha uma opção abaixo! \n[1] Ver lista\n[2] Adicionar pessoa \n[3] Ver pessoa \n[4] Sair\nR:");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Lista de pessoas\n");
                    for(Validacao  i: lista){
                        i.pessoas();
                    }
                    break;
                    case 2:
                    System.out.println("Adicionar pessoa\n");
                    System.out.println("Nome");
                    vl.pessoa(sc.next());
                    System.out.println("Idade");
                    vl.pidade(sc.nextInt());
                    System.out.println("Atributo");
                    vl.setatributo(sc.next());

                    Validacao pessoa = new Validacao(vl.nome, vl.idade, vl.getatributo());
                    lista.add(pessoa);
                    break;
                    case 3:
                        qnt=0;
                        for(Validacao i: lista){
                            qnt+=1;
                            System.out.print("["+qnt+"] ");
                            i.pessoas();

                        }
                        System.out.println("Escolha a pessoa!");
                        popcao=sc.nextInt()-1;
                        Validacao pessoal = lista.get(popcao);
                        pessoal.info();
                        break;
                        case 4:
                            System.err.print("\nSaindo...");

            }



        }
    }
}
