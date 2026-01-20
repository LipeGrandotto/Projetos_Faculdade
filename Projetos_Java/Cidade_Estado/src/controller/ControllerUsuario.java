package controller;

import dao.DaoUsuario;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.List;
import model.Usuario;


public class ControllerUsuario {
    
    DaoUsuario dao = new DaoUsuario();
    
    public List<Usuario> getUsuarios() 
    {
        return dao.getUsuarios();
    }   
    
    public boolean logarNoSistema(String e, String s)
    {
        if(e.equals("") || s.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Existem Campos em Branco");
            return false;
        }
        else
        {
            return dao.fazerLogin(e, s);
        }
    }
    
    public String inserirUsuario(Usuario u)
    {
        if(!u.getEmail().equals("") || !u.getNome().equals(""))
        {
            dao.salvarUsuario(u);
            return "Salvo com sucesso!!!";
        }
        else
        {
            return "Exitem campos em branco";
        }
    }
    
    
}
