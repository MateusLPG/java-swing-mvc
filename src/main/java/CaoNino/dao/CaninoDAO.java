/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaoNino.dao;

/**
 *
 * @author mateus
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import CaoNino.model.Canino;
import java.util.ArrayList;

//classe capaz de fazer o crud

public class CaninoDAO extends ConnectionMVC{
    public void cadastrarCanino(Canino cao) throws ExceptionDAO {
        String sql = "insert into Canino (nomeCanino, raca, cor, peso) value (?, ?, ?, ?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {            
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, cao.getNome());
            pStatement.setString(2, cao.getRaca());
            pStatement.setString(3, cao.getCor());
            pStatement.setDouble(4, cao.getPeso());
            pStatement.execute();
            ArrayList<Canino> caninoLista = new ArrayList<>();
            caninoLista.add(new Canino(cao.getNome(), cao.getRaca(), cao.getCor(), cao.getPeso()));
        
        } catch (SQLException e) {
            
            throw new ExceptionDAO ("Erro ao cadastrar o filme. " + e);
        
        } finally {           
            try {    
                if (pStatement != null){ pStatement.close(); }
            } catch (SQLException e){
                throw new ExceptionDAO("Erro no Statement: " + e); 
                
                
            } try {
                if (connection != null ) { connection.close();}
            } catch (SQLException e){
                throw new ExceptionDAO ("Erro ao fechar a conexão" + e);
            }
        }
    }
}
