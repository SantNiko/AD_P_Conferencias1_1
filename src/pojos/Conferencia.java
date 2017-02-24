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
    private ArrayList<Sesion> sesiones;
    private ArrayList<A_Persona> participantes;
    private Date fechaHora;
    private double precio;

    public Conferencia() {
    }

    public Conferencia(int id, String nombre, Date fechaHora, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.fechaHora = fechaHora;
        this.precio = precio;
        sesiones = new ArrayList<>();
        participantes = new ArrayList<>();
    }

    public Conferencia(int id, String nombre, ArrayList<Sesion> sesiones, ArrayList<A_Persona> participantes, Date fechaHora, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.sesiones = sesiones;
        this.participantes = participantes;
        this.fechaHora = fechaHora;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Conferencia{" + "id=" + id + ", nombre=" + nombre + ", sesiones=" + sesiones() + ", participantes=" + participantes() + ", fechaHora=" + fechaHora + ", precio=" + precio + '}';
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
        if (!Objects.equals(this.fechaHora, other.fechaHora)) {
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

    public ArrayList<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(ArrayList<Sesion> sesiones) {
        this.sesiones = sesiones;
    }
    public Sesion getSesion(int i){
        return sesiones.get(i);
    }
    
    public Sesion getSesion(Sesion art){
        int i  = sesiones.indexOf(art);
        if (i == -1) {
            return null;
        }
        return sesiones.get(i);
    }
    
    public void setSesion(int i, Sesion aut){
        sesiones.set(i, aut);
    }
    
    public boolean addSesion(Sesion aut){
        return sesiones.add(aut);
    }
    
    public boolean removeSesion(Sesion aut){
        return sesiones.remove(aut);
    }
    
    public boolean addSesion(Collection<Sesion> auts){
        return sesiones.addAll(auts);
    }
    
    public boolean removeSesion(Collection<Autor> auts){
        return sesiones.removeAll(auts);
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

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    private String sesiones(){
        String r = "{";
        for (Sesion ses : sesiones) {
            r+=ses.getNombre()+",";
        }
        r = ""+r.subSequence(0, r.length()-1)+"}";
        return r;
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
