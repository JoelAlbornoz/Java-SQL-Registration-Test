/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinscripciones;

/**
 *
 * @author Mudreco
 */
public class EjercicioInscripciones {

    public static void main(String[] args) {
        Registro registro = new Registro();
        Ventana_Administrador va = new Ventana_Administrador(registro);
        Ventana_Principal vp = new Ventana_Principal();
        Ventana_Estudiante ve = new Ventana_Estudiante();
        Listener_Visibilidad lCambVisibilidadAdm = new Listener_Visibilidad(va);
        Listener_Visibilidad lCambVisibilidadEst = new Listener_Visibilidad(ve);
        Listener_Estudiante le = new Listener_Estudiante(ve.tNombre,ve.tDni,ve.tPeso,ve.tAltura,ve.bSi, ve.bNo, registro, va);
        Listener_Administrador la = new Listener_Administrador(va);
        Listener_Exportar lee = new Listener_Exportar(registro);
        vp.botonAdministrador.addActionListener(lCambVisibilidadAdm);
        vp.botonEstudiante.addActionListener(lCambVisibilidadEst);
        ve.aplicar.addActionListener(le);
        va.bLimpiarLista.addActionListener(la);
        va.bExportarBBDD.addActionListener(lee);
    }

}
