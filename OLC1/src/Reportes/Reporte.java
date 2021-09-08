/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

/**
 *
 * @author ferna
 */
import Interfaz.AppForm;
import Tokens.*;
import Errores.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import Comparador.*;
public class Reporte {

    FileWriter filewriter = null;
    PrintWriter printw = null;

    public void ReporteToken(List_Token lista) {
        try {

            filewriter = new FileWriter("ReporteTokens-"+AppForm.file_report+".html");//declarar el archivo
            printw = new PrintWriter(filewriter);//declarar un impresor
            printw.println("<html>");
            printw.println("<head><title>Reporte de Tokens</title>"
                    + "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">"
                    + "<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>"
                    + "</head>");
            //si queremos escribir una comilla " en el
            //archivo uzamos la diagonal invertida \"
            printw.println("<body bgcolor=\"#9370D8\">");
            printw.println("<center><h1><font color=\"navy\">" + "REPORTE DE TOKENS" + "</font></h1></center>");
            printw.println("<table class=\"table table-bordered table-dark\">");
            printw.println("<thead>\n"
                    + "    <tr>\n"
                    + "      <th scope=\"col\">Lexema</th>\n"
                    + "      <th scope=\"col\">Token</th>\n"
                    + "      <th scope=\"col\">Linea</th>\n"
                    + "      <th scope=\"col\">Columna</th>\n"
                    + "      <th scope=\"col\">Archivo</th>\n"
                    + "    </tr>\n"
                    + "  </thead>");
            printw.println("<tbody>");
            for (Token tokens : lista) {
                printw.println("<tr>");
                printw.println("<td>"+tokens.Lexema+"</td>");
                printw.println("<td>"+tokens.TokenName+"</td>");
                printw.println("<td>"+tokens.line+"</td>");
                printw.println("<td>"+tokens.col+"</td>");
                printw.println("<td>"+tokens.file+"</td>");
                printw.println("</tr>");
            }
            printw.println("</body>");
            printw.println("</html>");
            printw.close();
            AppForm.escribir("Reporte de Tokens Ge"
                    + "nerado Exitosamente");
        } catch (Exception e) {
            AppForm.escribir("Hubo un error al general el Reporte de Tokens");
        }

    }
    
    public void ReporteError(List_Error lista) {
        try {

            filewriter = new FileWriter("ReporteErrores-"+AppForm.file_report+".html");//declarar el archivo
            printw = new PrintWriter(filewriter);//declarar un impresor
            printw.println("<html>");
            printw.println("<head><title>Reporte de Tokens</title>"
                    + "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">"
                    + "<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>"
                    + "</head>");
            //si queremos escribir una comilla " en el
            //archivo uzamos la diagonal invertida \"
            printw.println("<body bgcolor=\"#9370D8\">");
            printw.println("<center><h1><font color=\"navy\">" + "REPORTE DE TOKENS" + "</font></h1></center>");
            printw.println("<table class=\"table table-bordered table-dark\">");
            printw.println("<thead>\n"
                    + "    <tr>\n"
                    + "      <th scope=\"col\">Lexema</th>\n"
                    + "      <th scope=\"col\">Tipo</th>\n"
                    + "      <th scope=\"col\">Linea</th>\n"
                    + "      <th scope=\"col\">Columna</th>\n"
                    + "      <th scope=\"col\">Archivo</th>\n"
                    + "    </tr>\n"
                    + "  </thead>");
            printw.println("<tbody>");
            for (Error_G error : lista) {
                printw.println("<tr>");
                printw.println("<td>"+error.Lexema+"</td>");
                printw.println("<td>"+error.Tipo+"</td>");
                printw.println("<td>"+error.line+"</td>");
                printw.println("<td>"+error.col+"</td>");
                printw.println("<td>"+error.file+"</td>");
                printw.println("</tr>");
            }
            printw.println("</body>");
            printw.println("</html>");
            printw.close();
            AppForm.escribir("Reporte de Errores generado Exitosamente");
        } catch (Exception e) {
            AppForm.escribir("Hubo un error al general el Reporte de Tokens");
        }
    }
    
    public void ReporteJSON(){
          try {

            filewriter = new FileWriter("ReporteJSON-"+AppForm.file_report+".json");//declarar el archivo
            printw = new PrintWriter(filewriter);//declarar un impresor
            printw.println("{");
            printw.println("\"PuntajeGeneral\":"+ AppForm.PT_general+",");
            printw.println("\"PuntajesEspecificos\":[");
            for (PT_especifico t : AppForm.Class_Especificos) {
                printw.println("\t{");
                printw.println("\t\t\"archivo\":\""+t.file+"\",");
                printw.println("\t\t\"tipo\":\"clase\",");
                printw.println("\t\t\"nombre\":\""+t.nombre+"\",");
                printw.println("\t\t\"punteo\":"+t.Punteo);
                printw.println("\t},");
            }
            for (PT_especifico t : AppForm.Comm_Especificos) {
                printw.println("\t{");
                printw.println("\t\t\"archivo\":\""+t.file+"\",");
                printw.println("\t\t\"tipo\":\"comentario\",");
                String a=t.nombre.replace("\n","");
                printw.println("\t\t\"contenido\":\""+a+"\",");
                printw.println("\t\t\"punteo\":"+t.Punteo);
                printw.println("\t},");
            }
            for (PT_especifico t : AppForm.Funcs_Especificos) {
                printw.println("\t{");
                printw.println("\t\t\"archivo\":\""+t.file+"\",");
                printw.println("\t\t\"tipo\":\"funcion\",");
                printw.println("\t\t\"nombre\":\""+t.nombre+"\",");
                printw.println("\t\t\"punteo\":"+t.Punteo);
                printw.println("\t},");
            }
            int i=1;
            for (PT_especifico t : AppForm.Var_Especificos) {
                printw.println("\t{");
                printw.println("\t\t\"archivo\":\""+t.file+"\",");
                printw.println("\t\t\"tipo\":\"variable\",");
                printw.println("\t\t\"nombre\":\""+t.nombre+"\",");
                printw.println("\t\t\"punteo\":"+t.Punteo);
                if(i<AppForm.Var_Especificos.size()){
                    printw.println("\t},");                    
                }else{
                    printw.println("\t}");
                }
                i++;
            }
            printw.println("]");
            printw.println("}");
            printw.close();
            AppForm.escribir("Reporte JSON generado Exitosamente");
        } catch (Exception e) {
            AppForm.escribir("Hubo un error al general el Reporte JSON");
        }
    }
}
