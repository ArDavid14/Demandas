/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Juzgado;

import Capa_Datos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dcubi
 */
public class DataApoderadoDemdd {
    
    
     private long ApoDemdd_ID;
    private String ApoDemdd_Nom;
    private String ApoDemdd_TipoID;
    private String ApoDemdd_Correo;
    private String ApoDemdd_Direc;
    private long ApoDemdd_Telef;
    
    
 
    public String GuardarApoDemandado(){
        Conexion objmod = new Conexion();
        String cad = "insert into apoderado_demandado values('"+this.getApoDemdd_ID()+"','"+this.getApoDemdd_Nom()+
                "','"+this.getApoDemdd_TipoID()+
                "','"+this.getApoDemdd_Correo()+"','"+this.getApoDemdd_Direc()+
                "','"+this.getApoDemdd_Telef()+"')";
        return objmod.Ejecutar(cad);
    }
    public String ModificarApoDemandd(){
        Conexion objmod= new Conexion();
        String cad ="update apoderado_demandado set nombre ='"+this.getApoDemdd_Nom()
                +"', Tipo_id='"+this.getApoDemdd_TipoID()
                +"', Correo_electronico='"+this.getApoDemdd_Correo()+"', Direccion='"+this.getApoDemdd_Direc()
                +"', Telefono='"+ this.getApoDemdd_Telef()+
                "' where Id_Apdemandado='"+this.getApoDemdd_ID()+"'";
        return objmod.Ejecutar(cad);
    }
    
    
    public ArrayList<DataApoderadoDemdd> ListaApodeDemdd()
    {
        ArrayList lista4 = new ArrayList();
        try {
            Conexion objmod = new Conexion();
            ResultSet tabla2 = objmod.listar("Select * from Apoderado_Demandado");
            DataApoderadoDemdd objADemdd;
            while (tabla2.next()) {
                objADemdd = new DataApoderadoDemdd();
                objADemdd.setApoDemdd_ID(tabla2.getLong("Id_Apdemandado"));
                objADemdd.setApoDemdd_Nom(tabla2.getString("Nombre"));
                objADemdd.setApoDemdd_TipoID(tabla2.getString("Tipo_id"));
                objADemdd.setApoDemdd_Correo(tabla2.getString("correo_electronico"));
                objADemdd.setApoDemdd_Direc(tabla2.getString("Direccion"));
                objADemdd.setApoDemdd_Telef(tabla2.getLong("Telefono"));
                lista4.add(objADemdd);
            }
                    
        } catch (SQLException e) {
            //javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista4;
    }

    public long getApoDemdd_ID() {
        return ApoDemdd_ID;
    }

    public void setApoDemdd_ID(Long ApoDemdd_ID) {
        this.ApoDemdd_ID = ApoDemdd_ID;
    }

    public String getApoDemdd_Nom() {
        return ApoDemdd_Nom;
    }

    public void setApoDemdd_Nom(String ApoDemdd_Nom) {
        this.ApoDemdd_Nom = ApoDemdd_Nom;
    }


    public String getApoDemdd_TipoID() {
        return ApoDemdd_TipoID;
    }

    public void setApoDemdd_TipoID(String ApoDemdd_TipoID) {
        this.ApoDemdd_TipoID = ApoDemdd_TipoID;
    }

    public String getApoDemdd_Correo() {
        return ApoDemdd_Correo;
    }

    public void setApoDemdd_Correo(String ApoDemdd_Correo) {
        this.ApoDemdd_Correo = ApoDemdd_Correo;
    }

    public String getApoDemdd_Direc() {
        return ApoDemdd_Direc;
    }

    public void setApoDemdd_Direc(String ApoDemdd_Direc) {
        this.ApoDemdd_Direc = ApoDemdd_Direc;
    }

    public long getApoDemdd_Telef() {
        return ApoDemdd_Telef;
    }

    public void setApoDemdd_Telef(long ApoDemdd_Telef) {
        this.ApoDemdd_Telef = ApoDemdd_Telef;
    }
    
    
}
