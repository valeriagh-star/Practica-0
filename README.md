<h2 style="border-bottom: 2px solid #60549a; padding-bottom: 8px; margin-top: 5px;">
Práctica 0
</h2>

<h2 style="color: #35d5e3; border-bottom: 2px solid #60549a; padding-bottom: 8px; margin-top: 5px;">
  Paradigmas de programación y flujo básico con Git
</h2>

<div style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif; font-size: 14px; line-height: 1.6; text-align: justify;">

<div style="background-color: rgba(13, 207, 228, 0.05); border-left: 4px solid #0dcfe4; padding: 12px 16px; margin: 15px 0; border-radius: 0 8px 8px 0;">
  <span style="font-weight: 700; color: #0dcfe4; font-size: 15px;"> Integrantes del Equipo:</span>
  <ul style="margin: 8px 0 0 0; padding-left: 20px;">
    <li>García Herrera Valeria</li>
    <li>Grajeda Palacios Dulce Abril</li>
    <li>Pérez Megchun Pablo de Jesús</li>
  </ul>
</div>

<div style="background-color: rgba(255, 255, 255, 0.03); border: 1px solid rgba(128, 128, 128, 0.2); padding: 14px 18px; border-radius: 8px; margin: 15px 0;">
  <span style="font-weight: 700; color: #502ff9; font-size: 15px;"> Breve descripción de la práctica:</span>
  <p style="margin-top: 8px; margin-bottom: 8px;">
    En esta práctica se desarrolló un programa en Java que permite capturar el nombre y tres calificaciones de un estudiante. El programa calcula su promedio y, con base en este resultado, determina su estado académico.
  </p>
  <p style="margin: 0;">
    El estudiante será <strong>APROBADO</strong> si obtiene un promedio mayor o igual a <code>6.0</code>; de lo contrario, será <strong>REPROBADO</strong>. Finalmente, el programa despliega el resumen con el nombre, promedio final y estado.
  </p>
</div>

<h3 style="color: #9a4bee; margin-top: 25px; border-bottom: 2px solid #60549a; padding-bottom: 5px;">
  Respuestas de Reflexión
</h3>

#### **1. ¿Qué significa programar de forma estructurada?**
**Programar de forma estructurada** significa organizar el flujo de un programa de manera clara y ordenada utilizando únicamente **estructuras de control** explícitas y evitando saltos arbitrarios en la ejecución. Su propósito principal es lograr un código más fácil de leer, probar, modificar y mantener.

Además, un programa estructurado divide el problema en **funciones** con responsabilidades concretas, lo que evita códigos excesivamente largos y facilita el razonamiento sobre partes pequeñas del sistema.

<hr style="border: none; border-top: 2px solid #60549a; margin: 20px 0;">

#### **2. ¿Cuáles son las tres estructuras fundamentales de control?**
La **programación estructurada** organiza el flujo de un programa mediante tres estructuras principales:

- **Secuencia:** Instrucciones ejecutadas una después de otra.
- **Selección:** Elegir entre diferentes caminos utilizando condiciones (por ejemplo `if` o `switch`).
- **Iteración:** Repetición de un bloque de código mediante bucles (por ejemplo `for`, `while` o `do-while`).

<hr style="border: none; border-top: 2px solid #60549a; margin: 20px 0;">

#### **3. ¿Qué ventaja tuvo separar el programa en funciones?**
Separar el programa en funciones aportó ventajas clave en su estructura y mantenimiento:

1. **Reutilización de código:** En lugar de escribir la lógica de validación de calificaciones tres veces en el método `main`, se creó la función `leerCalificacion`. Esto permitió invocarla para `cal1`, `cal2` y `cal3` pasando solo el mensaje correspondiente sin duplicar código.

2. **Responsabilidad única y modularidad:** Cada función realiza exactamente una tarea concreta:

  - `leerNombre`: Valida que la entrada sea texto válido.
  - `leerCalificacion`: Garantiza que el número ingresado esté entre $0$ y $10$.
  - `calcularPromedio`: Ejecuta únicamente el cálculo matemático.
  - `determinarEstado`: Evalúa la condición de aprobación.
  - `mostrarResultado`: Maneja el formato de salida.

3. **Mayor legibilidad en el `main`:** El código del método `main` queda limpio y fácil de entender, como si fuera una lista simple de pasos a seguir.

<hr style="border: none; border-top: 2px solid #60549a; margin: 20px 0;">

#### **4. ¿Qué función tendría que modificarse si la calificación mínima aprobatoria cambiara?**

<hr style="border: none; border-top: 2px solid #60549a; margin: 20px 0;">

#### **5. ¿Qué diferencia conceptual observa entre una función y un método?**

<hr style="border: none; border-top: 2px solid #60549a; margin: 20px 0;">

#### **6. ¿Qué representa un commit en Git?**

<hr style="border: none; border-top: 2px solid #60549a; margin: 20px 0;">

#### **7. ¿Por qué es preferible realizar varios commits pequeños en lugar de un solo commit al final?**