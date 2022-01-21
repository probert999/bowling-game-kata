package com.probert999.bowlinggame;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BowlingGameTestData {

    public static Stream<Arguments> noSparesOrStrikes() {
        return Stream.of(
                Arguments.of(0, "-- -- -- -- -- -- -- -- -- --"),
                Arguments.of(1, "1- -- -- -- -- -- -- -- -- --"),
                Arguments.of(45, "1- 2- 3- 4- 5- 6- 7- 8- 9- --"),
                Arguments.of(45, "-1 -2 -3 -4 -5 -6 -7 -8 -9 --"));
    }

    public static Stream<Arguments> strikes() {
        return Stream.of(
                Arguments.of(10, "X -- -- -- -- -- -- -- -- --"),
                Arguments.of(30, "X X -- -- -- -- -- -- -- --"),
                Arguments.of(60, "-- -- -- X X X -- -- -- --"),
                Arguments.of(270, "X X X X X X X X X X --"));
    }

    public static Stream<Arguments> spares() {
        return Stream.of(
                Arguments.of(12, "5/ 1- -- -- -- -- -- -- -- --"),
                Arguments.of(35, "5/ 5/ 5- -- -- -- -- -- -- --"));
    }

    public static Stream<Arguments> bonusThrows() {
        return Stream.of(
                Arguments.of(300, "X X X X X X X X X X X X"),
                Arguments.of(145, "5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/-"),
                Arguments.of(15, " -- -- -- -- -- -- -- -- -- 5/5"),
                Arguments.of(30, " -- -- -- -- -- -- -- -- -- X X X"),
                Arguments.of(60, "-- -- -- -- -- -- -- -- X X X X"),
                Arguments.of(150, "5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5"));
    }


}
