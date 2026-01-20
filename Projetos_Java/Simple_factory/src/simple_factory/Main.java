package simple_factory;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

  
        String Tipo = JOptionPane.showInputDialog(null, "Sabores disponíveis:\n- Calabresa\n- FrangoCatupiry\n", "Pizzaria do if", JOptionPane.QUESTION_MESSAGE);
        if(Tipo != null){
        String tipo = Tipo.trim().toUpperCase();

        Pizza p = PizzaFactory.criarPizza(tipo);
        p.preparar();
        p.assar();
        p.empacotar();
        

    }
    }
}
