package Capa_Juzgado;
import java.sql.*;
import java.util.ArrayList;
import Capa_Datos.Conexion;

public class DataProceso {
private String pr_numradicado;
private String pr_fechain;
private String pr_fkcontr;

public ArrayList <DataProceso> ListarProceso(){
ArrayList lista4 = new ArrayList();
try {
Conexion objmod=new Conexion();
ResultSet tabla = objmod.listar("select * from PROCESO");
DataProceso objproceso;
while (tabla.next()) {
objproceso = new DataProceso();
objproceso.setPr_numradicado(tabla.getString("Numero_Radicado"));
objproceso.setPr_fechain(tabla.getString("Fecha_Inicio"));
objproceso.setPr_fkcontr(tabla.getString("FKNum_Contrato_modifica"));
}
} catch (SQLException e) {
javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
}
return lista4;
}

public String getPr_numradicado() {
return pr_numradicado;
}

public void setPr_numradicado(String pr_numradicado) {
this.pr_numradicado = pr_numradicado;
}

public String getPr_fechain() {
return pr_fechain;
}

public void setPr_fechain(String pr_fechain) {
this.pr_fechain = pr_fechain;
}

public String getPr_fkcontr() {
return pr_fkcontr;
}

public void setPr_fkcontr(String pr_fkcontr) {
this.pr_fkcontr = pr_fkcontr;
}


}