import java.io.*;
import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        System.out.println("Fichero de origen: ");
        String fileIn = insert.nextLine();
        System.out.println("Fichero de destino: ");
        String fileOut = insert.nextLine();
        inOut(fileIn, fileOut);

    }

    public static void inOut(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
