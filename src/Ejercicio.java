import java.util.Scanner;

public class Ejercicio {
    static int opcion, documento;
    static String nombre;
    static Scanner entrada = new Scanner(System.in);

    static void mostrarMenu() {
        System.out.println("\nElija una opción\n"+
                "1 - Registrar ingreso al curso\n"+
                "2 - Consultar usuarios que hayan presentado el curso\n"+
                "3 - Consultar resultados de la prueba del curso\n"+
                "4 - Salir del programa");
    }

    static void accionesMenu(int opcion) {
        Scanner input = new Scanner(System.in);

        switch (opcion) {
            case 1:{
                System.out.println("Ingrese su nombre completo:");
                nombre = input.nextLine();
                System.out.println("Ingrese su decumento sin puntos ni guiones:");
                documento = input.nextInt();
                System.out.println("Su ingreso al curso ha sido registrado");
                break;
            }
            case 2:{
                System.out.println("Christian Britos\n"+
                        "Laura Ferrari\n"+
                        "Sylvia Merello\n"+
                        "Sonia Pereyra");
                break;
            }
            case 3:{
                System.out.println("Ingresa el doumento del usuario a consultar:");
                documento = input.nextInt();

                aprebadoONo(documento);
                break;
            }
            case 4:{
                System.out.println("Que tenga buen día");
                break;
            }
        }
    }

    static void aprebadoONo(int documento) {
        switch (documento){
            case 12345678:{
                System.out.println("El usuario APROBÓ EL CURSO");
                break;
            }
            default:{
                System.out.println("El usuario NO APROBÓ el curso");
            }
        }
    }

    public static void main(String[] args) {
        int contador = 0;

        while(contador <= 8){
            mostrarMenu();
            opcion= entrada.nextInt();

            contador++;

            accionesMenu(opcion);
        }

    }
}
