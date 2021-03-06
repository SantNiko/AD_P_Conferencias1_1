/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Niko
 */
public class Sesion {
    
    private int id;
    private String nombre;
    private String info;
    private Date fechaHoraInicio;
    private double duracion;
    private Articulo articulo;
    private Conferencia conferencia;
    private ArrayList<Participante> oradores;
    

    public Sesion() {
    }

    public Sesion(int id, String nombre, String info, Date fechaHoraInicio, double duracion, Participante orador, Articulo articulo, Conferencia conferencia) {
        this.id = id;
        this.nombre = nombre;
        this.info = info;
        this.fechaHoraInicio = fechaHoraInicio;
        this.duracion = duracion;
        this.oradores.add(orador);
        this.articulo = articulo;
        this.conferencia = conferencia;
    }

    public Sesion(int id, String nombre, String info, Date fechaHoraInicio, double duracion, ArrayList<Participante> oradores, Articulo articulo, Conferencia conferencia) {
        this.id = id;
        this.nombre = nombre;
        this.info = info;
        this.fechaHoraInicio = fechaHoraInicio;
        this.duracion = duracion;
        this.oradores = oradores;
        this.articulo = articulo;
        this.conferencia = conferencia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sesion other = (Sesion) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.duracion) != Double.doubleToLongBits(other.duracion)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.info, other.info)) {
            return false;
        }
        if (!Objects.equals(this.fechaHoraInicio, other.fechaHoraInicio)) {
            return false;
        }
        if (!Objects.equals(this.oradores, other.oradores)) {
            return false;
        }
        if (!Objects.equals(this.articulo, other.articulo)) {
            return false;
        }
        return true;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuración(double duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Participante> getOradores() {
        return oradores;
    }

    public void setOradores(ArrayList<Participante> oradores) {
        this.oradores = oradores;
    }

    

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Conferencia getConferencia() {
        return conferencia;
    }

    public void setConferencia(Conferencia conferencia) {
        this.conferencia = conferencia;
    }
    
}
