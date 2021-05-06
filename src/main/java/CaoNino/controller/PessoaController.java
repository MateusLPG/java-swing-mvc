/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaoNino.controller;

import CaoNino.model.Pessoa;
import javax.swing.JTextField;

/**
 *
 * @author mateus
 */
public class PessoaController {
    
    public boolean cadastrarPessoa(String nome, String endereço, long telefone, String email, String sexo, long cpf){
        
        if (nome != null && nome.length() > 0 && endereço != null && endereço.length() > 0 && email != null && email.length() > 0 && sexo != null && sexo.length() > 0){
            Pessoa pessoa = new Pessoa(nome, endereço, telefone, email, sexo, cpf);
            
            pessoa.cadastrarPessoa(pessoa);
            
            return true; 
        }
        return false;
    
    }

    public void cadastrarPessoa(JTextField jTextFieldNome, JTextField jTextFieldEndereco, long telefone, JTextField jTextFieldEmail1, String sexo, long cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

