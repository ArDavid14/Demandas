
package Capa_Juzgado;
import java.sql.*;
import java.util.ArrayList;
import Capa_Datos.Conexion;

public class DataEmpleado {
    private String empl_id_empl;
    private String empl_Nom;
    private String empl_ape;
    private String empl_tipo_id;
    private String empl_correo;
    private String empl_direc;
    private String empl_tel;
    
    public ArrayList <DataEmpleado> ListaEmpl(){
        ArrayList lista1 = new ArrayList();
        try {
            Conexion objmod = new Conexion();
            ResultSet tabla=objmod.listar("select * from empleado");
            DataEmpleado objEmpl;
            while (tabla.next()) {
                objEmpl = new DataEmpleado();
                objEmpl.setEmpl_id_empl(tabla.getString("Id_Empleado"));
                objEmpl.setEmpl_Nom(tabla.getString("Nombre"));
                objEmpl.setEmpl_ape(tabla.getString("Apellido"));
                objEmpl.setEmpl_tipo_id(tabla.getString("Tipo_id"));
                objEmpl.setEmpl_correo(tabla.getString("correo_electronico"));
                objEmpl.setEmpl_direc(tabla.getString("Direccion"));
                objEmpl.setEmpl_tel(tabla.getString("Telefono"));
                lista1.add(objEmpl);
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista1;
    }

    public String getEmpl_id_empl() {
        return empl_id_empl;
    }

    public void setEmpl_id_empl(String empl_id_empl) {
        this.empl_id_empl = empl_id_empl;
    }

    public String getEmpl_Nom() {
        return empl_Nom;
    }

    public void setEmpl_Nom(String empl_Nom) {
        this.empl_Nom = empl_Nom;
    }

    public String getEmpl_ape() {
        return empl_ape;
    }

    public void setEmpl_ape(String empl_ape) {
        this.empl_ape = empl_ape;
    }

    public String getEmpl_tipo_id() {
        return empl_tipo_id;
    }

    public void setEmpl_tipo_id(String empl_tipo_id) {
        this.empl_tipo_id = empl_tipo_id;
    }

    public String getEmpl_correo() {
        return empl_correo;
    }

    public void setEmpl_correo(String empl_correo) {
        this.empl_correo = empl_correo;
    }

    public String getEmpl_direc() {
        return empl_direc;
    }

    public void setEmpl_direc(String empl_direc) {
        this.empl_direc = empl_direc;
    }

    public String getEmpl_tel() {
        return empl_tel;
    }

    public void setEmpl_tel(String empl_tel) {
        this.empl_tel = empl_tel;
    }
    
    
    
    
}

