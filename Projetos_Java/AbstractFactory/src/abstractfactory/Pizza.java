package abstractfactory;

public class Pizza {
    private Massa massa;
    private Recheio recheio;
    private FabricaDePizza fabrica;


    public Pizza(FabricaDePizza fabrica) {
        this.fabrica = fabrica;
    }

    public void montar() {
        this.massa = fabrica.criarMassa();
        this.recheio = fabrica.criarRecheio();
        
        System.out.println("Montando Pizza:");
        System.out.println("Tipo de massa " + massa.getSabor()+"\n");
        System.out.println("Tipo de Recheio: " + recheio.getTipo()+"\n");

    }
}
