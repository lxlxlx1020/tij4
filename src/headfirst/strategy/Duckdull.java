package headfirst.strategy;

/**
 * Created by laixiang on 2019/1/5.
 */
public class Duckdull {
    Duck duck = new Duck() {
        @Override
        void display() {
            System.out.println("this is a 鸭鸣器");
        }
    };

    public void quack() {
        duck.setQuackBehavior(new DuckdullQuack());
        duck.performQuack();
    }

    public static void main(String[] args) {
        Duckdull duckdull = new Duckdull();
        duckdull.quack();
    }
}

class DuckdullQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("DuckdullQuack quack");
    }
}
