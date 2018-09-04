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
/* El programa fue desarrollado  al mismo tiempo  que yo comence a estudiar java
    por lo que probablemente existan imperfecciones técnicas y otras malas prácticas
    (Atributos sin getters setters / Métodos que hacen más de lo que deberían / etc)
    que iré corrigiendo de a poco a medida que me detenga a revisarlo, no tengo muchas expectativas
    de que esto ocurra pronto ya que la finalidad principal de este programa era plasmar los conceptos
    generales que aprendía, y ahora mismo estoy concentrándome en otros proyectos.
    
    Sin más que comentar, quiero agradecer a quien esté leyendo este código y estoy más que
    dispuesto a responder cualquier duda, aclarar ideas, recibir feedback, o simplemente ponerme en
    contacto con cualquiera que así lo desee.
    
    este es mi mail de uso personal: nvo_joel_msn@hotmail.com*/
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
