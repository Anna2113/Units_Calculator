package com.example.unitscalculator.Units;

public class Speed {

    public double countTheKilometersPerHourToKilometersPerSecond(double kilometersPerHour){
        double kilometersPerSecond = kilometersPerHour * 0.000277;
        return kilometersPerSecond;
    }

    public double countTheKilometersPerHourToMetersPerSecond(double kilometersPerHour){
        double metersPerSecond = kilometersPerHour * 0.2777;
        return metersPerSecond;
    }

    public double countTheKilometersPerHourToCentimetersPerSecond(double kilometersPerHour){
        double centimetersPerSecond = kilometersPerHour * 27.7777;
        return centimetersPerSecond;
    }

    //-----------------------------------------------------------------

    public double countTheKilometersPerSecondToKilometersPerHour(double kilometersPerSecond){
        double kilometersPerHour = kilometersPerSecond * 3600;
        return kilometersPerHour;
    }

    public double countTheKilometersPerSecondToMetersPerSecond(double kilometersPerSecond){
        double kilometersPerHour = kilometersPerSecond * 1000;
        return kilometersPerHour;
    }

    public double countTheKilometersPerSecondToCentimetersPerSecond(double kilometersPerSecond){
        double kilometersPerHour = kilometersPerSecond * 100000;
        return kilometersPerHour;
    }

    //-----------------------------------------------------------------

    public double countTheMetersPerSecondToKilometersPerHour(double metersPerSecond){
        double kilometersPerHour = metersPerSecond * 3.60;
        return kilometersPerHour;
    }

    public double countTheMetersPerSecondToKilometersPerSecond(double metersPerSecond){
        double kilometersPerSecond = metersPerSecond * 0.0010;
        return kilometersPerSecond;
    }

    public double countTheMetersPerSecondToCentimetersPerSecond(double metersPerSecond){
        double centimetersPerSecond = metersPerSecond * 100;
        return centimetersPerSecond;
    }

    //-----------------------------------------------------------------

    public double countTheCentimetersPerSecondToKilometersPerHour(double centimetersPerSecond){
        double kilometersPerHour = centimetersPerSecond * 0.0360;
        return kilometersPerHour;
    }
    public double countTheCentimetersPerSecondToKilometersPerSecond(double centimetersPerSecond){
        double kilometersPerSecond = centimetersPerSecond * 0.00001;
        return kilometersPerSecond;
    }
    public double countTheCentimetersPerSecondToMetersPerSecond(double centimetersPerSecond){
        double metersPerSecond = centimetersPerSecond * 0.010;
        return metersPerSecond;
    }


}
