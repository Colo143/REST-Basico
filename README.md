# REST-Basico
REST Basico hecho con Java - Spring-Boot. Para pruebas unitarias JUnit y para documentar el mismo, con Swagger UI.

INSTRUCCIONES PARA EL USO DEL SERVICIO EN SPRING-BOOT:

1ra Forma de Ejecutar el Servicio: En el apartado de 'Package Explorer' o 'Project Explorer' y situarse al paquete o proyecto 'spring-boot-fibonacci', 
sobre el mismo click derecho, ir a 'Run As' y luego click izquierdo en 'Spring Boot App'.

2ra Forma de Ejecutar el Servicio: Ir al icono 'Run As' que esta en la parte superior-centro, luego dar click en el icono de flecha hacia abajo y elegir 
'spring-boot-fibonacci'.

3ta Forma de Ejecutar el Servicio: Ir al apartado 'Boot Dashboard', click en 'spring-boot-fibonacci' y finalmente click en sobre el icono 'Start o Restart'.

4da Forma de Ejecutar el Servicio: Alt + Shift + X + B.

En el navegador agregar la URL: http://localhost:8080/swagger-ui/index.html. El mismo se va cargar el FRAMEWORK Swagger UI, que si bien su objetivo principal es
la documentación automatizada, tambien se puede diseñar, construir y utilizar servicios RESTfull. 

Esto apunta a uno o varios CONTROLADORES, segun que controlador especifiquemos mediante con su nombre de packete del mismo. Ver la clase 'SwaggerConfig.java' para entender
mejor su mecanismo.

NOTA: El puerto 8080, es el puerto por defecto de Tomcat. Fijarse en el apartado de Consola (Console), para verificar que puerto esta usando Tomcat, en la 
la linea: [restartedMain] : o.s.b.w.embedded.tomcat.TomcatWebServer : Tomcat initialized with port(s): 8080 (http)


Una vez cargado Swagger UI, dirigirse y hacer click en 'fibonacci-controller' que se desplegara el/los REST que se uso en el controlador. Como se podra notar, es el POST.

Hacemos click en el REST y se va desplegar los detalles del metodo construido. Ahora para hacer la prueba del servicio, vamos hacer click en 'Try it out' para ejecutar la prueba.
Se va a habilitar los datos y parametros para editar (edit) o usar su MODELO (model) para solo ingresar el parametro y para esta ocasión vamos a usar la opcion modelo.

Este servicio espera un JSON, como se podra ver este metodo ya tiene construido un Objecto de formato JSON y el otro parametro se espera un dato numerico. Ver la clase 'FibonacciController' para entender mejor su mecanismo.
Si bien el JSON esta construido, nos falta el valor que tendra el dato del mismo. Para esto esta el parametro numerico. 
Insertamos cualquier numero en el apartado 'numeroInput' y en el 'Server Response' en su sub-apartado 'Response Body' veremos la respuesta del Servicio.

NOTA: Debemos tener en cuenta que la sub-funcion que esta en el metodo principal del REST, determina si el numero ingresado forma parte de la sucesion Fibonacci, pero
como la lista realmente puede ser infinito, decidi solo comparar con los primeros 21 numeros de la misma. Esto se puede reflejar mejor a continuacion en las pruebas
unitarias que se explicara mas adelante. 

Para apagar el Servicio:

1er forma: Situarse en la parte superior-centro, hacer click al icono 'Stop Service'.

2da forma: En el apartado del 'Dashboard', hacer cick en el icono 'Stop process'.

3ra forma: Ctrl + Alt + Shift + B + S.

INSTRUCCIONES PARA EL USO DE PRUEBAS UNITARIAS CON EL FRAMEWORK JUNIT TEST:

Debemos ir a la clase de prueba. Para ello vamos al apartado de 'Package Explorer' o 'Project Explorer' y situarse al paquete o proyecto 'spring-boot-fibonacci'.
Luego debemos situarnos a la carpeta 'src/test/java' y vamos desglosando el/los paquetes hasta llegar a la clase 'FibonacciApplicationTest'. Una vez abierto, vamos
hacer click derecho sobre cualquier parte del codigo y nos situamos a la seccion 'Run As' y en la sub seccion 'JUnit Test'. 

Otra forma de ejecutarlo es con las teclasAlt + Shift + X + T.

El framework va a cargar con todos los metodos a testear como objetivo a la clase inyectada 'ServiceFibonacciImpl' y veremos que se va ir implementando cada uno de 
ellos obteniendo su respuesta por Consola. 

El primer metodo, es obtener una lista de los primeros 21 numeros que forman parte de la sucesion Fibonacci. Esto se verifica concretamente para que el metodo 
'recursividadFibonacci(int n)' añadan los numeros correctos.

El segundo, valida si el metodo anterior, pero haciendo encapie a la clase a testear con su metodo 'listadoNumerosFibonacci()', si la lista obtiene correctamente el
tamaño que se espera. Que es 21.

El Tercero, valida si el numero obtenido por teclado en Consola pertenece a la lista de sucesion de Fibonacci. Siempre teniendo en cuenta que la lista que construyo
con el metodo anterior, se valide entre los mismos. Ya que una lista de sucesion Fibonacci es infinita.

Al terminar de testear todos los metodos, la ejecucion se termina y si los mismos se hace de forma correcta podremos ver en el apartado de JUnit, 
se formara una barra Verde, que quiere decir que todos los mismos fueron testeados con una respuesta que esperabamos. De lo contrario, si hubo un error, 
la barra se teñira de color rojo y abajo del mismo veremos los errores a corregir.

Despues de corregir el error, si es que hubo, podemos elegir el metodo a ejecutar para enforcarse en ello. Si simplemente queremos ejecutar para ver de 
nuevo el resultado podemos hacerlo de nuevo de a uno a todos a la vez.





