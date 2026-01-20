package simple_factory;
import javax.swing.JOptionPane;

public class PizzaCalabresa extends Pizza {
    public PizzaCalabresa() {
        this.nome = "Pizza de Calabresa";
    }

    @Override
    public void preparar() {
        JOptionPane.showMessageDialog(null, nome + ": Adicionando molho, calabresa e cebola.");
    }
}

