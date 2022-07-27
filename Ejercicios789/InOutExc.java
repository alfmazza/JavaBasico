import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InOutExc {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        System.out.println("Ingrese el fichero de origen: ");
        String fileIn = insert.nextLine();
        System.out.println("Ingrese fichero de destino: ");
        String fileOut = insert.nextLine();
        inOut(fileIn, fileOut);

        HashMap<String, String[]> mapa = new HashMap<>();
        String[] list = new String[] {fileIn};
        mapa.put(fileOut, list);

        for (Map.Entry<String, String[]> elemento : mapa.entrySet()) {
            System.out.println("El fichero [" + fileIn + "] se copió en el fichero de salida " + fileOut +
                    "\n y en el mapa como [" + elemento.getKey() + "], " + elemento.getValue() + "]");
        }
    }
    public static void inOut (String fileIn, String fileOut) {
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
