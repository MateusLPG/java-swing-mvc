/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaoNino.controller;

import CaoNino.dao.ExceptionDAO;
import CaoNino.model.FichaAdocao;

/**
 *
 * @author mateus
 */
public class FichaAdocaoController {
    
    public boolean cadastrarFicha(int CodigoCachorro, int CodigoPessoa) throws ExceptionDAO {
            FichaAdocao fichaadocao = new FichaAdocao(CodigoCachorro, CodigoPessoa);
            
            fichaadocao.AdotarCachorro(fichaadocao);
            
            return true;
        
    }
    
}
