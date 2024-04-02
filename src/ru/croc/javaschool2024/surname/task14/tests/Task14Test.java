package ru.croc.javaschool2024.surname.task14.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task14.Task14;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task14Test {
    private final PrintStream standardOut = System.out;

    @Test
    private void test() {
        testCase("estimate1.txt", "873729");
        testCase("estimate2.txt", "2478686");
        testCase("estimate3.txt", "1581994");

    }

    private void testCase(String estimateFileName, String expected) {
        final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        try {
            String pricelistPath = String.format(
                "src/%s/resources/pricelist.txt",
                Task14.class.getPackageName().replace(".", "/")
            );
            String estimatePath = String.format(
                "src/%s/resources/%s",
                Task14.class.getPackageName().replace(".", "/"),
                estimateFileName
            );

            Task14.main(new String[]{pricelistPath, estimatePath});
            String res = outputStreamCaptor.toString().trim();
            assertEquals(
                expected,
                res
            );
        } finally {
            System.setOut(standardOut);
        }
    }
}
