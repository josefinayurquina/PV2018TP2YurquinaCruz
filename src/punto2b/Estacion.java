/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2b;

/**
 *
 * @author Alumno
 */
public class Estacion {
    private String dia;
    private String mes;
    private String año;
    private String fecha;
    
    public Estacion() {
        
    }
   public void recibirFecha(String unaFecha){
       setFecha(unaFecha);       
   }//comentario de linea
   /*
   varias 
   lineas
   sin documentacion
   */
   public void separarFecha(){
       setDia(getFecha().substring(0, 2));
       setMes(getFecha().substring(3, 5));
       setAño(getFecha().substring(6, 8));
   }
   
   public String devolverEstacion(){
       String estacion = "";
       int opcion = 0;
       opcion = Integer.parseInt(getMes());
       int opcionDia = 0;
       opcionDia = Integer.parseInt(getDia());
       switch (opcion){
           case 1:
           estacion="verano";
               break;
           case 2:
               estacion = "verano";
               break;
           case 3:
               if (opcionDia < 21){
                   estacion = "verano";
               }
               else{
                   estacion = "otoño";
               }               
               break;
           case 4:
               estacion = "otoño";
               break;
           case 5:
               estacion = "otoño";
           case 6:
               estacion = "otoño";
               break;
           case 7:
                if (opcionDia < 21){
                   estacion = "otoño";
               }
               else{
                   estacion = "invierno";
               }               
               break;
           case 8:
               estacion = "invierno";
               break;
           case 9:
                if (opcionDia < 21){
                   estacion = "invierno";
               }
               else{
                   estacion = "primavera";
               }               
               break;
           case 10:
               estacion = "primavera";
               break;
           case 11:
               estacion = "primavera";
               break;
           case 12:
                if (opcionDia < 21){
                   estacion = "primavera";
               }
               else{
                   estacion = "verano";
               }               
               break;
                
               
       }
       return estacion;
   }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public String getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(String año) {
        this.año = año;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
