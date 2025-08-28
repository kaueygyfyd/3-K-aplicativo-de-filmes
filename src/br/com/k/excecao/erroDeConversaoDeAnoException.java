package br.com.k.excecao;

public class erroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    @Override
    public String getMessage() {
        return this.mensagem;
    }

    public erroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }
}
