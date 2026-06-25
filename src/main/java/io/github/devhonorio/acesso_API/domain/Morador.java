package io.github.devhonorio.acesso_API.domain;

public class Morador {
    private Long id;
    private String CPF;
    private String endereco;
    private String celular;
    private Pessoa pessoa;

    public Morador(Long id, String CPF, String endereco, String celular, Pessoa pessoa) {
        this.id = id;
        this.CPF = CPF;
        this.endereco = endereco;
        this.celular = celular;
        this.pessoa = pessoa;
    }

    public Morador() {
    }

    public Long getId() {
        return id;
    }       

    public void setId(Long id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
