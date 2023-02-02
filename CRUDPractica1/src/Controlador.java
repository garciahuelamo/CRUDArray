
public class Controlador {
    public static void main(String[] args) {

        int respuestaUsuario;

        Utilidades.menuPrincipal();
        respuestaUsuario = Utilidades.pedirInt("Introduzca el número de la opción a llevar a cabo:");
        if(respuestaUsuario>=2 && respuestaUsuario<=4){
            System.out.println("Hay que añadir primero datos en la opción 'AÑADIR'.");
        }

        Menu();
    }

    private static void Menu(){

        int longitudArray;
        String[] nombresVideojuegos;
        int[] codigosVideojuegos;
        double[] preciosVideojuego;
        int respuestaUsuario;

        longitudArray = 5;
        nombresVideojuegos = new String[longitudArray];
        codigosVideojuegos = new int[longitudArray];
        preciosVideojuego = new double[longitudArray];

        respuestaUsuario = Utilidades.mostrarMenu();

        switch (respuestaUsuario){

            case 1:

                MetodosCRUDArray.addNombreVideojuegos(nombresVideojuegos,longitudArray,"Introduzca el nombre de los videojuegos:");
                MetodosCRUDArray.addCodigoVideojuegos(codigosVideojuegos,longitudArray,"Introduzca el código de los videojuegos:");
                MetodosCRUDArray.addPrecioVideojuegos(preciosVideojuego,longitudArray,"Introduzca el precio de los videojuegos:");

                for(int i = 0; i<longitudArray; i++){
                    System.out.println("El videojuego es: " + nombresVideojuegos[i] +
                            ", su precio es: " + preciosVideojuego[i] + ", y su código es: " + codigosVideojuegos[i]);
                }

                do{
                    respuestaUsuario = Utilidades.pedirInt("¿Quiere seguir? (1) SI / (2) NO");

                    if(respuestaUsuario==1){

                        do{
                            respuestaUsuario = Utilidades.mostrarSubmenu("Introduzca el número correspondiente a la opción que quiere llevar a cabo:");

                            switch(respuestaUsuario) {

                                case 2:
                                    respuestaUsuario = Utilidades.pedirInt("(1) por NOMBRE, (2) por CODIGO, (3) por PRECIO");

                                    if (respuestaUsuario < 1 || respuestaUsuario > 3) {
                                        do {
                                            respuestaUsuario = Utilidades.pedirInt("Introduzca una opción válida: (1), (2) o (3):");
                                        } while (respuestaUsuario >= 1 && respuestaUsuario <= 3);
                                    }

                                    if (respuestaUsuario == 1) {
                                        MetodosCRUDArray.searchNombreVideojuegos(nombresVideojuegos, "A continuación, vamos a buscar el videojuego por su nombre:");
                                    } else if (respuestaUsuario == 2) {
                                        MetodosCRUDArray.searchCodigoVideojuegos(codigosVideojuegos, "A continuación, vamos a buscar el videojuego por su código:");
                                    } else {
                                        MetodosCRUDArray.searchPrecioVideojuegos(preciosVideojuego, "A continuación, vamos a buscar el videojuego por su precio:");
                                    }

                                    break;
                                case 3:
                                    respuestaUsuario = Utilidades.pedirInt("(1) por NOMBRE, (2) por CODIGO, (3) por PRECIO");

                                    if (respuestaUsuario < 1 || respuestaUsuario > 3) {
                                        do {
                                            respuestaUsuario = Utilidades.pedirInt("Introduzca una opción válida: (1), (2) o (3):");
                                        } while (respuestaUsuario >= 1 && respuestaUsuario <= 3);
                                    }

                                    if (respuestaUsuario == 1) {
                                        MetodosCRUDArray.deleteNombreVideojuegos(nombresVideojuegos, "A continuación, vamos a borrar el videojuego por su nombre:");
                                    } else if (respuestaUsuario == 2) {
                                        MetodosCRUDArray.deleteCodigoVideojuegos(codigosVideojuegos, "A continuación, vamos a borrar el videojuego por su código:");
                                    } else {
                                        MetodosCRUDArray.deletePrecioVideojuegos(preciosVideojuego, "A continuación, vamos a borrar el videojuego por su precio:");
                                    }

                                    break;
                                case 4:
                                    respuestaUsuario = Utilidades.pedirInt("(1) por NOMBRE, (2) por CODIGO, (3) por PRECIO");

                                    if (respuestaUsuario < 1 || respuestaUsuario > 3) {
                                        do {
                                            respuestaUsuario = Utilidades.pedirInt("Introduzca una opción válida: (1), (2) o (3):");
                                        } while (respuestaUsuario >= 1 && respuestaUsuario <= 3);
                                    }

                                    if (respuestaUsuario == 1) {
                                        MetodosCRUDArray.updateNombreVideojuegos(nombresVideojuegos, "A continuación, vamos a actualizar el videojuego por su nombre:");
                                    } else if (respuestaUsuario == 2) {
                                        MetodosCRUDArray.updateCodigoVideojuegos(codigosVideojuegos, "A continuación, vamos a actualizar el videojuego por su código:");
                                    } else {
                                        MetodosCRUDArray.updatePrecioVideojuegos(preciosVideojuego, "A continuación, vamos a actualizar el videojuego por su precio:");
                                    }

                                    break;
                            }

                            for(int i = 0; i<longitudArray; i++){
                                System.out.println("El videojuego es: " + nombresVideojuegos[i] +
                                        ", su precio es: " + preciosVideojuego[i] + ", y su código es: " + codigosVideojuegos[i]);
                            }

                        }while (respuestaUsuario!=5);
                    } else {
                        outMenu();
                    }
                } while (respuestaUsuario!=2);

                break;
            case 2:
                outMenu();

                break;
        }
    }

    private static void outMenu(){
        System.out.println("PROGRAMA FINALIZADO.");
    }

}
