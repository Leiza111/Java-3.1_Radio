package ru.netology.domain;

public class Radio {

    private int currentRadioStation; //текущая радиостанция
    private int currentVolume;


    //++установка(set) канала радиостанции
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) { //если текущ.станция меньше 0, то выходи
            return;
        }
        if (currentRadioStation > 9) { //если текущ.станция больше 9, то выходи
            return;
        }
        this.currentRadioStation = currentRadioStation; // если 0-9, то меняем память станцию
    }

    //кнопка next-следующая станция
    public void nextRadioStation() {

        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    //++кнопка prev-предыдущая станция
    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    //++возврвщаем значение поля радиостанции
    public int getCurrentRadioStation() { //отдает текущую станцию сам, не лезем сами
        return currentRadioStation;
    }


    //++выставление уровня звука
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) { //если текущ.станция меньше 0, то выходи
            return;
        }
        if (currentVolume > 10) { //если текущ.станция больше 9, то выходи
            return;
        }
        this.currentVolume = currentVolume; // если 0-9, то меняем память станцию
    }

    //MaxVolume
    public void setToMaxVolume() {
        currentVolume = 10;
    }

    //MinVolume
    public void setToMinVolume() {
        currentVolume = 0;
    }

    ////++возврвщаем значение уровня звука
    public int getCurrentVolume() {
        return currentVolume; //отдает текущую станцию
    }
}






