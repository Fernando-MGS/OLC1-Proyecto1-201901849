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
        int punteo = 0;
        int rep_clases = 0;
        int repitencia = 0;
        for (int i = 0; i < pr1.size(); i++) {
            try {
                for (int j = 0; j < pr1.size(); j++) {
                    ArrayList<Clases> clase1 = pr1.get(j).getClases();
                    ArrayList<Clases> clase2 = pr2.get(j).getClases();
                    for (int k = 0; k < clase1.size(); k++) {
                        if (clase1.get(k).getId() == clase2.get(k).getId()) {
                            punteo += 0.2;
                        }
                        if (clase1.get(k).getLineas() == clase2.get(k).getLineas()) {
                            punteo += 0.4;
                        }
                        ArrayList<String> metodos1 = clase1.get(k).getMetodos();
                        ArrayList<String> metodos2 = clase2.get(k).getMetodos();
                        if (metodos1.size() == metodos2.size()) {
                            for (int l = 0; l < metodos1.size(); l++) {
                                for (int m = 0; m < metodos2.size(); m++) {
                                    if (metodos1.get(l) == metodos2.get(m)) {
                                        repitencia++;
                                    }
                                }
                            }
                        }

                    }
                }
            } catch (Exception e) {

            }
        }
        return punteo;
    }

    public int Comparar_comentarios(ArrayList<Archivo> pr1, ArrayList<Archivo> pr2) {
        int repitencia = 0;
        for (int i = 0; i < pr1.size(); i++) {
            try {
                for (int j = 0; j < pr1.size(); j++) {
                    ArrayList<Comentarios> file1 = pr1.get(j).getComments();
                    ArrayList<Comentarios> file2 = pr2.get(j).getComments();
                    for (int k = 0; k < file1.size(); k++) {
                        for (int l = 0; l < file2.size(); l++) {
                            if (file1.get(k) == file2.get(l)) {
                                AppForm.Comm_Especificos.add(new PT_especifico(1, pr1.get(j).getName(), pr2.get(j).getName(), 4, file1.get(k).getContenido()));
                                repitencia++;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                AppForm.escribir("Hubo un error al comparar los comentarios");
            }
        }
        return repitencia;
    }

    public int Comparar_variables(ArrayList<Archivo> pr1, ArrayList<Archivo> pr2) {
        int repitencia = 0;
        for (int i = 0; i < pr1.size(); i++) {
            try {
                for (int j = 0; j < pr1.size(); j++) {
                    ArrayList<Variables> file1 = pr1.get(j).getVars();
                    ArrayList<Variables> file2 = pr2.get(j).getVars();
                    for (int k = 0; k < file1.size(); k++) {
                        for (int l = 0; l < file2.size(); l++) {
                            if (file1.get(k) == file2.get(l)) {
                                AppForm.Var_Especificos.add(new PT_especifico(1, pr1.get(j).getName(), pr2.get(j).getName(), 3, file1.get(k).getId()));
                                repitencia++;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                AppForm.escribir("Hubo un error al comparar las variables"+"\n");
            }
        }
        return repitencia;
    }

    public int Comparar_metodos(ArrayList<Archivo> pr1, ArrayList<Archivo> pr2) {
        int punteo = 0;
        return punteo;
    }
}
