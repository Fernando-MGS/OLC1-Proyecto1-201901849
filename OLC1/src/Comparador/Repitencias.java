/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparador;

/**
 *
 * @author ferna
 */
import ContenedorJS.*;
import Graficas.Resumenes;
import Interfaz.AppForm;
import java.util.ArrayList;
import java.util.Iterator;

public class Repitencias {

    public Repitencias() {

    }

    public void Comparacion() {
        
        resumen_Comentarios();
        double punteo_clases = (Comparar_clases(AppForm.Proyecto1, AppForm.Proyecto2) / suma_Clases()) * 0.3;
        //System.out.println(suma_Comentarios());
        double punteo_comentarios = (Comparar_comentarios(AppForm.Proyecto1, AppForm.Proyecto2) / suma_Comentarios()) * 0.2;
        double punteo_funciones = (Comparar_metodos(AppForm.Proyecto1, AppForm.Proyecto2) / suma_Funciones()) * 0.3;
        double punteo_variables = (Comparar_variables(AppForm.Proyecto1, AppForm.Proyecto2) / suma_Vars()) * 0.2;
        double punteo_general = punteo_clases + punteo_comentarios + punteo_funciones + punteo_variables;
        AppForm.PT_general = punteo_general;
        System.out.println(punteo_clases);
        System.out.println(punteo_comentarios);
        System.out.println(punteo_funciones);
        System.out.println(punteo_variables);
        System.out.println(punteo_general);
    }

    public double suma_Comentarios() {
        double suma = 0;
        int class1 = 0;
        int class2 = 0;
        for (int i = 0; i < AppForm.Proyecto1.size(); i++) {
            class1 += AppForm.Proyecto1.get(i).getComments().size();
            class2 += AppForm.Proyecto2.get(i).getComments().size();
            suma += AppForm.Proyecto1.get(i).getComments().size();
            suma += AppForm.Proyecto2.get(i).getComments().size();
        }
        AppForm.resumen.setComentarios1(class1);
        AppForm.resumen.setComentarios2(class2);
        return suma;
    }

    public void resumen_Comentarios() {
        double suma = 0;
        Resumenes resumen = new Resumenes();
        Resumenes resumen1 = new Resumenes();
        try {
            for (int i = 0; i < AppForm.Proyecto1.size(); i++) {
                System.out.println("=================");
                System.out.println(AppForm.Proyecto1.get(i).getName());
                System.out.println(AppForm.Proyecto2.get(i).getName());
                resumen.setClases(AppForm.Proyecto1.get(i).getClases().size());
                resumen1.setClases(AppForm.Proyecto2.get(i).getClases().size());
                resumen.setComentarios(AppForm.Proyecto1.get(i).getComments().size());
                resumen1.setComentarios(AppForm.Proyecto2.get(i).getComments().size());
                resumen.setFunciones(AppForm.Proyecto1.get(i).getFuncs().size());
                resumen1.setFunciones(AppForm.Proyecto2.get(i).getFuncs().size());
                resumen.setVariables(AppForm.Proyecto1.get(i).getVars().size());
                resumen1.setVariables(AppForm.Proyecto2.get(i).getVars().size());
                resumen.setNombre(AppForm.Proyecto1.get(i).getName());
                resumen1.setNombre(AppForm.Proyecto2.get(i).getName());
                AppForm.resumenes1.add(resumen);
                AppForm.resumenes2.add(resumen1);
            }
        }catch(Exception e){
            AppForm.escribir("Ocurrió un error al hacer el resumen de cada archivo");
        }

    }

    public double suma_Clases() {
        double suma = 0;
        int class1 = 0;
        int class2 = 0;
        for (int i = 0; i < AppForm.Proyecto1.size(); i++) {
            class1 += AppForm.Proyecto1.get(i).getClases().size();
            class2 += AppForm.Proyecto2.get(i).getClases().size();
            suma += AppForm.Proyecto1.get(i).getClases().size();
            suma += AppForm.Proyecto2.get(i).getClases().size();
        }
        AppForm.resumen.setClass1(class1);
        AppForm.resumen.setClass2(class2);
        return suma;
    }

    public double resumenes_Clases(Resumenes res) {
        double suma = 0;
        int class1 = 0;
        int class2 = 0;
        for (int i = 0; i < AppForm.Proyecto1.size(); i++) {
            class1 += AppForm.Proyecto1.get(i).getClases().size();
            class2 += AppForm.Proyecto2.get(i).getClases().size();
            suma += AppForm.Proyecto1.get(i).getClases().size();
            suma += AppForm.Proyecto2.get(i).getClases().size();
        }
        AppForm.resumen.setClass1(class1);
        AppForm.resumen.setClass2(class2);
        return suma;
    }

