/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinscripciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Mudreco
 */
public class Listener_Estudiante implements ActionListener{
     private Estudiante estudiante;
     /*private String nombre;
     private String dni;
     private float peso;
     private float altura;*/
     private boolean esTraslado;
     private Registro registro;
     private File nuevoArchivo;
     private FileOutputStream archivoEscribir;
     private JTextField nombre;
     private JTextField dni;
     private JTextField peso;
     private JTextField altura;
     
     private JRadioButton botSi;
     private JRadioButton botNo;
     Ventana_Administrador va;
     
   public Listener_Estudiante(JTextField tNombre, JTextField tDni, JTextField tPeso, JTextField tAltura, JRadioButton bSi, JRadioButton bNo, Registro registro, Ventana_Administrador va){
    botSi = bSi;
    botNo = bNo;
    this.va = va;
    estudiante = new Estudiante();
    nombre = tNombre;
    dni= tDni;
    peso = tPeso;
    altura  = tAltura;
   
    /*nombre = tNombre.getText();
    dni = tDni.getText();
    peso = Float.parseFloat(tPeso.getText());
    altura = Float.parseFloat(tAltura.getText());
    */
    
    
    this.registro = registro;
}
  
   
   public boolean validarTraslado(){
   if(botSi.isSelected()){
   return true;
   }else{
   return false;
   }  
   }

   
   
    public void actionPerformed(ActionEvent e) {
        esTraslado = validarTraslado();
        System.out.println();
        try{
        registro.aplicante=registro.asignarValores(nombre.getText(), dni.getText(), esTraslado, Float.parseFloat(peso.getText()), Float.parseFloat(altura.getText()));
        
        if(registro.comprobarAptitud()){
            try{
            nuevoArchivo= new File("C:\\Users\\Mudreco\\Desktop\\archivo.txt");
            archivoEscribir = new FileOutputStream(nuevoArchivo);}catch(Exception b){}
            registro.registrarAlumno();
            va.Actualizar();
            /*for(int i=0; i<registro.getAlumnoInscripto().length(); i++){
                archivoEscribir.write((int)registro.getAlumnoInscripto().charAt(i));
            }*/
            archivoEscribir.write(registro.getAlumnoInscripto().getBytes());
            archivoEscribir.close();
            
            
    }
        }catch(Exception c){
        JOptionPane popup = new JOptionPane(ERROR_MESSAGE);
        popup.showMessageDialog(null,"Error al aplicar los valores \n Complete todos los campos \n y revise que los campos peso y altura contengan solo numeros.");
        popup.setVisible(true);
        c.printStackTrace();
        }
    }
    
}
