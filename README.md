# OLC1-Proyecto1-201901849

## Descripción General
Actualmente en algunos cursos de Ingeniería en Ciencias y Sistemas existe una población
bastante elevada que generalmente alcanza un promedio de 70 estudiantes por curso, debido a
esta problemática la detección de copias entre proyectos se ha convertido en una tarea compleja
que requiere de mucho tiempo y nuevas técnicas para agilizar el análisis de proyectos. Como
estudiante de Organización de Lenguajes y Compiladores 1 se le solicita crear una herramienta
que sirva de apoyo a tutores académicos en el análisis del código fuente de los diferentes
proyectos desarrollados por los estudiantes, esto buscando una agilización y eficiencia en el
proceso de búsqueda de copias.

## Descripción de la solución
Se pretende crear un plan piloto para la identificación de copias entre proyectos a través de
una aplicación capaz de generar reportes estadísticos sobre distintos aspectos de un
proyecto, para dicha aplicación se deberá crear un analizador de archivos Javascript capaz
de identificar repitencias entre proyectos y que a su vez genere reportes estadísticos
basados en un puntaje de repitencia de copia entre proyectos. Por cuestiones de tiempo el
plan piloto realizará la comparación únicamente entre 2 proyectos y entre archivos que
posean el mismo nombre y extensión.
La aplicación contará con su propio lenguaje de generación de reportes por lo que será
necesario crear dos analizadores, un primer analizador el cual servirá para identificar los
proyectos que se analizaran y reportes que se deben generar. Adicionalmente necesitará un
segundo analizador que identifique las posibles copias entre los proyectos.

Para hacer uso de la aplicación el tutor desarrollará un archivo de entrada en el cual indicará
la ruta de los proyectos a comparar, adicionalmente desarrollará en dicho archivo los
reportes que desea generar basándose en los porcentajes de copia que se obtengan en la
comparación de archivos, una vez desarrollado el archivo de entrada el tutor procederá a
ejecutar la aplicación y obtendrá resultados que le permitan agilizar el proceso de
identificación de copias. 

## Objetivos

### Objetivos Generales
Aplicar los conocimientos sobre la fase de análisis léxico y sintáctico de un compilador para
la construcción de una solución de software para la detección de copias entre proyectos. 

### Objetivos Específicos
* Aprender a generar analizadores léxicos y sintácticos utilizando las herramientas JFLEX y CUP.
* Que el estudiante comprenda los tokens, lexemas y patrones o expresión regular.
* Que el estudiante pueda generar reportes a partir del análisis de los archivos de los proyectos.

## Herramientas
* Lenguaje de programación: Java
* Herramientas de análisis léxico y sintáctico: JFlex/CUP
* Herramienta para generar graficas: JFreechart
