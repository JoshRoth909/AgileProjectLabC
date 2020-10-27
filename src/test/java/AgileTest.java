import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
        @Test
        @DisplayName("when given an array of one positive number we expect back a negative number.")
        void testInverseOfOneNegativeNumber(){
            int[] expected = {1};
            int[] negative = {-1};
            int[] actual = invert(negative);
            assertArrayEquals(expected,actual);
        }
        @Test
        @DisplayName("when given an array of multiple positive " +
                "numbers we expect back multiple negative numbers.")
        void testInverseOfMultiplePositiveNumbers(){
            int[] expected = {-1,-1,-1,-1};
            int[] positive = {1,1,1,1};
            int[] actual = invert(positive);
            assertArrayEquals(expected,actual);
        }
        @Test
        @DisplayName("when given an array of multiple positive " +
                "numbers we expect back multiple negative numbers.")
        void testInverseOfMultipleNegativeNumbers(){
            int[] expected = {1,1,1,1};
            int[] negative = {-1,-1,-1,-1};
            int[] actual = invert(negative);
            assertArrayEquals(expected,actual);
        }
        @Test
        @DisplayName("when given an array of multiple positive and negative " +
                "numbers we expect back multiple positive and negative numbers.")
        void testInverseOfMultipleMixedNumbers(){
            int[] expected = {1,-1,1,-1};
            int[] mixed = {-1,1,-1,1};
            int[] actual = invert(mixed);
            assertArrayEquals(expected,actual);
        }
        }
