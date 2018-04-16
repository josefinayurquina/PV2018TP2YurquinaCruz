/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1a;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class contarVocales {
     public String cadena;
    
   
    
    public void ingresarPalabra(){
        
        Scanner aa =new Scanner(System.in);
        
        System.out.println("ingrese cadena");
        cadena = aa.nextLine();
        
    }        
    public void cantidad(){
        int cont=0;
        int m= cadena.length();
        for (int i = 0; i< m;i++){
            if (cadena.charAt(i)=='a'||cadena.charAt(i)=='e'||cadena.charAt(i)=='i'
       ||cadena.charAt(i)=='o'||cadena.charAt(i)=='u'){
                cont++;
                
            }          
            
            
                
        }
        System.out.println("las vocales son"+ cont);
    
    }

    /**
     * @param args the command line arguments
     */
            
    
}
