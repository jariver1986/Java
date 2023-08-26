/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mysql1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author HP VICTUS
 */
public class CConexion {
    Connection conectar     = null;
    String usuario          ="root";
    String contrasenia      ="1Corintios13";
    String bd               ="cuentas2";
    //String bd               ="bd_ins";
    
    String ip               ="localhost";
    String puerto           = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
                   //jdbc:mysql://localhost:3306/cuentas2
    public Connection estableceConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            JOptionPane.showMessageDialog(null, "Se conecto ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conecto "+ e.toString());
        }
        return conectar;
    }
            
}
