package ru.croc.javaschool2024.surname.task11.tests;

import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task11.Task11;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

public class Task11Test {
    private final PrintStream standardOut = System.out;

    @Test
    private void test() {
        testCase("2,4", List.of("Дюна"));
        testCase("11,9,2,5", List.of("Унесенные призраками"));
        testCase("8,7,10,3", List.of("Хатико", "Дюна 2"));
        testCase("1,2,3,4,5,6,7,8,9,10,11", List.of("-"));
        testCase("9,10,3", List.of("Начало"));
    }

    private void testCase(String in, List<String> outExpected) {
        provideInput(in);
        final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        Task11.main(new String[]{});
        String res = outputStreamCaptor.toString().trim();
        assert outExpected.contains(res);
        System.setOut(standardOut);
    }

    void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }
}
