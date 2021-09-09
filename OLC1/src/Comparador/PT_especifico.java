/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparador;

/**
 *
 * @author ferna
 */
public class PT_especifico {
    
    public double Punteo;
    public String file;
    public String file1;
    public int tipo; //1 class, 2 
    public String nombre;
    public String nombre2;
    
    
    public PT_especifico(){
        
    }
    public PT_especifico(double Punteo, String file,String file1, int tipo, String nombre,String nombre2){
        this.Punteo=Punteo;
        this.file=file;
        this.file1=file1;
        this.tipo=tipo;
        this.nombre= nombre;        
        this.nombre2= nombre2;        
    }
    
}
