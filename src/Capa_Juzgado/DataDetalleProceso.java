package Capa_Juzgado;
import java.sql.*;
import java.util.ArrayList;
import Capa_Datos.Conexion;

public class DataDetalleProceso {
    
    private long detalle_numdetalle;
    private String detalle_estado;
    private long detalle_fknumradi;
    private long detalle_fkiddemandante;
    private long detalle_fkidapdemandante;
    private long detalle_fkiddemandado;
    private long detalle_fkidapdemandado;
    
    public ArrayList<DataDetalleProceso> ListaDetalleproceso()
    {
 ArrayList lista5 = new ArrayList();
        try {
            Conexion objmod = new Conexion();
            ResultSet tabla = objmod.listar("select * from DETALLE_PROCESO");
            DataDetalleProceso objdetpro;
            while (tabla.next()) {
                objdetpro = new DataDetalleProceso();
                objdetpro.setDetalle_numdetalle(tabla.getLong("Numero_Detalle_Demanda"));
                objdetpro.setDetalle_estado(tabla.getString("Estado"));
                objdetpro.setDetalle_fknumradi(tabla.getLong("FKNumero_Radicado"));
                objdetpro.setDetalle_fkiddemandante(tabla.getLong("FKId_Demandante"));
                objdetpro.setDetalle_fkidapdemandante(tabla.getLong("FKId_Apdemandante"));
                objdetpro.setDetalle_fkiddemandado(tabla.getLong("FKId_Demandado"));
                objdetpro.setDetalle_fkidapdemandado(tabla.getLong("FKId_apdemandado"));
                lista5.add(objdetpro);
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista5;
    }
 public String GuardarDetalle(){
        Conexion objmod = new Conexion();
        String cad = "insert into DETALLE_PROCESO (estado,fknumero_radicado, FKId_Demandante, FKId_Apdemandante,FKId_Demandado,FKId_apdemandado)"
                + " values('"+this.getDetalle_estado()+
                "','"+this.getDetalle_fknumradi()+"','"+this.getDetalle_fkiddemandante()+
                "','"+this.getDetalle_fkidapdemandante()+"','"+this.getDetalle_fkiddemandado()+
                "','"+this.getDetalle_fkidapdemandado()+"')";
        return objmod.Ejecutar(cad);
    }
    
    public String ModificarDetalle(){
        Conexion objmod = new Conexion();
        String cad = "update DETALLE_PROCESO set Estado='"+this.getDetalle_estado()+"' where FKId_Demandante='"+this.getDetalle_fkiddemandante()+"'";
        return objmod.Ejecutar(cad);
    }

    public long getDetalle_numdetalle() {
        return detalle_numdetalle;
    }

    public void setDetalle_numdetalle(long detalle_numdetalle) {
        this.detalle_numdetalle = detalle_numdetalle;
    }

    public String getDetalle_estado() {
        return detalle_estado;
    }

    public void setDetalle_estado(String detalle_estado) {
        this.detalle_estado = detalle_estado;
    }

    public long getDetalle_fknumradi() {
        return detalle_fknumradi;
    }

    public void setDetalle_fknumradi(long detalle_fknumradi) {
        this.detalle_fknumradi = detalle_fknumradi;
    }

    public long getDetalle_fkiddemandante() {
        return detalle_fkiddemandante;
    }

    public void setDetalle_fkiddemandante(long detalle_fkiddemandante) {
        this.detalle_fkiddemandante = detalle_fkiddemandante;
    }

    public long getDetalle_fkidapdemandante() {
        return detalle_fkidapdemandante;
    }

    public void setDetalle_fkidapdemandante(long detalle_fkidapdemandante) {
        this.detalle_fkidapdemandante = detalle_fkidapdemandante;
    }

    public long getDetalle_fkiddemandado() {
        return detalle_fkiddemandado;
    }

    public void setDetalle_fkiddemandado(long detalle_fkiddemandado) {
        this.detalle_fkiddemandado = detalle_fkiddemandado;
    }

    public long getDetalle_fkidapdemandado() {
        return detalle_fkidapdemandado;
    }

    public void setDetalle_fkidapdemandado(long detalle_fkidapdemandado) {
        this.detalle_fkidapdemandado = detalle_fkidapdemandado;
    }

    

    
}
