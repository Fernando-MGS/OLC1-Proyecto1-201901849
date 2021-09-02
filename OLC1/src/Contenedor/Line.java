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
public class Line {
    private String title;
    private String file;

    
    public Line(){
    }
    
    public void print(){
        System.out.println("LINE");
        System.out.println("TITLE= "+this.title);
        System.out.println("FILE= "+this.file);
    }
    public Line(String title, String file){
        this.title=title;
        this.file=file;
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
     * @return the file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(String file) {
        this.file = file;
    }
    
    
}
