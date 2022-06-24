package org.margo.start.plaer;

class TapeDeck {
    boolean canRecord = false;
    // boolean canPlay = false;

    void playTape() {
        System.out.println("пленка проигрывается");
    }
    void recordTape() {
        System.out.println("идет запись на пленку");
    }
}

class TapeDeckTestDrive {
    public static void main(String args[]) {
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