    public double suma_Funciones() {
        double suma = 0;
        int class1 = 0;
        int class2 = 0;
        for (int i = 0; i < AppForm.Proyecto1.size(); i++) {
            class1 += AppForm.Proyecto1.get(i).getFuncs().size();
            class2 += AppForm.Proyecto2.get(i).getFuncs().size();
            suma += AppForm.Proyecto1.get(i).getFuncs().size();
            suma += AppForm.Proyecto2.get(i).getFuncs().size();
        }
        AppForm.resumen.setFunciones1(class1);
        AppForm.resumen.setFunciones2(class2);
        return suma;
    }

    public double resumen_Funciones(Resumenes res) {
        double suma = 0;
        int class1 = 0;
        int class2 = 0;
        for (int i = 0; i < AppForm.Proyecto1.size(); i++) {
            class1 += AppForm.Proyecto1.get(i).getFuncs().size();
            class2 += AppForm.Proyecto2.get(i).getFuncs().size();
            suma += AppForm.Proyecto1.get(i).getFuncs().size();
            suma += AppForm.Proyecto2.get(i).getFuncs().size();
        }
        AppForm.resumen.setFunciones1(class1);
        AppForm.resumen.setFunciones2(class2);
        return suma;
    }

    public double suma_Vars() {
        double suma = 0;
        int class1 = 0;
        int class2 = 0;
        for (int i = 0; i < AppForm.Proyecto1.size(); i++) {
            class1 += AppForm.Proyecto1.get(i).getVars().size();
            class2 += AppForm.Proyecto2.get(i).getVars().size();
            suma += AppForm.Proyecto1.get(i).getVars().size();
            suma += AppForm.Proyecto2.get(i).getVars().size();
        }
        AppForm.resumen.setVar1(class1);
        AppForm.resumen.setVar2(class2);
        return suma;
    }

    public double resumen_Vars(Resumenes res) {
        double suma = 0;
        int class1 = 0;
        int class2 = 0;
        for (int i = 0; i < AppForm.Proyecto1.size(); i++) {
            class1 += AppForm.Proyecto1.get(i).getVars().size();
            class2 += AppForm.Proyecto2.get(i).getVars().size();
            suma += AppForm.Proyecto1.get(i).getVars().size();
            suma += AppForm.Proyecto2.get(i).getVars().size();
        }
        AppForm.resumen.setVar1(class1);
        AppForm.resumen.setVar2(class2);
        return suma;
    }

    public int Comparar_clases(ArrayList<Archivo> pr1, ArrayList<Archivo> pr2) {

        int rep_clases = 0;
        double punteo = 0;
        try {
            for (int j = 0; j < pr1.size(); j++) {//for para recorrer la lista de archivos
                punteo = 0;

                ArrayList<Clases> clase1 = pr1.get(j).getClases();
                ArrayList<Clases> clase2 = pr2.get(j).getClases();
                for (int k = 0; k < clase1.size(); k++) {//for para recorrer la lista de clases de cada archivo1
                    for (int n = 0; n < clase2.size(); n++) {//for para recorrer la lista de clases de cada archivo2
                        punteo = 0;
                        int repitencia = 0;//lleva el numero de metodos repetidos, debe ser igual al numero de metodos del archivo 1
                        if (clase1.get(k).getId() == clase2.get(n).getId()) {//compara el nombre de las clases
                            punteo += 0.2;
                        }
                        if (clase1.get(k).getLineas() == clase2.get(n).getLineas()) {//compara el numero de lineas de cada clase
                            punteo += 0.4;
                        }
                        ArrayList<String> metodos1 = clase1.get(k).getMetodos();//obtiene la lista de metodos de cada clase
                        ArrayList<String> metodos2 = clase2.get(n).getMetodos();
                        if (metodos1.size() == metodos2.size()) {
                            for (int l = 0; l < metodos1.size(); l++) {//for para recorrer la lista de metodos de cada clase
                                for (int m = 0; m < metodos2.size(); m++) {
                                    if (metodos1.get(l).equals(metodos2.get(m))) {//compara el nombre de los metodos
                                        repitencia++;
                                    }
                                }
                            }
                        }
                        if (repitencia == metodos1.size()) {
                            punteo += 0.4;
                        }
                        if (punteo >= 0.6) {
                            rep_clases++;
                        }
                        AppForm.Class_Especificos.add(new PT_especifico(punteo, pr1.get(j).getName(), pr2.get(j).getName(), 1, clase1.get(k).getId(), clase2.get(n).getId()));
                    }
                }
            }
        } catch (Exception e) {
            AppForm.escribir("Ocurrió un problema al comparar clases" + "\n" + e);
            return rep_clases;
        }
        // System.out.println("Se repiten "+rep_clases+" clases");
        return rep_clases;
    }

