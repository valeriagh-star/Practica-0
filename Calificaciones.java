package capturarCalifs;
import java.util.Scanner;

public class Calificaciones {

    public static double calcularPromedio(double cal1, double cal2, double cal3) {
        return (cal1 + cal2 + cal3) / 3;
    }

    public static String determinarEstado(double promedio) {

        if (promedio >= 6.0) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }

    public static void mostrarResultado(String nombre, double promedio, String estado) {

        System.out.println("\n--- ESTADO ACADÉMICO ---");
        System.out.println("Nombre: " + nombre);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Estado: " + estado);
    }

    
    public static String leerNombre(Scanner scanner) {

        while (true) {

            System.out.print("Ingresa el nombre del estudiante: ");

            String nombre = scanner.nextLine().trim();

            if (!nombre.isEmpty() && nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {

                return nombre;

            } else {

                System.out.println("Opción inválida. El nombre solo debe contener letras.");
            }
        }
    }
    
    
    public static double leerCalificacion(Scanner scanner, String mensaje) {

        while (true) {

            System.out.print(mensaje);

            if (scanner.hasNextDouble()) {

                double calificacion = scanner.nextDouble();

                if (calificacion >= 0 && calificacion <= 10) {
                    return calificacion;
                }

                System.out.println("Opción inválida. La calificación debe estar entre 0 y 10.");

            } else {	

                System.out.println("Opción inválida. Debes ingresar solo números.");
                
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre = leerNombre(scanner);

        double cal1 = leerCalificacion(scanner, "Ingresa la primera calificación: ");

        double cal2 = leerCalificacion(scanner, "Ingresa la segunda calificación: ");

        double cal3 = leerCalificacion(scanner, "Ingresa la tercera calificación: ");

        double promedio = calcularPromedio(cal1, cal2, cal3);

        String estado = determinarEstado(promedio);

        mostrarResultado(nombre, promedio, estado);

        scanner.close();
    }
}