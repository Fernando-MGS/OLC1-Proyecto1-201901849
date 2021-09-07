/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContenedorJS;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class Clases {
    private String id;
    private ArrayList <String> Metodos;
    private int lineas;

    
    public Clases(){
        
    }
    
    public Clases(String id, ArrayList Metodos, int lineas){
        this.Metodos=Metodos;
        this.id=id;
        this.lineas=lineas;
    }
    
    public void print(){
        System.out.println("El id es "+this.id);
        System.out.println("Los metodos son");
        this.Metodos.forEach((t)->{
             System.out.println(t);
    });
        System.out.println("El numero de lineas es "+this.lineas);
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the Metodos
     */
    public ArrayList <String> getMetodos() {
        return Metodos;
    }

    /**
     * @param Metodos the Metodos to set
     */
    public void setMetodos(ArrayList <String> Metodos) {
        this.Metodos = Metodos;
    }

    /**
     * @return the lineas
     */
    public int getLineas() {
        return lineas;
    }

    /**
     * @param lineas the lineas to set
     */
    public void setLineas(int lineas) {
        this.lineas = lineas;
    }
    
    
}
