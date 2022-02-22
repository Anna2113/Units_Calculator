package com.example.unitscalculator;

import com.example.unitscalculator.Units.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

import static java.lang.String.*;

public class HelloController {

    @FXML
    private Label errorOne;

    @FXML
    private Label errorTwo;

    @FXML
    private Label errorThree;

    @FXML
    private Label errorFour;

    @FXML
    private Label errorFive;

    @FXML
    private Label errorSix;

    @FXML
    private Label alertOne;

    @FXML
    private Label alertTwo;

    @FXML
    private Label alertThree;

    @FXML
    private Label alertFour;

    @FXML
    private Label alertFive;

    @FXML
    private Label alertSix;

    @FXML
    private Tab tabFive;

    @FXML
    private Tab tabFour;

    @FXML
    private Tab tabOne;

    @FXML
    private Tab tabSix;

    @FXML
    private Tab tabThree;

    @FXML
    private Tab tabTwo;

    @FXML
    private TextField textFieldCelsius;

    @FXML
    private TextField textFieldCentimeters;

    @FXML
    private TextField textFieldCentimetersPerSecond;

    @FXML
    private TextField textFieldDays;

    @FXML
    private TextField textFieldFahrenheit;

    @FXML
    private TextField textFieldGrams;

    @FXML
    private TextField textFieldHorsepower;

    @FXML
    private TextField textFieldHours;

    @FXML
    private TextField textFieldKelvin;

    @FXML
    private TextField textFieldKilograms;

    @FXML
    private TextField textFieldKilometers;

    @FXML
    private TextField textFieldKilometersPerHour;

    @FXML
    private TextField textFieldKilometersPerSecond;

    @FXML
    private TextField textFieldKilowatt;

    @FXML
    private TextField textFieldMeters;

    @FXML
    private TextField textFieldMetersPerSecond;

    @FXML
    private TextField textFieldMilligrams;

    @FXML
    private TextField textFieldMilliwatt;

    @FXML
    private TextField textFieldMegawatt;

    @FXML
    private TextField textFieldMinutes;

    @FXML
    private TextField textFieldMonths;

    @FXML
    private TextField textFieldSeconds;

    @FXML
    private TextField textFieldWatt;

    @FXML
    private TextField textFieldWeeks;

    @FXML
    private TextField textFieldYear;

    @FXML
    void countLength(ActionEvent event) {
        Length model = new Length();

        if (!textFieldKilometers.getText().equals("")) {
            double km = Double.parseDouble(textFieldKilometers.getText());

            textFieldMeters.setText(valueOf(model.countTheKilometersToMeters(km)));
            textFieldCentimeters.setText(valueOf(model.countTheKilometersToCentimeters(km)));

        } else if (!textFieldMeters.getText().equals("")) {
            double m = Double.parseDouble(textFieldMeters.getText());

            textFieldKilometers.setText(valueOf(model.countTheMetersToKilometers(m)));
            textFieldCentimeters.setText(valueOf(model.countTheMetersToCentimeters(m)));

        } else if (!textFieldCentimeters.getText().equals("")) {
            double cm = Double.parseDouble(textFieldCentimeters.getText());

            textFieldKilometers.setText(valueOf(model.countTheCentimetersToKilometers(cm)));
            textFieldMeters.setText(valueOf(model.countTheCentimetersToMeters(cm)));

        } else if (textFieldKilometers.getText().equals("") && textFieldMeters.getText().equals("")
                && textFieldCentimeters.getText().equals("")) {
            alertOne.setText("No data entered!");
        }
    }

    @FXML
    void countMass(ActionEvent actionEvent) {
        Mass model = new Mass();

        if (!textFieldKilograms.getText().equals("")) {
            double k = Double.parseDouble(textFieldKilograms.getText());

            textFieldGrams.setText(String.valueOf(model.countTheKilogramsToGrams(k)));
            textFieldMilligrams.setText(String.valueOf(model.countTheKilogramsToMilligrams(k)));

        } else if (!textFieldGrams.getText().equals("")) {
            double g = Double.parseDouble(textFieldGrams.getText());

            textFieldKilograms.setText(String.valueOf(model.countTheGramsToKilograms(g)));
            textFieldMilligrams.setText(String.valueOf(model.countTheGramsToMilligrams(g)));

        } else if (!textFieldMilligrams.getText().equals("")) {
            double mg = Double.parseDouble(textFieldMilligrams.getText());

            textFieldKilograms.setText(String.valueOf(model.countTheMilligramsToKilograms(mg)));
            textFieldGrams.setText(String.valueOf(model.countTheMilligramsToGrams(mg)));

        } else if (textFieldKilograms.getText().equals("") && textFieldGrams.getText().equals("")
                && textFieldMilligrams.getText().equals("")) {
            alertTwo.setText("No data entered!");
        }
    }

