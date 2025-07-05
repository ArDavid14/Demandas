/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dcubi
 */
public class Conexion {
    
    private final String url="jdbc:mysql://localhost:3306/PROCESO_LEGAL";
    private final String user="root";
    private final String pwd="";
    
    public Conexion(){
        
    }
    
    public ResultSet listar(String Cad){
        
        try {
            Connection cn = DriverManager.getConnection(url,user,pwd);
            PreparedStatement da = cn.prepareStatement(Cad);
            ResultSet tbl = da.executeQuery();
            return tbl;
        } catch (SQLException e) {
            
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
            
        }
    }  
    
    public String Ejecutar(String Cad){
        try {
            Connection cn = DriverManager.getConnection(url,user,pwd);
            PreparedStatement da = cn.prepareStatement(Cad);
            int r = da.executeUpdate();
            return "se afectaron" + r +"filas";
        } catch (SQLException e) {
            
            //javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
