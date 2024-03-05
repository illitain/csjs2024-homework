package ru.croc.javaschool2024.surname.task1.tests;

import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task1.Task1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task1Test {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @Test
    void testSquareCalcs() {
        testOneSquareCalc("0\n0\n2\n0\n0\n2", "Площадь треугольника: 2.0");
        testOneSquareCalc("0\n0\n1\n0\n0\n1", "Площадь треугольника: 0.5");
        testOneSquareCalc("-5\n3\n4\n-7\n3\n14", "Площадь треугольника: 89.5");
        testOneSquareCalc("-5\n-15\n-20\n-8\n-110\n-213", "Площадь треугольника: 1852.5");
    }


    private void testOneSquareCalc(String input, String expected) {
        provideInput(input);
        System.setOut(new PrintStream(outputStreamCaptor));
        Task1.main(new String[]{});
        String[] lines = outputStreamCaptor.toString().trim().split("\n");
        String lastLine = lines[lines.length-1];
        assert lastLine.equals(expected);
    }
    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }
}
