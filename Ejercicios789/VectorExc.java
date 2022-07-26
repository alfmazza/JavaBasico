import java.util.Vector;

public class VectorExc {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        vector.remove(1);
        vector.remove(2);

        System.out.println(vector);
        /* System.out.println(vector.capacity()); 10
        *  La capacidad del vector es de 10. Al llegar a su capacidad
        *  máxima, automáticamente hace una copia de nuestro vector y
        *  al mismo tiempo crea otro con el tamaño duplicado. El problema
        *  de tener un vector de 1000 elementos -y en este caso, 1000
        *  Integers - es que en un momento vamos a usar memoria por 3000 elementos.
         */
    }
}
