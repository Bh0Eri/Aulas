import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class MascoteDaTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] mascote = {
                {"lyan ", "0"},
                {"eric ", "0"},
                {"luciano ", "0"},
                {"felipe ", "0"},
                {"bernado ", "0"},
        };
        int votototal=0;


        int opcao = 0;
        String nome = ".";
        while (true) {
            System.out.println("Bem vindo a escolha de mascote da turma de 2025");
            System.out.print("Qual é seu nome? ");
            nome = sc.next();


            int voto_Lyan = Integer.parseInt(mascote[0][1]);
            int voto_Eric = Integer.parseInt(mascote[1][1]);
            int voto_Luciano = Integer.parseInt(mascote[2][1]);
            int voto_Felipe = Integer.parseInt(mascote[3][1]);
            int voto_Bernado = Integer.parseInt(mascote[4][1]);


            do {
                for (int i = 0; i < mascote.length; i++) {
                    System.out.println("["+(i+1)+"] para > "+mascote[i][0]);
                }
                System.out.print("em quem você vai votar? Digite 0 para sair");
                opcao = sc.nextInt()-1;
                switch (opcao) {
                    case 0:
                        voto_Lyan++;
                        votototal++;
                        System.out.println("Voto confirmado com sucesso!");
                        break;
                        case 1:
                            voto_Eric++;
                            votototal++;
                            System.out.println("Voto confirmado com sucesso!");
                            break;
                            case 2:
                                voto_Luciano++;
                                votototal++;
                                System.out.println("Voto confirmado com sucesso!");
                                break;
                                case 3:
                                    voto_Felipe++;
                                    votototal++;
                                    System.out.println("Voto confirmado com sucesso!");
                                    break;
                                    case 4:
                                        voto_Bernado++;
                                        votototal++;
                                        System.out.println("Voto confirmado com sucesso!");
                                        break;
                                        case 5:
                                            System.out.println("Erro...");
                                            break;



                }

                mascote[0][1]= String.valueOf(voto_Lyan);
                mascote[1][1]= String.valueOf(voto_Eric);
                mascote[2][1]= String.valueOf(voto_Luciano);
                mascote[3][1]= String.valueOf(voto_Felipe);
                mascote[4][1]= String.valueOf(voto_Bernado);

            } while (opcao != -1);
            System.out.println("Outra pessoa vai votar? digite 0 para sair e 1 para continuar");
            int opcao2 = sc.nextInt();
            if (opcao2 == 1) {
                System.out.println("Continando");
            }else if (opcao2 == 0) {
                System.out.println("Saiindo");
                break;
            }else {
                System.out.println("Erro...");
            }


        }
        for (int i =0; i<mascote.length; i++) {
            for (int j = 0; j < mascote[i].length; j++) {
                System.out.println(mascote[i][j]);
            }
        }
    }

}
