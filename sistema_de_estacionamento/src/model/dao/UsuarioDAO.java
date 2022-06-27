
package model.dao;

import connection.Conexao_com_o_banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioDAO {
    
        
    
    	public boolean checkLogin(String usuario, String senha) {	
		
	
                Connection connection = Conexao_com_o_banco.getConnection(); 
                PreparedStatement stmt  = null;
                ResultSet rs = null;
                boolean check = false;
		
		try {

		     
                    stmt = connection.prepareStatement("SELECT * FROM tbl_usuario WHERE usuario = ? AND senha = ?");
                    stmt.setString(1, usuario);
                    stmt.setString(2, senha);
		    System.out.println(stmt);
			
		    rs = stmt.executeQuery();

			
		    while (rs.next()) {
			
                        check = true; 
		        
		    }
		        
		        
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return check;
		
	}
        
        
        
        
        

        
        
        
    
}
