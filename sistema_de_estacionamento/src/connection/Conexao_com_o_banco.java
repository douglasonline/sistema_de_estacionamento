
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Conexao_com_o_banco {
    
        private static final String jdbcURL = "jdbc:mysql://localhost:3306/tabelas_do_sistema_de_estacionamento";
	private static final String jdbcUsername = "root";
	private static final String jdbcPassword = "";

        
	public static Connection getConnection() {
		
		try {
                    
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
                
                
		} catch (ClassNotFoundException | SQLException ex) {
			
                    throw new RuntimeException("Erro na conexão: ", ex);
			
                }
        }     
        
		
	
        
        public static void closeConnection(Connection con){
    
            try {   
                if(con != null){
                    con.close();
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Conexao_com_o_banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
                
        
        }
        
        public static void closeConnection(Connection con, PreparedStatement stmt){
        
        
        closeConnection(con);
        
        try {   
                if(stmt != null){
                    stmt.close();
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Conexao_com_o_banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        
        
        }
        
        
        public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        
        closeConnection(con, stmt);
        
        try {   
                if(rs != null){
                    rs.close();
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Conexao_com_o_banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        
        
        }
        
        
        
        
        
        
        
    
}
