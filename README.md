# AED_Semana_07_Lab

Problema_7_1

Dada la implementación de la clase ArregloEdades en el paquete semana_07 adicione:
- Un método posPrimeraEdadAdolescente que retorne la posición de la primera
edad adolescente (edad en el rango de 12 a 20 años). En caso que no exista, retorne
el valor -1.
- Un método posUltimaEdadAdolescente que retorne la posición de la última edad
adolescente (edad en el rango de 12 a 20 años). En caso que no exista, retorne el
valor -1.
- Un método remplazarPrimeraEdadAdolescente que remplace la primera edad
adolescente por la última edad.
- Un método intercambiarEdadesAdolescentesExtremas que intercambie la primera
edad adolescente con la última edad adolescente.
- Un método eliminarPrimeraEdadAdolescente que elimine la primera edad
adolescente.

En la clase principal:
- A la pulsación del botón Remplazar primera edad adolescente, invoque al método
remplazarPrimeraEdadAdolescente y visualice un listado actualizado de edades.
En caso que el remplazo no sea posible, muestre un mensaje al respecto.
- A la pulsación del botón Intercambiar edades adolescentes extremas invoque al
método intercambiarEdadesAdolescentesExtremas y visualice un listado
actualizado de edades. En caso que el intercambio no sea posible, muestre un
mensaje al respecto.
- A la pulsación del botón Eliminar primera edad adolescente invoque al método
eliminarPrimeraEdadAdolescente y visualice un listado actualizado de edades. En
caso que la eliminación no sea posible, muestre un mensaje al respecto.

Problema_7_2

Dada la implementación de la clase ArregloNotas en el paquete semana_07 adicione:
- Un método notaMenor que retorne la menor de todas las notas.
- Un método posPrimeraNotaAprobatoria que retorne la posición de la primera nota
aprobatoria (nota en el rango de 13 a 20). En caso que no exista, retorne -1.
- Un método posUltimaNotaAprobatoria que retorne la posición de la última nota
aprobatoria (nota en el rango de 13 a 20). En caso que no exista, retorne -1.
- Un método remplazarUltimaNotaAprobatoria que remplace la última nota
aprobatoria por la nota menor.
- Un método eliminarPrimeraNotaAprobatoria que elimine la primera nota
aprobatoria.

En la clase principal:
- A la pulsación del botón Remplazar última nota aprobatoria, invoque al método
remplazarUltimaNotaAprobatoria y visualice un listado actualizado de notas. En
caso que el reemplazo no sea posible, muestre un mensaje al respecto.
- A la pulsación del botón Eliminar primera nota aprobatoria invoque al método
eliminarPrimeraNotaAprobatoria y visualice un listado actualizado de notas. En
caso que la eliminación no sea posible, muestre un mensaje al respecto.

Problema_7_3

Dada la implementación de la clase ArregloTemperaturas en el paquete semana_07
adicione:
- Un método temperaturaPromedio que retorne el promedio de todas las
temperaturas.
- Un método posPrimeraTemperaturaFebril que retorne la posición de la primera
temperatura febril (temperatura mayor que 37.2 oC). En caso que no exista, retorne el
valor -1.
- Un método buscarUltimaTemperaturaFebril que retorne la posición de la última
temperatura febril (temperatura mayor que 37.2 oC). En caso que no exista, retorne el
valor -1.
- Un método remplazarPrimeraTemperaturaFebril que remplace la primera
temperatura febril por la última temperatura febril.
- Un método remplazarUltimaTemperaturaFebril que remplace la última temperatura
febril por la temperatura promedio.
- Un método eliminarPrimeraTemperaturaFebril que elimine la primera temperatura
febril.

En la clase principal:
- A la pulsación del botón Remplazar primera temperatura febril, invoque al método
remplazarPrimeraTemperaturaFebril y visualice un listado actualizado de
temperaturas. En caso que el remplazo no sea posible, muestre un mensaje al
respecto.
- A la pulsación del botón Reemplazar última temperatura febril, invoque al método
remplazarUltimaTemperaturaFebril y visualice un listado actualizado de
temperaturas. En caso que el remplazo no sea posible, muestre un mensaje al
respecto.
- A la pulsación del botón Eliminar primera temperatura febril invoque al método
eliminarPrimeraTemperaturaFebril y visualice un listado actualizado de
temperaturas. En caso que la eliminación no sea posible, muestre un mensaje al
respecto.

Propuesto_7_1

Diseñe la clase ArregloCodigos en el paquete semana_07 con el atributo privado codigo
(int) de tipo arreglo lineal y el atributo privado indice (int).
Implemente además:
- Un Constructor sin parámetros que reserve 10 espacios en codigo e inicialice con 0
al indice.
- Un método tamaño que retorne la cantidad de datos ingresados hasta ese momento.
- Un método obtener que reciba una posición y retorne el código registrado en dicha
posición.
- Un método privado ampliarArreglo que extienda el arreglo en diez espacios más.
- Un método adicionar que reciba un código y lo registre en la posición que
corresponda. Verifique primero si el arreglo está lleno para invocar al método
ampliarArreglo.
- Un método intercambiarSegPen que cambie de lugar al segundo y penúltimo
código del arreglo.
- Un método eliminarPrimero que retire el primer código del arreglo.
- Un método posCodigo que retorne la posición del último código que se encuentre
en el rango de 1000 a 1111. En caso no exista retorne -1.
- Un método intercambiarCodigo que cambie de lugar al último código que se
encuentre en el rango de 1000 a 1111 con el tercer código del arreglo.
- Un método eliminarCodigo que retire del arreglo al último código que se encuentre
en el rango de 1000 a 1111.

En la clase principal:
- Declare y cree el objeto global ac de tipo ArregloCodigos.
- Implemente un método listar que visualice los códigos registrados hasta ese
momento.
- A la pulsación del botón Adicionar lea un código por GUI y adiciónelo al arreglo.
Invoque luego al método listar.
- A la pulsación del botón Intercambiar 1 invoque al método intercambiarSegPen e
invoque al método listar. En caso de que no sea posible muestre el mensaje
respectivo.
- A la pulsación del botón Eliminar 1 invoque al método eliminarPrimero. En caso
que el arreglo esté vacío muestre el mensaje respectivo.
- A la pulsación del botón Intercambiar 2 invoque al método intercambiarCodigo. En
caso de que no sea posible visualice un mensaje al respecto.
- A la pulsación del botón Eliminar 2 invoque al método eliminarCodigo. En caso de
que no sea posible visualice un mensaje al respecto.
