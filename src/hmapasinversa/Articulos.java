package hmapasinversa;
// Generated 28-feb-2017 16:09:16 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Articulos generated by hbm2java
 */
public class Articulos  implements java.io.Serializable {


     private int id;
     private String nombre;
     private String tam;
     private String tema;
     private Set personases = new HashSet(0);
     private Set sesioneses = new HashSet(0);

    public Articulos() {
    }

	
    public Articulos(int id, String nombre, String tam, String tema) {
        this.id = id;
        this.nombre = nombre;
        this.tam = tam;
        this.tema = tema;
    }
    public Articulos(int id, String nombre, String tam, String tema, Set personases, Set sesioneses) {
       this.id = id;
       this.nombre = nombre;
       this.tam = tam;
       this.tema = tema;
       this.personases = personases;
       this.sesioneses = sesioneses;
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
    public String getTam() {
        return this.tam;
    }
    
    public void setTam(String tam) {
        this.tam = tam;
    }
    public String getTema() {
        return this.tema;
    }
    
    public void setTema(String tema) {
        this.tema = tema;
    }
    public Set getPersonases() {
        return this.personases;
    }
    
    public void setPersonases(Set personases) {
        this.personases = personases;
    }
    public Set getSesioneses() {
        return this.sesioneses;
    }
    
    public void setSesioneses(Set sesioneses) {
        this.sesioneses = sesioneses;
    }




}


