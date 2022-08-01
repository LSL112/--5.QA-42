package ru.netology.sqr.JavaQaMvnSqr.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class SqrServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rangeSqr.csv")
    public void shouldAmountSqrExact(int expected, int first, int last) {
        SqrService service = new SqrService();

       // int expected = 3;
        int actual = service.AmountSqr(first, last);


        Assertions.assertEquals(expected, actual);


    }

}
