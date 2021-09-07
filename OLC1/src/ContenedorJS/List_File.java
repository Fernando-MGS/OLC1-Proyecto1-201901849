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
public class List_File extends ArrayList<Archivo> {
    public List_File(){
        super();
    }
    
    public void addFile(Archivo t) {
        this.add(t);
    }
}
