package br.com.medcenter.api.entities;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Paciente {
    private double altura;
    private double peso;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente paciente)) return false;
        return Double.compare(paciente.getAltura(), getAltura()) == 0 && Double.compare(paciente.getPeso(), getPeso()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAltura(), getPeso());
    }
}
