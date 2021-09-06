/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class List_Error extends ArrayList<Error_G> {

    public List_Error() {
        super();
    }

    public void addError(Error_G t) {
        this.add(t);
    }

    public void Console() {
        this.forEach((t) -> {
            t.print();
        });
    }
}
