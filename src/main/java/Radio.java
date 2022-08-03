public class Radio {
    private int currentStation;
    private int currentVolume;
    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            currentVolume = 10;
        } else if (newCurrentVolume < 0) {
            currentVolume = 0;
        } else {
            currentVolume = newCurrentVolume;
        }
    }
    public void setToMaxStation() {
        currentStation = 9;
    }
    public void setToMinStation() {
        currentStation = 0;
    }
    public void setToMaxVolume() {
        currentVolume = 10;
    }
    public void setToMinVolume() {
        currentVolume = 0;
    }
    public void increaseStationNext() {
        currentStation = currentStation + 1;
    }
    public void increaseStationPrev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }
    public void increaseVolumeNext() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    public void increaseVolumePrev() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
    public void increaseStationNextAfterMax(){
        if (currentStation == 9){
            setToMinStation();
        } else {
            increaseStationNext();
        }

    }
    public void increaseStationPrevAfterMin(){
        if (currentStation == 0){
            setToMaxStation();
        } else {
            increaseStationPrev();
        }
    }
    public void increaseVolumeNextAfterMax(){
        if (currentVolume < 10){
            increaseStationNext();
        }
    }
    public void increaseVolumeNextAfterMin(){
        if (currentVolume > 0){
            increaseStationPrev();
        }
    }
}