/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula2;

/**
 *
 * @author Marcos
 */
public class Calculadora2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Modelo contenedor=new Modelo();
        
        
        float n1=0;
        contenedor.setNum1(n1);
        
        float n2=0;
        contenedor.setNum2(n2);
        
        String op="+";
        
        contenedor.setOperacion(op);
        
        
        Vista.introducir(contenedor);
        
        contenedor.setResultado(realizaOperacion(contenedor.getNum1(),contenedor.getNum2(),contenedor.getOperacion()));
        
        Vista.imprimir(contenedor);
        
    }
    
    /**
     * 
     * @param n1
     * @param n2
     * @param op
     * @return 
     */
    public static float realizaOperacion(float n1,float n2,String op){

        
        float resultado=0;
        switch(op){
            case "+":resultado=(n1+n2);
                break;
            case "-": resultado=(n1-n2);
                break;
            case "*": resultado=(n1*n2);
                break;                
            case "/": resultado=(n1/n2);
                break;
        }
        return resultado;
    }
    
    }
    

