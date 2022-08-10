import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldGetCurrentStation(){
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentStation();
    }
    @Test
    public void shouldGetCurrentVolume(){
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentVolume();
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxStation() {
        Radio radio = new Radio();

        radio.setToMaxStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMinStation() {
        Radio radio = new Radio();

        radio.setToMinStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMinVolume() {
        Radio radio = new Radio();

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        radio.setCurrentStation(10);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetStationAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseStationNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.increaseStationNext();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.decreaseStationPrev();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeNext() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolumeNext();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumePrev() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);

        radio.decreaseVolumePrev();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldChangeStationToMinOnNextAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.changeStationNextAfterMax();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldChangeStationToNextUntilToMax(){
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.changeStationNextAfterMax();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldChangeStationToMaxOnPrevAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.changeStationPrevAfterMin();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldChangeStationToNextUntilToMin(){
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.changeStationPrevAfterMin();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseVolumeAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolumeNextAfterMax();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotDecreaseVolumeAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolumeNextAfterMin();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeUntilToMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.increaseVolumeNextAfterMax();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeUntilToMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.decreaseVolumeNextAfterMin();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
