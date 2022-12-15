package org.margo.start.annotation;

public class Two {
    @MethodInfo(purpose = "Print Hello world")
    public void printHelloWorld() {
        System.out.println("Hello world");
    }
}
