import java.util.Scanner;
public class Facturacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables para almacenar la información del cliente
        String nombreCliente;

        // Variables para almacenar la información de los productos
        String[] nombreProducto = new String[3];
        double[] valorUnitarioProducto = new double[3];
        int[] cantidadProducto = new int[3];

        // Variables para calcular los totales
        double[] valorTotalProducto = new double[3];
        double granTotal = 0.0;

        // Solicitar datos del cliente
        System.out.print("Nombre del cliente: ");
        nombreCliente = input.nextLine();

        // Iniciar el bucle para recopilar información de los productos
        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre Producto " + (i + 1) + ": ");
            nombreProducto[i] = input.nextLine();

            System.out.print("Valor Unitario Producto " + (i + 1) + ": ");
            valorUnitarioProducto[i] = input.nextDouble();

            System.out.print("Cantidad Producto " + (i + 1) + ": ");
            cantidadProducto[i] = input.nextInt();

            // Calcular el valor total para el producto actual
            valorTotalProducto[i] = valorUnitarioProducto[i] * cantidadProducto[i];

            // Agregar el valor total del producto al gran total
            granTotal += valorTotalProducto[i];

            // Limpiar el búfer del scanner
            input.nextLine();
        }

        // Cerrar el scanner
        input.close();

        // Imprimir la factura
        System.out.println("==============================================");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("==============================================");
        System.out.println("Nombre Producto\tValor Unitario\tCantidad\tValor Total");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println(nombreProducto[i] + "\t$" + valorUnitarioProducto[i] + "\t" + cantidadProducto[i] + "\t$" + valorTotalProducto[i]);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Gran Total: $" + granTotal);
    }
}