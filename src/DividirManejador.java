/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elian
 */
public class DividirManejador extends Manejador{    

    @Override
    public int calcular(Numeros request) {
        int resultado=0;
        if(request.getOperacionDeseada().equals("dividir")){
            if(request.getNum2()>0){
                resultado=request.getNum1()/request.getNum2();
            }            
        }else{
            System.out.println("Solo trabaja con sumar,restar,multiplicar y dividir");
        }
        return resultado;
    }
}
