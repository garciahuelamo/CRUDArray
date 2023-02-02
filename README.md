# CRUD_Array

El programa creado tiene el objetivo de poder añadir – buscar – borrar o actualizar diferentes variables o, salir del programa.

En concreto, vamos a almacenar 3 tipos de datos relacionados entre ellos. Para ello, he utilizado 3 tipos de array, todos con una longitud de 5 ítems.
  a.	Array tipo String para almacenar los nombres de los videojuegos.
  b.	Array tipo int para almacenar el código de cada videojuego.
  c.	Array tipo double para almacenar el precio que cuesta cada videojuego.

Para el programa se ha creado 3 archivos java: 
  1. Archivo "Utilidades" – donde podemos encontrar los métodos que son funcionales para cualquier programa que podamos hacer en un futuro. 
  2. Archivo "MétodosCRUDArray" – donde podemos encontrar los diferentes métodos que son funcionales únicamente para el programa que hemos creado. 
  3. Archivo "Controlador" – donde se encuentra el método main para poder ejecutar el programa. 

En el Controlador, a parte del método main, encontramos el método Menú – que es el método principal donde encontramos desarrollado todo el programa y, el método outMenú – para salir del programa.

En el método main, mostramos el menú principal, para que el usuario pueda elegir la opción que desea realizar. Si el usuario, pide borrar-modificar-o buscar datos sin haber añadido nada, automáticamente saltará un aviso que debe añadir datos para poder acceder a cualquiera de las 3 opciones anteriores, por tanto, se le mostrará un menú secundario con añadir o salir.

Cuando se haya añadido los datos, ya estará disponible el sub-menú para poder buscar-borrar o actualizar cualquiera de los 3 tipos de datos. 

Ejemplo para comprobar la funcionalidad correcta del programa:

![Datos originales_datos modificados_tabla](https://user-images.githubusercontent.com/97111035/216325242-df278cb7-e89b-4612-b383-c5dc2bb2991a.JPG)




