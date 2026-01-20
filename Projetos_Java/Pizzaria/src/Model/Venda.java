package Model;
import javax.swing.JOptionPane;

public class Venda extends Cardapio {
    int opcao = 0;
    
    public Venda (String nome, float preco){
        super(nome, preco);
    }
    
    public void Pedido () {
        opcao = Integer.parseInt(JOptionPane.showInputDialog("1: Hambúrguer - R$ 15,00\n" +
        "2: Suco - R$ 5,00\n"+
        "3: Pastel - R$ 7,00\n"+
        "4: Sanduiche - R$ 6,00\n" +
        "Digite o numero da opção: "));
        
        switch (this.opcao){
            case 1: 
                this.nome = "Hamúrguer";
                this.preco = 15;
                break;
            case 2: 
                this.nome = "Suco";
                this.preco = 5;
                break;
            case 3:
                this.nome = "Pastel";
                this.preco = 7;
                break;
            case 4:
                this.nome = "Sanduiche";
                this.preco = 6;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida! Item não listado.", "Aviso", JOptionPane.WARNING_MESSAGE);
                this.opcao = 0;
                break;
    }
    }
    
    public int getOpcao(){
        return opcao;
    }
    
    public void setOpcao(int opcao){
        this.opcao = opcao;
    }
    
}
 