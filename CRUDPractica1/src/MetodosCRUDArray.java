import java.util.Arrays;

public class MetodosCRUDArray {

    public static void addNombreVideojuegos (String[] nombresVideojuegos, int longitud, String texto){

        int contador;

        contador = 0;

        System.out.println(texto);

        for (int i = 0; i < longitud; i++) {

            nombresVideojuegos[i] = Utilidades.pedirString("Videojuego: " + (i + 1));
            contador++;

            if (contador == 5) {
                System.out.println("No hay más espacio para almacenar más datos.");
            }
        }

        System.out.println("Los videojuegos almacenados son: " + Arrays.toString(nombresVideojuegos));
    }

    public static void addCodigoVideojuegos (int[] codigosVideojuegos, int longitud, String texto){

        int contador;

        contador = 0;

        System.out.println(texto);

        for (int i = 0; i < longitud; i++) {

            codigosVideojuegos[i] = Utilidades.pedirInt("Videojuego: " + (i + 1));
            contador++;

            if (contador == 5) {
                System.out.println("No hay más espacio para almacenar más datos.");
            }
        }

        System.out.println("Los videojuegos almacenados son: " + Arrays.toString(codigosVideojuegos));
    }

    public static void addPrecioVideojuegos (double[] preciosVideojuegos, int longitud, String texto){

        int contador;

        contador = 0;

        System.out.println(texto);

        for (int i = 0; i < longitud; i++) {

            preciosVideojuegos[i] = Utilidades.pedirDouble("Videojuego: " + (i + 1));
            contador++;

            if (contador == 5) {
                System.out.println("No hay más espacio para almacenar más datos.");
            }
        }

        System.out.println("Los videojuegos almacenados son: " + Arrays.toString(preciosVideojuegos));
    }

    public static boolean searchNombreVideojuegos (String[] nombresVideojuegos, String texto){

        int longitud;
        String nombreUsuario;
        boolean validacion;

        longitud = nombresVideojuegos.length;
        validacion = false;

        System.out.println(texto);
        nombreUsuario = Utilidades.pedirString("Introduzca el nombre:");

        for (int i = 0; i< longitud; i++){

            if(nombresVideojuegos[i].equals(nombreUsuario)){
                validacion = true;
                System.out.println("NOMBRE ENCONTRADO: " + nombreUsuario);
                break;
            }
        }

        if (!validacion){
            System.out.println("NO ENCONTRADO");
        }

        return validacion;
    }

    public static boolean searchCodigoVideojuegos (int[] codigosVideojuegos, String texto){

        int longitud;
        int codigoUsuario;
        boolean validacion;

        longitud = codigosVideojuegos.length;
        validacion = false;

        System.out.println(texto);
        codigoUsuario = Utilidades.pedirInt("Introduzca el código:");

        for (int i = 0; i< longitud; i++){

            if(codigosVideojuegos[i] == codigoUsuario){
                validacion = true;
                System.out.println("CÓDIGO ENCONTRADO: " + codigoUsuario);
                break;
            }
        }

        if (!validacion){
            System.out.println("NO ENCONTRADO");
        }

        return validacion;
    }

    public static boolean searchPrecioVideojuegos(double[] preciosVideojuegos, String texto){

        int longitud;
        double precioUsuario;
        boolean validacion;

        longitud = preciosVideojuegos.length;
        validacion = false;

        System.out.println(texto);
        precioUsuario = Utilidades.pedirDouble("Introduzca el precio:");

        for (int i = 0; i< longitud; i++){

            if(preciosVideojuegos[i] == precioUsuario){
                validacion = true;
                System.out.println("PRECIO ENCONTRADO: " + precioUsuario);
                break;
            }
        }

        if (!validacion){
            System.out.println("NO ENCONTRADO");
        }

        return validacion;
    }

    public static boolean deleteNombreVideojuegos(String[] nombresVideojuegos, String texto){

        int longitud;
        String nombreUsuario;
        boolean validacion;
        int respuesta;

        longitud = nombresVideojuegos.length;
        validacion = false;

        System.out.println(texto);
        nombreUsuario = Utilidades.pedirString("Introduzca el nombre:");

        for(int i = 0; i < longitud; i++){

            if(nombresVideojuegos[i].compareTo(nombreUsuario) == 0){
                validacion = true;
                System.out.println("Encontrado. Espere un momento...");
                nombresVideojuegos[i] = " ";
                System.out.println("Borrado con éxito.");

                if(nombresVideojuegos[i] == " "){
                    respuesta = Utilidades.pedirInt("¿Quieres añadir un nuevo nombre?: (1) SI / (2) NO");
                    if(respuesta == 1){
                        nombreUsuario = Utilidades.pedirString("Nombre del videojuego: ");
                        nombresVideojuegos[i] = nombreUsuario;
                        System.out.println("Nombre almacenado: " + nombreUsuario);
                    } else {
                        System.out.println("Nombre nuevo NO añadido");
                    }
                }
            }
        }

        if (!validacion){
            System.out.println("NO ENCONTRADO");
        }

        return validacion;
    }

