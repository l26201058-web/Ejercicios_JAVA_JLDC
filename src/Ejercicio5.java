import java.util.Scanner; // LIBRERIA PARA EL SCANNER
/*
 * INSTITUTO TECNOLÓGICO DE PACHUCA
 * FUNDAMENTOS DE PROGRAMACIÓN
 * EJERCICIO: SENTENCIA IF - SISTEMA DE ESTACIONAMIENTO
 * JOSÉ LUIS DÍAZ CERÓN
 * 25-09-2026
 */
public class Ejercicio5 { // INICIO CLASE
    public static void main(String[] args) {
        final double TARIFA_MOTO = 10.0; // CONSTANTE TARIFA MOTOCICLETA
        final double TARIFA_AUTO = 20.0; // CONSTANTE TARIFA AUTOMOVIL
        final double TARIFA_CAMIONETA = 30.0; // CONSTANTE TARIFA CAMIONETA
        final double DESC_MAS_5_HORAS = 0.10; // CONSTANTE DESCUENTO MAS DE 5 HORAS
        final double DESC_MAS_10_HORAS = 0.20; // CONSTANTE DESCUENTO MAS DE 10 HORAS
        int tipoVehiculo; // DECLARACION DE VARIABLE TIPO VEHICULO
        int horas; // DECLARACION DE VARIABLE HORAS
        double tarifaPorHora; // DECLARACION DE VARIABLE TARIFA POR HORA
        String nombreVehiculo; // DECLARACION DE VARIABLE NOMBRE VEHICULO
        double subtotal; // DECLARACION DE VARIABLE SUBTOTAL
        double porcentajeDescuento; // DECLARACION DE VARIABLE PORCENTAJE DESCUENTO
        double montoDescuento; // DECLARACION DE VARIABLE MONTO DESCUENTO
        double totalPagar; // DECLARACION DE VARIABLE TOTAL A PAGAR
        Scanner scanner = new Scanner(System.in); // SCANNER PARA OBTENER DATOS

        tarifaPorHora = 0.0; // INICIALIZACION DE TARIFA POR HORA
        nombreVehiculo = ""; // INICIALIZACION DE NOMBRE VEHICULO
        porcentajeDescuento = 0.0; // INICIALIZACION DE PORCENTAJE DESCUENTO

        System.out.print("Ingrese el tipo de vehículo (1: Motocicleta, 2: Automóvil, 3: Camioneta): "); // SOLICITAR TIPO VEHICULO
        tipoVehiculo = scanner.nextInt(); // OBTENER TIPO VEHICULO
        System.out.print("Ingrese el número de horas estacionado: "); // SOLICITAR HORAS
        horas = scanner.nextInt(); // OBTENER HORAS
        if (horas <= 0) { // INICIO IF; SI HORAS ES <= 0 ENTONCES....
            System.out.println("Error: La cantidad de horas no es válida."); // MENSAJE SI HORAS NO VALIDAS
        } // FIN IF
        else if (tipoVehiculo < 1 || tipoVehiculo > 3) { // INICIO ELSE-IF; SI NO SI TIPO FUERA DEL RANGO ENTONCES....
            System.out.println("Error: Tipo de vehículo no válido."); // MENSAJE TIPO NO VALIDO
        } // FIN ELSE-IF
        else { // INICIO ELSE
            if (tipoVehiculo == 1) { // INICIO IF; SI TIPO ES IGUAL A 1 ENTONCES....
                tarifaPorHora = TARIFA_MOTO; // ASIGNAR TARIFA MOTO
                nombreVehiculo = "Motocicleta"; // ASIGNAR NOMBRE MOTO
            } // FIN IF
            else if (tipoVehiculo == 2) { // INICIO ELSE-IF; SI NO SI TIPO ES IGUAL A 2 ENTONCES....
                tarifaPorHora = TARIFA_AUTO; // ASIGNAR TARIFA AUTO
                nombreVehiculo = "Automóvil"; // ASIGNAR NOMBRE AUTO
            } // FIN ELSE-IF
            else if (tipoVehiculo == 3) { // INICIO ELSE-IF; SI NO SI TIPO ES IGUAL A 3 ENTONCES....
                tarifaPorHora = TARIFA_CAMIONETA; // ASIGNAR TARIFA CAMIONETA
                nombreVehiculo = "Camioneta"; // ASIGNAR NOMBRE CAMIONETA
            } // FIN ELSE-IF

            subtotal = horas * tarifaPorHora; // OPERACION DEL SUBTOTAL

            if (horas > 10) { // INICIO IF; SI HORAS ES > A 10 ENTONCES....
                porcentajeDescuento = DESC_MAS_10_HORAS; // ASIGNAR DESCUENTO 20%
            } // FIN IF
            else if (horas > 5) { // INICIO ELSE-IF; SI NO SI HORAS ES > A 5 ENTONCES....
                porcentajeDescuento = DESC_MAS_5_HORAS; // ASIGNAR DESCUENTO 10%
            } // FIN ELSE-IF

            montoDescuento = subtotal * porcentajeDescuento; // OPERACION DEL DESCUENTO
            totalPagar = subtotal - montoDescuento; // OPERACION DEL TOTAL A PAGAR

            System.out.println("\n Ticket de Estacionamiento "); // IMPRIMIR ENCABEZADO
            System.out.println("Tipo de vehículo: " + nombreVehiculo); // MOSTRAR TIPO VEHICULO
            System.out.println("Horas de permanencia: " + horas); // MOSTRAR HORAS
            System.out.println("Tarifa por hora: $" + tarifaPorHora); // MOSTRAR TARIFA
            System.out.println("Subtotal: $" + subtotal); // MOSTRAR SUBTOTAL
            System.out.println("Descuento aplicado: $" + montoDescuento); // MOSTRAR DESCUENTO
            System.out.println("Total a pagar: $" + totalPagar); // MOSTRAR TOTAL A PAGAR
        } // FIN ELSE
    }
} // FIN CLASE