import java.util.Scanner;

public class Utilidades {

    public static void menuPrincipal(){

        System.out.println("MENÚ:" +
                "\nOPCIÓN 1. AÑADIR" +
                "\nOPCIÓN 2. BUSCAR" +
                "\nOPCIÓN 3. BORRAR" +
                "\nOPCIÓN 4. ACTUALIZAR" +
                "\nOPCIÓN 5. SALIR");

    }
    public static int mostrarMenu() {

        int respuestaMenu;

        System.out.println("MENÚ:" +
                "\nOPCIÓN 1. AÑADIR" +
                "\nOPCIÓN 5. SALIR");

        System.out.println();
        respuestaMenu = Utilidades.pedirInt("Introduzca (1) para AÑADIR datos o (5) para SALIR del programa.");

        do {
            if(respuestaMenu!=1 && respuestaMenu!=5){
                System.out.println("ERROR");
                respuestaMenu = Utilidades.pedirInt("Introduzca (1) para AÑADIR datos o (5) para SALIR del programa.");
            }
        }while (respuestaMenu!=1 && respuestaMenu!=5);

        return respuestaMenu;
    }

    public static int mostrarSubmenu(String texto){

        int respuestaSubmenu;

        System.out.println("SUBMENÚ:" +
                "\nOPCIÓN 2.BUSCAR" +
                "\nOPCIÓN 3.BORRAR" +
                "\nOPCIÓN 4.MODIFICAR" +
                "\nOPCIÓN 5.SALIR");

        System.out.println(texto);
        respuestaSubmenu = Utilidades.pedirInt("Introduzca (2) para BUSCAR, (3) para BORRAR, (4) para MODIFICAR" +
                "O (5) para SALIR.");

        do {
            if(respuestaSubmenu<=1 || respuestaSubmenu>=6){
                System.out.println("ERROR");
                respuestaSubmenu = Utilidades.pedirInt("Introduzca (2) para BUSCAR, (3) para BORRAR, (4) para MODIFICAR" +
                        "O (5) para SALIR.");
            }
        }while (respuestaSubmenu<1 || respuestaSubmenu>6);

        return respuestaSubmenu;
    }

    public static String pedirString(String texto) {

        String respuesta;

        Scanner reader = new Scanner(System.in);
        System.out.println(texto);
        respuesta = reader.next();
        reader.nextLine();

        return respuesta;
    }

    public static int pedirInt(String texto) {

        int respuesta;

        Scanner reader = new Scanner(System.in);
        System.out.println(texto);
        respuesta = reader.nextInt();
        reader.nextLine();

        return respuesta;
    }

    public static double pedirDouble(String texto) {

        double respuesta;

        Scanner reader = new Scanner(System.in);
        System.out.println(texto);
        respuesta = reader.nextDouble();
        reader.nextLine();

        return respuesta;
    }
}
