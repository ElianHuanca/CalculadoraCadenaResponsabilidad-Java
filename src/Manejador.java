/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elian
 */
public abstract class Manejador {
    protected Manejador sucessor;
    
    public void setSucesor(Manejador succesor){
        this.sucessor=succesor;
    };
    
    public abstract int calcular(Numeros request);
}
