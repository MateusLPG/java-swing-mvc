/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaoNino.model;

import CaoNino.dao.AdotarDAO;
import CaoNino.dao.ExceptionDAO;
import CaoNino.view.AdotarCachorro;
import java.util.Date;

/**
 *
 * @author mateu
 */
public class FichaAdocao {
    

    private int codigoCanino;
    private int codigoPessoa;
    private Date dataAdocao;

    AdotarCachorro adotarcachorro = new AdotarCachorro();
    
    public FichaAdocao(int idCanino, int idPessoa) {
        this.codigoCanino = idCanino;
        this.codigoPessoa = idPessoa;
    }
    
    
    public void AdotarCachorro (FichaAdocao ficha) throws ExceptionDAO {
        
        new AdotarDAO().AdotarCachorro(ficha);
        
    } 

    public int getCodigoCanino() {
        return codigoCanino;
    }

    public void setCodigoCanino(int codigoCanino) {
        this.codigoCanino = codigoCanino;
    }

    public int getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(int codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public AdotarCachorro getAdotarcachorro() {
        return adotarcachorro;
    }

    public void setAdotarcachorro(AdotarCachorro adotarcachorro) {
        this.adotarcachorro = adotarcachorro;
    }



    
  
    
    
}
