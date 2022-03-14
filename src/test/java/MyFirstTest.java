import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class MyFirstTest {

    @Test
    public void verifyString(){
        String expected = "Codeup" ;
        String actual = "Codeup";

        assertEquals(expected,actual);
    }
    @Test
    public void verifyingString1(){
        String expected = "Codeup";
        String actual = expected;

       // actual = expected;

         // this created completely "new" value of "Codeup" and assign it to the actual .  So even set to line 17, "actual" will be still different from "expected"

        //assertNotEquals(expected,actual);
        //assertEquals(expected,actual);
        assertEquals(expected,actual);


    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 10.0;

        assertEquals(price, discount);
  //      assertSame(price,discount);

        //DIFFERENCE BETWEEN SAME AND EQUAL
        //Same => checks to see if they are same obj,
        //Equal => checks to see if their value of reference variables are same.
//        assertEquals(5.1, price - discount, 0.5);
//        assertNotEquals(4.9, price - discount, 0.5);
    }

    //

    @Test
    public void verifyingArrList(){
        List<String> language  =  new ArrayList<>();
        List<String> moreLanguage = new ArrayList<>();
        assertNotSame(language,moreLanguage);
    }

    @Test
    public void verifyingArr(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers,otherNumbers);  // expect to be true
    }




}
