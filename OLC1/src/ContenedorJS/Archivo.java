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
public class Archivo {
    private ArrayList <Clases> Clases;
    private ArrayList <Comentarios> Comments;
    private ArrayList <Funciones> Funcs;
    private ArrayList <Variables> Vars;
    private String name;
    private String project;

    public Archivo(){
        
    }
    
    public Archivo(ArrayList Clases,ArrayList Comments, ArrayList Funcs, ArrayList Vars, String name, String project){
        this.Clases=Clases;
        this.Comments=Comments;
        this.Funcs=Funcs;
        this.Vars=Vars;
        this.project=project;
        this.name=name;
    }
    /**
     * @return the Clases
     */
    public ArrayList <Clases> getClases() {
        return Clases;
    }

    /**
     * @param Clases the Clases to set
     */
    public void setClases(ArrayList <Clases> Clases) {
        this.Clases = Clases;
    }

    /**
     * @return the Comments
     */
    public ArrayList <Comentarios> getComments() {
        return Comments;
    }

    /**
     * @param Comments the Comments to set
     */
    public void setComments(ArrayList <Comentarios> Comments) {
        this.Comments = Comments;
    }

    /**
     * @return the Funcs
     */
    public ArrayList <Funciones> getFuncs() {
        return Funcs;
    }

    /**
     * @param Funcs the Funcs to set
     */
    public void setFuncs(ArrayList <Funciones> Funcs) {
        this.Funcs = Funcs;
    }

    /**
     * @return the Vars
     */
    public ArrayList <Variables> getVars() {
        return Vars;
    }

    /**
     * @param Vars the Vars to set
     */
    public void setVars(ArrayList <Variables> Vars) {
        this.Vars = Vars;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the project
     */
    public String getProject() {
        return project;
    }

    /**
     * @param project the project to set
     */
    public void setProject(String project) {
        this.project = project;
    }
    
    
    
}
