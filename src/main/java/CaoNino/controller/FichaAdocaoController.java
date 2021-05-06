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
    public boolean cadastrarFicha(String cachorro, String pessoa) throws ExceptionDAO {
        if (cachorro != null && cachorro.length() > 0 && pessoa != null && pessoa.length() > 0) {
            FichaAdocao fichaadocao = new FichaAdocao(cachorro, pessoa);
            
            fichaadocao.AdotarCachorro(fichaadocao);
            
            return true;
        }
        return false;
    }
    
}
