import java.util.Scanner; // LIBRERIA PARA EL SCANNER
/*
 * INSTITUTO TECNOLÓGICO DE PACHUCA
 * FUNDAMENTOS DE PROGRAMACIÓN
 * EJERCICIO: SENTENCIA IF - CAJERO AUTOMÁTICO
 * JOSÉ LUIS DÍAZ CERÓN
 * 25-09-2026
 */
public class Ejercicio1 { // INICIO CLASE
    public static void main(String[] args) {
        final double LIMITE_RETIRO = 5000.0; // CONSTANTE DEL LIMITE DE RETIRO
        double saldo; // DECLARACION DE VARIABLE SALDO
        double retiro; // DECLARACION DE VARIABLE RETIRO
        double nuevoSaldo; // DECLARACION DE VARIABLE NUEVO SALDO
        Scanner scanner = new Scanner(System.in); // SCANNER PARA OBTENER DATOS
        System.out.print("Ingrese el saldo disponible: "); // SOLICITAR SALDO DISPONIBLE
        saldo = scanner.nextDouble(); // OBTENER SALDO DISPONIBLE
        System.out.print("Ingrese la cantidad a retirar: "); // SOLICITAR CANTIDAD A RETIRAR
        retiro = scanner.nextDouble(); // OBTENER CANTIDAD A RETIRAR
        if (retiro <= 0) { //  INICIO IF; SI EL RETIRO ES <= 0 ENTONCES....
            System.out.println("Error: La cantidad a retirar debe ser mayor a cero."); // MENSAJE SI SE CUMPLE LA CONDICION
        } // FIN IF
        else if (retiro > LIMITE_RETIRO) { // INICIO ELSE-IF; SI NO SI EL RETIRO ES MAYOR AL LIMITE ENTONCES...
            System.out.println("Error: La cantidad excede el límite de retiro de $" + LIMITE_RETIRO); // MENSAJE SI SE CUMPLE LA CONDICION
        } // FIN ELSE-IF
        else if (retiro > saldo) { // INICIO ELSE-IF; SI NO SI EL RETIRO ES MAYOR AL SALDO ENTONCES....
            System.out.println("Error: Saldo insuficiente para realizar la operación."); // MENSAJE SI SE CUMPLE LA CONDICION
        } // FIN ELSE-IF
        else { // INICIO ELSE
            nuevoSaldo = saldo - retiro; // OPERACION DEL NUEVO SALDO
            System.out.println("\n Retiro Autorizado "); // IMPRIMIR ENCABEZADO
            System.out.println("Cantidad retirada: $" + retiro); // MOSTRAR CANTIDAD RETIRADA
            System.out.println("Nuevo saldo: $" + nuevoSaldo); // MOSTRAR NUEVO SALDO
            if (nuevoSaldo < 500) { // INICIO IF; SI EL NUEVO SALDO ES < A 500 ENTONCES....
                System.out.println("ADVERTENCIA: Su saldo restante es menor a $500 pesos."); // MENSAJE DE ADVERTENCIA
            } // FIN IF
        } // FIN ELSE
    }
} // FIN CLASE