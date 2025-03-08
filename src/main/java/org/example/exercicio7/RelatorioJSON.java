package org.example.exercicio7;

public class RelatorioJSON implements Relatorio {

    @Override
    public void gerarCabecalho() {
        System.out.println("Gerando Cabecalho do JSON ");

    }

    @Override
    public void gerarCorpo() {
        System.out.println("Gerando Corpo do JSON ");
    }

    @Override
    public void gerarRodape() {
        System.out.println("Gerando Rodape do JSON ");
    }
}
