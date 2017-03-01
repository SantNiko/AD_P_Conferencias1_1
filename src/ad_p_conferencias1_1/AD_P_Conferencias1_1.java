package ad_p_conferencias1_1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.ListModel;
import pojos.Conferencia;
import proxectoaad.jfPruebas1;

/**
 *
 * @author Niko
 */
public class AD_P_Conferencias1_1 {

   
    ArrayList<Conferencia> conferencias; // para tranajar en memoria
    
    public static void main(String[] args) {
        
        /*
            Vamos a crear una interfaz grafica 
        */
        JFrame j = new proxectoaad.main();
        j.setVisible(true);
    }
    
    public static void listado(Object conferencias){
        jfPruebas1 lista = new jfPruebas1();
        
        DefaultListModel dflm = new DefaultListModel();
        for (Object conferencia : (List)conferencias) {
            System.out.println(conferencia);
            dflm.addElement(conferencia);
        }
        lista.getjListConfe().setModel(dflm);
        
        lista.setVisible(true);
    }
    
}
