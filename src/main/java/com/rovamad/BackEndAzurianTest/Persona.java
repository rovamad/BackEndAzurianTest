package com.rovamad.BackEndAzurianTest;

import javax.persistence.*;

@Entity
@Table(name = "personas")
public class Persona {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpersonas;
    @Column
    private String nombre;
    @Column
    private String apellido;

    public int getId() {
        return idpersonas;
    }

    public void setId(int idpersonas) {
        this.idpersonas = idpersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
