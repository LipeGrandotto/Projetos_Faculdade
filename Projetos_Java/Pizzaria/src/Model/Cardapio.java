package Model;

import javax.swing.JOptionPane;

public abstract class Cardapio {
    protected String nome;
    protected float preco;
    
    public Cardapio(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrar_itens(){
        JOptionPane.showMessageDialog(null, nome + " - R$ " + preco);
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public float getPreço() {
        return preco;
    }
    
    public void setPreço(float Preço){
        this.preco = Preço;
    }
    

}
