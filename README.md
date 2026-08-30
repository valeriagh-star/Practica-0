# Práctica 0

## Paradigmas de programación y flujo básico con Git

> ### Integrantes del Equipo:
> * García Herrera Valeria
> * Grajeda Palacios Dulce Abril
> * Pérez Megchun Pablo de Jesús

---

> ### Breve descripción de la práctica:
> En esta práctica se desarrolló un programa en Java que permite capturar el nombre y tres calificaciones de un estudiante. El programa calcula su promedio y, con base en este resultado, determina su estado académico.
>
> El estudiante será **APROBADO** si obtiene un promedio mayor o igual a `6.0`; de lo contrario, será **REPROBADO**. Finalmente, el programa imprime en consola el resumen con el nombre, calificaciones, promedio final y estado de aprobación del estudiante.

---

## Respuestas de Reflexión:

### 1. ¿Qué significa programar de forma estructurada?
**Programar de forma estructurada** significa organizar el flujo de un programa de manera clara y ordenada utilizando únicamente **estructuras de control** explícitas y evitando saltos arbitrarios en la ejecución. Su propósito principal es lograr un código más fácil de leer, probar, modificar y mantener.

Además, un programa estructurado divide el problema en **funciones** con responsabilidades concretas, lo que evita códigos excesivamente largos y facilita el razonamiento sobre partes pequeñas del sistema.

---

### 2. ¿Cuáles son las tres estructuras fundamentales de control?
La **programación estructurada** organiza el flujo de un programa mediante tres estructuras principales:

- **Secuencia:** Instrucciones ejecutadas una después de otra.
- **Selección:** Elegir entre diferentes caminos utilizando **condiciones** (por ejemplo `if` o `switch`).
- **Iteración:** Repetición de un bloque de código mediante **bucles** (por ejemplo `for`, `while` o `do-while`).

---

### 3. ¿Qué ventaja tuvo separar el programa en funciones?
Separar el programa en funciones aportó ventajas clave en su estructura y mantenimiento:

1. **Reutilización de código:** En lugar de escribir la lógica de validación de calificaciones tres veces en el método `main`, se creó la función `leerCalificacion`. Esto permitió invocarla para `cal1`, `cal2` y `cal3` pasando solo el mensaje correspondiente sin duplicar código.

2. **Responsabilidad única y modularidad:** Cada función realiza exactamente una tarea concreta:
   - `leerNombre`: Valida que la entrada sea texto válido.
   - `leerCalificacion`: Garantiza que el número ingresado esté entre $0$ y $10$.
   - `calcularPromedio`: Ejecuta únicamente el cálculo matemático.
   - `determinarEstado`: Evalúa la condición de aprobación.
   - `mostrarResultado`: Maneja el formato de salida.

3. **Mayor legibilidad en el `main`:** El código del método `main` queda limpio y fácil de entender, como si fuera una lista simple de pasos a seguir.

---

### 4. ¿Qué función tendría que modificarse si la calificación mínima aprobatoria cambiara?
Tendría que modificarse la función `determinarEstado`.

Esta función contiene la estructura condicional `if (promedio >= 6.0)` que evalúa el resultado final. Si el criterio de aprobación cambia, solo es necesario ajustar el valor de comparación (`6.0`) dentro de esta función, manteniendo intactos el cálculo del promedio y la captura de datos.

---

### 5. ¿Qué diferencia conceptual observa entre una función y un método?
La diferencia principal radica en su **pertenencia a una clase u objeto**:

- **Función:** Es un bloque de código independiente que realiza una tarea específica sin depender de objetos o clases (característico de lenguajes estructurados como C).
- **Método:** Es una función declarada dentro de una **clase**, orientada a definir el comportamiento de dicha clase o de sus objetos. (Representa un comportamiento dentro de la Programación Orientada a Objetos.)

En Java, los bloques de código que realizan tareas y están definidos dentro de una clase se consideran **métodos**. Por ejemplo, en nustro código: `public static double calcularPromedio(...)` es un método. Aunque conceptualmente puede cumplir la función de una **función tradicional**, en Java se denomina método debido a que se encuentra dentro de una clase la cual llamamos `Calificaciones`.

---

### 6. ¿Qué representa un commit en Git?
Un **commit** representa una **captura del estado del proyecto** en un momento determinado. Funciona como un punto de guardado en el historial de versiones donde se registran los cambios realizados en los archivos junto con un mensaje descriptivo, el autor y la fecha, permitiendo revisar la evolución del código o regresar a versiones anteriores si es necesario.

---

### 7. ¿Por qué es preferible realizar varios commits pequeños en lugar de un solo commit al final?
Es preferible porque brinda **mayor control, claridad y trazabilidad** en el desarrollo:

1. **Facilidad para identificar y corregir errores:** Si algo falla, es sencillo aislar el cambio exacto que causó el problema y revertirlo sin perder todo el trabajo.

2. **Historial claro y ordenado:** Permite documentar el avance paso a paso con mensajes descriptivos, lo que facilita entender la evolución del código.

3. **Trabajo en equipo eficiente:** Simplifica la colaboración al integrar cambios pequeños gradualmente, lo que facilita resolver conflictos al fusionar ramas.

---