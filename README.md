# Web-API-de-Libro-con-control-de-excepciones

## Descripción de Anotaciones en Spring

Al deber anterior se le agrega la carpeta "exeptions" y una clase llamada "LibroExeptions".

![image](https://github.com/cristofer753/Web-API-de-Libro-con-control-de-excepciones/assets/141539505/a00c19c5-71db-425b-ac1a-297067e143a5)


Se le agrega la lógica para La clase LibroException tiene un constructor que toma un parámetro message, que es el mensaje de texto que se proporcionará cuando se lance la excepción.

![image](https://github.com/cristofer753/Web-API-de-Libro-con-control-de-excepciones/assets/141539505/4ac9b05f-e5d1-470d-98a4-09502638c145)


Ahora en la clase “LibroController “se le agrega a los métodos lo requerido:

1. `getLibroById`: Recupera un libro por su ID, lanzando una excepción si no se encuentra.
2. `addLibro`: Agrega un nuevo libro utilizando el cuerpo de la solicitud.
3. `handleLibroException`: Maneja excepciones personalizadas para libros no encontrados, devolviendo un mensaje de error con estado 404.

![image](https://github.com/cristofer753/Web-API-de-Libro-con-control-de-excepciones/assets/141539505/829ad668-d258-43ff-a3db-a204cc1e3e7f)


Ahora realizamos el run y hacemos los debidos gets y post.

![image](https://github.com/cristofer753/Web-API-de-Libro-con-control-de-excepciones/assets/141539505/dcb4e9af-b575-48c5-8686-9704aac3a17f)


Realizamos un `@GetMapping` para ver todos los libros.

![image](https://github.com/cristofer753/Web-API-de-Libro-con-control-de-excepciones/assets/141539505/30004ba0-6854-4e4d-84fa-21d2012d2435)


Ahora buscamos libros por ID con `@GetMapping("/{id_libro}")`.

![image](https://github.com/cristofer753/Web-API-de-Libro-con-control-de-excepciones/assets/141539505/75ee7966-93f3-431f-910b-12b3e9fa15de)


Como siguiente realizamos un `@PostMapping` para agregar un libro.
Y también me da el estado 201 Created modificado cuando se crea el libro.

![image](https://github.com/cristofer753/Web-API-de-Libro-con-control-de-excepciones/assets/141539505/ff2615e2-ef40-4e49-868d-a171bd592125)


Como último realizamos una búsqueda por ID que no exista para que me refleje el estado NOT_FOUND con un mensaje personalizado.

![image](https://github.com/cristofer753/Web-API-de-Libro-con-control-de-excepciones/assets/141539505/8afa2ee2-7ace-4459-97f9-257a6254170c)


# FIN 
