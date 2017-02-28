/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Niko
 */
public class Articulo {
    
    public static final String TAM_CORTO = "corto";
    public static final String TAM_LARGO = "largo";
    
    private int id;
    private int nombre;
    private String tam;
    private String tema;
    private ArrayList<Autor> autores; //

    public Articulo() {
    }

    public Articulo(int id, int nombre, String tam, String tema) {
        this.id = id;
        this.nombre = nombre;
        this.tam = tam;
        this.tema = tema;
        autores = new ArrayList<>();
    }

    public Articulo(int id, int nombre, String tam, String tema, ArrayList<Autor> autores) {
        this.id = id;
        this.nombre = nombre;
        this.tam = tam;
        this.tema = tema;
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Articulo{" + "id=" + id + ", nombre=" + nombre + ", tam=" + tam + ", tema=" + tema + ", autores=" + autores() + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
    
    public Autor getArticulo(int i){
        return autores.get(i);
    }
    
    public Autor getArticulo(Autor art){
        int i  = autores.indexOf(art);
        if (i == -1) {
            return null;
        }
        return autores.get(i);
    }
    
    public void setArticulo(int i, Autor aut){
        autores.set(i, aut);
    }
    
    public boolean addArticulo(Autor aut){
        return autores.add(aut);
    }
    
    public boolean removeArticulo(Autor aut){
        return autores.remove(aut);
    }
    
    public boolean addArticulo(Collection<Autor> auts){
        return autores.addAll(auts);
    }
    
    public boolean removeAutores(Collection<Autor> auts){
        return autores.removeAll(auts);
    }
    
    private String autores(){
        String r = "{";
        for (Autor autor : autores) {
            r+=autor.getNombre()+",";
        }
        r = ""+r.subSequence(0, r.length()-1)+"}";
        return r;
    }
}
