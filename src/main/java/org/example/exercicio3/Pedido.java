package org.example.exercicio3;

public class Pedido {
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = (cliente != null) ? cliente : new ClienteNulo();
    }
    public String getNomeCliente() {
        return cliente.getNome();
    }
}

