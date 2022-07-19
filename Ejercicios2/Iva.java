import java.util.Scanner;

public class Iva {

    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        System.out.println("Ingrese el precio: ");
        double precio = insert.nextDouble();

        calcularIva(precio);

    }


    public static void calcularIva(double precio) {
        double resultado = precio * 1.21;
        System.out.println("El precio final es: " + resultado);
    }
}