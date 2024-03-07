package ru.croc.javaschool2024.surname.task2.tests;

import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task2.Task2;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task2Test {
    private final PrintStream standardOut = System.out;


    @Test
    public void byteFormattingTest() {
        byteFormattingTest("23","23.0 B");
        byteFormattingTest("1024","1.0 KB");
        byteFormattingTest("53692044905543","48.8 TB");
        byteFormattingTest("5428952","5.2 MB");
    }

    private void byteFormattingTest(String input, String expected) {
        final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        Task2.main(new String[] {input});
        String output = outputStreamCaptor.toString().trim();
        assert  output.equals(expected);
        System.setOut(standardOut);
    }


}