    public static boolean deleteCodigoVideojuegos(int[] codigosVideojuegos, String texto){

        int longitud;
        int codigoUsuario;
        String delete;
        boolean validacion;

        validacion = false;
        delete = "99999";
        longitud = codigosVideojuegos.length;

        System.out.println(texto);
        codigoUsuario = Utilidades.pedirInt("Introduzca el código:");

        for(int i = 0; i < longitud; i++){

            if(codigosVideojuegos[i] == codigoUsuario){
                validacion = true;
                System.out.println("Encontrado. Espere un momento...");
                codigosVideojuegos[i] = Integer.parseInt(delete);
                System.out.println("Borrado con éxito.");

                if(codigosVideojuegos[i] == Integer.parseInt(delete)){
                    codigoUsuario = Utilidades.pedirInt("¿Quieres añadir un nuevo código?: (1) SI / (2) NO");
                    if(codigoUsuario == 1){
                        codigoUsuario = Utilidades.pedirInt("Código del videojuego: ");
                        codigosVideojuegos[i] = codigoUsuario;
                        System.out.println("Código almacenado: " + codigoUsuario);
                    } else {
                        System.out.println("Código nuevo NO añadido");
                    }
                }
            }
        }

        if (!validacion){
            System.out.println("NO ENCONTRADO");
        }

        return validacion;
    }

    public static boolean deletePrecioVideojuegos(double[] preciosVideojuegos, String texto){

        int longitud;
        double precioUsuario;
        String delete;
        boolean validacion = false;

        longitud = preciosVideojuegos.length;
        validacion = false;
        delete = "99999";

        System.out.println(texto);
        precioUsuario = Utilidades.pedirDouble("Introduzca el precio:");

        for(int i = 0; i < longitud; i++){

            if(preciosVideojuegos[i] == precioUsuario){
                validacion = true;
                System.out.println("Encontrado. Espere un momento...");
                preciosVideojuegos[i] = Integer.parseInt(delete);
                System.out.println("Borrado con éxito.");

                if(preciosVideojuegos[i] == Integer.parseInt(delete)){
                    precioUsuario = Utilidades.pedirInt("¿Quieres añadir un nuevo precio?: (1) SI / (2) NO");
                    if(precioUsuario == 1){
                        precioUsuario = Utilidades.pedirDouble("Precio del videojuego: ");
                        preciosVideojuegos[i] = precioUsuario;
                        System.out.println("Precio almacenado: " + precioUsuario);
                    } else {
                        System.out.println("Precio nuevo NO añadido");
                    }
                }
            }
        }

        if (!validacion){
            System.out.println("NO ENCONTRADO");
        }


        return validacion;

    }
    public static String updateNombreVideojuegos(String[] nombresVideojuegos, String texto){

        int longitud;
        String nombreUsuario;

        longitud = nombresVideojuegos.length;

        System.out.println(texto);
        nombreUsuario = Utilidades.pedirString("Introduzca el nombre:");

        for(int i = 0; i < longitud; i++){

            if (nombresVideojuegos[i].compareTo(nombreUsuario) == 0){
                System.out.println("Encontrado. Espere un momento...");
                nombreUsuario = Utilidades.pedirString("Introduzca el nuevo nombre:");
                nombresVideojuegos[i] = nombreUsuario;
                System.out.println("Actualización con éxito.");
            }
        }

        return nombreUsuario;
    }

    public static boolean updateCodigoVideojuegos(int[] codigosVideojuegos, String texto){

        int longitud;
        int codigoUsuario;
        boolean validacion;
        String delete = "99999";

        longitud = codigosVideojuegos.length;
        validacion = false;

        System.out.println(texto);
        codigoUsuario = Utilidades.pedirInt("Introduzca el código:");

        for(int i = 0; i < longitud; i++){

            if (codigosVideojuegos[i] == codigoUsuario){
                validacion = true;
                System.out.println("Encontrado. Espere un momento...");
                codigoUsuario = Utilidades.pedirInt("Introduzca el nuevo código:");
                codigosVideojuegos[i] = codigoUsuario;
                System.out.println("Actualización con éxito.");
                break;
            }
        }

        if (!validacion){
            System.out.println("NO ENCONTRADO");
        }

        return validacion;
    }

    public static boolean updatePrecioVideojuegos(double[] preciosVideojuegos, String texto){

        int longitud;
        double precioUsuario;
        boolean validacion;

        longitud = preciosVideojuegos.length;
        validacion = false;

        System.out.println(texto);
        precioUsuario = Utilidades.pedirDouble("Introduzca el precio:");

        for(int i = 0; i < longitud; i++){

            if (preciosVideojuegos[i] == precioUsuario){
                validacion = true;
                System.out.println("Encontrado. Espere un momento...");
                precioUsuario = Utilidades.pedirDouble("Introduzca el nuevo código:");
                preciosVideojuegos[i] = precioUsuario;
                System.out.println("Actualización con éxito.");
                break;
            }
        }

        if (!validacion){
            System.out.println("NO ENCONTRADO");
        }

        return validacion;
    }

}
