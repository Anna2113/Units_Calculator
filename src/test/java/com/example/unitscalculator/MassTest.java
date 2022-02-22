package com.example.unitscalculator;

import com.example.unitscalculator.Units.Mass;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MassTest {

    @Test
    void kilograms_should_be_equal_5() {
        //given
        Mass model = new Mass();

        //when
        double result = model.countTheGramsToKilograms(5000.0);

        //then
        Assertions.assertThat(result).isEqualTo(5.0);
    }

    @Test
    void grams_should_be_less_then_12000() {
        //given
        Mass model = new Mass();

        //when
        double result = model.countTheKilogramsToGrams(11.0);

        //then
        Assertions.assertThat(result).isLessThan(12000.0);
    }

    @Test
    void grams_should_be_greater_then_10() {
        //given
        Mass model = new Mass();

        //when
        double result = model.countTheMilligramsToGrams(11000.0);

        //then
        Assertions.assertThat(result).isGreaterThan(10.0);
    }

    @Test
    void milligrams_should_be_less_then_or_equal_to_50000() {
        //given
        Mass model = new Mass();

        //when
        double result = model.countTheGramsToMilligrams(50.0);

        //then
        Assertions.assertThat(result).isLessThanOrEqualTo(50000.0);
    }
}
