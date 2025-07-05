
package Capa_Juzgado;
import java.sql.*;
import java.util.ArrayList;
import Capa_Datos.Conexion;

public class DataContrato {
    private String contr_numn_contr;
    private String contr_fecha_contr;
    private String contr_fecha_ini;
    private String contr_fecha_fin;
    private String contr_fecha_term;
    private String contr_tipocontr;
    private String contr_estado;
    private int contr_salario;
    private String contr_fkidempl;
    private String contr_fkcodcargo;
    
    public ArrayList <DataContrato> ListaContr(){
        ArrayList lista2 = new ArrayList();
        try {
            Conexion objmod = new Conexion();
            ResultSet tabla=objmod.listar("select * from CONTRATO_MODIFICA");
            DataContrato objcontr;
            while (tabla.next()) {
                objcontr = new DataContrato();
                objcontr.setContr_numn_contr(tabla.getString("Num_Contrato_modifica"));
                objcontr.setContr_fecha_contr(tabla.getString("Fecha_contrato"));
                objcontr.setContr_fecha_ini(tabla.getString("Fecha_Inicio"));
                objcontr.setContr_fecha_fin(tabla.getString("Fecha_Final"));
                objcontr.setContr_fecha_term(tabla.getString("Fecha_Terminacion"));
                objcontr.setContr_tipocontr(tabla.getString("Tipo_contrato"));
                objcontr.setContr_estado(tabla.getString("Estado"));
                objcontr.setContr_salario(tabla.getInt("Salario"));
                objcontr.setContr_fkidempl(tabla.getNString("FKId_Empleado"));
                objcontr.setContr_fkcodcargo(tabla.getString("FKCod_Cargo"));
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista2;
    }
    
    public String getContr_numn_contr() {
        return contr_numn_contr;
    }

    public void setContr_numn_contr(String contr_numn_contr) {
        this.contr_numn_contr = contr_numn_contr;
    }

    public String getContr_fecha_contr() {
        return contr_fecha_contr;
    }

    public void setContr_fecha_contr(String contr_fecha_contr) {
        this.contr_fecha_contr = contr_fecha_contr;
    }

    public String getContr_fecha_ini() {
        return contr_fecha_ini;
    }

    public void setContr_fecha_ini(String contr_fecha_ini) {
        this.contr_fecha_ini = contr_fecha_ini;
    }

    public String getContr_fecha_fin() {
        return contr_fecha_fin;
    }

    public void setContr_fecha_fin(String contr_fecha_fin) {
        this.contr_fecha_fin = contr_fecha_fin;
    }

    public String getContr_fecha_term() {
        return contr_fecha_term;
    }

    public void setContr_fecha_term(String contr_fecha_term) {
        this.contr_fecha_term = contr_fecha_term;
    }

    public String getContr_estado() {
        return contr_estado;
    }

    public void setContr_estado(String contr_estado) {
        this.contr_estado = contr_estado;
    }

    public String getContr_fkidempl() {
        return contr_fkidempl;
    }

    public void setContr_fkidempl(String contr_fkidempl) {
        this.contr_fkidempl = contr_fkidempl;
    }

    public String getContr_fkcodcargo() {
        return contr_fkcodcargo;
    }

    public void setContr_fkcodcargo(String contr_fkcodcargo) {
        this.contr_fkcodcargo = contr_fkcodcargo;
    }

    public String getContr_tipocontr() {
        return contr_tipocontr;
    }

    public void setContr_tipocontr(String contr_tipocontr) {
        this.contr_tipocontr = contr_tipocontr;
    }

    public int getContr_salario() {
        return contr_salario;
    }

    public void setContr_salario(int contr_salario) {
        this.contr_salario = contr_salario;
    }
    
    
    
}