    @FXML
    void countPower(ActionEvent actionEvent) {
        Power model = new Power();

        if (!textFieldMilliwatt.getText().equals("")) {
            double mW = Double.parseDouble(textFieldMilliwatt.getText());

            textFieldWatt.setText(String.valueOf(model.countTheMilliwattToWatt(mW)));
            textFieldKilowatt.setText(String.valueOf(model.countTheMilliwattToKilowatt(mW)));
            textFieldMegawatt.setText(String.valueOf(model.countTheMilliwattToMegawatt(mW)));
            textFieldHorsepower.setText(String.valueOf(model.countTheMilliwattToHorsepower(mW)));

        } else if (!textFieldWatt.getText().equals("")) {
            double W = Double.parseDouble(textFieldWatt.getText());

            textFieldMilliwatt.setText(String.valueOf(model.countTheWattToMilliwatt(W)));
            textFieldKilowatt.setText(String.valueOf(model.countTheWattToKilowatt(W)));
            textFieldMegawatt.setText(String.valueOf(model.countTheWattToMegawatt(W)));
            textFieldHorsepower.setText(String.valueOf(model.countTheWattToHorsepower(W)));

        } else if (!textFieldKilowatt.getText().equals("")) {
            double kW = Double.parseDouble(textFieldKilowatt.getText());

            textFieldMilliwatt.setText(String.valueOf(model.countTheKilowattToMilliwatt(kW)));
            textFieldWatt.setText(String.valueOf(model.countTheKilowattToWatt(kW)));
            textFieldMegawatt.setText(String.valueOf(model.countTheKilowattToMegawatt(kW)));
            textFieldHorsepower.setText(String.valueOf(model.countTheKilowattToHorsepower(kW)));

        } else if (!textFieldMegawatt.getText().equals("")) {
            double MW = Double.parseDouble(textFieldMegawatt.getText());

            textFieldMilliwatt.setText(String.valueOf(model.countTheMegawattToMilliwatt(MW)));
            textFieldWatt.setText(String.valueOf(model.countTheMegawattToWatt(MW)));
            textFieldKilowatt.setText(String.valueOf(model.countTheMegawattToKilowatt(MW)));
            textFieldHorsepower.setText(String.valueOf(model.countTheMegawattToHorsepower(MW)));

        } else if (!textFieldHorsepower.getText().equals("")) {
            double KM = Double.parseDouble(textFieldHorsepower.getText());

            textFieldMilliwatt.setText(String.valueOf(model.countTheHorsepowerToMilliwatt(KM)));
            textFieldWatt.setText(String.valueOf(model.countTheHorsepowerToWatt(KM)));
            textFieldKilowatt.setText(String.valueOf(model.countTheHorsepowerToKilowatt(KM)));
            textFieldMegawatt.setText(String.valueOf(model.countTheHorsepowerToMegawatt(KM)));

        } else if (textFieldMilliwatt.getText().equals("") && textFieldWatt.getText().equals("")
                && textFieldKilowatt.getText().equals("") && textFieldMegawatt.getText().equals("")
                && textFieldHorsepower.getText().equals("")) {
            alertThree.setText("No data entered!");
        }
    }

