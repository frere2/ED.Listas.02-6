package br.edu.fateczl.ed.model;

public class Musica {
    public String nome;
    public String nomeArtista;
    public int duracao; // em segundos

    public Musica(String nome, String nomeArtista, int duracao) {
        this.nome = nome;
        this.nomeArtista = nomeArtista;
        this.duracao = duracao;
    }
    @Override
    public String toString() {
        return "Música: " + nome + " - Artista: " + nomeArtista + " - Duração: " + duracao + "s";
    }
}
