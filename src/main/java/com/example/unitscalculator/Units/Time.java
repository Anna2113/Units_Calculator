package com.example.unitscalculator.Units;

public class Time {

    public double countTheYearToMonths(double year){
        double months = year * 12;
        return months;
    }

    public double countTheYearToWeeks(double year){
        double weeks = year * 52.14;
        return weeks;
    }

    public double countTheYearToDays(double year){
        double days;
        if(year % 4 == 0){
            days = (year * 365) + (year / 4);
        }else days = year * 365;
        return days;
    }

    public double countTheYearToHours(double year){
        double hours;
        if(year % 4 == 0){
            hours = year * 8760 + ((year / 4) * 24);
        }else hours = year * 8760;
        return hours;
    }

    public double countTheYearToMinutes(double year){
        double minutes;
        if(year % 4 == 0){
            minutes = year * 525600 + ((year / 4) * 1440);
        }else minutes = year * 525600;
        return minutes;
    }

    public double countTheYearToSeconds(double year){
        double seconds;
        if(year % 4 == 0){
            seconds= year * 31536000 + ((year / 4) * 86400);
        }else seconds = year * 31536000;
        return seconds;
    }

    //-----------------------------------------------------------------

    public double countTheMonthsToYear(double months){
        double year = months / 12;
        return year;
    }
    public double countTheMonthsToWeeks(double months){
        double weeks = months * 4.34;
        return weeks;
    }
    public double countTheMonthsToDays(double months){
        double days = months * 30.42;
        return days;
    }
    public double countTheMonthsToHours(double months){
        double hours = months * 730;
        return hours;
    }
    public double countTheMonthsToMinutes(double months){
        double minutes = months * 43800;
        return minutes;
    }
    public double countTheMonthsToSeconds(double months){
        double seconds = months * 2628000;
        return seconds;
    }

    //-----------------------------------------------------------------

    public double countTheWeeksToYear(double weeks){
        double year = weeks * 0.01918;
        return year;
    }
    public double countTheWeeksToMonths(double weeks){
        double months = weeks * 0.23014;
        return months;
    }
    public double countTheWeeksToDays(double weeks){
        double days = weeks * 7;
        return days;
    }
    public double countTheWeeksToHours(double weeks){
        double hours = weeks * 168;
        return hours;
    }
    public double countTheWeeksToMinutes(double weeks){
        double minutes = weeks * 10080;
        return minutes;
    }
    public double countTheWeeksToSeconds(double weeks){
        double seconds = weeks * 604800;
        return seconds;
    }

    //-----------------------------------------------------------------

    public double countTheDaysToYear(double days){
        double year = days * 0.00274;
        return year;
    }
    public double countTheDaysToMonths(double days){
        double months = days * 0.03288;
        return months;
    }
    public double countTheDaysToWeeks(double days){
        double weeks = days * 0.14286;
        return weeks;
    }
    public double countTheDaysToHours(double days){
        double hours = days * 24;
        return hours;
    }
    public double countTheDaysToMinutes(double days){
        double minutes = days * 1440;
        return minutes;
    }
    public double countTheDaysToSeconds(double days){
        double seconds = days * 86400;
        return seconds;
    }

    //-----------------------------------------------------------------

    public double countTheHoursToYear(double hours){
        double year = hours * 0.0001140;
        return year;
    }
    public double countTheHoursToMonths(double hours){
        double months = hours * 0.001388;
        return months;
    }
    public double countTheHoursToWeeks(double hours){
        double weeks = hours * 0.005952;
        return weeks;
    }
    public double countTheHoursToDays(double hours){
        double days = hours * 0.0416;
        return days;
    }
    public double countTheHoursToMinutes(double hours){
        double minutes = hours * 60;
        return minutes;
    }
    public double countTheHoursToSeconds(double hours){
        double seconds = hours * 3600;
        return seconds;
    }

    //-----------------------------------------------------------------

    public double countTheMinutesToYear(double minutes){
        double year = minutes * 0.0000019;
        return year;
    }
    public double countTheMinutesToMonths(double minutes){
        double months = minutes * 0.000023;
        return months;
    }
    public double countTheMinutesToWeeks(double minutes){
        double weeks = minutes * 0.0000992;
        return weeks;
    }
    public double countTheMinutesToDays(double minutes){
        double days = minutes * 0.000694;
        return days;
    }
    public double countTheMinutesToHours(double minutes){
        double hours = minutes * 0.01667;
        return hours;
    }
    public double countTheMinutesToSeconds(double minutes){
        double seconds = minutes * 60;
        return seconds;
    }

}
