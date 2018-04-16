
package punto1b;

import java.util.Scanner;

public class Inventir {
    private String cadena;
    private String invers;
    private String inverslargo;
    int pal;
        public void ingresarDato(){
         Scanner cad = new Scanner(System.in);
         System.out.println("ingrese frase");
         cadena = cad.nextLine();
         System.out.println("la frase invertida es:" + reversa(cadena));
        }
    private String reversa(String cad){
        invers = cad;
        pal = cad.length();
        if (pal == 1){
          return inverslargo = invers;
        }  
        else{
            for(int i = cad.length()-1 ; i>= 0 ; i--){
            inverslargo = inverslargo + invers.charAt(i);   
            
            }
        }    
        return inverslargo;
    }
    
}

