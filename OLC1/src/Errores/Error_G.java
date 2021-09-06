/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

/**
 *
 * @author ferna
 */
public class Error_G {
    public String Lexema;
    public String Tipo;
    public int line;
    public int col;
    public String file;
    
    public Error_G(String Lexema, String Tipo, int line, int col, String file){
        this.Lexema=Lexema;
        this.Tipo=Tipo;
        this.col=col;
        this.line=line;
        this.file=file;
    }
    
    public void print(){
        System.out.println(this.Lexema+"-"+this.Tipo+"-"+this.line+"-"+this.col+"-"+this.file);
    }

}
