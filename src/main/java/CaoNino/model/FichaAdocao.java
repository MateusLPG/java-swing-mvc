/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaoNino.model;

import CaoNino.dao.AdotarDAO;
import CaoNino.dao.ExceptionDAO;
import java.util.Date;

/**
 *
 * @author mateu
 */
public class FichaAdocao {
    
    private String cachorro;
    private String pessoa;
    private Canino canino;
    private Pessoa pessoaP;
    private Date dataAdocao;

    public FichaAdocao(String nomeCanino, String nomePessoa) {
        this.cachorro = nomeCanino;
        this.pessoa = nomePessoa;
    }
    
    
    public void AdotarCachorro (FichaAdocao ficha) throws ExceptionDAO {
        new AdotarDAO().AdotarCachorro(ficha);
        
    } 

    public String getCachorro() {
        return cachorro;
    }

    public void setCachorro(String cachorro) {
        this.cachorro = cachorro;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public Canino getCanino() {
        return canino;
    }

    public void setCanino(Canino canino) {
        this.canino = canino;
    }

    public Pessoa getPessoaP() {
        return pessoaP;
    }

    public void setPessoaP(Pessoa pessoaP) {
        this.pessoaP = pessoaP;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

  
    
    
}
