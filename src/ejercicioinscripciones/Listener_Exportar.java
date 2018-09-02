/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinscripciones;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mudreco
 */
public class Listener_Exportar implements ActionListener {
    private Registro registro;
    private Connection conexion;
    private Statement sentencia;
    private ResultSet rs;
    public Listener_Exportar(Registro registro){
     this.registro = registro;
     try{
         conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
         sentencia = conexion.createStatement();
     }catch(Exception e){
         System.out.println("No se pudo conectar con BBDD");
     }
     System.out.println("Se conectó correctamente con BBDD");
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            
            for(Estudiante es: registro.getListaInscriptos() ){          
            sentencia.execute("INSERT INTO alumnos (DNI, NOMBRE, ALTURA, PESO, TRASLADO) VALUES ("+ es.getDni()+","+"'"+es.getNombre()+"'"+","+es.getAltura()+","+es.getPeso()+","+"1"+")");
            }
            System.out.println("Lo logramos :D");
                    } catch (SQLException ex) {
            Logger.getLogger(Listener_Exportar.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Hiciste algo mal salame");
        }
        
    }
    
    
    
    
    
    
    
    
    
    
}
