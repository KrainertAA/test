package DopExamples;

public class GameTank {
    public static void main(String[] args) {


//        tank.goForward(10);
//        tank.printPosition();
//        tank.goForward(50);
//        tank.printPosition();
//        tank.goBackward(100);
//        tank.printPosition();

        Tank justTank = new Tank();
        // At (10;20) fuel=100
        Tank anywareTank = new Tank(10, 10);
        // At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();


    }
}
