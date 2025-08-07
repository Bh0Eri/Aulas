package Mercadinho;

import java.util.ArrayList;
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Produto pt = new Produto();


        int opcao;
        // Admin , Mudar, Adicionar, remover produtos
        String senhaadm, senha;
        System.out.println("Digite a senha admin:");
        senhaadm = sc.nextLine();
        while(true){
            System.out.print("\n [1] Produtos \n [2] Adicionar produto \n [3] Remover produto \n [4] Modificar produto \n [5] Desconto\n [6] Sair \n R:");
            switch(opcao = sc.nextInt()){
                case 1:
                    if(produtos.isEmpty()){
                        System.err.println("Não existem produtos cadastrados");
                    }else {
                        for(Produto p : produtos){
                            p.lista();
                        }
                    }
                    break;
                    case 2:
                        System.out.println("Senha do admin:");
                        senha = sc.next();
                        if(senha.equals(senhaadm)){
                            System.out.println("Produto:");
                            pt.setNome(sc.next());
                            System.out.println("preço:");
                            pt.setPreco(sc.nextDouble());
                            produtos.add(new Produto(pt.getNome(), pt.getPreco()));
                        }else {
                            System.err.println("ERRO");
                        }
                        break;
                        case 3:
                            System.out.println("Senha do admin:");
                            senha = sc.next();
                            if(senha.equals(senhaadm)){
                                System.out.println("Produto para remover:");
                                int i=1;
                                for(Produto p : produtos){
                                    System.out.print("["+i+"] ");
                                    p.lista();
                                    i+=1;
                                }
                                System.out.println("\nProduto:");
                                int remover = sc.nextInt()-1;
                                produtos.remove(remover);
                            }else  {
                                System.err.println("ERRO");
                            }
                            break;
                            case 4:
                                System.out.println("Senha do admin:");
                                senha = sc.next();
                                if(senha.equals(senhaadm)){
                                    System.out.println("Produto para modificar:");
                                    int i=0;
                                    for(Produto p : produtos){
                                        i+=1;
                                        System.out.print("["+i+"]");
                                        p.lista();
                                    }
                                    int modificar = sc.nextInt()-1;
                                    System.out.println("nome:");
                                    pt.setNome(sc.next());
                                    System.out.println("preco:");
                                    pt.setPreco(sc.nextDouble());
                                    produtos.remove(modificar);
                                    produtos.add(modificar, new Produto(pt.getNome(), pt.getPreco()));

                                }else {
                                    System.err.println("ERRO");
                                }
                                break;
                                case 5:
                                    System.out.print("De quanto será o desconto:");
                                    int sale = sc.nextInt();
                                    System.out.println("em qual produto?");
                                    int i=1;
                                    for(Produto p : produtos){
                                        System.out.print("["+i+"] ");
                                        p.lista();
                                        i+=1;
                                    }
                                    int desc = sc.nextInt()-1;
                                    Produto pr = produtos.get(desc);
                                    pr.setPreco(pt.desconto(sale));

                                    System.out.println("Desconto aplicado com sucesso");


                                break;
                                case 6:
                                    System.err.println("Saindo");
                                    break;
            }
            if (opcao == 6) {
                break;
            }else {}


        }
        sc.close();
    }
}
