package hmapasinversa;
// Generated 01-mar-2017 18:25:25 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Conferencias generated by hbm2java
 */
public class Conferencias  implements java.io.Serializable {


     private int id;
     private String nombre;
     private String descripcion;
     private Date fechaInicio;
     private Date fechaFin;
     private Date horaInicio;
     private Date horaFin;
     private double precio;
     private Set sesioneses = new HashSet(0);
     private Set participantesConferenciases = new HashSet(0);

    public Conferencias() {
    }

	
    public Conferencias(int id, String nombre, String descripcion, Date fechaInicio, Date fechaFin, Date horaInicio, Date horaFin, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.precio = precio;
    }
    public Conferencias(int id, String nombre, String descripcion, Date fechaInicio, Date fechaFin, Date horaInicio, Date horaFin, double precio, Set sesioneses, Set participantesConferenciases) {
       this.id = id;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.horaInicio = horaInicio;
       this.horaFin = horaFin;
       this.precio = precio;
       this.sesioneses = sesioneses;
       this.participantesConferenciases = participantesConferenciases;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public Date getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }
    public Date getHoraFin() {
        return this.horaFin;
    }
    
    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Set getSesioneses() {
        return this.sesioneses;
    }
    
    public void setSesioneses(Set sesioneses) {
        this.sesioneses = sesioneses;
    }
    public Set getParticipantesConferenciases() {
        return this.participantesConferenciases;
    }
    
    public void setParticipantesConferenciases(Set participantesConferenciases) {
        this.participantesConferenciases = participantesConferenciases;
    }




}


