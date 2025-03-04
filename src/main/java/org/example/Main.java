package org.example;

import org.example.exercicio2.Desconto;
import org.example.exercicio3.Cliente;
import org.example.exercicio3.Pedido;
import org.example.exercicio4.Ajuste;
import org.example.exercicio4.Produto;

public class Main {
    public static void main(String[] args) {

        Cliente clienteValido = new Cliente("João Silva");
        Pedido pedido1 = new Pedido(clienteValido);
        System.out.println("Nome do Cliente: " + pedido1.getNomeCliente());


        Pedido pedido2 = new Pedido(null);
        System.out.println("Nome do Cliente: " + pedido2.getNomeCliente());


        Produto produtoOriginal = new Produto("Camiseta", 15.00);
        Ajuste ajuste = new Ajuste();

        Produto produtoComDesconto = ajuste.aplicarDesconto(produtoOriginal);
        System.out.println("Descricao: " + produtoComDesconto.getNome());
        System.out.println("Produto com desconto: R$" + produtoComDesconto.getPreco());

        System.out.println("Valor sem desconto: R$" + produtoOriginal.getPreco());

    }
}