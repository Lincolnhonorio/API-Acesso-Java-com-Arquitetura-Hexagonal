package io.github.devhonorio.acesso_API.domain;

public class Morador {
    private int id;
    private int CPF;
    private String endereco;
    private int celular;
    private int idPessoa;

    public Morador(int id, int CPF, String endereco, int celular, int idPessoa) {
        this.id = id;
        this.CPF = CPF;
        this.endereco = endereco;
        this.celular = celular;
        this.idPessoa = idPessoa;   
    }

    public Morador() {
    }

    public int getId() {
        return id;
    }       

    public void setId(int id) {
        this.id = id;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

}
