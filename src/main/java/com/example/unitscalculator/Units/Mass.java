package com.example.unitscalculator.Units;

public class Mass {

    public double countTheKilogramsToGrams(double kilograms){
        double grams = kilograms * 1000;
     return grams;
    }

    public double countTheKilogramsToMilligrams(double kilograms){
        double milligrams = kilograms * 1000000;
        return milligrams;
    }

    //-----------------------------------------------------------------

    public double countTheGramsToKilograms(double grams){
        double kilograms = grams / 1000;
        return kilograms;
    }

    public double countTheGramsToMilligrams(double grams){
        double milligrams = grams * 1000;
        return milligrams;
    }

    //-----------------------------------------------------------------

    public double countTheMilligramsToKilograms(double milligrams){
        double kilograms = milligrams / 1000000;
        return kilograms;
    }

    public double countTheMilligramsToGrams(double milligrams){
        double grams = milligrams / 1000;
        return grams;
    }


}
