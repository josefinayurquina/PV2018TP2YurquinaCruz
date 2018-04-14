
/*crear una clase fecha con los siguientes metodos:
devolver edad en semanas, este metodo recive una fecha de nacimiento
y devuelve la edad de la persona en semanas
string fechanac"01/02/1929"
 */
/*crear una clase fecha con los siguientes metodos:
devolver edad en semanas, este metodo recive una fecha de nacimiento
y devuelve la edad de la persona en semanas
string fechanac"01/02/1929"
 */
package punto04;
    import java.util.Scanner;
    import java.text.SimpleDateFormat;
    import java.text.ParseException;
    import java.util.Date;

public class Fecha7 {
    private String fecha;
    
    public void ingresarFecha() throws ParseException{

        Scanner d = new Scanner(System.in);
        System.out.println("ingrese fecha de nacimiento dd/MM/yyyy:");
        fecha = d.nextLine();
        System.out.println("fecha ingresada:" + pasarstringadate(fecha));
        Date hol;
        hol = pasarstringadate(fecha);
        Date datee = new Date();
        System.out.println("fecha actual:" +datee);
        System.out.print("cantidad de semanas entre las fechas:" +cantidad(datee,hol));
    }
    private int cantidad(Date ac, Date nac){
    int semana=(int) ((ac.getTime()-nac.getTime())/604800000);//cantidad de milisegundos en una semana
    return semana;
    }
        public Date pasarstringadate(String fechaa){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date fechadevuelta = formato.parse(fechaa);
            return fechadevuelta;}
        catch(ParseException a)
        {
        }
        return null;
    }
}

    


