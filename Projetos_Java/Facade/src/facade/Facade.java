package facade;


public class Facade {
    private PortaCarro portacarro;
    private Motor motor;
    private Som som;

    public Facade(PortaCarro portacarro, Motor motor, Som som) {
        this.portacarro = portacarro;
        this.motor = motor;
        this.som = som;
    }

    public void assistirFilme() {
        portacarro.Entrar();
        motor.ligar();
        som.ligar();
        som.setVolume(20);
    }
}
