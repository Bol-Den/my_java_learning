package lesson_06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DogActionTest {

   private DogAction action = new DogAction();

   @Test
   void shouldBeRunning() {
      assertEquals("running", action.dogRun());
   }

   @Test
   void shouldNotBeRunning() {
      assertFalse( action.dogRun().equals("run")) ;
   }

}