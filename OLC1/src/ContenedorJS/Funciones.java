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
public class Funciones {
    private String id;
    private int lineas;
    private int params;

    
    public Funciones(){
        
    }
    
    public Funciones(String id, int lineas, int params){
        this.id=id;
        this.lineas=lineas;
        this.params=params;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the lineas
     */
    public int getLineas() {
        return lineas;
    }

    /**
     * @param lineas the lineas to set
     */
    public void setLineas(int lineas) {
        this.lineas = lineas;
    }

    /**
     * @return the params
     */
    public int getParams() {
        return params;
    }

    /**
     * @param params the params to set
     */
    public void setParams(int params) {
        this.params = params;
    }
    
    
}
