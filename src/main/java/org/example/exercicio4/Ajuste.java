package org.example.exercicio4;

public class Ajuste {

    public Produto aplicarDesconto(Produto produto) {
        double novoPreco = produto.getPreco() - 10;

        return new Produto(produto.getNome(), Math.max(novoPreco, 0));
    }
}