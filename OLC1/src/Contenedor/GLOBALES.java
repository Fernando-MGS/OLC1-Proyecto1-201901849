/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenedor;

/**
 *
 * @author ferna
 */
public class GLOBALES {
    private String nombre;
    private double valor_d;
    private String valor_s;
    private int tipo;//0 es string, 1 es double, 3 es double especial
    
    public GLOBALES(){
    }
    
    public GLOBALES(String nombre, double valor_d, String valor_s, int tipo){
        this.nombre=nombre;
        this.valor_d=valor_d;
        this.valor_s=valor_s;
        this.tipo=tipo;
    }

    public void print(){
        System.out.println("NOMBRE="+this.nombre);
        System.out.println("Valor_d="+this.valor_d);
        System.out.println("Valor s="+this.valor_s);
        System.out.println("Tipo="+this.tipo);
    }
    public String return_var(){
        String aux;
        aux="NOMBRE="+this.nombre+"\n";
        aux+="Valor_d="+this.valor_d+"\n";
        aux+="Valor s="+this.valor_s+"\n";
        aux+="Tipo="+this.tipo+"\n";
        return aux;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        System.out.println("");
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the valor_d
     */
    public double getValor_d() {
        return valor_d;
    }

    /**
     * @param valor_d the valor_d to set
     */
    public void setValor_d(double valor_d) {
        this.valor_d = valor_d;
    }

    /**
     * @return the valor_s
     */
    public String getValor_s() {
        return valor_s;
    }

    /**
     * @param valor_s the valor_s to set
     */
    public void setValor_s(String valor_s) {
        this.valor_s = valor_s;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
