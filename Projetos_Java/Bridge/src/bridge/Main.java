package bridge;

public class Main {


    public static void main(String[] args) {
        System.out.println("Teste para assistir Raul Gil MAOEEEEE ");
        Dispositivo minhaTv = new Televisao();
        
        
        ControleRemoto controleTv = new ControleRemoto(minhaTv);
        controleTv.botaoLigar();
        controleTv.botaoMudo();

        Dispositivo meuRadio = new Radio();
        
 
        ControleRemoto controleRadio = new ControleRemoto(meuRadio);
        controleRadio.botaoLigar();
        controleRadio.botaoMudo();
    }
}
