package singleton;

public class Carro {
    private static Carro instancia = null;
    private String modelo;
    
    private Carro(){}
    
    public static synchronized Carro getInstancia()
    {
        if(instancia==null)
        {
            instancia = new Carro();
            System.out.println("Instancia Criada");
        }
        return instancia;
}
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
