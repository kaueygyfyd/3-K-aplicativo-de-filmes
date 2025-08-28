package br.com.k.principal;

import br.com.k.modelos.Episodio;
import br.com.k.calculos.CalcularTempo;
import br.com.k.modelos.Filme;
import br.com.k.modelos.Serie;
import br.com.k.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefinho", 2017);

        meuFilme.exibirFichaTecnica();

        meuFilme.avalia(7);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        System.out.println("Soma das avaliações: " + meuFilme.getSomaDeAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println("A média é " + meuFilme.getMedia());

        Serie java = new Serie("Java", 1996);

        System.out.println();
        java.exibirFichaTecnica();

        java.setTemporada(1);
        java.setEpisodiosPorTemporada(2);
        java.setMinutosPorEpisodio(45);
        System.out.println("Duração para maratonar Java: " + java.getDuracaoEmMinutos());

        CalcularTempo calculadora = new CalcularTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(java);
        episodio.setTotalVisualizacoes(25);
        filtro.filtra(episodio);

        var meuFilmeDois = new Filme("Velozes e furiosos 10", 2023);
        meuFilmeDois.setDuracaoEmMinutos(200);
        meuFilmeDois.setAnoDeLancamento(1);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(meuFilmeDois);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista de filme " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());







        //System.out.println(meuFilme.pegaMedia());
    }
}
