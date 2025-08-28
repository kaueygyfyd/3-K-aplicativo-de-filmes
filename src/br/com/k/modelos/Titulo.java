package br.com.k.modelos;

import br.com.k.excecao.erroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private double avaliacoes;
    private double somaDeAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private String director;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
    this.nome = meuTituloOmdb.title();
    if(meuTituloOmdb.year().length() > 4){
    throw new erroDeConversaoDeAnoException("Não consegui converter o ano " +
            "porque tem mais de 04 caracteres");
        }

    this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
    this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 3));
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para anoDeLancamento
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    // Getter para anoDeLancamento
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    // Setter para avaliacoes
    public void setAvaliacoes(double avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    // Getter para avaliacoes
    public double getAvaliacoes() {
        return avaliacoes;
    }

    // Getter para somaDeAvaliacoes (não há setter, pois é calculado)
    public double getSomaDeAvaliacoes() {
        return somaDeAvaliacoes;
    }

    // Getter para totalDeAvaliacoes (não há setter, pois é incrementado)
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    // Setter para duracaoEmMinutos
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Getter para duracaoEmMinutos
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    // Setter para incluidoNoPlano
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    // Getter para incluidoNoPlano
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    // Método para exibir a ficha técnica (usa getters para acessar os atributos)
    public void exibirFichaTecnica() {
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
        System.out.println("Avaliação: " + getAvaliacoes());
        System.out.println("Está no plano: " + isIncluidoNoPlano());
    }

    // Método para avaliar (mantido como está, pois modifica atributos internos)
    public void avalia(double nota) {
        somaDeAvaliacoes += nota;
        totalDeAvaliacoes++;
        //avaliacoes = pegaMedia(); // Atualiza a avaliação média
    }

    public double pegaMedia(){
        return somaDeAvaliacoes / totalDeAvaliacoes;
        }

    // Método para calcular a média com condicional para caso o número for igual a zero
    public double getMedia() {
        if (totalDeAvaliacoes > 0) {
            return somaDeAvaliacoes / totalDeAvaliacoes;
        } else {
            return 0; // Ou outro valor padrão que faça sentido para o seu caso
        }
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Ano de Lancamento: " + getAnoDeLancamento() +
                "\n" + "Duração em minutos: " + getDuracaoEmMinutos();
    }
}
