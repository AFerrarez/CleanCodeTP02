package org.example.exercicio12;

import java.util.EnumSet;

public class NotificacaoService {

    private EnumSet<TipoNotificacao> tiposValidos = EnumSet.allOf(TipoNotificacao.class);

    public void enviarNotificacao(TipoNotificacao tipo) {
        if (tiposValidos.contains(tipo) == false) {
            throw new IllegalArgumentException("Tipo de notificação desconhecido");
        }

        switch (tipo) {
            case EMAIL:
                System.out.println("Enviando e-mail...");
                break;
            case SMS:
                System.out.println("Enviando SMS...");
                break;
            case PUSH:
                System.out.println("Enviando notificação push...");
                break;
        }
    }

}
