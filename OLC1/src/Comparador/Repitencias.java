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
    public Repitencias(){
        
    }
    
    public void Comparacion(){
        int punteo_clases=Comparar_clases(AppForm.Proyecto1,AppForm.Proyecto2);
        int punteo_comentarios=Comparar_comentarios();
        int punteo_funciones=Comparar_metodos();
        int punteo_variables=Comparar_variables();
    }
    
    public int Comparar_clases(ArrayList<Archivo> pr1, ArrayList<Archivo> pr2){
        int punteo=0;
       for(int i=0; i<pr1.size();i++){
           try{
               
           }catch(Exception e){
               
           }
       }
       return punteo;
    }
    
    public int Comparar_comentarios(){
        int punteo=0;
        return punteo;
    }
    
    public int Comparar_variables(){
        int punteo=0;
        return punteo;
    }
    public int Comparar_metodos(){
        int punteo=0;
        return punteo;
    }
}
