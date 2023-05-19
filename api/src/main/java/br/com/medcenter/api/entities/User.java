package br.com.medcenter.api.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String username;
    private String email;
    private String senha;
    private String dtnasc;
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getId(), user.getId()) && Objects.equals(getNome(), user.getNome()) && Objects.equals(getUsername(), user.getUsername()) && Objects.equals(getEmail(), user.getEmail()) && Objects.equals(getSenha(), user.getSenha()) && Objects.equals(getDtnasc(), user.getDtnasc()) && Objects.equals(getCpf(), user.getCpf()) && Objects.equals(getType(), user.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getUsername(), getEmail(), getSenha(), getDtnasc(), getCpf(), getType());
    }
}
