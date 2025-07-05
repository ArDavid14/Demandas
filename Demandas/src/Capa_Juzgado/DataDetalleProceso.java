package Capa_Juzgado;
import java.sql.*;
import java.util.ArrayList;
import Capa_Datos.Conexion;

public class DataDetalleProceso {
    
    private int detalle_numdetalle;
    private String detalle_estado;
    private int detalle_fknumradi;
    private int detalle_fkiddemandante;
    private int detalle_fkidapdemandante;
    private int detalle_fkiddemandado;
    private int detalle_fkidapdemandado;
    
    public ArrayList<DataDetalleProceso> ListaDetalleproceso()
    {
 ArrayList lista5 = new ArrayList();
        try {
            Conexion objmod = new Conexion();
            ResultSet tabla = objmod.listar("select * from DETALLE_PROCESO");
            DataDetalleProceso objdetpro;
            while (tabla.next()) {
                objdetpro = new DataDetalleProceso();
                objdetpro.setDetalle_numdetalle(tabla.getInt("Numero_Detalle_Demanda"));
                objdetpro.setDetalle_estado(tabla.getString("Estado"));
                objdetpro.setDetalle_fknumradi(tabla.getInt("FKNumero_Radicado"));
                objdetpro.setDetalle_fkiddemandante(tabla.getInt("FKId_Demandante"));
                objdetpro.setDetalle_fkidapdemandante(tabla.getInt("FKId_Apdemandante "));
                objdetpro.setDetalle_fkiddemandado(tabla.getInt("FKId_Demandado"));
                objdetpro.setDetalle_fkidapdemandado(tabla.getInt("FKId_apdemandado"));
                lista5.add(objdetpro);
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista5;
    }
 public String GuardarDetalle(){
        Conexion objmod = new Conexion();
        String cad = "insert into DETALLE_PROCESO values('"+this.getDetalle_numdetalle()+"','"+this.getDetalle_estado()+
                "','"+this.getDetalle_fknumradi()+"','"+this.getDetalle_fkiddemandante()+
                "','"+this.getDetalle_fkidapdemandante()+"','"+this.getDetalle_fkiddemandado()+
                "','"+this.getDetalle_fkidapdemandado()+"')'";
        return objmod.Ejecutar(cad);
    }
    
    public String ModificarDetalle(){
        Conexion objmod = new Conexion();
        String cad = "update DETALLE_PROCESO set Estado varchar='"+this.getDetalle_estado()+"', FKNumero_Radicado='"+this.getDetalle_fknumradi()
                +"', FKId_Demandante='"+this.getDetalle_fkiddemandante()+"', FKId_Apdemandante='"+this.getDetalle_fkidapdemandante()
                +"', FKId_Demandado='"+this.getDetalle_fkiddemandado()+"', FKId_apdemandado='"+this.getDetalle_fkidapdemandado()
                +"' where Numero_Detalle_Demanda='"+this.getDetalle_numdetalle()+"'";
        return objmod.Ejecutar(cad);
    }

    public int getDetalle_numdetalle() {
        return detalle_numdetalle;
    }

 public void setDetalle_numdetalle(int detalle_numdetalle) {
        this.detalle_numdetalle = detalle_numdetalle;
    }

    public String getDetalle_estado() {
        return detalle_estado;
    }

    public void setDetalle_estado(String detalle_estado) {
        this.detalle_estado = detalle_estado;
    }

    public int getDetalle_fknumradi() {
        return detalle_fknumradi;
    }

    public void setDetalle_fknumradi(int detalle_fknumradi) {
        this.detalle_fknumradi = detalle_fknumradi;
    }

    public int getDetalle_fkiddemandante() {
        return detalle_fkiddemandante;
    }
 

    public void setDetalle_fkiddemandante(int detalle_fkiddemandante) {
        this.detalle_fkiddemandante = detalle_fkiddemandante;
    }

    public int getDetalle_fkidapdemandante() {
        return detalle_fkidapdemandante;
    }

    public void setDetalle_fkidapdemandante(int detalle_fkidapdemandante) {
        this.detalle_fkidapdemandante = detalle_fkidapdemandante;
    }

    public int getDetalle_fkiddemandado() {
        return detalle_fkiddemandado;
    }

    public void setDetalle_fkiddemandado(int detalle_dkiddemandado) {
        this.detalle_fkiddemandado = detalle_dkiddemandado;
    }

    public int getDetalle_fkidapdemandado() {
        return detalle_fkidapdemandado;
    }

    public void setDetalle_fkidapdemandado(int detalle_fkidapdemandado) {
        this.detalle_fkidapdemandado = detalle_fkidapdemandado;
    }

    
}
