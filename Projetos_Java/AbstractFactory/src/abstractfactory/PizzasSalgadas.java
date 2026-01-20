package abstractfactory;

public class PizzasSalgadas implements FabricaDePizza {
    
private class MassaTradicional implements Massa {

    @Override
    public String getSabor() {
        return "Massa Tradicional Salgada";
        }
    }

    private class RecheioCalabresa implements Recheio {
        @Override
        public String getTipo() {
            return "Calabresa";
        }
    }

    @Override
    public Massa criarMassa() {
        return new MassaTradicional();
    }

    @Override
    public Recheio criarRecheio() {
        return new RecheioCalabresa();
    }
}

