package ru.croc.javaschool2024.surname.task8.tests;

import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task8.MD5Hashing;
import ru.croc.javaschool2024.surname.task8.Task8;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotSame;

public class Task8Test {

    private static final String INITIAL_HASH = "40682260CC011947FC2D0B1A927138C5";


    @Test
    private void positiveMainCaseTest() {
        int threadsNumber = 4;

        String password = Task8.decodePassword(threadsNumber, INITIAL_HASH);
        String hash = MD5Hashing.hashPassword(password);

        assertEquals(hash, INITIAL_HASH);
    }


    @Test
    private void negativeMainCaseTest() {
        int threadsNumber = 4;

        String someStrForTest = "smsmbls";
        String someStringHash = MD5Hashing.hashPassword(someStrForTest);
        String password = Task8.decodePassword(threadsNumber, someStringHash);
        String recalculatedHash = MD5Hashing.hashPassword(password);

        assertNotSame(recalculatedHash, INITIAL_HASH);
    }
}
