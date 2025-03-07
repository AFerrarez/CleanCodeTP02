package org.example;

import org.example.exercicio2.Desconto;
import org.example.exercicio3.Cliente;
import org.example.exercicio3.Pedido;
import org.example.exercicio4.Ajuste;
import org.example.exercicio4.Produto;
import org.example.exercicio5.ClienteClassificador;

public class Main {
    public static void main(String[] args) {
//
//        Cliente clienteValido = new Cliente("João Silva");
//        Pedido pedido1 = new Pedido(clienteValido);
//        System.out.println("Nome do Cliente: " + pedido1.getNomeCliente());
//
//
//        Pedido pedido2 = new Pedido(null);
//        System.out.println("Nome do Cliente: " + pedido2.getNomeCliente());
//
//
//        Produto produtoOriginal = new Produto("Camiseta", 15.00);
//        Ajuste ajuste = new Ajuste();
//
//        Produto produtoComDesconto = ajuste.aplicarDesconto(produtoOriginal);
//        System.out.println("Descricao: " + produtoComDesconto.getNome());
//        System.out.println("Produto com desconto: R$" + produtoComDesconto.getPreco());
//
//        System.out.println("Valor sem desconto: R$" + produtoOriginal.getPreco());


        // Criando um objeto da classe ClienteClassificador
        ClienteClassificador classificador = new ClienteClassificador();

        // Teste 1: Cliente Sênior Premium
        String resultado1 = classificador.classificarCliente(65, 6000, 15, "São Paulo");
        System.out.println("Teste 1 (65 anos, renda 6000, 15 compras): " + resultado1);

        // Teste 2: Cliente Sênior Regular
        String resultado2 = classificador.classificarCliente(70, 5500, 5, "Rio de Janeiro");
        System.out.println("Teste 2 (70 anos, renda 5500, 5 compras): " + resultado2);

        // Teste 3: Cliente Sênior Baixa Renda
        String resultado3 = classificador.classificarCliente(62, 3000, 8, "Belo Horizonte");
        System.out.println("Teste 3 (62 anos, renda 3000, 8 compras): " + resultado3);

        // Teste 4: Cliente Jovem Premium
        String resultado4 = classificador.classificarCliente(25, 8000, 25, "Curitiba");
        System.out.println("Teste 4 (25 anos, renda 8000, 25 compras): " + resultado4);

        // Teste 5: Cliente Jovem Regular
        String resultado5 = classificador.classificarCliente(30, 7500, 15, "Porto Alegre");
        System.out.println("Teste 5 (30 anos, renda 7500, 15 compras): " + resultado5);

        // Teste 6: Cliente Jovem Baixa Renda
        String resultado6 = classificador.classificarCliente(40, 4000, 10, "Salvador");
        System.out.println("Teste 6 (40 anos, renda 4000, 10 compras): " + resultado6);
    }
}