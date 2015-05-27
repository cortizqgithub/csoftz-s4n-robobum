# csoftz-s4n-robobum

V1.0.0.10-May.27/2015

#RoboBum!
NOTE: Original instructions are in Spanish.

El Ejercito Nacional de Colombia ha desarrollado un programa para la
detección de minas antipersona. Dentro del programa, usted ha sido
elegido para desarrollar la aplicación de software que controlará el
robot que estará encargado de su detección.
El robot cuenta con mútliples tipos de sensores los cuales pueden
identificar múltiples tipos de amenazas, no sólo bombas antipersona.

La posición del robot está representada por la combinación de
coordenadas X y Y y una letra que corresponde a uno de los puntos
cardinales. Por simplificación, el terreno de Marte puede ser visto
como una grilla. Por ejemplo, (0,0,N) corresponde a la posición de un
robot en la esquina inferior izquierda de la grilla estando el
explorando apuntando al norte.

Con el propósito de controlar el robot robótico, el operador del
robot envía cadenas de caracteres sencillas. Las letras posibles son
‘I’, ‘D’ y ‘A’.

● ‘I’ corresponde a girar 90 grados a la Izquierda sin moverse del
punto en la grilla en la que se encuentra,

● ‘D’ corresponde a girar 90 grados a la Derecha sin moverse del
punto en la grilla en la que se encuentra

● ‘A’ corresponde a realizar un movimiento hacia adelante
manteniendo la misma dirección en la que actualmente se
encuentra.

Asuma que el cuadro que queda al norte del punto (X,Y) es (X,Y+1).
Datos de entrada: La primera línea de datos de entrada es la
coordenada superior derecha máxima posible del terreno de Marte, la
coordenada inferior izquierda se asume que es 0,0.

El robot tiene dos líneas de entrada de datos. La primera línea
corresponde la posición actual del robot y la segunda línea es una
serie de instrucciones que le indican al robot como debe explorar el
terreno.

La posición está compuesta por dos enteros y una letra separados por
espacios, correspondientes a la coordenada X y Y y la orientación del
robot.

Las amenazas se encuentran en otro archivo de texto plano el cual
consta de una línea por amenaza. El tipo de amenaza se define en
términos de una coordenada (X, Y) y el caracter asterísco (*) que
representa una bomba antipersona.

Datos de salida: La salida en consola por cada robot debe ser su
posición final y su orientación.

#Ejemplo

Entrada de ejemplo movimientos:

5 5
1 2 N
IAIAIAIAA
3 3 E
AADAADADDA

Entrada de ejemplo amenazas:
(1,2)*
(2,1)*
(5,5)*
(3,3)*
(2,4)%

Salida en consola esperada:
1 3 N
Amenazas detectadas: (1,2)
5 1 E

Amenazas detectadas: (3,3)
