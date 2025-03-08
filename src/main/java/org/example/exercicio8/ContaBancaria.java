package org.example.exercicio8;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean checkSaldo (double valor){
        return saldo >= valor;
    }

    public boolean comprar (double valor){
        if (checkSaldo(valor)){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}
