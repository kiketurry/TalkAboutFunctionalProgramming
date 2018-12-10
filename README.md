# TalkAboutFunctionalProgramming

Que es la programación funcional?
----------------------------------
Lo que utilizado la mayoría hasta ahora: variables, intrucciones o bucles, es lo que conocemos como programación imperativa
Ejemplos: C, JAVA, C#, procedural PASCAL o orientado a objetos JAVA.

Pero existen otros paradigmas, la porgramación logica y la funcional, cambian radicalmente el estilo de programa,
con otros procesos distintos, nos hará pensar de forma distinta.

Los lenguajes funcionales se inventaron a la par de los lenguajes imperativos, pero durante mucho tiempo,
se han considerado demasiado teoricos y abstractos. Ejemplos de lenguaje funcional puro Haskel.

Kotlin es un lenguaje orientado a objetos pero soporta construcciones funcionales, es un lenguaje hibrido.

Por qué debemos aprenderlo?
----------------------------
Afrontaremos los problemas de forma diferente, abstracciones más solidas, haremos un código más sencillo y preparado antes cambios.
Se ejecutará de forma paralela out of the box. Programas más robustos y con menos fallos.

Estado es cualquier dato que se pueda guardar y modificar posteriormente en memoria (ya sea persistente o volatil), Existen 2 tipos de estados:
Estado observable, tiene una consecuencia visible, variables públicas
Estado no observable dato en bbdd, no se puede saber desde el exterior si ha cambiado algo: variables privadas, indice de una tabla de base de datos.

Con kotlin y android es imposible hacer una app carente de estados, kotlin nos proporciona "val" para usar en vez de "var",
pero el framework de android esta enfocado a programación orientada a objetos, por lo que no es posible programar sin estado,
pero dentro de esto, hay que intentar que las variables que usemos tenga un alcance lo más acotado posible.

La programación funcional intentará que no tengas variables, sistemas de entrada salida ficheros bases de datos.
Evitar estados mutables nos ayuda a tener una mayor seguridad, ejecuciones concurrentes y mejor testeabilidad (no existen pre ni post condiciones a la prueba).
Concepto de clase inmutables -> Sin variables. Se ira empujando el uso de variables y estados al exterior y ya veremos quien lidia con los estados.

Recursividad
--------------
Recursión es nuestra amiga, arbol o sistema de ficheros estructuras plana y jerarquicas.


Funciones de orden superior
----------------------------
Las funciones tiene mucho que decir en la programación funcional, parametros de entrada y retorno.
Las funciones son un dato más, un funcion puede recibir funciones y retornar funciones -> Funciones de orden superior o también llamada lambda (anonimas)


Abstracciones
--------------
Functor
Aplicativo
Monada

Principios funcionales
1. Ausencia de estado mutables
2. Orientado a expresiones que sea declarativo, mucho más modular
3. las funciones no produzacan efectos colaterales
4. Evaluación perezosa, el momento en que se ejecuta una linea de codigo deja de ser importante
5. La recursión, la eterna odiada
6. Fuertemente tipado
7. Sistemas funcionales, monadas, patrones funcionales
8. Funciones de orden superior