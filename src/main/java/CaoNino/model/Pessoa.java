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
public class Pessoa {
    
    private int codPessoa;
    private String nome;
    private String endereço;
    private long telefone;
    private String email;
    private String sexo;
    private long cpf;
    private Canino canino;
    
    

    public Pessoa(String nome, String endereço, long telefone, String email, String sexo, long cpf) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.cpf = cpf;
    }
    
    public void cadastrarPessoa(Pessoa pessoa){}
    
    public int getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Canino getCanino() {
        return canino;
    }

    public void setCanino(Canino canino) {
        this.canino = canino;
    }
    
    
    
}
