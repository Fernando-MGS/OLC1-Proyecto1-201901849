/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorJS;


import Analizador.*;
import java.io.BufferedReader;
import java.io.StringReader;
import Contenedor.FCA;
/**
 *
 * @author Emely
 */
public class AnalizadorLenguajeJS {

    private static AnalizadorLenguajeJS analizadorJS;
    public static FCA contenido;

    public static boolean AnalizarCodigo(String entrada, String ubicacion) {
        try {
            SintacticoJS sin = new SintacticoJS(
                    new LexicoJS(new BufferedReader(new StringReader(entrada))));
            //analizando
            sin.parse();
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }

        return true;
    }

    public static String getDot(String entrada) {
            StringBuilder graph = new StringBuilder();
            graph.append("digraph G { \n");
        try {
            SintacticoJS sin = new SintacticoJS(
                    new LexicoJS(new BufferedReader(new StringReader(entrada))));
            //analizando
            sin.parse();
            
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        graph.append("} \n");
        return graph.toString();
    }

    public static AnalizadorLenguajeJS getInstancia() {
        if (analizadorJS == null) {
            analizadorJS = new AnalizadorLenguajeJS();
        }
        return analizadorJS;
    }

    public static void LimpiarInstancia() {
        if (analizadorJS != null) {
            System.out.println("Errores clear");
        } else {
            System.out.println("No existe un analizador");
        }
    }

}
