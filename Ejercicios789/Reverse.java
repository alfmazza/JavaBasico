public class Reverse {
    static String resultado = "";

    public static void main(String[] args) {
        reverse("Hola, soy una string que va a ser invertida :(");
        System.out.println("El resultado del String es: " + resultado);
    }

    public static String reverse (String texto) {
        for (int i = texto.length() -1; i >= 0; i--) {
            resultado = resultado + texto.charAt(i);
        }
        return resultado;
    }
}
