package com.example.unitscalculator;

import com.example.unitscalculator.Units.Time;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    void year_should_have_1461_days() {
        //given
        Time model = new Time();

        //when
        double result = model.countTheYearToDays(4);

        //then
        Assertions.assertThat(result).isEqualTo(1461);
    }

    @Test
    void year_should_have_35064_hours() {
        //given
        Time model = new Time();

        //when
        double result = model.countTheYearToHours(4);

        //then
        Assertions.assertThat(result).isEqualTo(35064);
    }

    @Test
    void year_should_have_2103840_minutes() {
        //given
        Time model = new Time();

        //when
        double result = model.countTheYearToMinutes(4);

        //then
        Assertions.assertThat(result).isEqualTo(2103840.0);
    }

    @Test
    void year_should_have_126230400_seconds() {
        //given
        Time model = new Time();

        //when
        double result = model.countTheYearToSeconds(4);

        //then
        Assertions.assertThat(result).isEqualTo(126230400.0);
    }
}
