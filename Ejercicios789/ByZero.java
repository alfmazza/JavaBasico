
public class ByZero {
    public static void main(String[] args) {

        try {
            DividePorCero(10);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse!");
        } finally {
            System.out.println("Demo de código");
        }

    }

        public static void DividePorCero (int num) throws ArithmeticException {
          num = num / 0;
          System.out.println(num);
        }

    }
