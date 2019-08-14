/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradaysalidadedatos;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author edmayen
 */
public class Entradaysalidadedatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        //inicio de ejemplo de entrada y salida de datos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        System.out.println("La variable s vale: "+s);
        
        //termino de ejemplo de entrada y salida de datos 
        
        /*
        Ejemplo de conversion de datos con un cast 
        
        int a=5;
        int b=7;
        double c=0.5;
        
        c=a;    //conversion  implicita
        
        a=(int)c;   //conversion explicita utilizando "cast"
        
        String s = "2";
       
        b=Integer.parseInt(s);      //conversion con "parse"
        c=Double.parseDouble(s);
        
        */
    }
    
}
