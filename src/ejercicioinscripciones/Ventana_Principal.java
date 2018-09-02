/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinscripciones;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana_Principal extends JFrame {

    public Ventana_Principal() {
        super.setLayout(new FlowLayout());
        super.setBounds(500, 500, 500, 500);
        super.setVisible(true);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.add(botonAdministrador);
        super.add(botonEstudiante);

    }
    JButton botonAdministrador = new JButton("Administrador");
    JButton botonEstudiante = new JButton("Estudiante");

}
