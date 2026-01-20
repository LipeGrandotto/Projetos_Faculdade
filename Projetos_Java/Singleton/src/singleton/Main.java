package singleton;

public class Main {

    public static void main(String[] args) {
        Carro carro1 = Carro.getInstancia();
        carro1.setModelo("Ferrari");
        

        Carro carro2 = Carro.getInstancia();

        System.out.println("Modelo do Carro 2: " + carro2.getModelo());
        
        if (carro1 == carro2) {
            System.out.println("Carro1 e carro2 sao mesmo objeto.");
        } else {
            System.out.println("Falha! Sao objetos diferentes.");
        }
    }
}
