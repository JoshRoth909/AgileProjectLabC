import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessiGoalsTest {


    @Test
    void testMessiGoalsWhenGivenAllZeros() {
        int expected = 0;
        int actual = MessiGoals.messiGoalsFunc(0,0,0);
        assertEquals(expected,actual);
    }
    @Test
    void testMessiGoalsWhenGivenNumbersInSequence(){
        int expected = 6;
        int actual = MessiGoals.messiGoalsFunc(1,2,3);
        assertEquals(expected,actual);
    }
    @Test
    void testMessiGoalsWhenGivenIntegersInReverseSequence(){
        int expected = 6;
        int actual = MessiGoals.messiGoalsFunc(3,2,1);
        assertEquals(expected,actual);
    }
    @Test
    void testMessiGoalsWhenGivenTwoZeros(){
        int expected = 10;
        int actual = MessiGoals.messiGoalsFunc(0,10,0);
        assertEquals(expected,actual);
    }
    @Test
    void testMessiGoalsWhenGivenTwoSameNonZeroNumbers(){
        int expected = 11;
        int actual = MessiGoals.messiGoalsFunc(5,3,3);
        assertEquals(expected,actual);
    }
    @Test
    void testMessiGoalsWhenGivenAllSameNonZeroNumbers(){
        int expected = 6;
        int actual = MessiGoals.messiGoalsFunc(2,2,2);
        assertEquals(expected,actual);
    }

}