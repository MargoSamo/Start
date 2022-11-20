package org.margo.start.enumtest;

public enum Clothes {
    SHORTS(-10), DRESS(+10);

    private final int temperature;

    Clothes(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public static void main(String[] args) {
        Clothes one = Clothes.DRESS;
        if (one.getTemperature() != 10) {
            System.out.println("fail");
        } else {
            System.out.println("success");
        }
    }
}
