import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        boolean continuar = true;

        System.out.println("=== Registro de Productos ===");

        while (continuar) {
            // Solicitar datos del producto
            System.out.print("Ingrese el ID del producto: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la marca del producto: ");
            String marca = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble(); 

            productos.add(new Producto(id, nombre, marca, precio));

            System.out.print("¿Desea registrar otro producto? (s/n): ");
            char respuesta = scanner.next().charAt(0);
            continuar = (respuesta == 's' || respuesta == 'S');
        }
           // Mostrar productos registrados
        System.out.println("\n=== Productos Registrados ===");
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();

    }
}
