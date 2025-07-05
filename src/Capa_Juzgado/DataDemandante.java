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
public class DataDemandante {
    
    private long Demt_ID;
    private String Demdt_Nom;
    private String Demdt_TipoID;
    private String Demdt_Correo;
    private String Demdt_Direc;
    private long Demdt_Telef;
    
    
 
    public String GuardarDemandante(){
        Conexion objmod = new Conexion();
        String cad = "insert into demandante values('"+this.getDemt_ID()+"','"+this.getDemdt_Nom()+
                "','"+this.getDemdt_TipoID()+
                "','"+this.getDemdt_Correo()+"','"+this.getDemdt_Direc()+
                "','"+this.getDemdt_Telef()+"')";
        return objmod.Ejecutar(cad);
    }
    
    public String ModificarDemandt(){
        Conexion objmod= new Conexion();
        String cad ="update Demandante set nombre ='"+this.getDemdt_Nom()
                +"', Tipo_id='"+this.getDemdt_TipoID()
                +"', Correo_electronico='"+this.getDemdt_Correo()+"', Direccion='"+this.getDemdt_Direc()
                +"', Telefono='"+ this.getDemdt_Telef()+
                "' where Id_Demandante='"+this.getDemt_ID()+"'";
        return objmod.Ejecutar(cad);
    }
    
    public ArrayList<DataDemandante> ListaDemandante()
    {
        ArrayList lista2 = new ArrayList();
        try {
            Conexion objmod = new Conexion();
            ResultSet tabla = objmod.listar("Select * from Demandante");
            DataDemandante objDemdt;
            while (tabla.next()) {
                objDemdt = new DataDemandante();
                objDemdt.setDemt_ID(tabla.getLong("id_demandante"));
                
                objDemdt.setDemdt_Nom(tabla.getString("Nombre"));
                objDemdt.setDemdt_TipoID(tabla.getString("Tipo_id"));
                objDemdt.setDemdt_Correo(tabla.getString("correo_electronico"));
                objDemdt.setDemdt_Direc(tabla.getString("Direccion"));
                objDemdt.setDemdt_Telef(tabla.getLong("Telefono"));
                lista2.add(objDemdt);
            }
                    
        } catch (SQLException e) {
            //javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista2;
    }
    
    

    
    public long getDemt_ID() {
        return Demt_ID;
    }

    public void setDemt_ID(long Demdt_ID) {
        this.Demt_ID = Demdt_ID;
    }

    public String getDemdt_Nom() {
        return Demdt_Nom;
    }

    public void setDemdt_Nom(String Demdt_Nom) {
        this.Demdt_Nom = Demdt_Nom;
    }

    public String getDemdt_TipoID() {
        return Demdt_TipoID;
    }

    public void setDemdt_TipoID(String Demdt_TipoID) {
        this.Demdt_TipoID = Demdt_TipoID;
    }

    public String getDemdt_Correo() {
        return Demdt_Correo;
    }

    public void setDemdt_Correo(String Demdt_Correo) {
        this.Demdt_Correo = Demdt_Correo;
    }

    public String getDemdt_Direc() {
        return Demdt_Direc;
    }

    public void setDemdt_Direc(String Demdt_Direc) {
        this.Demdt_Direc = Demdt_Direc;
    }

    public long getDemdt_Telef() {
        return Demdt_Telef;
    }

    public void setDemdt_Telef(long Demdt_Telef) {
        this.Demdt_Telef = Demdt_Telef;
    }


    
            
}
