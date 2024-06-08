package lesson_06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParrotTest {

    private Parrot parrot1 = new Parrot("boris","brown", 10);
    private Parrot parrot2 = new Parrot("britva", "white");
    private Parrot parrot3 = new Parrot("britva",15);

    @Test
    void testShouldReturnTen(){
        int result = parrot1.getAge();
        assertEquals(10, result);
    }

    @Test
    void testShouldReturnAgeZero(){
        int result = parrot2.getAge();
        assertEquals(0, result);
    }

    @Test
    void testShouldReturnColorZero(){
        String result = parrot3.getColor();
        assertTrue(result == null);
    }
}