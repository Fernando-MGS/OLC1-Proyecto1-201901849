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
public class Barras {
    private String title;
    private ArrayList <String> ejex;
    private ArrayList <String> value;
    private String titlex;
    private String titley;

    public Barras(){
        
    }
    
    public void print(){
        System.out.println("BARRAS");
        System.out.println("Titulo= "+this.title);
        System.out.println("EJE X= "+this.ejex);
        System.out.println("VALUE= "+this.value);
        System.out.println("Title X= "+this.titlex);
        System.out.println("Title Y= "+this.titley);
    }
    
    public String return_bar(){
        String aux;
        aux="BARRAS"+"\n";
        aux+="Titulo= "+this.title+"\n";
        aux+="Title X= "+this.titlex+"\n";
        aux+="Title Y= "+this.titley+"\n";
        return aux;
    }
    
    public Barras(String title, ArrayList ejex, ArrayList value, String titlex, String titley){
        this.title=title;
        this.ejex=ejex;
        this.titlex=titlex;
        this.titley=titley;
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

    /**
     * @return the titlex
     */
    public String getTitlex() {
        return titlex;
    }

    /**
     * @param titlex the titlex to set
     */
    public void setTitlex(String titlex) {
        this.titlex = titlex;
    }

    /**
     * @return the titley
     */
    public String getTitley() {
        return titley;
    }

    /**
     * @param titley the titley to set
     */
    public void setTitley(String titley) {
        this.titley = titley;
    }
}

