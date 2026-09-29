import java.util.Scanner; // LIBRERIA PARA EL SCANNER
/*
 * INSTITUTO TECNOLÓGICO DE PACHUCA
 * FUNDAMENTOS DE PROGRAMACIÓN
 * EJERCICIO: SENTENCIA IF - SISTEMA DE CALIFICACIONES
 * JOSÉ LUIS DÍAZ CERÓN
 * 25-09-2026
 */
public class Ejercicio2 { // INICIO CLASE
    public static void main(String[] args) {
        final double MINIMO_APROBATORIO = 70.0; // CONSTANTE MINIMO APROBATORIO
        final double MINIMO_UNIDAD = 60.0; // CONSTANTE MINIMO POR UNIDAD
        double u1; // DECLARACION DE VARIABLE U1
        double u2; // DECLARACION DE VARIABLE U2
        double u3; // DECLARACION DE VARIABLE U3
        double promedio; // DECLARACION DE VARIABLE PROMEDIO
        Scanner scanner = new Scanner(System.in); // SCANNER PARA OBTENER DATOS
        System.out.print("Ingrese la calificación de la unidad 1: "); // SOLICITAR CALIFICACION U1
        u1 = scanner.nextDouble(); // OBTENER CALIFICACION U1
        System.out.print("Ingrese la calificación de la unidad 2: "); // SOLICITAR CALIFICACION U2
        u2 = scanner.nextDouble(); // OBTENER CALIFICACION U2
        System.out.print("Ingrese la calificación de la unidad 3: "); // SOLICITAR CALIFICACION U3
        u3 = scanner.nextDouble(); // OBTENER CALIFICACION U3
        promedio = (u1 + u2 + u3) / 3; // OPERACION DEL PROMEDIO
        System.out.println("\n--- Resultados ---"); // IMPRIMIR ENCABEZADO
        System.out.println("Calificación Unidad 1: " + u1); // MOSTRAR UNIDAD 1
        System.out.println("Calificación Unidad 2: " + u2); // MOSTRAR UNIDAD 2
        System.out.println("Calificación Unidad 3: " + u3); // MOSTRAR UNIDAD 3
        System.out.println("Promedio: " + promedio); // MOSTRAR PROMEDIO
        if (promedio >= MINIMO_APROBATORIO) { // INICIO IF; SI PROMEDIO ES >= A 70 ENTONCES....
            System.out.println("Estatus final: APROBADO"); // MENSAJE SI SE CUMPLE LA CONDICION
        } // FIN IF
        else { // INICIO ELSE
            System.out.println("Estatus final: REPROBADO"); // MENSAJE SI NO SE CUMPLE LA CONDICION
        } // FIN ELSE
        if (u1 < MINIMO_UNIDAD) { // INICIO IF; SI UNIDAD 1 ES < A 60 ENTONCES....
            System.out.println("Atención: Debe presentar recuperación de la Unidad 1."); // MENSAJE DE RECUPERACION
        } // FIN IF
        if (u2 < MINIMO_UNIDAD) { // INICIO IF; SI UNIDAD 2 ES < A 60 ENTONCES....
            System.out.println("Atención: Debe presentar recuperación de la Unidad 2."); // MENSAJE DE RECUPERACION
        } // FIN IF
        if (u3 < MINIMO_UNIDAD) { // INICIO IF; SI UNIDAD 3 ES < A 60 ENTONCES....
            System.out.println("Atención: Debe presentar recuperación de la Unidad 3."); // MENSAJE DE RECUPERACION
        } // FIN IF
    }
} // FIN CLASE