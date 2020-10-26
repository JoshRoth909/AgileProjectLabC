import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static testpackage.Agile.invert;

public class AgileTest {



        @Test
        @DisplayName("When given an empty array we expect back an empty array.")
        void testEmptyArray(){
            int[] expected = {};
            int[] emptyArray = {};
            int[] actual = invert(emptyArray);
            assertArrayEquals(expected,actual);

        }
        @Test
        @DisplayName("when given an array of zeros we expect an array of zeros to be returned.")
        void testZeroArray(){
            int[] expected= {0};
            int[] zeroArray={0};
            int[] actual= invert(zeroArray);
            assertArrayEquals(expected,actual);

        }
        @Test
        @DisplayName("when given an array of one positive number we expect back a negative number.")
        void testInverseOfOnePositiveNumber(){
            int[] expected = {-1};
            int[] positive = {1};
            int[] actual = invert(positive);
            assertArrayEquals(expected,actual);
        }
//    when given an array of one negative number we expect back a positive number.
//    when given an array of multiple positive numbers we expect back multiple negative numbers.
//    when given an array of multiple negative numbers we expect back multiple positive numbers.
//    when given an array of multiple mixed numbers we expect back multiple inverse mixed numbers.

}
