PASOS PARA CREAR API DE ADMINISTRACION DE USUSARIOS.

1. Programas a descargar e instalar: 
   
   *IntelliJ IDEA
   *MySQL WorkBench
   *WampServer

2. una vez descargados e instalados en la PC procedemos a crear nuestra API
  
   2.1: Nos dirigimos a la pagina https://start.spring.io/ que donde crearemos nuestro proyecto con Spring boot,
        y agregamos las siguientes dependencias en el enlace add dependency:
         
           *MySQL connector
           *JPA
           *Hirbernate
           *Spring web
           *Thaymleaft
         
        En project escogemos MAVEN, en lenguaje JAVA y terminamos de diligenciar los datos del proyecto (METADATA) y 
        decargamos el proyecto que nos dio Spring

   2.2: Una vez decargado los descomprimimos y los abrimos con el IDE IntelliJ IDEA y esperamos a que nos cargue el proyecto

3. Creamos la base de datos en MySQL, hacemos una tabla con nombre usuarios con los atributos (nombre, edad, correo) y procedemos a sincronizarla 
   en MySQL WorkBench

4. Volvemos a IDE nos ubicamos en la carpeta src del proyecto y buscamos resourcec/application.properties para proceder a conectarnos a la base de datos.

5.una vez conectados a la DB nos ubicamos en la carpeta com.nombreDelProyecto (com.example.CRUDUsuarios) y creamos los siguietes package con clases e interfaces:

       *nombre package: Controller:
                           *nombre clase: ControllerUsuarios : controlamos todas nuestras peticiones HTTP hacia el servidor

       *nombre package: Entity:
                           *nombre clase: Uusarios: se crean las variables de la tabla que tenemos en nuestra base de datos con sus atributos

	 *nombre package: Repository:
                           *nombre interface: RepositoryUsuarios: accedemos a las consultas para la base de datos

       *nombre package: Service:
                           *nombre clase: ServiceUsuariosIMPL : estan las funciones de logica de negocio
                           *nombre interface: ServiceUsuarios : accedemos a ellas a traves de servicios para usuarlas en el controlador

6.para crear las vistas nos dirigimos a la carpeta resources/templates y creamos los HTML para generar las vistas de nuestros endpoints.

7.ya para desplegar nos ublicamos en SpringCRUDUsuariosApliccation para correr la aplicacion

      