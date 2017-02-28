/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.util.ArrayList;

/**
 *
 * @author Niko
 */
public class Participante extends A_Persona{
    
    public static final String ROL_ORADOR = "orador";
    public static final String ROL_PUBLICO = "publico";
    
    private String email;
    private boolean confirmado;
    private ArrayList<Conferencia> conferencias;
    /* Aqui podriamos y seguramente era bastante correcto poner en vez de un 
    atributo confirmado un atributo que fuera conferencias y seria un MAP con 
    indice conferencia y valor booleano i está confirmado o no*/

    public Participante() {
    }

    public Participante(String dni, String nombre, String email) {
        super(dni, nombre);
        this.email = email;
        conferencias = new ArrayList<>();
    }
    public Participante(String dni, String nombre, String email, Conferencia conferencia) {
        super(dni, nombre);
        this.email = email;
        conferencias.add(conferencia);
    }
    public Participante(String dni, String nombre, String email, boolean confirmado) {
        super(dni, nombre);
        this.email = email;
        this.confirmado = confirmado;
        conferencias = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Participante{" +super.toString()+ " email="+email+" confirmado="+confirmado+'}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }
}
