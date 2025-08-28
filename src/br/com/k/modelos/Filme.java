package br.com.k.modelos;

import br.com.k.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
private String director;

public Filme(String nome, int anoDeLancamento) {
    super(nome, anoDeLancamento);
}

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}


/*"Codigo antigo"

/*public class Filme {
    private String nome;
    private int anoDeLancamento;
    private double avalicoes;
    private double somaDeAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSomaDeAvaliacoes(){
        return somaDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibirFichaTecica(){
        System.out.println("Nome do filme: " + nome);

    }

    public void avalia(double nota){
        somaDeAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDeAvaliacoes / totalDeAvaliacoes;
    }
}*/