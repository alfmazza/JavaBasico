public class BiArray {
    public static void main(String[] args) {
        int[][] numeros = new int [2][2];
        numeros [0][0] = 5;
        numeros [0][1] = 2;
        numeros [1][0] = 7;
        numeros [1][1] = 3;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println("Posición" + "[" + i + "]" + "[" + j + "]" + ", valor: " + numeros[i][j]);
            }
        }
    }
}
