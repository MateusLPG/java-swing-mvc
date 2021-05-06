/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaoNino.controller;
import CaoNino.dao.ExceptionDAO;
import CaoNino.model.Canino;
import java.sql.SQLException;
import javax.swing.JTextField;
/**
 *
 * @author mateu
 */
public class CaninoController {
    
    public boolean cadastrarCanino(String nome, String raca, String cor, double peso) throws ExceptionDAO, SQLException {

        if (nome != null && nome.length() > 0 && cor != null && cor.length() > 0){
            Canino canino = new Canino(nome, raca, cor, peso);
            
            canino.cadastrarCanino(canino);
            
            return true;
        }
        return false;
    }
    
    public void cadastrarCanino(JTextField jTextFieldNome, JTextField jTextFieldEndereco, JTextField jTextFieldCor, JTextField jTextFieldPeso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void cadastrarCanino(JTextField jTextFieldNome, JTextField jTextFieldEndereco, JTextField jTextFieldCor, double peso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
