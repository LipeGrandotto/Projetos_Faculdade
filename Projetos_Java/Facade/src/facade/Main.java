package facade;

public class Main {

    public static void main(String[] args) {
        PortaCarro carro = new PortaCarro();
        Motor motor = new Motor();
        Som som = new Som();


        Facade Uno = new Facade(carro, motor, som);
        
 
        Uno.assistirFilme();
    }
}
