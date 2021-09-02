/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

/**
 *
 * @author ferna
 */
public class GenerarCompilador {

    public static void main(String[] args) {
        generarCompilador();
    }

    public static void generarCompilador() {
        try {
            String ruta = "src/Analizador/";
            String opcFlex[] = {ruta + "LexFCA", "-d", ruta};
            jflex.Main.generate(opcFlex);

            String opcCUP[] = {"-destdir", ruta, "-parser", "Sintactico", ruta + "SynFCA"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
        }
    }
}
