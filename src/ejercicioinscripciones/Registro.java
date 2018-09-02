package ejercicioinscripciones;

import java.util.ArrayList;



/**
 *
 * @author Mudreco
 */
public class Registro {

    public Registro() {
        for (int i = 0; i < listaInscriptos.length; i++) {
            listaInscriptos[i] = new Estudiante();
        }
    }

    public Estudiante aplicante;
    private Estudiante[] listaInscriptos = new Estudiante[5];
    private int inscriptos = 0;
    
    
    ///getLI
    public Estudiante[] getListaInscriptos(){
    return listaInscriptos;
    }
    
    //Método para Comprobar la Aptitud del Aplicante
    public boolean comprobarAptitud() {
        if (aplicante.esTraslado()) {
            return true;
        } else if (aplicante.getAltura() > 170.0 && aplicante.getPeso() < 100.0) {
            return true;
        } else {
            System.out.println("No cumple los Requisitos");
            return false;
        }
    }

    //Método para revisar si hay cupos disponibles
    public boolean revisarCupos() {
        if (inscriptos < 5) {
            System.out.print("Quedan" + (5 - inscriptos) + "Cupos disponibles");
            return true;

        } else {
            return false;
        }
    }

    //Método para Registrar un alumno
    public void registrarAlumno() {
        if(inscriptos < 5 ){
        listaInscriptos[inscriptos] = aplicante;
        inscriptos++;}else{
            System.out.println("No quedan Cupos");
        }
    }

    //Metodo para eliminar un alumno del registro
    public void eliminarAlumno(int numeroDeCupo) {
        listaInscriptos[numeroDeCupo] = new Estudiante();
        inscriptos--;
    }

    //Metodo para limpiar la lista
    public void limpiarLista() {
        for (int i = 0; i < listaInscriptos.length; i++) {
            listaInscriptos[i] = new Estudiante();
        }
        inscriptos = 0;

    }
    

    /*Método para mostrar todos los alumnos inscriptos y el cupo que ocupan
    -->Este método esta pensado para para poder usarse en el caso de querer ver un único alumno, varios, o todos
    ademas de seguir siendo util en caso de aumentar el número de cupos, por lo que debe ser usado aislado, o dentro
    de una estructura repetitiva.*/
    public String getAlumnoInscripto(int numeroCupo) {
        String alumnoNombre = listaInscriptos[numeroCupo].getNombre();
        return alumnoNombre;
    }
    //Implementacion del Método para asignar los valores al Aplicante 
    public Estudiante asignarValores(String nombre, String dni, boolean traslado, float peso, float altura){
    Estudiante estInt = new Estudiante();
    estInt.setNombre(nombre);
    estInt.setDni(dni);
    estInt.setTraslado(traslado);
    estInt.setPeso(peso);
    estInt.setAltura(altura);
    return estInt;
    }
    
    //Implementacion Provisional del Metodo GetAlumnoInscripto (Devuelve la lista completa, con saltos de linea)
    public String getAlumnoInscripto() {
        String lista = "";
        for (int i = 0; i < listaInscriptos.length; i++) {
            lista = lista + "\r\n "  + i + listaInscriptos[i].getNombre() +"   Dni:   " + listaInscriptos[i].getDni() + "   Peso:   " + listaInscriptos[i].getPeso() + "   Altura:   " + listaInscriptos[i].getAltura();

        }
        return lista;
    }
}
