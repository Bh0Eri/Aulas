package Rpg;

import java.util.Scanner;

public class RpgMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criação e configuração do jogador
        System.out.println("Nome:");
        String nome = sc.next();
        System.out.println("Classe (Guerreiro, Mago ou Arqueiro):");
        String classe = sc.next();
        Player player = new Player(nome, classe);

        while (true) {
            System.out.println("Escolha a dificuldade:\n[1] Fácil (Lobo)\n[2] Normal (Orc)\n[3] Difícil (Golem)");
            int opc = sc.nextInt();
            Enemy enemy;
            switch (opc) {
                case 1: enemy = new Enemy("Lobo", 50, 1, 5, 12); break;
                case 2: enemy = new Enemy("Orc", 100, 2, 12, 18); break;
                case 3: enemy = new Enemy("Golem", 200, 3, 20, 25); break;
                default:
                    System.err.println("Opção inválida. Tente novamente.");
                    continue;
            }

            // Loop de batalha
            while (player.estaVivo() && enemy.estaVivo()) {
                System.out.println("\n--- STATUS ---");
                System.out.println(player.status());
                System.out.println(enemy.status());

                System.out.println("Ações:\n[1] Atacar\n[2] Curar\n[3] Desistir");
                int acao = sc.nextInt();

                if (acao == 1) {
                    int dano = player.atacar();
                    enemy.receberDano(dano);
                    System.out.println("Você causou " + dano + " de dano.");
                } else if (acao == 2) {
                    int cura = player.rm.nextInt(5, 25);
                    player.curar(cura);
                    System.out.println("Você se curou em " + cura + " pontos.");
                } else if (acao == 3) {
                    System.out.println("Você desistiu do combate!");
                    break;
                } else {
                    System.err.println("Opção inválida!");
                    continue;
                }

                if (enemy.estaVivo()) {
                    int danoInimigo = enemy.atacar();
                    player.receberDano(danoInimigo);
                    System.out.println("O inimigo te atacou e causou " + danoInimigo + " de dano.");
                }
            }

            if (!enemy.estaVivo()) {
                System.out.println("Você derrotou o " + enemy.nome + "!");
                player.ganharXp(enemy.nivel * 50);
            } else if (!player.estaVivo()) {
                System.out.println("Você foi derrotado...");
            }

            System.out.println("Jogar novamente? [1] Sim | [2] Não");
            if (sc.nextInt() != 1) {
                System.out.println("Até a próxima!");
                break;
            }
        }

        sc.close();
    }
}
