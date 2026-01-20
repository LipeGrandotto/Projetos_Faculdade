package bridge;


public class ControleRemoto extends Controle {
    public ControleRemoto(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void botaoMudo() {
        System.out.println("Silenciando volume do dispositivo...");
        dispositivo.setVolume(0);
    }
}
