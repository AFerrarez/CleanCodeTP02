package org.example;

import org.example.exercicio2.Desconto;
import org.example.exercicio3.Cliente;
import org.example.exercicio3.Pedido;

public class Main {
    public static void main(String[] args) {

        Cliente clienteValido = new Cliente("João Silva");
        Pedido pedido1 = new Pedido(clienteValido);
        System.out.println("Nome do Cliente: " + pedido1.getNomeCliente());


        Pedido pedido2 = new Pedido(null);
        System.out.println("Nome do Cliente: " + pedido2.getNomeCliente());
    }
}