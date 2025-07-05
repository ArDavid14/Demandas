package Capa_Juzgado;
import java.sql.*;
import java.util.ArrayList;
import Capa_Datos.Conexion;

public class DataCargo {

private String car_codcar;
private String car_nom;

public ArrayList <DataCargo> ListarCargo(){
ArrayList lista3 = new ArrayList();
try {
Conexion objmod=new Conexion();
ResultSet tabla = objmod.listar("select * from CARGO");
DataCargo objcargo;
while (tabla.next()) {
objcargo = new DataCargo();
objcargo.setCar_codcar(tabla.getString("Cod_Cargo"));
objcargo.setCar_codcar(tabla.getString("Nombre_Cargo"));
}
} catch (SQLException e) {
javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
}
return lista3;
}
public String getCar_codcar() {
return car_codcar;
}

public void setCar_codcar(String car_codcar) {
this.car_codcar = car_codcar;
}

public String getCar_nom() {
return car_nom;
}

public void setCar_nom(String car_nom) {
this.car_nom = car_nom;
}



}
