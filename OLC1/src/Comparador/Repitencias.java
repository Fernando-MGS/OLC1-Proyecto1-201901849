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
import Interfaz.AppForm;
import java.util.ArrayList;
import java.util.Iterator;

public class Repitencias {

    private ArrayList<Archivo> Proyecto1;
    private ArrayList<Archivo> Proyecto2;

    public Repitencias() {

    }

    public void Comparacion() {
        int punteo_clases = Comparar_clases(AppForm.Proyecto1, AppForm.Proyecto2);
        int punteo_comentarios = Comparar_comentarios(AppForm.Proyecto1, AppForm.Proyecto2);
        int punteo_funciones = Comparar_metodos(AppForm.Proyecto1, AppForm.Proyecto2);
        int punteo_variables = Comparar_variables(AppForm.Proyecto1, AppForm.Proyecto2);
    }

    public int Comparar_clases(ArrayList<Archivo> pr1, ArrayList<Archivo> pr2) {

        int rep_clases = 0;
        double punteo = 0;
        try {
            for (int j = 0; j < pr1.size(); j++) {//for para recorrer la lista de archivos
                punteo = 0;
                
                ArrayList<Clases> clase1 = pr1.get(j).getClases();
                ArrayList<Clases> clase2 = pr2.get(j).getClases();
                for (int k = 0; k < clase1.size(); k++) {//for para recorrer la lista de clases de cada archivo
                    int repitencia = 0;//lleva el numero de metodos repetidos, debe ser igual al numero de metodos del archivo 1
                    if (clase1.get(k).getId() == clase2.get(k).getId()) {//compara el nombre de las clases
                        punteo += 0.2;
                    }
                    if (clase1.get(k).getLineas() == clase2.get(k).getLineas()) {//compara el numero de lineas de cada clase
                        punteo += 0.4;
                    }
                    ArrayList<String> metodos1 = clase1.get(k).getMetodos();//obtiene la lista de metodos de cada clase
                    ArrayList<String> metodos2 = clase2.get(k).getMetodos();
                    if (metodos1.size() == metodos2.size()) {
                        for (int l = 0; l < metodos1.size(); l++) {//for para recorrer la lista de metodos de cada clase
                            for (int m = 0; m < metodos2.size(); m++) {
                                if (metodos1.get(l) == metodos2.get(m)) {//compara el nombre de los metodos
                                    repitencia++;
                                    break;
                                }
                            }
                        }
                    }
                    if(repitencia==metodos1.size()){
                        punteo+=0.4;
                    }
                    if(punteo>=0.6){
                        AppForm.Class_Especificos.add(new PT_especifico(punteo, pr1.get(j).getName(), pr2.get(j).getName(), 1, clase1.get(k).getId(),clase2.get(k).getId()));
                        rep_clases++;
                    }
                }
            }
        } catch (Exception e) {
            AppForm.escribir("Ocurrió un problema al comparar clases" + "\n" + e);
            return 0;
        }

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
                        if (file1.get(k) == file2.get(l)) {
                            AppForm.Comm_Especificos.add(new PT_especifico(1.0, pr1.get(j).getName(), pr2.get(j).getName(), 4, file1.get(k).getContenido(),file2.get(k).getContenido()));
                            repitencia++;
                        }
                    }
                }
            }
        } catch (Exception e) {
            AppForm.escribir("Hubo un error al comparar los comentarios" + "\n" + e);
            return 0;
        }

        return repitencia;
    }

    public int Comparar_variables(ArrayList<Archivo> pr1, ArrayList<Archivo> pr2) {
        int repitencia = 0;

        try {
            for (int j = 0; j < pr1.size(); j++) {
                ArrayList<Variables> file1 = pr1.get(j).getVars();
                ArrayList<Variables> file2 = pr2.get(j).getVars();
                for (int k = 0; k < file1.size(); k++) {
                    for (int l = 0; l < file2.size(); l++) {
                        if (file1.get(k) == file2.get(l)) {
                            AppForm.Var_Especificos.add(new PT_especifico(1, pr1.get(j).getName(), pr2.get(j).getName(), 3, file1.get(k).getId(),""));
                            repitencia++;
                        }
                    }
                }
            }
        } catch (Exception e) {
            AppForm.escribir("Hubo un error al comparar las variables" + "\n" + e);
            return 0;
        }

        return repitencia;
    }
    public int Comparar_metodos(ArrayList<Archivo> pr1, ArrayList<Archivo> pr2) {
        double punteo = 0;
        try {
            for (int j = 0; j < pr1.size(); j++) {
                ArrayList<Funciones> file1 = pr1.get(j).getFuncs();
                ArrayList<Funciones> file2 = pr2.get(j).getFuncs();
                for (int k = 0; k < file1.size(); k++) {
                    for (int l = 0; l < file2.size(); l++) {
                        if (file1.get(k) == file2.get(l)) {
                            AppForm.Var_Especificos.add(new PT_especifico(1, pr1.get(j).getName(), pr2.get(j).getName(), 3, file1.get(k).getId(),""));  
                        }
                    }
                }
            }
        } catch (Exception e) {
            AppForm.escribir("Hubo un error al comparar las variables" + "\n" + e);
            return 0;
        }
        return 0;
    }

}

