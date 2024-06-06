package lesson_04;

import org.junit.Test;
import static org.junit.Assert.*;

public class InterestRateTest {

    private InterestRate rate = new InterestRate();

    @Test
    public void shouldReturnFive(){
        assertEquals(5, rate.calculateInterestRate(701) );
    }

}