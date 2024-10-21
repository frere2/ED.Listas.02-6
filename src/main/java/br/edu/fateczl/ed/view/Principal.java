package br.edu.fateczl.ed.view;

import br.edu.fateczl.Lista;
import br.edu.fateczl.ed.controller.PlayerController;
import br.edu.fateczl.ed.model.Musica;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PlayerController player = new PlayerController();
        Lista<Musica> playlist = new Lista<>();

        boolean rodando = true;

        while (rodando) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar música");
            System.out.println("2 - Remover música");
            System.out.println("3 - Executar playlist");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da música:");
                    String nome = scanner.next();
                    System.out.println("Digite o nome do artista:");
                    String artista = scanner.next();
                    System.out.println("Digite a duração (em segundos):");
                    int duracao = scanner.nextInt();
                    String musica = nome + ";" + artista + ";" + duracao;
                    player.adicionaMusica(playlist, musica);
                    break;

                case 2:
                    System.out.println("Digite a posição da música a ser removida:");
                    int posicao = scanner.nextInt();
                    player.removeMusica(playlist, posicao);
                    break;

                case 3:
                    player.executaPlaylist(playlist);
                    break;

                case 4:
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
        System.out.println("encerrando!");
    }
}