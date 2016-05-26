package examples.radio;

public class Main {

    public static void main(String[] args) {

        Radio radio = new Radio();
        radio.setStation(new KissFM());

        for (int i = 0; i < 10; i++) {
            radio.nextStation();
            radio.play();
        }

    }

}
