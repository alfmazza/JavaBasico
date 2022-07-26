import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinked {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Elemento 1");
        list.add("Elemento 2");
        list.add("Elemento 3");
        list.add("Elemento 4");

        LinkedList<String> list2 = new LinkedList<>(list);
        for (String s : list) {
            System.out.println("Valores de la ArrayList: " + s);
            }
        for (String e : list2) {
            System.out.println("Valores de la LinkedList: " + e);
             }
        }
    }
