package observer;

public class Main {
    public static void main(String[] args) {
        Notifica jose = new Cliente("Jose");
        Notifica pedro = new Cliente("Pedro");
        
        Loja loja = new Loja();
        
        loja.inscrever(jose);
        loja.inscrever(pedro);
        
        loja.listar();
        loja.isTemCelular();
        loja.chegouCelular();
        loja.listar();

    }
    
}
