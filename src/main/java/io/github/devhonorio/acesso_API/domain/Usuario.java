package io.github.devhonorio.acesso_API.domain;

public class Usuario {
   private Long id;
   private String nome;
   private String email;
   private String senha;
   private Boolean administrador;
   private int idPessoa;
   
   public Usuario(Long id, String nome, String email, String senha, Boolean administrador) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.administrador = administrador;
    this.idPessoa = idPessoa;
    }

   public Usuario() {
   }


    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}





