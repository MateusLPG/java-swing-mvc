/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaoNino.model;

/**
 *
 * @author mateu
 */

import CaoNino.dao.CaninoDAO;
import CaoNino.dao.ExceptionDAO;
//import java.sql.SQLException;

public class Canino {
    
    private int codCanino;
    private String nome;
    private String raca;
    private String cor;
    private double peso;
    private Pessoa pessoa;

    public Canino(String nome, String raca, String cor, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
    }
    
    

    public void cadastrarCanino(Canino cao) throws ExceptionDAO {
       new CaninoDAO().cadastrarCanino(cao);
    }
    
    
    public int getCodCanino() {
        return codCanino;
    }

    public void setCodCanino(int codCanino) {
        this.codCanino = codCanino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
    
}
