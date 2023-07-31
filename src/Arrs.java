import java.util.Arrays;

public class Arrs {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[20];

        int a = 20;
        int b = 35;
        while (a > b) {
            System.out.println("1: " + (b - a));
            a++;
        }
        /*
        do {
            System.out.println("2: " + (b - a));
            a++;
        } while (a > b);

         */
        /*
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i + " : " + arr1[i]);

        }
        */

        for (int item : arr1) {
            if (item == 3)
                continue;
            System.out.println(item);

        }
    }
}
