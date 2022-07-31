package Radio;

public class Radio {
    private int defaultMaxStation = 9;
    private int maxStation;

    private int minStation = 0;
    private int currentStation = minStation;
    private int defaultMaxVolume = 10;
    private int maxVolume;

    private int minVolume = 0;

    private int currentVolume = minVolume;



    public Radio(int totalStationsAmount, int maxVolume){
        this.maxStation = totalStationsAmount - 1;
        this.maxVolume = maxVolume;
    }
    public Radio(){
        this.maxStation = defaultMaxStation;
        this.maxVolume = defaultMaxVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }
    public int getMaxStation(){
        return maxStation;
    }
    public int getMinStation(){
        return minStation;
    }

    public void setToMaxStation() {
        currentStation = maxStation;
    }

    public void setToMinStation() {
        currentStation = minStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseStationNext() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            setToMinStation();
        }
    }

    public void increaseStationPrev() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            setToMaxStation();
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
        } else if (newCurrentVolume < minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void increaseVolumeNext() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            setToMaxVolume();
        }
    }

    public void increaseVolumePrev() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            setToMinVolume();
        }
    }
}