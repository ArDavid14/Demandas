/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Juzgado;
import java.sql.*;
import java.util.ArrayList;
import Capa_Datos.Conexion;
/**
 *
 * @author Dcubi
 */
public class DataDemandado {
    
    private long Demdd_ID;
    private String Demdd_Nom;
    private String Demdd_Apel;
    private String Demdd_TipoID;
    private String Demdd_Correo;
    private String Demdd_Direc;
    private long Demdd_Telef;
    
    
 
    public String GuardarDemandado(){
        Conexion objmod = new Conexion();
        String cad = "insert into demandado values('"+this.getDemdd_ID()+"','"+this.getDemdd_Nom()+
                "','"+this.getDemdd_Apel() +"','"+this.getDemdd_TipoID()+
                "','"+this.getDemdd_Correo()+"','"+this.getDemdd_Direc()+
                "','"+this.getDemdd_Telef()+"')";
        return objmod.Ejecutar(cad);
    }
    public String ModificarDemandd(){
        Conexion objmod= new Conexion();
        String cad ="update Demandado set nombre ='"+this.getDemdd_Nom()
                +"', Apellido='"+this.getDemdd_Apel()+"', Tipo_id='"+this.getDemdd_TipoID()
                +"', Correo_electronico='"+this.getDemdd_Correo()+"', Direccion='"+this.getDemdd_Direc()
                +"', Telefono='"+ this.getDemdd_Telef()+
                "' where Id_Demandado='"+this.getDemdd_ID()+"'";
        return objmod.Ejecutar(cad);
    }
    public String BuscarDemandd() {
        Conexion objmod = new Conexion();
        String cad="Select * from articulo where ID_demandado ='"+ this.getDemdd_ID()+"'";
        return objmod.Ejecutar(cad);  
    }
    
    
    public ArrayList<DataDemandado> ListaDemandado()
    {
        ArrayList lista3 = new ArrayList();
        try {
            Conexion objmod = new Conexion();
            ResultSet tabla1 = objmod.listar("Select * from Demandado");
            DataDemandado objDemdd;
            while (tabla1.next()) {
                objDemdd = new DataDemandado();
                objDemdd.setDemdd_ID(tabla1.getLong("Id_Demandado"));
                objDemdd.setDemdd_Nom(tabla1.getString("Nombre"));
                objDemdd.setDemdd_Apel(tabla1.getString("Apellido"));
                objDemdd.setDemdd_TipoID(tabla1.getString("Tipo_id"));
                objDemdd.setDemdd_Correo(tabla1.getString("correo_electronico"));
                objDemdd.setDemdd_Direc(tabla1.getString("Direccion"));
                objDemdd.setDemdd_Telef(tabla1.getLong("Telefono"));
                lista3.add(objDemdd);
            }
                    
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista3;
    }

    public String getDemdd_Apel() {
        return Demdd_Apel;
    }

    public void setDemdd_Apel(String Demdd_Apel) {
        this.Demdd_Apel = Demdd_Apel;
    }
    
    

    public long getDemdd_ID() {
        return Demdd_ID;
    }

    public void setDemdd_ID(long Demdd_ID) {
        this.Demdd_ID = Demdd_ID;
    }

    public String getDemdd_Nom() {
        return Demdd_Nom;
    }

    public void setDemdd_Nom(String Demdd_Nom) {
        this.Demdd_Nom = Demdd_Nom;
    }

    public String getDemdd_TipoID() {
        return Demdd_TipoID;
    }

    public void setDemdd_TipoID(String Demdd_TipoID) {
        this.Demdd_TipoID = Demdd_TipoID;
    }

    public String getDemdd_Correo() {
        return Demdd_Correo;
    }

    public void setDemdd_Correo(String Demdd_Correo) {
        this.Demdd_Correo = Demdd_Correo;
    }

    public String getDemdd_Direc() {
        return Demdd_Direc;
    }

    public void setDemdd_Direc(String Demdd_Direc) {
        this.Demdd_Direc = Demdd_Direc;
    }

    public long getDemdd_Telef() {
        return Demdd_Telef;
    }

    public void setDemdd_Telef(long Demdd_Telef) {
        this.Demdd_Telef = Demdd_Telef;
    }
   
            
}
