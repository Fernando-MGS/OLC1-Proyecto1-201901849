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
            AppForm.escribir("Gnerado Exitosamente");
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
            AppForm.escribir("Gnerado Exitosamente");
        } catch (Exception e) {
            AppForm.escribir("Hubo un error al general el Reporte de Tokens");
        }
    }
}
