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
import ContenedorJS.ContentFile;
import java.io.File;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reporte {

    FileWriter filewriter = null;
    PrintWriter printw = null;

    public void ReporteToken(List_Token lista) {
        try {

            filewriter = new FileWriter("ReporteTokens-" + AppForm.file_report + ".html");//declarar el archivo
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
                printw.println("<td>" + tokens.Lexema + "</td>");
                printw.println("<td>" + tokens.TokenName + "</td>");
                printw.println("<td>" + tokens.line + "</td>");
                printw.println("<td>" + tokens.col + "</td>");
                printw.println("<td>" + tokens.file + "</td>");
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

            filewriter = new FileWriter("ReporteErrores-" + AppForm.file_report + ".html");//declarar el archivo
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
                printw.println("<td>" + error.Lexema + "</td>");
                printw.println("<td>" + error.Tipo + "</td>");
                printw.println("<td>" + error.line + "</td>");
                printw.println("<td>" + error.col + "</td>");
                printw.println("<td>" + error.file + "</td>");
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

    public void ReporteJSON() {
        try {

            filewriter = new FileWriter("ReporteJSON-" + AppForm.file_report + ".json");//declarar el archivo
            printw = new PrintWriter(filewriter);//declarar un impresor
            printw.println("{");
            printw.println("\"PuntajeGeneral\":" + AppForm.PT_general + ",");
            printw.println("\"PuntajesEspecificos\":[");
            for (PT_especifico t : AppForm.Class_Especificos) {
                printw.println("\t{");
                printw.println("\t\t\"archivo\":\"" + t.file + "\",");
                printw.println("\t\t\"tipo\":\"clase\",");
                printw.println("\t\t\"nombre\":\"" + t.nombre + "\",");
                printw.println("\t\t\"punteo\":" + t.Punteo);
                printw.println("\t},");
            }
            for (PT_especifico t : AppForm.Comm_Especificos) {
                printw.println("\t{");
                printw.println("\t\t\"archivo\":\"" + t.file + "\",");
                printw.println("\t\t\"tipo\":\"comentario\",");
                String a = t.nombre.replace("\n", "");
                printw.println("\t\t\"contenido\":\"" + a + "\",");
                printw.println("\t\t\"punteo\":" + t.Punteo);
                printw.println("\t},");
            }
            for (PT_especifico t : AppForm.Funcs_Especificos) {
                printw.println("\t{");
                printw.println("\t\t\"archivo\":\"" + t.file + "\",");
                printw.println("\t\t\"tipo\":\"funcion\",");
                printw.println("\t\t\"nombre\":\"" + t.nombre + "\",");
                printw.println("\t\t\"punteo\":" + t.Punteo);
                printw.println("\t},");
            }
            int i = 1;
            for (PT_especifico t : AppForm.Var_Especificos) {
                printw.println("\t{");
                printw.println("\t\t\"archivo\":\"" + t.file + "\",");
                printw.println("\t\t\"tipo\":\"variable\",");
                printw.println("\t\t\"nombre\":\"" + t.nombre + "\",");
                printw.println("\t\t\"punteo\":" + t.Punteo);
                if (i < AppForm.Var_Especificos.size()) {
                    printw.println("\t},");
                } else {
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

    public void Resumen() {
        try {

            filewriter = new FileWriter("Resumen-" + AppForm.file_report + ".html");//declarar el archivo
            printw = new PrintWriter(filewriter);//declarar un impresor
            printw.println("<html>");
            printw.println("<head><title>Reporte Estadistico</title>"
                    + "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">"
                    + "<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>"
                    + "</head>");
            //si queremos escribir una comilla " en el
            //archivo uzamos la diagonal invertida \"
            printw.println("<body bgcolor=\"#9370D8\">");
            printw.println("<center><h1><font color=\"navy\">" + "RESUMEN" + "</font></h1></center>");
            printw.println("<table class=\"table table-bordered table-dark\">");
            printw.println("<thead>\n"
                    + "    <tr>\n"
                    + "      <th scope=\"col\">Tipo</th>\n"
                    + "      <th scope=\"col\">Proyecto1</th>\n"
                    + "      <th scope=\"col\">Proyecto2</th>\n"
                    + "    </tr>\n"
                    + "  </thead>");
            printw.println("<tbody>");
            //variables
            printw.println("<tr>");
            printw.println("<td>Total Variables</td>");
            printw.println("<td>" + AppForm.resumen.getVar1() + "</td>");
            printw.println("<td>" + AppForm.resumen.getVar2() + "</td>");
            printw.println("</tr>");
            //Clases
            printw.println("<tr>");
            printw.println("<td>Total Clases</td>");
            printw.println("<td>" + AppForm.resumen.getClass1() + "</td>");
            printw.println("<td>" + AppForm.resumen.getClass2() + "</td>");
            printw.println("</tr>");
            //Funciones
            printw.println("<tr>");
            printw.println("<td>Total Metodo/Funciones</td>");
            printw.println("<td>" + AppForm.resumen.getFunciones1() + "</td>");
            printw.println("<td>" + AppForm.resumen.getFunciones2() + "</td>");
            printw.println("</tr>");
            //Clases
            printw.println("<tr>");
            printw.println("<td>Total Comentarios</td>");
            printw.println("<td>" + AppForm.resumen.getComentarios1() + "</td>");
            printw.println("<td>" + AppForm.resumen.getComentarios2() + "</td>");
            printw.println("</tr>");
            printw.println("</tbody>");
            printw.println("</table>");
            
            File folder2 = new File("Graficas/Lineas");
            File[] File_list2 = folder2.listFiles();
            System.out.println("El tamaño es "+File_list2.length);
            if (File_list2.length > 0) {
                printw.println("<center><h1><font color=\"navy\">" + "GRAFICAS DE LINEAS" + "</font></h1></center>");
                for (File file : File_list2) {
                    if (!file.isDirectory()) {

                        printw.println("<img src=\"Graficas/Lineas/" + file.getName() + "\">");
                        //String ruta = paths[0] + "\\" + file.getName();
                        //project1.add(new ContentFile(file.getName(), muestraContenido(ruta)));
                        //System.out.println(paths[0]+"\\"+file.getName());
                        //addFiles(paths[0] + "\\" + file.getName());
                    }
                }
            }
            
            
            folder2 = new File("Graficas/Barras");
            File_list2 = folder2.listFiles();
            if (File_list2.length > 0) {
                System.out.println("El tamaño es "+File_list2.length);
                printw.println("<center><h1><font color=\"navy\">" + "GRAFICAS DE BARRAS" + "</font></h1></center>");
                for (File file : File_list2) {
                    if (!file.isDirectory()) {

                        printw.println("<img src=\"Graficas/Barras/" + file.getName() + "\">");
                        //String ruta = paths[0] + "\\" + file.getName();
                        //project1.add(new ContentFile(file.getName(), muestraContenido(ruta)));
                        //System.out.println(paths[0]+"\\"+file.getName());
                        //addFiles(paths[0] + "\\" + file.getName());
                    }
                }
            }

            folder2 = new File("Graficas/Pie");
            File_list2 = folder2.listFiles();
            if (File_list2.length > 0) {
                System.out.println("El tamaño es "+File_list2.length);
                printw.println("<center><h1><font color=\"navy\">" + "GRAFICAS DE PIE" + "</font></h1></center>");
                for (File file : File_list2) {
                    if (!file.isDirectory()) {

                        printw.println("<img src=\"Graficas/Pie/" + file.getName() + "\">");
                        //String ruta = paths[0] + "\\" + file.getName();
                        //project1.add(new ContentFile(file.getName(), muestraContenido(ruta)));
                        //System.out.println(paths[0]+"\\"+file.getName());
                        //addFiles(paths[0] + "\\" + file.getName());
                    }
                }
            }
            
            
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            //Datos finales
            printw.println("<center><h1>DATOS FINALES:</h1></center>");
            printw.println("<center><h3>NOMBRES: FERNANDO MAURICIO GÓMEZ SANTOS</h3></center>");
            printw.println("<center><h3>CARNET:201901849</h3></center>");
            printw.println("<center><h3>FECHA Y HORA: " + dtf.format(LocalDateTime.now()) + "</h3></center>");

            printw.println("</body>");
            printw.println("</html>");
            printw.close();
            AppForm.escribir("Resumen generado Exitosamente");
        } catch (Exception e) {
            AppForm.escribir("Hubo un error al general el Resumen");
        }
    }
}
