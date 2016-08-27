package HomeWork;

public class Sum {
    public static void main(String[] args) {
        int[] myIntArray = {60, 700, 55, 800, 1000, 5555, 400, 9000, 20, 50};
        int sum = 0;
        for (int i = 0; i < myIntArray.length; i++) {
            sum = sum + myIntArray[i];
        }
            System.out.println(sum);
        }

    }