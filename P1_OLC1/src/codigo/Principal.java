/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
import java.io.File;
/**
 *
 * @author ferna
 */
public class Principal {
    public static void main(String[] args) {
        String ruta= "C:/Users/ferna/OneDrive/Escritorio/Universidad/Sexto Semestre/Compi1/Laboratorio/OLC1-Proyecto1-201901849/P1_OLC1/src/codigo/lexer.flex";
        //Universidad\Sexto Semestre\Compi1\Laboratorio\OLC1-Proyecto1-201901849\P1_OLC1\src\codigo
        /*FrmMain frame = new FrmMain();
        frame.setVisible(true);*/
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
    
}
