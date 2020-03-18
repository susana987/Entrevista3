/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrevista;

/**
 *
 * @author Susana Alba
 */
public class Formulario {
    
    public String Mate (int a, int b){
       String msg = null;
       if (a < 0 || b < 0){
          msg = "SOLO NUMEROS POSITIVOS"; 
       }else{
       if (a == 0 || b == 0){
           msg = "SOLO NUMEROS MAYORES A CERO";
       }else{
           if (a > b){
          msg = a + "\n" + "ES MAYOR";
       }else{
           msg = b + "\n" + "ES MAYOR";
      }
       }
       }
    return msg;   
    }
    
   
    
    
}
