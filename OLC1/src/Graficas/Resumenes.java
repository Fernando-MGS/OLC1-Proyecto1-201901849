/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

/**
 *
 * @author ferna
 */
public class Resumenes {
    private String nombre;
    private int clases;
    private int funciones;
    private int variables;
    private int comentarios;
    
    public Resumenes(){
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the clases
     */
    public int getClases() {
        return clases;
    }

    /**
     * @param clases the clases to set
     */
    public void setClases(int clases) {
        this.clases = clases;
    }

    /**
     * @return the funciones
     */
    public int getFunciones() {
        return funciones;
    }

    /**
     * @param funciones the funciones to set
     */
    public void setFunciones(int funciones) {
        this.funciones = funciones;
    }

    /**
     * @return the variables
     */
    public int getVariables() {
        return variables;
    }

    /**
     * @param variables the variables to set
     */
    public void setVariables(int variables) {
        this.variables = variables;
    }

    /**
     * @return the comentarios
     */
    public int getComentarios() {
        return comentarios;
    }

    /**
     * @param comentarios the comentarios to set
     */
    public void setComentarios(int comentarios) {
        this.comentarios = comentarios;
    }
    
    
}