    public int Comparar_comentarios(ArrayList<Archivo> pr1, ArrayList<Archivo> pr2) {
        int repitencia = 0;

        try {
            for (int j = 0; j < pr1.size(); j++) {
                ArrayList<Comentarios> file1 = pr1.get(j).getComments();
                ArrayList<Comentarios> file2 = pr2.get(j).getComments();
                for (int k = 0; k < file1.size(); k++) {
                    for (int l = 0; l < file2.size(); l++) {
                        String a = file1.get(k).getContenido();
                        String b = file2.get(l).getContenido();
                        a = a.replace("\t", "");
                        a = a.replace("/", "");
                        a = a.replace("*", "");
                        b = b.replace("\t", "");
                        b = b.replace("/", "");
                        b = b.replace("*", "");
                        if (a.equals(b)) {
                            AppForm.Comm_Especificos.add(new PT_especifico(1.0, pr1.get(j).getName(), a, 4, file1.get(k).getContenido(), file2.get(l).getContenido()));
                            repitencia++;
                        } else {
                            AppForm.Comm_Especificos.add(new PT_especifico(0, pr1.get(j).getName(), a, 4, file1.get(k).getContenido(), file2.get(l).getContenido()));
                        }
                    }
                }
            }
        } catch (Exception e) {
            AppForm.escribir("Hubo un error al comparar los comentarios" + "\n" + e);
            return repitencia;
        }
        // System.out.println("Se repiten "+repitencia+" comentarios");
        return repitencia;
    }

    public int Comparar_variables(ArrayList<Archivo> pr1, ArrayList<Archivo> pr2) {
        int repitencia = 0;

        try {
            for (int j = 0; j < pr1.size(); j++) {
                // System.out.println("Para archivo "+j+"===================");
                ArrayList<Variables> file1 = pr1.get(j).getVars();
                ArrayList<Variables> file2 = pr2.get(j).getVars();
                for (int k = 0; k < file1.size(); k++) {
                    PT_especifico aux = new PT_especifico();
                    aux.Punteo = 0;
                    for (int l = 0; l < file2.size(); l++) {
                        //System.out.println(file1.get(k).getId()+ " vs "+file2.get(l).getId());
                        if (file1.get(k).getId().equals(file2.get(l).getId())) {
                            aux = new PT_especifico(1, pr1.get(j).getName(), pr2.get(j).getName(), 3, file1.get(k).getId(), "");
                            repitencia++;
                            //break;
                        } else if (aux.Punteo == 0) {
                            aux = new PT_especifico(0, pr1.get(j).getName(), pr2.get(j).getName(), 3, file1.get(k).getId(), "");
                        }
                    }
                    AppForm.Var_Especificos.add(aux);
                }
            }
        } catch (Exception e) {
            AppForm.escribir("Hubo un error al comparar las variables" + "\n" + e);
            return repitencia;
        }
        // System.out.println("Se repiten "+repitencia+" variables");
        return repitencia;
    }

    public int Comparar_metodos(ArrayList<Archivo> pr1, ArrayList<Archivo> pr2) {
        double punteo = 0;
        int repitencia = 0;

        boolean confirmacion = false;
        try {
            for (int i = 0; i < pr1.size(); i++) {

                ArrayList<Funciones> file1 = pr1.get(i).getFuncs();
                ArrayList<Funciones> file2 = pr2.get(i).getFuncs();
                for (int j = 0; j < file1.size(); j++) {

                    PT_especifico aux = new PT_especifico();
                    PT_especifico aux2 = new PT_especifico();
                    aux.Punteo = 0;
                    for (int k = 0; k < file2.size(); k++) {
                        int bandera = 0;
                        punteo = 0;
                        if (file1.get(j).getId().equals(file2.get(k).getId())) {
                            punteo += 0.4;
                            bandera++;
                            confirmacion = true;
                        }
                        if (file1.get(j).getLineas() == file2.get(k).getLineas()) {
                            punteo += 0.3;
                            confirmacion = true;
                        }
                        if (confirmacion && file1.get(j).getParams() == file2.get(k).getParams()) {
                            punteo += 0.3;
                        }
                        //System.out.println(punteo + " vs " + aux.Punteo);
                        if (punteo >= aux.Punteo) {
                            aux = new PT_especifico(punteo, pr1.get(i).getName(), pr2.get(i).getName(), 2, file1.get(j).getId(), file2.get(k).getId());
                            if (bandera == 1) {
                                aux2 = new PT_especifico(punteo, pr1.get(i).getName(), pr2.get(i).getName(), 2, file1.get(k).getId(), file2.get(k).getId());
                            }
                        }
                    }
                    //System.out.println(aux.Punteo + "-" + aux.nombre);
                    if (aux.Punteo >= 0.6) {
                        repitencia++;
                    }
                    AppForm.Funcs_Especificos.add(aux);
                }

            }
        } catch (Exception e) {
            AppForm.escribir("Hubo un error al comparar los metodos" + "\n" + e);
            return repitencia;
        }
        System.out.println("Se repiten " + repitencia + " metodos");
        return repitencia;
    }

}
