package ru.croc.javaschool2024.surname.task3.tests;

import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task3.Task3;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task3Test {

    private final PrintStream standardOut = System.out;


    @Test
    private void testSum() {
        testOneSum("3", "4","5", "55");
        testOneSum("1", "2","100", "10000");
        testOneSum("5", "10","55", "15125");

    }

    private void testOneSum(String startElem, String diff, String amount, String expected) {
        final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        Task3.main(new String[]{startElem, diff, amount});
        String res = outputStreamCaptor.toString().trim();
        assert res.equals(expected);
        System.setOut(standardOut);
    }
}
