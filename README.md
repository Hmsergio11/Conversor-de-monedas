# Conversor de Monedas
Descripción
Este es un programa de consola en Java que permite convertir cantidades entre diferentes divisas utilizando la API de ExchangeRate-API. El programa ofrece un menú interactivo donde el usuario puede seleccionar las monedas de origen y destino, ingresar la cantidad a convertir y ver el historial de conversiones realizadas.

## Características
- Conversión entre múltiples divisas: Soporta una amplia gama de monedas internacionales.
- Opción de conversión personalizada: Permite elegir cualquier par de divisas disponibles para la conversión.
- Historial de conversiones: Guarda y muestra las conversiones realizadas durante la sesión, junto con la fecha y hora.
- Interfaz sencilla: Menú intuitivo para facilitar la interacción con el usuario.

## Interacción con el programa:

- Se mostrará un menú con las opciones disponibles.
- Ingresa el número correspondiente a la opción que deseas realizar y presiona Enter.
- Sigue las instrucciones en pantalla para completar la conversión.
## Menú de opciones

```
****************************************************
Sea bienvenido/a al conversor de monedas

1 - Dólar =>> Peso argentino
2 - Peso argentino =>> Dólar
3 - Dólar =>> Real brasileño
4 - Real brasileño =>> Dólar
5 - Dólar =>> Peso colombiano
6 - Peso colombiano =>> Dólar
7 - Personalizado
8 - Historial
9 - Salir

Elija una opción válida:
****************************************************
```
## Ejemplo de uso
### Conversión personalizada:

Selecciona la opción 7 para realizar una conversión personalizada.

- Selecciona la divisa base: Se te presentará una lista de divisas disponibles. 
- Ingresa el número correspondiente a la divisa de origen.
- Selecciona la divisa destino: Ingresa el número correspondiente a la divisa a la que deseas convertir.
- Ingresa la cantidad: Escribe la cantidad que deseas convertir y presiona Enter.
- Resultado: El programa mostrará el resultado de la conversión y lo almacenará en el historial.

### Ver historial:
Selecciona la opción 8 para ver todas las conversiones realizadas durante la sesión, junto con la fecha y hora.

## Manejo de errores
El programa maneja entradas inválidas y excepciones, mostrando mensajes adecuados al usuario y solicitando que ingrese datos correctos.
