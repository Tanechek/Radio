package Radio;

public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
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

    public void increaseStationNext() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            setToMinStation();
        }
    }

    public void increaseStationPrev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            setToMaxStation();
        }
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
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

    public void increaseVolumeNext() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            setToMaxVolume();
        }
    }

    public void increaseVolumePrev() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            setToMinVolume();
        }
    }
}