/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinscripciones;

import java.awt.BorderLayout;
import static java.awt.BorderLayout.*;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ventana_Administrador extends JFrame {

    Registro registro;
    
    public Ventana_Administrador(Registro registro) {
        this.registro = registro;
        super.setLayout(new BorderLayout());
        super.add(panel, NORTH);
        panel.setVisible(true);
        panel.setLayout(new FlowLayout());

        super.setBounds(500, 500, 500, 500);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.add(bEliminarAlumno);
        panel.add(bLimpiarLista);
        panel.add(bExportarBBDD);
        lista.setText(registro.getAlumnoInscripto());

        super.add(lista, CENTER);
    }
    JPanel panel = new JPanel();
    //TODO implementar la posibilidad de eliminar solo un alumno
    int numeroCupo;
    JButton bExportarBBDD = new JButton("Exportar a BBDD");
    JButton bEliminarAlumno = new JButton("Eliminar Alumno");
    JButton bLimpiarLista = new JButton("Limpiar Lista");
    JTextArea lista = new JTextArea();
    
    public void Actualizar(){
    lista.setText(registro.getAlumnoInscripto());
    }
}
