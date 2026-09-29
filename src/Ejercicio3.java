import java.util.Scanner; // LIBRERIA PARA EL SCANNER
/*
 * INSTITUTO TECNOLÓGICO DE PACHUCA
 * FUNDAMENTOS DE PROGRAMACIÓN
 * EJERCICIO: SENTENCIA IF - TIENDA CON DESCUENTOS
 * JOSÉ LUIS DÍAZ CERÓN
 * 25-09-2026
 */
public class Ejercicio3 { // INICIO CLASE
    public static void main(String[] args) {
        final double DESC_NORMAL = 0.0; // CONSTANTE DESCUENTO NORMAL
        final double DESC_FRECUENTE = 0.10; // CONSTANTE DESCUENTO FRECUENTE
        final double DESC_VIP = 0.20; // CONSTANTE DESCUENTO VIP
        final double DESC_ADICIONAL = 0.05; // CONSTANTE DESCUENTO ADICIONAL
        String cliente; // DECLARACION DE VARIABLE CLIENTE
        double montoOriginal; // DECLARACION DE VARIABLE MONTO ORIGINAL
        int tipoCliente; // DECLARACION DE VARIABLE TIPO CLIENTE
        double tasaTipoCliente; // DECLARACION DE VARIABLE TASA TIPO CLIENTE
        double descuentoPorTipo; // DECLARACION DE VARIABLE DESCUENTO POR TIPO
        double descuentoAdicional; // DECLARACION DE VARIABLE DESCUENTO ADICIONAL
        double totalDescuentos; // DECLARACION DE VARIABLE TOTAL DESCUENTOS
        double totalPagar; // DECLARACION DE VARIABLE TOTAL A PAGAR
        Scanner scanner = new Scanner(System.in); // SCANNER PARA OBTENER DATOS

        tasaTipoCliente = 0.0; // INICIALIZACION DE TASA DE DESCUENTO
        descuentoAdicional = 0.0; // INICIALIZACION DE DESCUENTO ADICIONAL

        System.out.print("Ingrese el nombre del cliente: "); // SOLICITAR NOMBRE CLIENTE
        cliente = scanner.nextLine(); // OBTENER NOMBRE CLIENTE
        System.out.print("Ingrese el monto de la compra: "); // SOLICITAR MONTO
        montoOriginal = scanner.nextDouble(); // OBTENER MONTO DE COMPRA
        System.out.print("Ingrese el tipo de cliente (1: Normal, 2: Frecuente, 3: VIP): "); // SOLICITAR TIPO DE CLIENTE
        tipoCliente = scanner.nextInt(); // OBTENER TIPO DE CLIENTE
        if (tipoCliente == 1) { // INICIO IF; SI TIPO ES IGUAL A 1 ENTONCES....
            tasaTipoCliente = DESC_NORMAL; // ASIGNAR DESCUENTO CLIENTE NORMAL
        } // FIN IF
        else if (tipoCliente == 2) { // INICIO ELSE-IF; SI NO SI TIPO ES IGUAL A 2 ENTONCES....
            tasaTipoCliente = DESC_FRECUENTE; // ASIGNAR DESCUENTO CLIENTE FRECUENTE
        } // FIN ELSE-IF
        else if (tipoCliente == 3) { // INICIO ELSE-IF; SI NO SI TIPO ES IGUAL A 3 ENTONCES....
            tasaTipoCliente = DESC_VIP; // ASIGNAR DESCUENTO CLIENTE VIP
        } // FIN ELSE-IF
        else { // INICIO ELSE
            System.out.println("Tipo de cliente no válido. Se aplicará 0% de descuento por tipo."); // MENSAJE DE ERROR DE TIPO
        } // FIN ELSE

        descuentoPorTipo = montoOriginal * tasaTipoCliente; // OPERACION DE DESCUENTO POR TIPO

        if (montoOriginal > 2000) { // INICIO IF; SI MONTO ES > A 2000 ENTONCES....
            descuentoAdicional = montoOriginal * DESC_ADICIONAL; // CALCULAR DESCUENTO ADICIONAL
        } // FIN IF

        totalDescuentos = descuentoPorTipo + descuentoAdicional; // OPERACION DE TOTAL DESCUENTOS

        totalPagar = montoOriginal - totalDescuentos; // OPERACION DEL TOTAL A PAGAR
        System.out.println("\n Resumen de Compra "); // IMPRIMIR ENCABEZADO
        System.out.println("Cliente: " + cliente); // MOSTRAR CLIENTE
        System.out.println("Monto original: $" + montoOriginal); // MOSTRAR MONTO ORIGINAL
        System.out.println("Descuento por tipo de cliente: $" + descuentoPorTipo); // MOSTRAR DESCUENTO CLIENTE
        System.out.println("Descuento adicional (> $2000): $" + descuentoAdicional); // MOSTRAR DESCUENTO ADICIONAL
        System.out.println("Total de descuentos: $" + totalDescuentos); // MOSTRAR TOTAL DESCUENTOS
        System.out.println("Total a pagar: $" + totalPagar); // MOSTRAR TOTAL A PAGAR
    }
} // FIN CLASE