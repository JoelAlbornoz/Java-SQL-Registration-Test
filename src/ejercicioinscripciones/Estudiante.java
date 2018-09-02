/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinscripciones;

import java.time.LocalDate;

/**
 *
 * @author Mudreco
 */
public class Estudiante {

    private String nombreCompleto;
    private float peso;
    private float altura;
    private boolean traslado;
    private LocalDate fechaNacimiento;
    private String dni;

    public Estudiante() {
        nombreCompleto = "N/A";
        peso = 0;
        altura = 0;
        traslado = false;
        fechaNacimiento = null;
        dni = "N/A";
    }

    //Setters
    public void setNombre(String Nombre) {
        nombreCompleto = Nombre;
    }

    public void setPeso(float Peso) {
        peso = Peso;
    }

    public void setAltura(float Altura) {
        altura = Altura;
    }

    public void setTraslado(boolean Traslado) {
        traslado = Traslado;
    }

    public void setFecha(LocalDate Fecha) {
        fechaNacimiento = Fecha;
    }

    public void setDni(String Dni) {
        dni = Dni;
    }
    //Getters

    public String getNombre() {
        return nombreCompleto;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public boolean esTraslado() {
        return traslado;
    }

    public LocalDate getFecha() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

}
