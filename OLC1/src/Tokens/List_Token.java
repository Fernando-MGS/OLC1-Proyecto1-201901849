/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tokens;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class List_Token extends ArrayList<Token>{
    public List_Token(){
        super();
    }
    
    public void addToken(Token t){
        this.add(t);
    }
    
    public void Console(){
        this.forEach((t)->{
            t.print();
    });
    }
}

