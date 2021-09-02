/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenedor;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class FCA {
   private ArrayList <GLOBALES> GLB;
   private Barras bar;
   private Line linea;
   private PIE pie;
   private String ruta1;
   private String ruta2;
   
   public FCA(){
       
   }

   public FCA(ArrayList GLB, Barras bar, Line linea, PIE pie, String ruta1, String ruta2){
       this.GLB=GLB;
       this.bar=bar;
       this.linea=linea;
       this.pie=pie;
       this.ruta1=ruta1;
       this.ruta2=ruta2;
   }
    /**
     * @return the GLB
     */
    public void Print(){
        System.out.println("GLOBALES");
        for(int i=0; i<GLB.size();i++){
            this.GLB.get(i).print();
            System.out.println("_________");
        }
        this.bar.print();
        this.linea.print();
        this.pie.print();
        System.out.println(this.ruta1);
    }

    /**
     * @return the bar
     */
    public Barras getBar() {
        return bar;
    }

    /**
     * @param bar the bar to set
     */
    public void setBar(Barras bar) {
        this.bar = bar;
    }

    /**
     * @return the linea
     */
    public Line getLinea() {
        return linea;
    }

    /**
     * @param linea the linea to set
     */
    public void setLinea(Line linea) {
        this.linea = linea;
    }

    /**
     * @return the pie
     */
    public PIE getPie() {
        return pie;
    }

    /**
     * @param pie the pie to set
     */
    public void setPie(PIE pie) {
        this.pie = pie;
    }

    /**
     * @return the ruta1
     */
    public String getRuta1() {
        return ruta1;
    }

    /**
     * @param ruta1 the ruta1 to set
     */
    public void setRuta1(String ruta1) {
        this.ruta1 = ruta1;
    }

    /**
     * @return the ruta2
     */
    public String getRuta2() {
        return ruta2;
    }

    /**
     * @param ruta2 the ruta2 to set
     */
    public void setRuta2(String ruta2) {
        this.ruta2 = ruta2;
    }

    /**
     * @return the GLB
     */
    public ArrayList <GLOBALES> getGLB() {
        return GLB;
    }

    /**
     * @param GLB the GLB to set
     */
    public void setGLB(ArrayList <GLOBALES> GLB) {
        this.GLB = GLB;
    }
   
}