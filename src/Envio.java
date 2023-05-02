import java.util.Scanner;
public class Envio {

    public PaqueteDeEnvio[] leerEnvios() {
        MostrarEnvios mostrarEnvios = new MostrarEnvios();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos envios desea registrar");
        int numEnvio=scanner.nextInt();
        PaqueteDeEnvio[] envios = new PaqueteDeEnvio[numEnvio];

        for (int i = 0; i < envios.length; i++) {
            System.out.println("Ingrese los datos del envío " + (i+1));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("         Datos del remitente:");
            System.out.print("Nombres: ");
            scanner.nextLine();
            String nombresR = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidosR = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccionR = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefonoR = scanner.nextLine();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("       Datos del destinatario:");
            System.out.print("Nombres: ");
            String nombresD = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidosD= scanner.nextLine();
            System.out.print("Dirección: ");
            String direccionD = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefonoD = scanner.nextLine();
            System.out.print("Tipo de envío (nacional o internacional): ");
            String tipoEnvio = scanner.nextLine();
            System.out.print("Contenido (documento o mercancía): ");
            String contenido = scanner.nextLine();
            System.out.print("Peso (en kilogramos): ");
            double peso = scanner.nextDouble();
            scanner.nextLine();

            envios[i] = new PaqueteDeEnvio(new PaqueteDeEnvio.Persona(nombresR, apellidosR, direccionR, telefonoR),
                    new PaqueteDeEnvio.Persona(nombresD, apellidosD, direccionD, telefonoD), tipoEnvio, contenido, peso);
        }
        mostrarEnvios.imprimirEnvios(envios);
        return envios;
    }
}




