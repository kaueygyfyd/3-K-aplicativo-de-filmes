package br.com.k.calculos;

import br.com.k.modelos.Filme;

public class CalcularTempo {

private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

        public void inclui(Filme f) {
            tempoTotal += f.getDuracaoEmMinutos();
        }
}
