
package model.dao;

import connection.Conexao_com_o_banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Movimentacao;


public class MovimentacaoDAO {
    
    public void create(Movimentacao m){
    
        
                Connection con = Conexao_com_o_banco.getConnection(); 
                PreparedStatement stmt  = null;
                DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("HH");
                
              
		try {

		     
                    stmt = con.prepareStatement("INSERT INTO tbl_movimentacao (placa, modelo, data_entrada, data_saida, tempo, valor_pago) VALUES (?,?,?,?,?,?)");
                    stmt.setString(1, m.getPlaca());
                    stmt.setString(2, m.getModelo());
                    stmt.setLong(3, m.getData_entrada());
                    stmt.setString(4, "0000000000001");
                    stmt.setString(5, "1 hora");
                    stmt.setDouble(6, 6.00);
                    
		    System.out.println(stmt);
			
		    stmt.executeUpdate(); 
                    
                    JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
			
		} catch (SQLException ex) {
			
		
                    JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
                    
                    System.out.println("Erro ao salvar: " + ex);
                    
                    
		} finally{
                
                
                    Conexao_com_o_banco.closeConnection(con, stmt); 
                    
                
                }
                
    }
    
    
                public List<Movimentacao> lista_de_veiculos() {	
		
	        List<Movimentacao> dados_veiculos = new ArrayList<>();
                
                Connection connection = Conexao_com_o_banco.getConnection(); 
                PreparedStatement stmt  = null;
                ResultSet rs = null;
              
		try {

		     
                    stmt = connection.prepareStatement("SELECT * FROM tbl_movimentacao WHERE data_saida = '0000000000001'");
                    
		    System.out.println(stmt);
			
		    rs = stmt.executeQuery();

			
		    while (rs.next()) {
			
                      Movimentacao movimentacao = new Movimentacao(); 
                        
                      movimentacao.setId(rs.getInt("id"));
                      movimentacao.setPlaca(rs.getString("placa"));
                      movimentacao.setModelo(rs.getString("modelo"));
                      movimentacao.setData_entrada(rs.getLong("data_entrada"));
                   
                      dados_veiculos.add(movimentacao); 
                      
                      
		        
		    }
		        
                    	
		} catch (SQLException ex) {
			
		      
                      java.util.logging.Logger.getLogger(MovimentacaoDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    
                    
		} finally{
                
                     Conexao_com_o_banco.closeConnection(connection, stmt, rs);
                    
                }
	
		
		return dados_veiculos;
		
	}
                
                
                
                
            public void update(Movimentacao m){
    
        
                Connection con = Conexao_com_o_banco.getConnection(); 
                PreparedStatement stmt  = null;
              
		try {

		     
                    stmt = con.prepareStatement("UPDATE tbl_movimentacao SET placa= ?, modelo= ? WHERE id = ?");
                    stmt.setString(1, m.getPlaca());
                    stmt.setString(2, m.getModelo());
                    stmt.setInt(3, m.getId());
                    
		    System.out.println(stmt);
			
		    stmt.executeUpdate(); 
                    
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
			
		} catch (SQLException ex) {
			
		
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
                    
                    System.out.println("Erro ao salvar: " + ex);
                    
                    
		} finally{
                
                
                    Conexao_com_o_banco.closeConnection(con, stmt); 
                    
                
                }
                
    }
    
            
            
                public void updatesaida(Movimentacao m){
    
        
                Connection con = Conexao_com_o_banco.getConnection(); 
                PreparedStatement stmt  = null;
                Date d2 = new Date();
              
		try {

		     
                    stmt = con.prepareStatement("UPDATE tbl_movimentacao SET data_saida= ? WHERE id = ?");
                    stmt.setLong(1, d2.getTime());
                    stmt.setInt(2, m.getId()); 
                    
		    System.out.println(stmt);
			
		    stmt.executeUpdate(); 
                    
                    JOptionPane.showMessageDialog(null, "Removido com sucesso!");
			
		} catch (SQLException ex) {
			
		
                    JOptionPane.showMessageDialog(null, "Erro ao remover: " + ex);
                    
                    System.out.println("Erro ao salvar: " + ex);
                    
                    
		} finally{
                
                
                    Conexao_com_o_banco.closeConnection(con, stmt); 
                    
                
                }
                
    }
                
                
                
                public List<Movimentacao> lista_de_veiculos_de_saida(Movimentacao m) {	
		
	        List<Movimentacao> dados_veiculos = new ArrayList<>();
                
                Connection connection = Conexao_com_o_banco.getConnection(); 
                PreparedStatement stmt  = null;
                ResultSet rs = null;
              
		try {

		     
                    stmt = connection.prepareStatement("SELECT * FROM tbl_movimentacao WHERE id = ?");
                    stmt.setInt(1, m.getId());
                    
		    System.out.println(stmt);
			
		    rs = stmt.executeQuery();

			
		    while (rs.next()) {
			
                      Movimentacao movimentacao = new Movimentacao(); 
                        
                      movimentacao.setData_entrada(rs.getLong("data_entrada"));
                      movimentacao.setData_saida(rs.getLong("data_saida"));
                   
                      dados_veiculos.add(movimentacao); 
                      
                      
		        
		    }
		        
                    	
		} catch (SQLException ex) {
			
		      
                      java.util.logging.Logger.getLogger(MovimentacaoDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    
                    
		} finally{
                
                     Conexao_com_o_banco.closeConnection(connection, stmt, rs);
                    
                }
	
		
		return dados_veiculos;
		
	}
   
   
                
               public void updatesaida2(Movimentacao m){
    
        
                Connection con = Conexao_com_o_banco.getConnection(); 
                PreparedStatement stmt  = null;
                Date d2 = new Date();
              
		try {

		     
                    stmt = con.prepareStatement("UPDATE tbl_movimentacao SET tempo= ?, valor_pago= ? WHERE id = ?");
                    stmt.setString(1, m.getTempo());
                    stmt.setDouble(2, m.getValor_pago());
                    stmt.setInt(3, m.getId()); 
                    
		    System.out.println(stmt);
			
		    stmt.executeUpdate(); 
                    
			
		} catch (SQLException ex) {
			
		
                    JOptionPane.showMessageDialog(null, "Erro: " + ex);
                    
                    System.out.println("Erro: " + ex);
                    
                    
		} finally{
                
                
                    Conexao_com_o_banco.closeConnection(con, stmt); 
                    
                
                }
                
    }   
               
               
                
               
                public List<Movimentacao> lista_de_veiculos_tela_saida() {	
		
	        List<Movimentacao> dados_veiculos = new ArrayList<>();
                
                Connection connection = Conexao_com_o_banco.getConnection(); 
                PreparedStatement stmt  = null;
                ResultSet rs = null;
              
		try {

		     
                    stmt = connection.prepareStatement("SELECT * FROM tbl_movimentacao WHERE data_saida != '0000000000001'");
                    
		    System.out.println(stmt);
			
		    rs = stmt.executeQuery();

			
		    while (rs.next()) {
			
                      Movimentacao movimentacao = new Movimentacao(); 
                        
                      movimentacao.setId(rs.getInt("id"));
                      movimentacao.setPlaca(rs.getString("placa"));
                      movimentacao.setModelo(rs.getString("modelo"));
                      movimentacao.setData_entrada(rs.getLong("data_entrada"));
                      movimentacao.setData_saida(rs.getLong("data_saida"));
                      movimentacao.setTempo(rs.getString("tempo"));
                      movimentacao.setValor_pago(rs.getDouble("valor_pago"));
                   
                      dados_veiculos.add(movimentacao); 
                      
                      
		        
		    }
		        
                    	
		} catch (SQLException ex) {
			
		      
                      java.util.logging.Logger.getLogger(MovimentacaoDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    
                    
		} finally{
                
                     Conexao_com_o_banco.closeConnection(connection, stmt, rs);
                    
                }
	
		
		return dados_veiculos;
		
	}           
                
   
                
    
}
