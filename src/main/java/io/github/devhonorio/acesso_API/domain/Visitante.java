package io.github.devhonorio.acesso_API.domain;

public class Visitante {
    private int id;
    private String rg;
    private int idPessoa;

    public Visitante(int id, String rg, int idPessoa) {
        this.id = id;
        this.rg = rg;
        this.idPessoa = idPessoa;
    }

    public Visitante() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    
}
