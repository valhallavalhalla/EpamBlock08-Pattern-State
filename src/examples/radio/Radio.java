package examples.radio;

public class Radio {

    private Station station;

    public void play() {
        station.play();
    }

    public void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioDFM());
        } else if (station instanceof RadioDFM) {
            setStation(new KissFM());
        } else {
            setStation(new Radio7());
        }
    }

    public void setStation(Station station) {
        this.station = station;
    }

}
