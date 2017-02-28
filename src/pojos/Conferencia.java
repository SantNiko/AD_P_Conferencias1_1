/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Niko
 */
public class Conferencia {
    
    private int id;
    private String nombre;
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private double precio;
    private ArrayList<A_Persona> participantes;

    public Conferencia() {
    }

    public Conferencia(int id, String nombre, Date fechaHoraInicio, Date fechaHoraFin, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.participantes = new ArrayList();
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.precio = precio;
    }

    public Conferencia(int id, String nombre, A_Persona participante, Date fechaHoraInicio, Date fechaHoraFin, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.participantes.add(participante);
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.precio = precio;
    }

    public Conferencia(int id, String nombre,ArrayList<A_Persona> participantes, Date fechaHoraInicio, Date fechaHoraFin, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.participantes = participantes;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Conferencia{" + "id=" + id + ", nombre=" + nombre + ", participantes=" + participantes() + ", fechaHoraInicio=" + fechaHoraInicio + ", fechaHoraFin=" + fechaHoraFin + ", precio=" + precio + '}';
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
        final Conferencia other = (Conferencia) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.participantes, other.participantes)) {
            return false;
        }
        if (!Objects.equals(this.fechaHoraInicio, other.fechaHoraInicio)) {
            return false;
        }
        if (!Objects.equals(this.fechaHoraFin, other.fechaHoraFin)) {
            return false;
        }
        return true;
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
    public ArrayList<A_Persona> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<A_Persona> participantes) {
        this.participantes = participantes;
    }
    
    public A_Persona getParticipante(int i){
        return participantes.get(i);
    }
    
    public A_Persona getParticipante(A_Persona art){
        int i  = participantes.indexOf(art);
        if (i == -1) {
            return null;
        }
        return participantes.get(i);
    }
    
    public void setParticipante(int i, A_Persona aut){
        participantes.set(i, aut);
    }
    
    public boolean addParticipante(A_Persona aut){
        return participantes.add(aut);
    }
    
    public boolean removeParticipante(A_Persona aut){
        return participantes.remove(aut);
    }
    
    public boolean addParticipantes(Collection<A_Persona> auts){
        return participantes.addAll(auts);
    }
    
    public boolean removeParticipantes(Collection<A_Persona> auts){
        return participantes.removeAll(auts);
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public Date getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(Date fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    private String participantes(){
        String r = "{";
        for (A_Persona part : participantes) {
            r+=part.getNombre()+",";
        }
        r = ""+r.subSequence(0, r.length()-1)+"}";
        return r;
    }
}
