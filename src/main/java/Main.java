import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        FechaNacimiento fecha = new FechaNacimiento();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String nombre;
        String apellido;
        boolean salir = false;


        while (!salir) {
            System.out.print("Ingrese el Nombre de la Persona: ");
            Scanner sc = new Scanner(System.in);
            nombre = sc.nextLine();
            System.out.print("Ingrese el Apellido de la Persona: ");
            apellido = sc.nextLine();
            Persona persona = new Persona(nombre, apellido, fecha.Nacimiento());
            personas.add(persona);
            System.out.print("Para salir escriba 's' -Enter para continuar-: ");
            String opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("s")) {
                salir = true;
            }
        }
        System.out.println("----Lista de Personas ingresadas----");

        System.out.format("%-15s%-15s%-15s\n","-Nombre-","-Apellido-","-FechaNacimiento-");
        for (Persona pers: personas) {
            System.out.format("%-15s%-15s%-15s\n",pers.getNombre(), pers.getApellido(), sdf.format(pers.getFechaNacimiento()));
        }

    }
}