    @FXML
    void countSpeed(ActionEvent actionEvent) {
        Speed model = new Speed();

        if (!textFieldKilometersPerHour.getText().equals("")) {
            double kPh = Double.parseDouble(textFieldKilometersPerHour.getText());

            double resultOne = model.countTheKilometersPerHourToKilometersPerSecond(kPh);
            textFieldKilometersPerSecond.setText(String.valueOf(resultOne));

            double resultTwo = model.countTheKilometersPerHourToMetersPerSecond(kPh);
            textFieldMetersPerSecond.setText(String.valueOf(resultTwo));

            double resultThree = model.countTheKilometersPerHourToCentimetersPerSecond(kPh);
            textFieldCentimetersPerSecond.setText(String.valueOf(resultThree));

        } else if (!textFieldKilometersPerSecond.getText().equals("")) {
            double kPs = Double.parseDouble(textFieldKilometersPerSecond.getText());

            double resultOne = model.countTheKilometersPerSecondToKilometersPerHour(kPs);
            textFieldKilometersPerHour.setText(String.valueOf(resultOne));

            double resultTwo = model.countTheKilometersPerSecondToMetersPerSecond(kPs);
            textFieldMetersPerSecond.setText(String.valueOf(resultTwo));

            double resultThree = model.countTheKilometersPerSecondToCentimetersPerSecond(kPs);
            textFieldCentimetersPerSecond.setText(String.valueOf(resultThree));

        } else if (!textFieldMetersPerSecond.getText().equals("")) {
            double mPs = Double.parseDouble(textFieldMetersPerSecond.getText());

            double resultOne = model.countTheMetersPerSecondToKilometersPerHour(mPs);
            textFieldKilometersPerHour.setText(String.valueOf(resultOne));

            double resultTwo = model.countTheMetersPerSecondToKilometersPerSecond(mPs);
            textFieldKilometersPerSecond.setText(String.valueOf(resultTwo));

            double resultThree = model.countTheMetersPerSecondToCentimetersPerSecond(mPs);
            textFieldCentimetersPerSecond.setText(String.valueOf(resultThree));

        } else if (!textFieldCentimetersPerSecond.getText().equals("")) {
            double cPs = Double.parseDouble(textFieldCentimetersPerSecond.getText());

            double resultOne = model.countTheCentimetersPerSecondToKilometersPerHour(cPs);
            textFieldKilometersPerHour.setText(String.valueOf(resultOne));

            double resultTwo = model.countTheCentimetersPerSecondToKilometersPerSecond(cPs);
            textFieldKilometersPerSecond.setText(String.valueOf(resultTwo));

            double resultThree = model.countTheCentimetersPerSecondToMetersPerSecond(cPs);
            textFieldMetersPerSecond.setText(String.valueOf(resultThree));

        } else if (textFieldKilometersPerHour.getText().equals("")
                && textFieldKilometersPerSecond.getText().equals("")
                && textFieldMetersPerSecond.getText().equals("")
                && textFieldCentimetersPerSecond.getText().equals("")) {
            alertFour.setText("No data entered!");
        }
    }

