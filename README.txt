Descripción:
 - El presente proyecto sirve para ejemplificar el uso de maven profiles.
 - La receta es generar una carpeta con los valores de cada profile, e indicar en el pom.xml
   del proyecto la ruta de los archivos, declarar además los profiles existentes y tener uno 
   por default.

Instrucciones de uso:
 - Para compilar para ambiente de desarrollo (por default), solo basta ejecutar: mvn clean install
 - Para compilar para ambiente de producción, es necesario ejecutar: mvn clean install -P env-prod
 - Se pueden generar n profiles, cada uno con un nombre custom, los valores de las propiedades, pueden
   incluirse en el pom.xml o en los archivos alojados en src/main/resources/profiles.

