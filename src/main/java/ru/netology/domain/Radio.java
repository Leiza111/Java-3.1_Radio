package ru.netology.domain;

public class Radio {

    private int currentRadioStation; //текущая радиостанция
    private int currentVolume;
    private int numberStation = 10;

    //конструкторы
    public Radio() { //конструктор без параметров+
    }

    public Radio(int numberStation) { //конст.с с параметром+
        this.numberStation = numberStation;
    }


    //get/set numberStation
    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        this.numberStation = numberStation;
    }

    //get/set currentRadioStation
    public int getCurrentRadioStation() { //отдает текущую станцию сам, не лезем сами
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > numberStation - 1) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation; // если 0-9, то меняем память станцию
    }


    //кнопка next-следующая станция
    public void nextRadioStation() {
        if (currentRadioStation < numberStation - 1) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    //++кнопка prev-предыдущая станция
    public void prevRadioStation() {
        if (currentRadioStation > 0) {

            currentRadioStation--;
        } else {
            currentRadioStation = numberStation - 1;
        }
    }


    //get/set currentVolume
    public int getCurrentVolume() {
        return currentVolume; //отдает текущую станцию
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) { //если текущ.станция больше 100, то выходи
            return;
        }
        if (currentVolume < 0) { //если текущ.станция меньше 0, то выходи
            return;
        }
        this.currentVolume = currentVolume; // если 0-9, то меняем память станцию
    }


    //Увеличение громкости
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    //Уменьшение громкости
    public void reducеVolume() {
        if (currentVolume > 0) {
        }
        currentVolume--;
    }
}