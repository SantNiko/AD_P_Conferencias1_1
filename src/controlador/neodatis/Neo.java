/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.neodatis;

import java.io.File;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.OID;
import org.neodatis.odb.Objects;
import org.neodatis.odb.Values;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.IValuesQuery;

/**
 *
 * @author Niko
 */
public class Neo {
    
    private static File fichero = null;
    private static ODB bd = null;
    
    public static File getFile(){
        return fichero;
    }
    public static void setFile(String nombreBD){
        fichero = new File(nombreBD);
    } 
    
    public static File getODB(){
        return fichero;
    }
    public static void setODB(ODB newODB){
        bd = newODB;
    }
    
    public static ODB abrirBD(String nombreBD){
        fichero = new File(nombreBD);
        bd = ODBFactory.open(nombreBD);
        return bd;
    }
    public static ODB abrirBD(String nombreBD, String user, String password){
        fichero = new File(nombreBD);
        bd = ODBFactory.open(nombreBD, user, password);
        return bd;
    }
    
    public static OID storeObj(Object o){
        OID oid = null;
        if (bd != null) {
            oid = bd.store(o);
        }
        return oid;
    }
    public static OID storeObj(Object o, boolean c){
        OID oid = null;
        if (bd != null) {
            oid = bd.store(o);
            if (c) {
                bd.commit();
            }
        }
        return oid;
    }
    public static OID delObj(Object o){
        OID oid = null;
        if (bd != null) {
            oid = bd.delete(o);
        }
        return oid;
    }
    public static OID delObj(Object o, boolean c){
        OID oid = null;
        if (bd != null) {
            oid = bd.delete(o);
            if (c) {
                bd.commit();
            }
        }
        return oid;
    }
    
    public static Object getObj(OID oid){
        return bd.getObjectFromId(oid);
    }
    
    public static Object getOid(Object o){
        return bd.getObjectId(o);
    }
    
    public static <T extends Object> Objects<T> query(IQuery query){
        return bd.getObjects(query);
    }
    
    public static Values values(IValuesQuery query){
        return bd.getValues(query);
    }
    
    public static void commitBD(){
        bd.commit();
    }
    
    public static void cerrarBD(){
        bd.close();
    }
}
