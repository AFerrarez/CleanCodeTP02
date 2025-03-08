package org.example.exercicio7.service;

import org.example.exercicio7.*;

public class RelatorioService {
    public void gerarRelatorio(String tipo) {
        RelatorioFactory factory = getRelatorioFactory(tipo);

        if (factory == null) {
            System.out.println("Tipo de relatório desconhecido!");
            return;
        }

        Relatorio relatorio = factory.criarRelatorio();
        relatorio.gerarCabecalho();
        relatorio.gerarCorpo();
        relatorio.gerarRodape();
    }

    private RelatorioFactory getRelatorioFactory(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "PDF" -> new RelatorioPDFFactory();
            case "CSV" -> new RelatorioCSVFactory();
            case "JSON" -> new RelatorioJSONFactory();
            default -> null;
        };
    }
}
