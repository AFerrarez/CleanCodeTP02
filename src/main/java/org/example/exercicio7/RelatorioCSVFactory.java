package org.example.exercicio7;

public class RelatorioCSVFactory implements RelatorioFactory {


    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioCSV();
    }
}
