import java.util.ArrayList;

public class ArrayInt {
    public static void main(String[] args) {

            ArrayList <Integer> nums = new ArrayList<>();
            for(int i = 0; i < 10; i++) {
                nums.add(i + 1);
            }
            for(int i = 0; i < nums.size(); i++) {
                if(nums.get(i) % 2 == 0) {
                    nums.remove(i);
                }
            }
            for (Integer e : nums) {
                System.out.println("Valor impar: " + e);
            }
        }
    }
