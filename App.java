import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

            System.out.println("---Inicio----");
            System.out.println("insira o nome do explorador: ");
            Scanner teclado = new Scanner(System.in);
            String nome = teclado.next();
            System.out.println("Insira a nacionalidade: ");
            String nacionalidade_inserida = teclado.next();
            System.out.println("Seu explorador irá começar com (100) de Energia e (100) de Saúde, com estado de vida: vivo.");
            System.out.println("Vamos começar!!!");
            Explorador Jogador = new Explorador(nome, nacionalidade_inserida);
            Jogador.vida = true;
            Jogador.saude = 100;
            Jogador.energia = 100;

            while (Jogador.vida = true) {
                if (Jogador.energia <= 0) {
                    Jogador.morrer();
                    Jogador.vida = false;
                    System.out.println("Voce morreu!!!");
                    break;
                }
                if (Jogador.saude <= 0) {
                    System.out.println("Voce morreu!!!");
                    Jogador.morrer();
                    Jogador.vida = false;
                    break;
                }
                if (Jogador.vida = false) {
                    System.out.println("Voce morreu!!!");
                    Jogador.morrer();
                    Jogador.vida = false;
                    break;
                }
                System.out.println("Insira um comando: \n1- Explorar \n2- Coletar Recursos \n3- Treinar \n4- Exibir informações \n5- parar de jogar");
                String comando = teclado.next();
                while (true) {
                    switch (comando) {
                        case "1":
                            Jogador.Explorar();
                            System.out.println("Voce está explorando e perdeu 10 de energia e 5 de saude");
                            break;
                        case "2":
                            Jogador.ColetarRecursos();
                            System.out.println("Está coletando recursos e ganhou 20 de energia e 10 de saude");
                            break;
                        case "3":
                            Jogador.Treinar();
                            System.out.println("Está Treinando, ganhou 15 de saude e perdeu 10 de Energia");
                            break;
                        case "4":
                            System.out.println("Nome: " + Jogador.nome + "\nNascionalidade: " + Jogador.nacionalidade + "\nVida: " + Jogador.vida + "\nSaude: " + Jogador.saude + "\nEnergia: " + Jogador.energia);
                            break;
                        case "5":
                            System.out.println("Fim de jogo!");
                            break;
                        }
                break;
                }
            }
           
        }
    }
