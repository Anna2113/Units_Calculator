package com.example.unitscalculator;

import com.example.unitscalculator.Units.Length;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthTest {

    @Test
    void kilometers_should_be_less_then_5() {
        //given
        Length model = new Length();

        //when
        Double result = model.countTheCentimetersToKilometers(300000.0);

        //then
        Assertions.assertThat(result).isLessThan(5.0);
    }

    @Test
    void meters_should_be_greater_then_999() {
        //given
        Length model = new Length();

        //when
        double result = model.countTheKilometersToMeters(1.0);

        //then
        Assertions.assertThat(result).isGreaterThan(999.0);
    }

    @Test
    void centimeters_should_be_equal_2000() {
        //given
        Length model = new Length();

        //when
        double result = model.countTheMetersToCentimeters(20.0);

        //then
        Assertions.assertThat(result).isEqualTo(2000.0);
    }

    @Test
    void kilometers_cant_be_equal_zero() {
        //given
        Length model = new Length();

        //when
        double result = model.kilometers(2.0);

        //then
        Assertions.assertThat(result).isNotEqualTo(0.0);
    }

    @Test
    void meters_should_be_equal_1000() {
        //given
        Length model = new Length();

        //when
        double result = model.meters(1000.0);

        //then
        Assertions.assertThat(result).isEqualTo(1000.0);
    }

    @Test
    void centimeters_should_be_greater_then_200() {
        //given
        Length model = new Length();

        //when
        double result = model.centimeters(400.0);

        //then
        Assertions.assertThat(result).isGreaterThan(200.0);
    }
}
