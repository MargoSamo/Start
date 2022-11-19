package org.margo.start.enumtest;

public enum Season {
    SUMMER(30), WINTER(-30), AUTUMN(15), SPRING(5);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
