package io.github.devhonorio.acesso_API.domain;

public class Visita {
    private int id;
    private int dataHora;
    private int idVisitante;
    private int idMorador;


    public Visita() {
    }

    public Visita(int dataHora, int id, int idMorador, int idVisitante) {
        this.dataHora = dataHora;
        this.id = id;
        this.idMorador = idMorador;
        this.idVisitante = idVisitante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDataHora() {
        return dataHora;
    }

    public void setDataHora(int dataHora) {
        this.dataHora = dataHora;
    }

    public int getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
    }

    public int getIdMorador() {
        return idMorador;
    }

    public void setIdMorador(int idMorador) {
        this.idMorador = idMorador;
    }

}
