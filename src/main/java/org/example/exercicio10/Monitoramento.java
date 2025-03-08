package org.example.exercicio10;
import java.util.concurrent.atomic.AtomicInteger;

public class Monitoramento {

    private AtomicInteger contadorAcessos = new AtomicInteger(0);

    public int getContadorAcessos() {
        return contadorAcessos.get();
    }

    public void incrementarAcessos() {
        contadorAcessos.incrementAndGet();
    }
}
