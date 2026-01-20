/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Estado;

/**
 *
 * @author user
 */
public class DaoEstado {
    
    Connection con = null;
    PreparedStatement pstm = null;

    public List<String> getSiglaEstados()
    {
    List<String> lista = new ArrayList<String>();
    ResultSet rs = null;
    con = new Conexao().conectaBanco();
    
    try{
  
    pstm = con.prepareStatement("SELECT sigla FROM estados", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
        do{
           
             lista.add(rs.getString("sigla"));
            
        }while(rs.next());
    }
    
    pstm.close();
  
    }   
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao buscar dados no BD "+erro);
    }
    
    
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de busca "+err);
        }
    }
    
    return lista;
}
    
    public int getIdBySigla(String sigla)
    {
    int id=0;
    ResultSet rs = null;
    con = new Conexao().conectaBanco();
    
    try{
  
    pstm = con.prepareStatement("SELECT id FROM estados WHERE sigla=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
     pstm.setString(1, sigla);
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
       id=rs.getInt("id");
    }
    
    pstm.close();
  
    }   
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao buscar dados no BD "+erro);
    }
    
    
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de busca "+err);
        }
    }
    
    return id;
}
}
