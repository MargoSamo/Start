package org.margo.start.lambda;

interface Executable1 {
    int execute();
}

class Runner1 {
    public void run(Executable1 e) {
        int a = e.execute();
        System.out.println(a);
    }
}

public class LambdaTwo {
    public static void main(String[] args) {
        Runner1 runner = new Runner1();

        runner.run(new Executable1() {
            @Override
            public int execute() {
                System.out.println("Hello?");
                System.out.println("Goodbye");

                return 1;
            }
        });

        runner.run(() -> {
            System.out.println("hello!?");
            System.out.println("Goodbye");

            return 5;
        });
    }
}
