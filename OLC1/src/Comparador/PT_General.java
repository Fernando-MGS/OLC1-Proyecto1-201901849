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
public class PT_General {
    public int Clases;
    public int Comentarios;
    public int metodos;
    public int variables;
    public int var_total;
    public int class_total;
    public int metodos_total;
    public int comments_total;
    
    public PT_General(int Clases, int Comentarios, int metodos, int variables, int var_total, int class_total, int metodos_total, int comments_total){
        this.Clases=Clases;
        this.Comentarios=Comentarios;
        this.metodos=metodos;
        this.variables=variables;
        this.var_total=var_total;
        this.class_total=class_total;   
        this.metodos_total=metodos_total;
        this.comments_total=comments_total;
    }
}
