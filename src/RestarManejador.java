/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elian
 */
public class RestarManejador extends Manejador{

    @Override
    public int calcular(Numeros request) {
        int resultado=0;
        if(request.getOperacionDeseada().equals("restar")){
            resultado= request.getNum1()-request.getNum2();
        }else{
            resultado+=sucessor.calcular(request);
        }
        return resultado;
    }
    
}
