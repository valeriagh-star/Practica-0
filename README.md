# Práctica 0

---

## Paradigmas de programación y flujo básico con Git

---

> ### Integrantes del Equipo:
> * García Herrera Valeria
> * Grajeda Palacios Dulce Abril
> * Pérez Megchun Pablo de Jesús

---

> ### Breve descripción de la práctica:
> En esta práctica se desarrolló un programa en Java que permite capturar el nombre y tres calificaciones de un estudiante. El programa calcula su promedio y, con base en este resultado, determina su estado académico.
>
> El estudiante será **APROBADO** si obtiene un promedio mayor o igual a `6.0`; de lo contrario, será **REPROBADO**. Finalmente, el programa despliega el resumen con el nombre, promedio final y estado.

---

## Respuestas de Reflexión:

---

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