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
public class DataApoderadoDemdt {
    
    
     private long ApoDemdt_ID;
    private String ApoDemdt_Nom;
    private String ApoDemdt_TipoID;
    private String ApoDemdt_Correo;
    private String ApoDemdt_Direc;
    private long ApoDemdt_Telef;
    
    
 
    public String GuardarApoDemandante(){
        Conexion objmod = new Conexion();
        String cad = "insert into apoderado_demandante values('"+this.getApoDemdt_ID()+"','"+this.getApoDemdt_Nom()+
                "','"+this.getApoDemdt_TipoID()+
                "','"+this.getApoDemdt_Correo()+"','"+this.getApoDemdt_Direc()+
                "','"+this.getApoDemdt_Telef()+"')";
        return objmod.Ejecutar(cad);
    }
    public String ModificarApoDemandt(){
        Conexion objmod= new Conexion();
        String cad ="update apoderado_demandante set nombre ='"+this.getApoDemdt_Nom()
                +"', Tipo_id='"+this.getApoDemdt_TipoID()
                +"', Correo_electronico='"+this.getApoDemdt_Correo()+"', Direccion='"+this.getApoDemdt_Direc()
                +"', Telefono='"+ this.getApoDemdt_Telef()+
                "' where Id_Apdemandante='"+this.getApoDemdt_ID()+"'";
        return objmod.Ejecutar(cad);
    }
    
    public ArrayList<DataApoderadoDemdt> ListaApoDemdt()
    {
        ArrayList lista5 = new ArrayList();
        try {
            Conexion objmod = new Conexion();
            ResultSet tabla2 = objmod.listar("Select * from Apoderado_demandante");
            DataApoderadoDemdt objADemdt;
            while (tabla2.next()) {
                objADemdt = new DataApoderadoDemdt();
                objADemdt.setApoDemdt_ID(tabla2.getLong("Id_Apdemandante"));
                objADemdt.setApoDemdt_Nom(tabla2.getString("Nombre"));
                objADemdt.setApoDemdt_TipoID(tabla2.getString("Tipo_id"));
                objADemdt.setApoDemdt_Correo(tabla2.getString("correo_electronico"));
                objADemdt.setApoDemdt_Direc(tabla2.getString("Direccion"));
                objADemdt.setApoDemdt_Telef(tabla2.getLong("Telefono"));
                lista5.add(objADemdt);
            }
                    
        } catch (SQLException e) {
            //javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista5;
    }

    public long getApoDemdt_ID() {
        return ApoDemdt_ID;
    }

    public void setApoDemdt_ID(long ApoDemdt_ID) {
        this.ApoDemdt_ID = ApoDemdt_ID;
    }

    public String getApoDemdt_Nom() {
        return ApoDemdt_Nom;
    }

    public void setApoDemdt_Nom(String ApoDemdt_Nom) {
        this.ApoDemdt_Nom = ApoDemdt_Nom;
    }

    public String getApoDemdt_TipoID() {
        return ApoDemdt_TipoID;
    }

    public void setApoDemdt_TipoID(String ApoDemdt_TipoID) {
        this.ApoDemdt_TipoID = ApoDemdt_TipoID;
    }

    public String getApoDemdt_Correo() {
        return ApoDemdt_Correo;
    }

    public void setApoDemdt_Correo(String ApoDemdt_Correo) {
        this.ApoDemdt_Correo = ApoDemdt_Correo;
    }

    public String getApoDemdt_Direc() {
        return ApoDemdt_Direc;
    }

    public void setApoDemdt_Direc(String ApoDemdt_Direc) {
        this.ApoDemdt_Direc = ApoDemdt_Direc;
    }

    public long getApoDemdt_Telef() {
        return ApoDemdt_Telef;
    }

    public void setApoDemdt_Telef(long ApoDemdt_Telef) {
        this.ApoDemdt_Telef = ApoDemdt_Telef;
    }

    
}
