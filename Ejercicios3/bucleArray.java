public class bucleArray {

    public static void main(String[] args) {

        String[] names = {"Alfredo", "Germán", "Lucila", "Emilia", "Esteban"};

        for(int i = 0; i < names.length; i++) {
            if (i == names.length -1) {
                System.out.print(names[i] + ".");
            } else {
                System.out.print(names[i] + ", ");
            }
        }
    }
}