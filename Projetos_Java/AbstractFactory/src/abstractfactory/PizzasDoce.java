package abstractfactory;


public class PizzasDoce implements FabricaDePizza {
    private class MassaChocolate implements Massa {
        @Override
        public String getSabor() {
            return "Massa de Cacau";
        }
    }

    private class RecheioMorango implements Recheio {
        @Override
        public String getTipo() {
            return "chocolate";
        }
    }

    @Override
    public Massa criarMassa() {
        return new MassaChocolate();
    }

    @Override
    public Recheio criarRecheio() {
        return new RecheioMorango();
    }
}