    @FXML
    void countTime(ActionEvent actionEvent) {
        Time model = new Time();

        if (!textFieldYear.getText().equals("")) {
            double year = Double.parseDouble(textFieldYear.getText());

            textFieldMonths.setText(String.valueOf(model.countTheYearToMonths(year)));
            textFieldWeeks.setText(String.valueOf(model.countTheYearToWeeks(year)));
            textFieldDays.setText(String.valueOf(model.countTheYearToDays(year)));
            textFieldHours.setText(String.valueOf(model.countTheYearToHours(year)));
            textFieldMinutes.setText(String.valueOf(model.countTheYearToMinutes(year)));
            textFieldSeconds.setText(String.valueOf(model.countTheYearToSeconds(year)));

        } else if (!textFieldMonths.getText().equals("")) {
            double month = Double.parseDouble(textFieldMonths.getText());

            textFieldYear.setText(String.valueOf(model.countTheMonthsToYear(month)));
            textFieldWeeks.setText(String.valueOf(model.countTheMonthsToWeeks(month)));
            textFieldDays.setText(String.valueOf(model.countTheMonthsToDays(month)));
            textFieldHours.setText(String.valueOf(model.countTheMonthsToHours(month)));
            textFieldMinutes.setText(String.valueOf(model.countTheMonthsToMinutes(month)));
            textFieldSeconds.setText(String.valueOf(model.countTheMonthsToSeconds(month)));

        } else if (!textFieldWeeks.getText().equals("")) {
            double weeks = Double.parseDouble(textFieldWeeks.getText());

            textFieldYear.setText(String.valueOf(model.countTheWeeksToYear(weeks)));
            textFieldMonths.setText(String.valueOf(model.countTheWeeksToMonths(weeks)));
            textFieldDays.setText(String.valueOf(model.countTheWeeksToDays(weeks)));
            textFieldHours.setText(String.valueOf(model.countTheWeeksToHours(weeks)));
            textFieldMinutes.setText(String.valueOf(model.countTheWeeksToMinutes(weeks)));
            textFieldSeconds.setText(String.valueOf(model.countTheWeeksToSeconds(weeks)));

        } else if (!textFieldDays.getText().equals("")) {
            double days = Double.parseDouble(textFieldDays.getText());

            textFieldYear.setText(String.valueOf(model.countTheDaysToYear(days)));
            textFieldMonths.setText(String.valueOf(model.countTheDaysToMonths(days)));
            textFieldWeeks.setText(String.valueOf(model.countTheDaysToWeeks(days)));
            textFieldHours.setText(String.valueOf(model.countTheDaysToHours(days)));
            textFieldMinutes.setText(String.valueOf(model.countTheDaysToMinutes(days)));
            textFieldSeconds.setText(String.valueOf(model.countTheDaysToSeconds(days)));

        } else if (!textFieldHours.getText().equals("")) {
            double hours = Double.parseDouble(textFieldHours.getText());

            textFieldYear.setText(String.valueOf(model.countTheHoursToYear(hours)));
            textFieldMonths.setText(String.valueOf(model.countTheHoursToMonths(hours)));
            textFieldWeeks.setText(String.valueOf(model.countTheHoursToWeeks(hours)));
            textFieldDays.setText(String.valueOf(model.countTheHoursToDays(hours)));
            textFieldMinutes.setText(String.valueOf(model.countTheHoursToMinutes(hours)));
            textFieldSeconds.setText(String.valueOf(model.countTheHoursToSeconds(hours)));

        } else if (!textFieldMinutes.getText().equals("")) {
            double minutes = Double.parseDouble(textFieldMinutes.getText());

            textFieldYear.setText(String.valueOf(model.countTheMinutesToYear(minutes)));
            textFieldMonths.setText(String.valueOf(model.countTheMinutesToMonths(minutes)));
            textFieldWeeks.setText(String.valueOf(model.countTheMinutesToWeeks(minutes)));
            textFieldDays.setText(String.valueOf(model.countTheMinutesToDays(minutes)));
            textFieldHours.setText(String.valueOf(model.countTheMinutesToHours(minutes)));
            textFieldSeconds.setText(String.valueOf(model.countTheMinutesToSeconds(minutes)));

        } else if (!textFieldSeconds.getText().equals("")) {
            alertFive.setText("Seconds cannot be converted");
        } else if (textFieldYear.getText().equals("") && textFieldMonths.getText().equals("")
                && textFieldWeeks.getText().equals("") && textFieldDays.getText().equals("")
                && textFieldHours.getText().equals("") && textFieldMinutes.getText().equals("")
                && textFieldSeconds.getText().equals("")) {
            alertFive.setText("No data entered!");
        }
    }

    @FXML
    void countTemperature(ActionEvent actionEvent) {

        Temperature model = new Temperature();

        if (!textFieldCelsius.getText().equals("")) {
            double cels = Double.parseDouble(textFieldCelsius.getText());

            textFieldFahrenheit.setText(String.valueOf(model.countTheCelsiusToFahrenheit(cels)));
            textFieldKelvin.setText(String.valueOf(model.countTheCelsiusToKalvin(cels)));

        } else if (!textFieldFahrenheit.getText().equals("")) {
            double fahr = Double.parseDouble(textFieldFahrenheit.getText());

            textFieldCelsius.setText(String.valueOf(model.countTheFahrenheitToCelsius(fahr)));
            textFieldKelvin.setText(String.valueOf(model.countTheFahrenheitToKalvin(fahr)));

        } else if (!textFieldKelvin.getText().equals("")) {
            double kelv = Double.parseDouble(textFieldKelvin.getText());

            textFieldCelsius.setText(String.valueOf(model.countTheKelvinToCelsius(kelv)));

            textFieldFahrenheit.setText(String.valueOf(model.countTheKelvinToFahrenheit(kelv)));

        } else if (textFieldCelsius.getText().equals("") && textFieldFahrenheit.getText().equals("")
                && textFieldKelvin.getText().equals("")) {
            alertSix.setText("No data entered!");
        }
    }

