package br.com.medcenter.api.entities;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Admin {
    private User user;
    private Type type;

    public void cadastrarMed(){
    }
    public void cadastrarAuxAdm(){
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin admin)) return false;
        return Objects.equals(getUser(), admin.getUser()) && Objects.equals(getType(), admin.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser(), getType());
    }
}
