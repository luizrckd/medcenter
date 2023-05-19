package br.com.medcenter.api.entities;

import jakarta.persistence.Entity;

@Entity
public class Med {
    private String especialidade;
    private String disponibilidade;

    public void marcarConsulta(){

    }

    public void cancelarConsulta(){

    }
}
