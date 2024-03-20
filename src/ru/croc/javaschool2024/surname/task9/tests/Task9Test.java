package ru.croc.javaschool2024.surname.task9.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task9.Task9;

public class Task9Test {
    @Test
    private void lotReadingTest() {
        String path = String.format(
            "src/%s/resources/lot.txt",
            Task9.class.getPackageName().replace(".", "/")
        );
        assertEquals(
            Task9.readLot(path).toString(),
            "“Поцелуй”, Густав Климт, 100000"
        );
    }

    @Test
    private void participantsReadingTest() {
        String path = String.format(
            "src/%s/resources/participants.txt",
            Task9.class.getPackageName().replace(".", "/")
        );
        assertEquals(
            Task9.readParticipants(path).length,
            12
        );
    }
}
