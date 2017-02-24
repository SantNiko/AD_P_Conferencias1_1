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
public class Autor extends A_Persona{
    
    private ArrayList<Articulo> articulos;

    public Autor() {
    }

    public Autor(String dni, String nombre) {
        super(dni, nombre);
        articulos = new ArrayList<>();
    }

    public Autor(ArrayList<Articulo> articulos, String dni, String nombre) {
        super(dni, nombre);
        this.articulos = articulos;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    public Articulo getArticulo(int i){
        return articulos.get(i);
    }
    
    public Articulo getArticulo(Articulo art){
        int i  = articulos.indexOf(art);
        if (i == -1) {
            return null;
        }
        return articulos.get(i);
    }
    
    public void setArticulo(int i, Articulo art){
        articulos.set(i, art);
    }
    
    public boolean addArticulo(Articulo art){
        return articulos.add(art);
    }
    
    public boolean removeArticulo(Articulo art){
        return articulos.remove(art);
    }
    
    public boolean addArticulo(Collection<Articulo> arts){
        return articulos.addAll(arts);
    }
    
    public boolean removeArticulo(Collection<Articulo> arts){
        return articulos.removeAll(arts);
    }
    
}
