package org.example.exercicio7;

public class RelatorioCSV implements Relatorio {

    @Override
    public void gerarCabecalho() {
        System.out.println("Gerando Cabecalho do CSV ");

    }

    @Override
    public void gerarCorpo() {
        System.out.println("Gerando Corpo do CSV ");
    }

    @Override
    public void gerarRodape() {
        System.out.println("Gerando Rodape do CSV ");
    }
}
