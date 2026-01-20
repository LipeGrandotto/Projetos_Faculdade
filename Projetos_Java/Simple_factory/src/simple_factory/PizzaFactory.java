package simple_factory;

public class PizzaFactory {
    public static Pizza criarPizza (String tipo){
        
        Pizza pizza = null;
        switch (tipo){
            case "FRANGOCOMCATUPIRY", "FRANGOCATUPIRY":
                pizza = new FrangoCatupiry();
                break;
            case "CALABRESA":
                pizza = new PizzaCalabresa();
                break;
            default:
                break;
        }
        return pizza;
    }
    
}
