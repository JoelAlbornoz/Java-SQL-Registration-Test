/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinscripciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Mudreco
 */
public class Listener_Visibilidad implements ActionListener {

    JFrame frameInterno;

    Listener_Visibilidad(JFrame frame) {
        frameInterno = new JFrame();
        frameInterno = frame;
    }

    public void cambiarVisibilidad() {
        if (frameInterno.isVisible()) {
            frameInterno.setVisible(false);
        } else {
            frameInterno.setVisible(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        cambiarVisibilidad();
    }

}
