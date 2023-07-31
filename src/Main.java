
public class Main {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        String str = "qwe";
        /*if (a > b) {
            System.out.println("a is greater or equal b");
        }else {
            System.out.println("b is greater than a");
        }

        if (a == b) {
            System.out.println("a equal b");
        }*/

        int variable = switch (str) {
            case "qwe", "abc" -> 3;
            default -> 0;
        };
        System.out.println(variable);
    }
}