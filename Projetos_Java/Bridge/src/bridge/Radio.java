package bridge;

public class Radio implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("Radio: Ligado e sintonizado");
    }

    @Override
    public void desligar() {
        System.out.println("Radio: Desligado");
    }

    @Override
    public void setVolume(int percentual) {
        System.out.println("Radio: Volume em " + percentual + "%");
    }
}
