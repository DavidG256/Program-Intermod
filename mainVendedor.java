import java.util.Scanner;


class mainVendedor {
    // Autor: David García Antón
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese ID del Vendedor: ");
            String id = scanner.next();

            System.out.print("Es jefe? (true/false): ");
            boolean esJefe = scanner.nextBoolean();

            System.out.print("Ingrese Salario: ");
            String salario = scanner.next();

            System.out.print("Ingrese Jornada Laboral: ");
            String jornada = scanner.next();

            Vendedor vendedor = new Vendedor(id, esJefe, salario, jornada);
            vendedor.mostrarVendedor();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}