package com.example.pooproject.modelo;

import java.util.Date;

public class Acciones {
    Date fecha;
    String cambio;


    public Acciones() {
    }

    public Acciones(Date fecha, String cambio) {
        this.fecha = fecha;
        this.cambio = cambio;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
}