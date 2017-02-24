/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author Niko
 */
public class Participante extends A_Persona{
    
    public static final String ROL_ORADOR = "orador";
    public static final String ROL_PUBLICO = "orador";
    
    private String rol;

    public Participante() {
    }

    public Participante(String rol, String dni, String nombre) {
        super(dni, nombre);
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Participante{" +super.toString()+ "rol=" + rol + '}';
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
