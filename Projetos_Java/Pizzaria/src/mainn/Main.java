package mainn;
import javax.swing.JOptionPane;
import Model.Venda;

public class Main {

    public static void main(String[] args) {
        Venda v = new Venda("Temp", 0);
        v.Pedido();
        
        if (v.getOpcao() != 0) {
            JOptionPane.showMessageDialog(null, 
                "Você escolheu a opção " + v.getOpcao() + ".\n" +
                "Item: " + v.getNome() + "\n" +
                "Preço: R$ " + String.format("%.2f", v.getPreço())
            );
        } else {
             JOptionPane.showMessageDialog(null, "Pedido cancelado ou opção inválida.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
