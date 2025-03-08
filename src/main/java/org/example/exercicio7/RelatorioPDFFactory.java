package org.example.exercicio7;

public class RelatorioPDFFactory implements RelatorioFactory {


    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioPDF();
    }
}
