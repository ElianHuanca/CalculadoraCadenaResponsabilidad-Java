/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elian
 */
public class Numeros {
    private int num1;
    private int num2;
    private String operacionDeseada;

    public Numeros(int num1, int num2, String operacionDeseada) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacionDeseada = operacionDeseada;
    }
    
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperacionDeseada() {
        return operacionDeseada;
    }
    
    
}
