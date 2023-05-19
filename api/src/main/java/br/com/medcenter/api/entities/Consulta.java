package br.com.medcenter.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_consulta_tipo")
public class Consulta {
    private String data;

}
