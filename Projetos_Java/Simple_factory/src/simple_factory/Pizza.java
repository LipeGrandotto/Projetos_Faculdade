package simple_factory;
import javax.swing.JOptionPane;

public abstract class Pizza {
    protected String nome;

   
    public abstract void preparar();

    
    public void assar() {
        JOptionPane.showMessageDialog(null, nome + ": Assando por 15 minutos a 300 graus...");
    }

    public void empacotar() {
        JOptionPane.showMessageDialog(null, nome + ": Empacotando...");
    }
    
    public String getNome() {
        return nome;
    }
}
