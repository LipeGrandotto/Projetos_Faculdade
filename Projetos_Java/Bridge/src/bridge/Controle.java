package bridge;

public class Controle {
    protected Dispositivo dispositivo;

    public Controle(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void botaoLigar() {
        dispositivo.ligar();
    }

    public void botaoDesligar() {
        dispositivo.desligar();
    }
}
