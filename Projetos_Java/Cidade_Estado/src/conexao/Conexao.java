package conexao;
import java.sql.*;
import javax.swing.JOptionPane;


public class Conexao {
    
    Connection conexao = null;
    private final String driver = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://localhost:5432/cidade_estado";
    private final String usuario = "postgres";
    private final String senha = "";
    
    
            public Connection conectaBanco(){
            try
            {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,usuario,senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!!!");
            }catch(ClassNotFoundException drive)
            {
                JOptionPane.showMessageDialog(null,"Erro no driver do BD: " +drive);
            }
            catch(SQLException fonte)
            {
               JOptionPane.showMessageDialog(null,"Erro ao encontra a fonte de dados: " +fonte);
            }
            
             return conexao;
            }

    public Connection getConexao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
