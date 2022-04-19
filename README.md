## MyPetApp

**Actividad de Aprendizaje 2ª Evaluación**

**Asignatura: ENTORNOS DE DESARROLLO**

**Ciclo Superior Desarrollo Aplicaciones Multiplataforma**

**-San Valero-**

**OBJETIVOS:**

Mediante el desarrollo de la actividad se pretende profundizar en la *integración continua*  y manejo de los repositorios en GITHUB,
así como el manejo del flujo de trabajo **GIT FLOW**. Asi mismo también se  pretende adquirir los conocimientos para el manejo
de **JENKINS y SONARQUBE** para la integración continua.

Para ello se solcita la creación de una pequeño proyecto con los siguientes objetivos:

+ Crear 3 Clases con 5 atributos cada una, mínimo String, Float e int.
+ Crear el repositorio en Git Hub.
+ Crear una rama para cada función:
  * Creación de Clases
  * Crear objetos
  * Listar objetos
+ Un **Job en Jenkins** para obtener el código del proyecto del repositorio y que se compile y empaquete el proyecto
+ Ejecutar **Jenkins** junto con **SonarQube** para comprobar el código
+ Ejecutar **VisiualVM** para comprobar el rendimiento de la aplicación
+ Configuración de **Maven** para análisis del proyecto
+ Adición de configuración para **test JUnit**
+ Rama **release** en git flow

Desarrollo:

Se ha creado una sencilla aplicación de consola para la gestión de las visitas en un clínica veterinaría.
Desde ella, en la recepción de puede ir añadiendo los clientes que reciben, con o sin mascota.
También se podra generar una receta o la factura a aplicar.

### GIT:
Tras la creación de un nuevo repositorio en **github** , se ha gestionado el mismo por medio de
la creación y corpatición de ramas con el uso de **git-flow** para llevar el control sobre diferentes
etapas de creación.
Se han crreado durante el proyecto las siguientes ramas:
+ **Main** : rama principal
+ **develoop**: rama de desarrollo.
+ **feature/CrearObjetos**: rama para la creación de la función de crear objetos desde las clases
+ **feature/ListarObjetos**: rama para la creación de la función de listado de objetos.
+ **release** : Rama para el lanzamiento de la aplicación.

### GITHUB PAGES
Para finalizar el proyecto se creará una página en **git-pages**
+ Jsenen.github.io/MyPetApp/


### Clases:
+ **Clientes** -> Para la creación de los Clientes. Desde esta se puede pasar a la clase Mascota para añadirla al cliente
+ **Mascotas** -> Para la creación de Mascotas
+ **Recetas** -> Para la creación de Recetas
+ **Facturas** -> Para la creación de Facturas
+ **Opciones** -> Clase donde se encuentra el menú principal de opciones
+ **MyPetApp** -> Ejecutor principal de la aplicación, desde donde se generan las opciones

### Métodos:
+ Todas las clases disponen de los métodos Getter and Setters correspondientes para la extraciión y edición de datos. Así como del correspondiente método toString() para generación de listados.

### Test:
Dentro del directorio **src** encontramos la carpeta **test** con una clase de cada tipo y los correspondientes test JUnit.

### MAVEN:
Se ha configurado Maven con los plugin y dependencias necesariós para gestionar el ciclo de vida del proyecto.

### JENKINS:
Se ha configurado Jenkins desde una máquina virtual Docker para automatizar los procesos de validación, compilado, test y empaquetado del proyecto.

### SONAQUBE:
Se ha configurado SonarQube desde una máquina virtual Docker para automatizar desde Jenkins y poder comprobar la calidad del proyecto

### VisualVM:
Se ha instalado VisualVM, así como su correspondiente plugin del IDE IntelliJ para comprobar los recursos que usa la aplicación Java.


    