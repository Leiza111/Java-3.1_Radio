package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RadioTest {

    //SetNumberStation
    @Test //выставление количества радиостанций
    public void shouldSetNumberStation() {
        Radio rad = new Radio(); //создали pадио c текущейРадиостанцией 0
        rad.setNumberStation(5);//возьметЗначе-еИПоложитВ currentRadiostation, кот.находится в голове объекта-запомнить, что положили в память
        int expected = 5; //ожидаемый
        int actual = rad.getNumberStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //выставление количества радиостанций
    public void shouldSetNumberStation0() {
        Radio rad = new Radio(); //создали pадио c текущейРадиостанцией 0
        rad.setNumberStation(0);//возьметЗначе-еИПоложитВ currentRadiostation, кот.находится в голове объекта-запомнить, что положили в память
        int expected = 0; //ожидаемый
        int actual = rad.getNumberStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //выставление количества радиостанций меньше 0
    public void shouldSetNumberStationLessZero() {
        Radio rad = new Radio(); //создали pадио c текущейРадиостанцией 0
        rad.setNumberStation(-2);//возьметЗначе-еИПоложитВ currentRadiostation, кот.находится в голове объекта-запомнить, что положили в память
        int expected = 10; //ожидаемый
        int actual = rad.getNumberStation(); //фактический
        assertEquals(expected, actual);
    }

    //setCurrentRadioStation
    @Test //выставление радиостанции ниже мин
    public void shouldBelowTheMinRadioStation() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(-5);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения -1
    public void shouldMinusOneRadioStation() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(-1);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 0
    public void shouldZeroRadioStation() {
        Radio rad = new Radio(); //создалиРадиоСТекущ.Радиост 0
        rad.setCurrentRadioStation(0);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 1
    public void shouldOneRadioStation() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(1);
        int expected = 1; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 8
    public void shouldEightRadioStation() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(8);
        int expected = 8; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический

        assertEquals(expected, actual);
    }

    @Test //граничные значения 9
    public void shouldNineRadioStation() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(9);
        int expected = 9; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 10
    public void shouldTenRadioStation() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(10);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //кнопка next1(2)
    public void shouldNextRadioStation() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(1);
        rad.nextRadioStation();
        int expected = 2; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //кнопка next3(4)
    public void shouldNextRadioStation3() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(3);
        rad.nextRadioStation();
        int expected = 4; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический

        assertEquals(expected, actual);
    }

    @Test //кнопка next0(1)
    public void shouldNextRadioStation0() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(0);
        rad.nextRadioStation();
        int expected = 1; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //кнопка next8(9)
    public void shouldNextRadioStation8() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(8);
        rad.nextRadioStation();
        int expected = 9; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //кнопка next9(0)
    public void shouldNextRadioStation9() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(9);
        rad.nextRadioStation();
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический

        assertEquals(expected, actual);
    }

    @Test //кнопка prev4(3)
    public void shouldPrevRadioStation4() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(4);
        rad.prevRadioStation();
        int expected = 3; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //кнопка prev0(9)
    public void shouldPrevRadioStation0() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();
        int expected = 9; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический

        assertEquals(expected, actual);
    }


    @Test //выставление уровня звука выше макс
    public void shouldAboveTheMaxVolume() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentVolume(150);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }

    @Test //выставление допустимого уровня звука
    public void shouldCurrentVolume() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentVolume(100);
        int expected = 100; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }

    @Test //выставление уровня звука ниже мин
    public void shouldBelowTheMinVolume() {
        Radio rad = new Radio(); //
        rad.setCurrentVolume(-5);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения -1
    public void shouldMinusOneVolume() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentVolume(-1);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 0
    public void shouldZeroVolume() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentVolume(0);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 1
    public void shouldOneVolum() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentVolume(1);
        int expected = 1; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 99
    public void shouldNineVolum() {
        Radio rad = new Radio(); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentVolume(99);
        int expected = 99; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }







    //SetNumberStation
    @Test //выставление количества радиостанций
    public void shouldSetNumberStationArgs() {
        Radio rad = new Radio(30); //создали pадио c текущейРадиостанцией 0
        rad.setNumberStation(5);//возьметЗначе-еИПоложитВ currentRadiostation, кот.находится в голове объекта-запомнить, что положили в память
        int expected = 5; //ожидаемый
        int actual = rad.getNumberStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //выставление количества радиостанций
    public void shouldSetNumberStation0Args() {
        Radio rad = new Radio(30); //создали pадио c текущейРадиостанцией 0
        rad.setNumberStation(0);//возьметЗначе-еИПоложитВ currentRadiostation, кот.находится в голове объекта-запомнить, что положили в память
        int expected = 0; //ожидаемый
        int actual = rad.getNumberStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //выставление количества радиостанций меньше 0
    public void shouldSetNumberStationLessZeroArgs() {
        Radio rad = new Radio(30); //создали pадио c текущейРадиостанцией 0
        rad.setNumberStation(-2);//возьметЗначе-еИПоложитВ currentRadiostation, кот.находится в голове объекта-запомнить, что положили в память
        int expected = 30; //ожидаемый
        int actual = rad.getNumberStation(); //фактический
        assertEquals(expected, actual);
    }

    //setCurrentRadioStation
    @Test //выставление радиостанции ниже мин
    public void shouldBelowTheMinRadioStationArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(-5);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения -1
    public void shouldMinusOneRadioStationArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(-1);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 0
    public void shouldZeroRadioStationArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущ.Радиост 0
        rad.setCurrentRadioStation(0);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 1
    public void shouldOneRadioStationArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(1);
        int expected = 1; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 8
    public void shouldEightRadioStationArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(8);
        int expected = 8; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический

        assertEquals(expected, actual);
    }

    @Test //граничные значения 9
    public void shouldNineRadioStationArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(9);
        int expected = 9; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 30
    public void shouldTenRadioStationArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(30);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //кнопка next1(2)
    public void shouldNextRadioStationArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(1);
        rad.nextRadioStation();
        int expected = 2; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //кнопка next3(4)
    public void shouldNextRadioStation3Args() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(3);
        rad.nextRadioStation();
        int expected = 4; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический

        assertEquals(expected, actual);
    }

    @Test //кнопка next0(1)
    public void shouldNextRadioStation0Args() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(0);
        rad.nextRadioStation();
        int expected = 1; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //кнопка next8(9)
    public void shouldNextRadioStation8Args() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(8);
        rad.nextRadioStation();
        int expected = 9; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //кнопка next29(0)
    public void shouldNextRadioStation29Args() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(29);
        rad.nextRadioStation();
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический

        assertEquals(expected, actual);
    }

    @Test //кнопка prev4(3)
    public void shouldPrevRadioStation4Args() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(4);
        rad.prevRadioStation();
        int expected = 3; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический
        assertEquals(expected, actual);
    }

    @Test //кнопка prev0(9)
    public void shouldPrevRadioStation0Args() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();
        int expected = 29; //ожидаемый
        int actual = rad.getCurrentRadioStation(); //фактический

        assertEquals(expected, actual);
    }


    @Test //выставление уровня звука выше макс
    public void shouldAboveTheMaxVolumeArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentVolume(150);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }

    @Test //выставление допустимого уровня звука
    public void shouldCurrentVolumeArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentVolume(100);
        int expected = 100; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }

    @Test //выставление уровня звука ниже мин
    public void shouldBelowTheMinVolumeArgs() {
        Radio rad = new Radio(30); //
        rad.setCurrentVolume(-5);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения -1
    public void shouldMinusOneVolumeArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentVolume(-1);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 0
    public void shouldZeroVolumeArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentVolume(0);
        int expected = 0; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 1
    public void shouldOneVolumArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentVolume(1);
        int expected = 1; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }

    @Test //граничные значения 99
    public void shouldNineVolumArgs() {
        Radio rad = new Radio(30); //создалиРадиоСТекущейРадиостанцией 0
        rad.setCurrentVolume(99);
        int expected = 99; //ожидаемый
        int actual = rad.getCurrentVolume(); //фактический
        assertEquals(expected, actual);
    }

}
