package org.example.exercicio5;

public class ClienteClassificador {

    public String classificarCliente(int idade, double renda, int compras, String localizacao) {

        String tipoIdade = idade > 60 ? "Sênior" : "Jovem";

        double limiteRenda = idade > 60 ? 5000 : 7000;
        int limiteCompras = idade > 60 ? 10 : 20;

        if (renda > limiteRenda && compras > limiteCompras) {
            return "Cliente Premium " + tipoIdade;
        } else if (renda > limiteRenda) {
            return "Cliente Regular " + tipoIdade;
        } else {
            return "Cliente " + tipoIdade + " Baixa Renda";
        }
    }
}

