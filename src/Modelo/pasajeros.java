/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author EDD
 */
public class pasajeros {

    public int vuelo;
    public String asiento;
    public String origen;
    public String destino;
    public String nombrep;
    public String apellido;
    public String fecha;
    public String aereolinea;
    public String categoria;
    public Double preciob;

    public pasajeros() {
    }

    public pasajeros(int vuelo, String asiento, String origen, String destino, String nombrep, String apellido, String fecha, String aereolinea, String categoria, double preciob) {
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.origen = origen;
        this.destino = destino;
        this.nombrep = nombrep;
        this.apellido = apellido;
        this.fecha = fecha;
        this.aereolinea = aereolinea;
        this.categoria = categoria;
        this.preciob = preciob;
    }

    public int getVuelo() {
        return vuelo;
    }

    public void setVuelo(int vuelo) {
        this.vuelo = vuelo;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAereolinea() {
        return aereolinea;
    }

    public void setAereolinea(String aereolinea) {
        this.aereolinea = aereolinea;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreciob() {
        return preciob;
    }

    public void setPreciob(double preciob) {
        this.preciob = preciob;
    }

}
