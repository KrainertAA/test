package DopExamples;

public class Bell {

    boolean s = true;

    void sound () {
        if (s) {
            System.out.println("ding");
        }
        else {
            System.out.println("dong");
        }
        s = !s;

    }

}
