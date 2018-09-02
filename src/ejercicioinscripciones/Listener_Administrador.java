/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinscripciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

/**
 *
 * @author Mudreco
 */
public class Listener_Administrador implements ActionListener {
    private Registro registro;
    private Ventana_Administrador va;
    Listener_Administrador(Ventana_Administrador va){
    //this.registro = registro;
    this.va = va;
    
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        va.registro.limpiarLista();
        va.Actualizar();
        
    }
    
    
}
