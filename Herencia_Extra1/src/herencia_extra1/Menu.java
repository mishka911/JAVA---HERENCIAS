package herencia_extra1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
    private final Scanner scan = new Scanner(System.in);

    public void iniciarPrograma() {
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    Alquiler alquiler = new Alquiler();
                    System.out.println("Ingrese los datos");
                    System.out.println("Ingrese el nombre del cliente");
                    alquiler.setNombre(scan.next());
                    System.out.println("Ingrese el documento del cliente");
                    alquiler.setDni(scan.nextInt());
                    System.out.println("ingrese la fecha de alquiler en el formato dd/mm/yyyy");
                    LocalDate fechaAlquiler = LocalDate.parse(scan.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    alquiler.setFechaAlquiler(fechaAlquiler);
                    System.out.println("Ingrese la fecha de devolucion");
                    LocalDate fechaDevolucion = LocalDate.parse(scan.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    alquiler.setFechaDevolucion(fechaDevolucion);
                    System.out.println("Ingrese la posicion de amarre");
                    alquiler.setAmarre(scan.nextDouble());
                    System.out.println("Ingrese el tipo de barco");
                    System.out.println("1. barco a motor");
                    System.out.println("2. velero");
                    System.out.println("3. yate de lujo");

                    int opcionBarco = scan.nextInt();
                    if (opcionBarco == 1) {
                        BarcoMotor barco = new BarcoMotor();
                        barco = barco.crearBarcoMotor();
                        alquiler.setBarco(barco);

                    } else if (opcionBarco == 2) {
                        Velero barco = new Velero();
                        barco = barco.crearVelero();
                        alquiler.setBarco(barco);

                    } else if (opcionBarco == 3) {
                        Yate barco = new Yate();
                        barco = barco.crearYate();
                        alquiler.setBarco(barco);

                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                    System.out.println(alquiler);
                    System.out.println("el valor que debe cancelar es: $ " + String.format("%.2f", alquiler.calcularPrecioAlquiler()));
                    break;
                case 2:
                    System.out.println("ADIOSSSSS");
                    break;
            }
        }while(opcion != 2);

    }

    public int menu() {
        System.out.println("1.ALQUILAR");
        System.out.println("2.SALIR");
        System.out.println("ingrese una opcion");
        return scan.nextInt();
    }
  
}
