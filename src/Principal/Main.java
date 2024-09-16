/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Controlador.Controlador;
import Modelo.Estudiante;
import Vista.VerEstudiante;

/**
 *
 * @author jhoja
 */
public class Main {
    public static void main(String[] args) {
        VerEstudiante v = new VerEstudiante();
        Estudiante e = new Estudiante();
        new Controlador(e, v);
    }
}
