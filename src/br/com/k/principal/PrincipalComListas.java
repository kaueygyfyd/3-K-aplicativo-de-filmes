package br.com.k.principal;

import br.com.k.modelos.Filme;
import br.com.k.modelos.Serie;
import br.com.k.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefinho", 2017);
        meuFilme.avalia(10);
        var meuFilmeDois = new Filme("Velozes e furiosos 10", 2023);
        meuFilmeDois.avalia(10);
        Serie java = new Serie("Java", 1996);
        java.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilmeDois);
        lista.add(meuFilme);
        lista.add(java);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2)
                System.out.println("Classificação " + filme.getClassificacao());
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Kauê Araujo");
        buscaPorArtista.add("Artur Araujo");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois de ordenação:");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);


    }
}
