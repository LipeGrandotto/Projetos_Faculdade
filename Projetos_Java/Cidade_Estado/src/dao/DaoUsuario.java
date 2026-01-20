package dao;

import conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;


        
public class DaoUsuario {
    
    Connection con = null;
    PreparedStatement pstm = null;

public List<Usuario> getUsuarios()
{
    List<Usuario> lista = new ArrayList<Usuario>();
    ResultSet rs = null;
    con = new Conexao().conectaBanco();
    
    try{
  
    pstm = con.prepareStatement("SELECT * FROM usuarios", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
        do{
            Usuario u = new Usuario();
             u.setId(rs.getInt("id"));
             u.setNome(rs.getString("nome"));
             u.setEmail(rs.getString("email"));
             u.setSenha(rs.getString("senha"));
             u.setPerfil(rs.getInt("perfil"));
             u.setEstado(rs.getString("estado"));
             u.setCidade(rs.getString("cidade"));
             lista.add(u);
            
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
    
public boolean fazerLogin(String email, String senha)
{
    boolean resultado = false;
    
    ResultSet rs = null;
    con = new Conexao().conectaBanco();
    
    try{
  
    pstm = con.prepareStatement("SELECT * FROM usuarios WHERE email=? and senha=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    pstm.setString(1, email);
    pstm.setString(2, senha);
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
       resultado = true;
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
    
    return resultado;
}

public void salvarUsuario(Usuario usu)
{
    con = new Conexao().conectaBanco();
    
    try{
    pstm = con.prepareStatement("INSERT INTO usuarios (nome,email,senha,perfil,estado,cidade) VALUES (?,?,?,?,?,?)");
    pstm.setString(1,usu.getNome() );
    pstm.setString(2,usu.getEmail());
    pstm.setString(3, usu.getSenha());
    pstm.setInt(4, usu.getPerfil());
    pstm.setString(5, usu.getEstado());
    pstm.setString(6, usu.getCidade());
    this.pstm.execute();
    
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao salvar usuário no BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de salvamento "+err);
        }
    }
    

}
    

}  