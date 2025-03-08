package org.example.exercicio9;

import java.util.LinkedList;
import java.util.Queue;

public class FilaMensagens {
    private Queue<String> mensagens = new LinkedList<>();

    public String vizualisarProximaMensagem() {
        return mensagens.poll();
    }

    public void removerProximaMnesagem (){
        mensagens.poll();
    }

    public void adicionarMensagens(String mensagem) {
        mensagens.add(mensagem);
    }
}
