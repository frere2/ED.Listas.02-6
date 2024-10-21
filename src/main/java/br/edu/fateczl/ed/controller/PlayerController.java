package br.edu.fateczl.ed.controller;

import br.edu.fateczl.Lista;
import br.edu.fateczl.ed.model.Musica;

public class PlayerController {

    public void adicionaMusica(Lista<Musica> lista, String musica) throws Exception {
        String[] dados = musica.split(";");

        String nome = dados[0];
        String nomeArtista = dados[1];
        int duracao = Integer.parseInt(dados[2]);

        Musica novaMusica = new Musica(nome, nomeArtista, duracao);
        lista.addLast(novaMusica);
        System.out.println("Música adicionada: " + novaMusica);
    }

    public void removeMusica(Lista<Musica> lista, int posicao) throws Exception {
        if (lista.isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }

        if (posicao < 0 || posicao >= lista.size()) {
            System.out.println("Posição inválida!");
            return;
        }

        lista.remove(posicao);
    }

    public void executaPlaylist(Lista<Musica> lista) throws Exception {
        if (lista.isEmpty()) {
            System.out.println("A playlist está vazia!");
            return;
        }

        int tamanho = lista.size();
        for (int i = 0; i < tamanho; i++) {
            Musica musica = lista.get(i);
            System.out.println(musica.toString());
            try {
                Thread.sleep(musica.duracao * 1000L);
            } catch (InterruptedException e) {
                System.err.println("Erro ao tocar a musica!");
            }
        }
    }
}