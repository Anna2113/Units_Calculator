package com.example.unitscalculator.Units;

public class Length {

    public double kilometers(double km){return km;}

    public double meters(double m){
        return m;
    }

    public double centimeters(double cm){
        return cm;
    }

    //-----------------------------------------------------------------

    public double countTheKilometersToMeters(double kilometry) {
        double metry = kilometry * 1000;
        return metry;
    }

    public double countTheKilometersToCentimeters(double kilometry) {
        double centymetry = kilometry * 100000;
        return centymetry;
    }

    //-----------------------------------------------------------------

    public double countTheMetersToKilometers(double metry) {
        double kilometry = metry * 0.001;
        return kilometry;
    }

    public double countTheMetersToCentimeters(double metry) {
        double centymetry = metry * 100;
        return centymetry;
    }

    //-----------------------------------------------------------------

    public double countTheCentimetersToKilometers(double centymetry) {
        double kilometry = centymetry / 100000;
        return kilometry;
    }

    public double countTheCentimetersToMeters(double centymetry) {
        double metry = centymetry / 100;
        return metry;
    }

}

