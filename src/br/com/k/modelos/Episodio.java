package br.com.k.modelos;

import br.com.k.calculos.Classificavel;

public class Episodio implements Classificavel {
    String nome;
    int numero;
    int quantidadeDeEpisodios;
    private Serie serie;
    int totalVisualizacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidadeDeEpisodios() {
        return quantidadeDeEpisodios;
    }

    public void setQuantidadeDeEpisodios(int quantidadeDeEpisodios) {
        this.quantidadeDeEpisodios = quantidadeDeEpisodios;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }


    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
