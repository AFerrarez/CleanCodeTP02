package org.example.exercicio7;

public class RelatorioJSONFactory implements RelatorioFactory {


    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioJSON();
    }
}
