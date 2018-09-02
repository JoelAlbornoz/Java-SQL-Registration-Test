/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinscripciones;

import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Mudreco
 */
public class Ventana_Estudiante extends JFrame {

    public Ventana_Estudiante() {
       
        super.setBounds(500, 500, 500, 500);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        grupo.add(bSi);
        grupo.add(bNo);
        panelCentral.setLayout(new GridLayout(6, 2));
        panelCentral.add(rNombre);
        panelCentral.add(tNombre);
        panelCentral.add(rDni);
        panelCentral.add(tDni);
        panelCentral.add(rPeso);
        panelCentral.add(tPeso);
        panelCentral.add(rAltura);
        panelCentral.add(tAltura);
        panelCentral.add(rTraslado);
        panelCentral.add(vacio);
        panelCentral.add(bSi);
        panelCentral.add(bNo);
        super.add(aplicar, SOUTH);
        super.add(cuposDisponibles, NORTH);
        super.add(panelCentral, CENTER);
    }

    
    private JPanel panelCentral = new JPanel();

    public JButton aplicar = new JButton("Aplicar");
    public ButtonGroup grupo = new ButtonGroup();
    public JRadioButton bSi = new JRadioButton("Si");
    public JRadioButton bNo = new JRadioButton("No");

    private JLabel rNombre = new JLabel("Ingrese su nombre");
    private JLabel rDni = new JLabel("Ingrese su DNI");
    private JLabel rPeso = new JLabel("Ingrese su Peso");
    private JLabel rAltura = new JLabel("Ingrese su Alutra");
    private JLabel rTraslado = new JLabel("Viene usted de otra escuela?");
    private JLabel vacio = new JLabel("");
    private JLabel cuposDisponibles = new JLabel("Existen x cupos disponibles");

    public JTextField tNombre = new JTextField();
    public JTextField tDni = new JTextField();
    public JTextField tPeso = new JTextField();
    public JTextField tAltura = new JTextField();

}
