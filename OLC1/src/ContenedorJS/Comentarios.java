/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContenedorJS;

/**
 *
 * @author ferna
 */
public class Comentarios {
    private String contenido;

    public Comentarios(){
        
    }
    
    public Comentarios(String contenido){
        this.contenido=contenido;
    }
    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
}
