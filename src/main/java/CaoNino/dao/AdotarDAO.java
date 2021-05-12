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
import CaoNino.model.FichaAdocao;
import CaoNino.model.Pessoa;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import CaoNino.view.AdotarCachorro;
import java.util.ArrayList;

public class AdotarDAO extends ConnectionMVC{
    
    public void AdotarCachorro (FichaAdocao ficha) throws ExceptionDAO {
        String sql = "insert into fichaAdocao (cachorro, pessoa) value (?, ?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {            
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, ficha.getCachorro());
            pStatement.setString(2, ficha.getPessoa());
            pStatement.execute();
        
        } catch (SQLException e) {
            
            throw new ExceptionDAO ("Erro ao cadastrar o filme. " + e);
        
        } finally {           
            try {    
                if (pStatement != null){ 
                    
                    pStatement.close();
                }
            } catch (SQLException e){
                throw new ExceptionDAO("Erro no Statement: " + e); 
                
                
            } try {
                if (connection != null ) {
                
                    connection.close();
                }
            } catch (SQLException e){
                throw new ExceptionDAO ("Erro ao fechar a conexão" + e);
            }
        }
    }
    
    
    public ArrayList<Canino> listarCachorros () {
           
        String sql = "select * from Canino";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;
        ArrayList<Canino> listaCachorros = new ArrayList<>();
        
        try {
            conn = new ConnectionMVC().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Canino canino = new Canino (rs.getString("nomeCanino"), rs.getString("raca"), rs.getString("cor"), rs.getFloat("peso"));
                listaCachorros.add(canino);               
            }
        
        } catch (Exception e) { 
            System.out.println("Erro: " + e); 
        }      
        
        return listaCachorros;
    }
    

       
}
 