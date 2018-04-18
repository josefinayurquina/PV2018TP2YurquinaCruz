/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Trabajo Desorganizado
       fechar100();
        
    }
        public static void fechar100() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca día, mes y año");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        GregorianCalendar fechad = new GregorianCalendar(year, month-1, day);
        fechad.add(Calendar.DATE, 100);
        Date fechaDate = fechad.getTime();        
        SimpleDateFormat formato = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy");
        System.out.println("La fecha despues de 100 dias es: " + formato.format(fechaDate));
         }
    }
    

