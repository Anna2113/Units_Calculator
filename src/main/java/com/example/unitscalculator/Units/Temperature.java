package com.example.unitscalculator.Units;

public class Temperature {

    public double countTheCelsiusToFahrenheit(double celsius){
        double fahrenheit = 33.80 + (celsius * 1.8) - 1.8;
        return fahrenheit;
    }

    public double countTheCelsiusToKalvin(double celsius){
        double kelvin = 274.15 + celsius - 1;
        return kelvin;
    }

    //-----------------------------------------------------------------

    public double countTheFahrenheitToCelsius(double fahrenheit){
        double celsius;
        if(fahrenheit % 2 == 0){
            celsius = roundToTwoDecimalPlace(-17.222 + (fahrenheit * 0.555) - 0.555);
        }else {
            celsius = roundToTwoDecimalPlace(-17.222 + (fahrenheit * 0.556) - 0.556);
        }
        return celsius;
    }
    public double countTheFahrenheitToKalvin(double fahrenheit){
        double kelvin;
        if(fahrenheit % 2 == 0){
            kelvin = roundToThreeDecimalPlace(255.927 + (fahrenheit * 0.555) - 0.555);
        }else {
            kelvin = roundToThreeDecimalPlace(255.927 + (fahrenheit * 0.556) - 0.556);
        }
        return kelvin;
    }

    //-----------------------------------------------------------------

    public double countTheKelvinToFahrenheit(double kelvin){
        double fahrenheit =  roundToTwoDecimalPlace((kelvin - 273.15) * 1.8000 + 32.00);
        return fahrenheit;
    }

    public double countTheKelvinToCelsius(double kelvin){
        double celsius = -272.15 + kelvin - 1;
        return celsius;
    }

    public static double roundToTwoDecimalPlace(double value) {

        return Math.round(value * 100.0) / 100.0;
    }
    public static double roundToThreeDecimalPlace(double value) {

        return Math.round(value * 1000.0) / 1000.0;
    }

}
