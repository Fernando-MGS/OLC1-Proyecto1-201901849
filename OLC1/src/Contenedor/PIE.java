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
public class PIE {
    private String title;
    private ArrayList <String> ejex;
    private ArrayList <String> value;
    
    public PIE(){
        
    }
    
    public void print(){
        System.out.println("PIE");
        System.out.println("TITLE= "+this.title);
        System.out.println("EJEX= "+this.ejex);    
        System.out.println("VALUE= "+this.value);
    }
    
     public String return_pie(){
        String aux;
        aux="PIE";
        aux+="TITLE= "+this.title+"\n";
        return  aux;
    }
    public PIE(String title,ArrayList ejex, ArrayList value ){
        this.ejex=ejex;
        this.title=title;
        this.value=value;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the ejex
     */
    public ArrayList <String> getEjex() {
        return ejex;
    }

    /**
     * @param ejex the ejex to set
     */
    public void setEjex(ArrayList <String> ejex) {
        this.ejex = ejex;
    }

    /**
     * @return the value
     */
    public ArrayList <String> getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(ArrayList <String> value) {
        this.value = value;
    }
    
    
}
