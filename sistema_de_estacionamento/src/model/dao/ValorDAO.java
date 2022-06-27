
package model.dao;

import connection.Conexao_com_o_banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Valor;


public class ValorDAO {
    
    
                public List<Valor> lista_dados_tbl_valor() {	
		
	        List<Valor> dados_tbl_valor = new ArrayList<>();
                
                Connection connection = Conexao_com_o_banco.getConnection(); 
                PreparedStatement stmt  = null;
                ResultSet rs = null;
              
		try {

		     
                    stmt = connection.prepareStatement("SELECT * FROM tbl_valor");
                    
		    System.out.println(stmt);
			
		    rs = stmt.executeQuery();

			
		    while (rs.next()) {
			
                      Valor valor = new Valor(); 
                        
                      valor.setId(rs.getInt("id"));
                      valor.setValor_primeira_hora(rs.getDouble("valor_primeira_hora"));
                      valor.setValor_demais_horas(rs.getDouble("valor_demais_horas"));
                      //valor.setData_fim(rs.getDate("data_fim"));
                   
                      dados_tbl_valor.add(valor);  
                      
                      
		        
		    }
		        
                    	
		} catch (SQLException ex) {
			
		      
                      java.util.logging.Logger.getLogger(MovimentacaoDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    
                    
		} finally{
                
                     Conexao_com_o_banco.closeConnection(connection, stmt, rs);
                    
                }
	
		
		return dados_tbl_valor;
		
	}
    
    
}
