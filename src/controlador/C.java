/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JFrame;
import pojos.Conferencia;
import proxectoaad.jfPruebas1;

/**
 *
 * @author Niko
 */
public class C {
    
    private static ArrayList<Conferencia> conferencias; 
    private static Conferencia confeSelect;

    public C() {
    }
    
    public static void setConfeSelect(Object obj){
        confeSelect = (Conferencia)obj;
    }
    public static Conferencia getConfeSelect(){
        return confeSelect;
    }
    
    public void mostrarConfe(jfPruebas1 j){
        j.setLblNombreEdit(confeSelect.getNombre());
        j.setLblFechaEdit(confeSelect.getNombre());
        j.setLblNSesionesEdit(confeSelect.getNombre());
        j.setLblHoraFinEdit(confeSelect.getNombre());
        j.setLblDescripcionEdit(confeSelect.getNombre());
        j.setLblTemaEdit(confeSelect.getNombre());
        j.setLblHoraInicioEdit(confeSelect.getNombre());
        j.setLblNParticipantesEdit(confeSelect.getNombre());
        j.setLblPrecioEdit(confeSelect.getNombre());
    }
}
