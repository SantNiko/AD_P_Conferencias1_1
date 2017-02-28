/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.hibernate;

import java.io.Serializable;
import java.sql.Connection;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Niko
 */
public class Hib {
    
    private static Session sesion;

    public static Session openSesion(){
        return NHU.iniciarSession();
    }
    public static Session connect(){
        return NHU.iniciarSession();
    }
    
    public static Connection closeSesion(){
        return sesion.close();
    }
    
    /**
     * Método que si el argumento save es true guarda o actualiza 
     * en una base de datos el objeto dado como primer argumento, si save es
     * false se borra ese mismo objeto de la base de datos
     * 
     * @param obj
     * @param save
     * @return True si se guardó/actualizó/borró correctamente
     */
    public static boolean obj(Object obj,boolean save) {
        boolean done = false;
        Session sesion = NHU.iniciarSession();
        try {
            sesion.beginTransaction();
            if (save) {
                sesion.saveOrUpdate(obj);
            }else{
                sesion.delete(obj);
            }
            sesion.getTransaction().commit();
            done = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println("Error en BD.obj()");
        }
        sesion.close();
        return done;
    }
    
    /**
     * Método de consulta de un objeto de una base de datos passando
     * como argumentos la clase del objeto que queremos encontrar y 
     * la clave primaria de ese objeto concreto que queremos encontrar.
     * 
     * @param dQuien
     * @param id
     * @return
     */
    public static Object consultar(Class dQuien, Serializable id){
        Session sesion = NHU.iniciarSession();
        
        Object objFound = null;
        
        try {
            objFound = sesion.get(dQuien, id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error en BD.consultar()");
        }
        sesion.close();
        return objFound;
    }
    
    public static void cerrarBD(){
        NHU.closeSessionFactory();
    }
    
    public static Object ver(Class dQuien){
        //Session sesion = NewHibernateUtil.iniciarSession();
        
        Object objFound = null;
        
        try {
            Criteria crit = sesion.createCriteria(dQuien);
            objFound = crit.list();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            System.out.println("Error en BD.ver()");
        }
        //sesion.close();
        return objFound;
    }
}
