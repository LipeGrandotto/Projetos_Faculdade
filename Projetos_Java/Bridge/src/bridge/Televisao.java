package bridge;

public class Televisao implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("TV: Ligada");
    }

    @Override
    public void desligar() {
        System.out.println("TV: Desligada");
    }

    @Override
    public void setVolume(int percentual) {
        System.out.println("TV: Volume definido em " + percentual + "%");
    }
}
