package org.example.exercicio7;

public class RelatorioPDF implements Relatorio {

    @Override
    public void gerarCabecalho() {
        System.out.println("Gerando Cabecalho do PDF");

    }

    @Override
    public void gerarCorpo() {
        System.out.println("Gerando Corpo do PDF");
    }

    @Override
    public void gerarRodape() {
        System.out.println("Gerando Rodape do PDF");
    }
}
