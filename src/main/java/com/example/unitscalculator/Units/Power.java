package com.example.unitscalculator.Units;

public class Power {

    public double countTheMilliwattToWatt(double milliwatt){
        double watt = milliwatt / 1000;
        return watt;
    }

    public double countTheMilliwattToKilowatt(double milliwatt){
        double kilowatt = milliwatt / 1000000;
        return kilowatt;
    }

    public double countTheMilliwattToMegawatt(double milliwatt){
        double megawatt = milliwatt / 1000000000;
        return megawatt;
    }

    public double countTheMilliwattToHorsepower(double milliwatt){
        double horsepower = milliwatt * 0.00000135962;
        return horsepower;
    }

    //-----------------------------------------------------------------

    public double countTheWattToMilliwatt(double watt){
        double milliwatt = watt * 1000;
        return milliwatt;
    }

    public double countTheWattToKilowatt(double watt){
        double kilowatt = watt / 1000;
        return kilowatt;
    }

    public double countTheWattToMegawatt(double watt){
        double megawatt = watt / 1000000;
        return megawatt;
    }

    public double countTheWattToHorsepower(double watt){
        double horsepower = watt * 0.001359;
        return horsepower;
    }

    //-----------------------------------------------------------------

    public double countTheKilowattToMilliwatt(double kilowatt){
        double milliwatt = kilowatt * 1000000;
        return milliwatt;
    }

    public double countTheKilowattToWatt(double kilowatt){
        double watt = kilowatt * 1000;
        return watt;
    }

    public double countTheKilowattToMegawatt(double kilowatt){
        double megawatt = kilowatt / 1000;
        return megawatt;
    }

    public double countTheKilowattToHorsepower(double kilowatt){
        double horsepower = kilowatt * 1.35962;
        return horsepower;
    }

    //-----------------------------------------------------------------

    public double countTheMegawattToMilliwatt(double megawatt){
        double milliwatt = megawatt * 1000000000;
        return milliwatt;
    }

    public double countTheMegawattToWatt(double megawatt){
        double watt = megawatt * 1000000;
        return watt;
    }

    public double countTheMegawattToKilowatt(double megawatt){
        double kilowatt = megawatt * 1000;
        return kilowatt;
    }

    public double countTheMegawattToHorsepower(double megawatt){
        double horsepower = megawatt * 1359.6216;
        return horsepower;
    }

    //-----------------------------------------------------------------

    public double countTheHorsepowerToMilliwatt(double horsepower){
        double milliwatt = horsepower * 735498.75; //
        return milliwatt;
    }

    public double countTheHorsepowerToWatt(double horsepower){
        double watt = horsepower * 735.49875; //*1000
        return watt;
    }

    public double countTheHorsepowerToKilowatt(double horsepower){
        double kilowatt = horsepower * 0.73549;
        return kilowatt;
    }

    public double countTheHorsepowerToMegawatt(double horsepower){
        double megawatt = horsepower * 0.00073549; //
        return megawatt;
    }



}
