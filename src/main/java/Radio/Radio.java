package Radio;

public class Radio {
    public int currentStation;

    public int getCurrentStation(){
        return currentStation;
    }

    public void setToMaxStation(){
        currentStation = 9;
    }

    public void setToMinStation(){
        currentStation = 0;
    }

    public void setCurrentStation(int newCurrentStation){
        if (newCurrentStation > 9){
            newCurrentStation = 0;
        }
        if (newCurrentStation < 0){
            newCurrentStation = 9;
        }
        currentStation = newCurrentStation;
    }

    public void increaseStationNext() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    public void increaseStationPrev(){
        if (currentStation < 9){
            currentStation = currentStation - 1;
        }
    }
}
