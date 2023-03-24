import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FechaNacimiento {
    private Date date;

    public Date Nacimiento(){
        System.out.print("Introduzca la -Fecha de Nacimiento- con formato dd/mm/yyyy: ");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try{
            date = df.parse(fecha);
        } catch (Exception e){
            System.out.println("Formato fecha invalido...");
        }
        return date;
    }
}
