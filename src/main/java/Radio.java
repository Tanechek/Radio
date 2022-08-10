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
    public void decreaseStationPrev() {
        currentStation = currentStation - 1;
    }
    public void increaseVolumeNext() {
        currentVolume = currentVolume + 1;
    }
    public void decreaseVolumePrev() {
        currentVolume = currentVolume - 1;
    }
    public void changeStationNextAfterMax(){
        if (currentStation == 9){
            setToMinStation();
        } else {
            increaseStationNext();
        }
    }
    public void changeStationPrevAfterMin(){
        if (currentStation == 0){
            setToMaxStation();
        } else {
            decreaseStationPrev();
        }
    }
    public void increaseVolumeNextAfterMax(){
        if (currentVolume < 10){
            increaseVolumeNext();
        }
    }
    public void decreaseVolumeNextAfterMin(){
        if (currentVolume > 0){
            decreaseVolumePrev();
        }
    }
}