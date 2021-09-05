/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tokens;

/**
 *
 * @author ferna
 */
public class Token {
    public String Lexema;
    public String TokenName;
    public int line;
    public int col;
    public String file;
    
    public Token(String Lexema, String TokenName, int line, int col, String file){
        this.Lexema=Lexema;
        this.TokenName=TokenName;
        this.col=col;
        this.line=line;
        this.file=file;
    }
    
    public void print() {
        System.out.println(this.Lexema+"-"+this.TokenName+"-"+this.line+"-"+this.col+"-"+this.file);
    }
    
}
