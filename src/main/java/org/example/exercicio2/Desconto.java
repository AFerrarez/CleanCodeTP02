package org.example.exercicio2;

public class Desconto {

    private static final double VALOR_MINIMO_DESCONTO = 1000.0;
    private static final double PERCENTUAL_DESCONTO = 0.10;

    public double calcularDesconto(double preco) {
        if (preco >= VALOR_MINIMO_DESCONTO) {
            return preco * (1 - PERCENTUAL_DESCONTO);
        }
        return preco;
    }
}
