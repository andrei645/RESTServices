package com.example.laborator11.problemm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "problem")
public class Problem {

    @Id
    private Integer id;
    private String enunt;
    private String variante;

    @Column(name = "varianta_corecta")
    private String variantaCorecta;

    public Problem(Integer id, String enunt, String variante, String variantaCorecta) {
        this.id = id;
        this.enunt = enunt;
        this.variante = variante;
        this.variantaCorecta = variantaCorecta;
    }

    public Problem() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnunt() {
        return enunt;
    }

    public void setEnunt(String enunt) {
        this.enunt = enunt;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public String getVariantaCorecta() {
        return variantaCorecta;
    }

    public void setVariantaCorecta(String variantaCorecta) {
        this.variantaCorecta = variantaCorecta;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "id=" + id +
                ", enunt='" + enunt + '\'' +
                ", variante='" + variante + '\'' +
                ", variantaCorecta='" + variantaCorecta + '\'' +
                '}';
    }
}
