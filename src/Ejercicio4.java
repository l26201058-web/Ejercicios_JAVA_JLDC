import java.util.Scanner; // LIBRERIA PARA EL SCANNER
/*
 * INSTITUTO TECNOLÓGICO DE PACHUCA
 * FUNDAMENTOS DE PROGRAMACIÓN
 * EJERCICIO: SENTENCIA IF - CAJERO CON COMISIÓN
 * JOSÉ LUIS DÍAZ CERÓN
 * 25-09-2026
 */
public class Ejercicio4 { // INICIO CLASE
    public static void main(String[] args) {
        final double COMISION = 10.0; // CONSTANTE DE COMISION BANCARIA
        final double LIMITE_RETIRO = 5000.0; // CONSTANTE LIMITE DE RETIRO
        double saldoDisponible; // DECLARACION DE VARIABLE SALDO DISPONIBLE
        double cantidadRetirar; // DECLARACION DE VARIABLE CANTIDAD RETIRAR
        double saldoFinal; // DECLARACION DE VARIABLE SALDO FINAL
        Scanner scanner = new Scanner(System.in); // SCANNER PARA OBTENER DATOS
        System.out.print("Ingrese el saldo disponible: "); // SOLICITAR SALDO DISPONIBLE
        saldoDisponible = scanner.nextDouble(); // OBTENER SALDO DISPONIBLE
        System.out.print("Ingrese la cantidad que desea retirar: "); // SOLICITAR CANTIDAD RETIRO
        cantidadRetirar = scanner.nextDouble(); // OBTENER CANTIDAD RETIRO
        if (cantidadRetirar <= 0) { // INICIO IF; SI CANTIDAD RETIRO ES <= 0 ENTONCES....
            System.out.println("Error: La cantidad a retirar debe ser mayor a cero."); // MENSAJE SI SE CUMPLE LA CONDICION
        } // FIN IF
        else if (cantidadRetirar > LIMITE_RETIRO) { // INICIO ELSE-IF; SI NO SI RETIRO ES MAYOR AL LIMITE ENTONCES....
            System.out.println("Error: La cantidad supera el límite permitido de $" + LIMITE_RETIRO); // MENSAJE SI SE CUMPLE LA CONDICION
        } // FIN ELSE-IF
        else if ((cantidadRetirar + COMISION) > saldoDisponible) { // INICIO ELSE-IF; SI NO SI RETIRO MAS COMISION SUPERA SALDO ENTONCES....
            System.out.println("Error: Saldo insuficiente para cubrir el retiro y la comisión de $" + COMISION); // MENSAJE SI SE CUMPLE LA CONDICION
        } // FIN ELSE-IF
        else { // INICIO ELSE
            saldoFinal = saldoDisponible - cantidadRetirar - COMISION; // OPERACION DEL SALDO FINAL
            System.out.println("\n  Retiro Autorizado "); // IMPRIMIR ENCABEZADO
            System.out.println("Monto retirado: $" + cantidadRetirar); // MOSTRAR MONTO RETIRADO
            System.out.println("Comisión cobrada: $" + COMISION); // MOSTRAR COMISION COBRADA
            System.out.println("Saldo final restante: $" + saldoFinal); // MOSTRAR SALDO FINAL
        } // FIN ELSE
    }
} // FIN CLASE