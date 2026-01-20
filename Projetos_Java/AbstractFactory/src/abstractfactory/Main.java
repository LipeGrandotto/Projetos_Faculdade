package abstractfactory;


public class Main {
    public static void main(String[] args) {      

      
        FabricaDePizza fabrica1 = new PizzasDoce();
        Pizza pizzaDoce = new Pizza(fabrica1);
        pizzaDoce.montar();


        FabricaDePizza fabrica2 = new PizzasSalgadas();
        Pizza pizzaSalgada = new Pizza(fabrica2);
        pizzaSalgada.montar();
    }
}