    @FXML
    void clearData(ActionEvent actionEvent) {

        if (tabOne.isSelected()) {
            if (!textFieldKilometers.getText().equals("") || !textFieldMeters.getText().equals("")
                    || !textFieldCentimeters.getText().equals("") || !alertOne.getText().equals("")
            || !errorOne.getText().equals(""))
            {
                textFieldKilometers.setText("");
                textFieldMeters.setText("");
                textFieldCentimeters.setText("");
                alertOne.setText("");
                errorOne.setText("");
            } else {
                errorOne.setText("The fields are empty.");
            }
        } else if (tabTwo.isSelected()) {
            if (!textFieldKilograms.getText().equals("") || !textFieldGrams.getText().equals("")
                    || !textFieldMilligrams.getText().equals("") || !alertTwo.getText().equals("")
            || !errorTwo.getText().equals(""))
            {
                textFieldKilograms.setText("");
                textFieldGrams.setText("");
                textFieldMilligrams.setText("");
                alertTwo.setText("");
                errorTwo.setText("");
            } else {
                errorTwo.setText("The fields are empty.");
            }
        } else if (tabThree.isSelected()) {
            if (!textFieldMilliwatt.getText().equals("") || !textFieldWatt.getText().equals("")
                    || !textFieldKilograms.getText().equals("") || !textFieldMegawatt.getText().equals("")
                    || !textFieldHorsepower.getText().equals("") || !alertThree.getText().equals("")
            || !errorThree.getText().equals(""))
            {
                textFieldMilliwatt.setText("");
                textFieldWatt.setText("");
                textFieldKilowatt.setText("");
                textFieldMegawatt.setText("");
                textFieldHorsepower.setText("");
                alertThree.setText("");
                errorThree.setText("");
            } else {
                errorThree.setText("The fields are empty.");
            }
        } else if (tabFour.isSelected()) {
            if (!textFieldKilometersPerHour.getText().equals("") || !textFieldKilometersPerSecond.getText().equals("")
                    || !textFieldMetersPerSecond.getText().equals("")
                    || !textFieldCentimetersPerSecond.getText().equals("") || !alertFour.getText().equals("")
            || !errorFour.getText().equals(""))
            {
                textFieldKilometersPerHour.setText("");
                textFieldKilometersPerSecond.setText("");
                textFieldMetersPerSecond.setText("");
                textFieldCentimetersPerSecond.setText("");
                alertFour.setText("");
                errorFour.setText("");
            } else {
                errorFour.setText("The fields are empty.");
            }
        } else if (tabFive.isSelected()) {
            if (!textFieldYear.getText().equals("") || !textFieldMonths.getText().equals("")
                    || !textFieldWeeks.getText().equals("") || !textFieldDays.getText().equals("")
                    || !textFieldHours.getText().equals("") || !textFieldMinutes.getText().equals("")
                    || !textFieldSeconds.getText().equals("") || !alertFive.getText().equals("")
            || !errorFive.getText().equals(""))
            {
                textFieldYear.setText("");
                textFieldMonths.setText("");
                textFieldWeeks.setText("");
                textFieldDays.setText("");
                textFieldHours.setText("");
                textFieldMinutes.setText("");
                textFieldSeconds.setText("");
                alertFive.setText("");
                errorFive.setText("");
            } else {
                errorFive.setText("The fields are empty.");
            }
        } else if (tabSix.isSelected()) {
            if (!textFieldCelsius.getText().equals("") || !textFieldFahrenheit.getText().equals("")
                    || !textFieldKelvin.getText().equals("") || !alertSix.getText().equals("")
            || !errorSix.getText().equals(""))
            {
                textFieldCelsius.setText("");
                textFieldFahrenheit.setText("");
                textFieldKelvin.setText("");
                alertSix.setText("");
                errorSix.setText("");
            } else {
                errorSix.setText("The fields are empty.");
            }
        }
    }
}




