import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static testpackage.PlayBanjo.banjo;

public class BanjoTest {

    @Test
    @DisplayName("when given an empty string, expect: does not play banjo")
    void testBanjoEmptyString(){
        String expected = " does not play banjo";
        String actual = banjo("");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("when given a string of a space, expect does not play banjo with two spaces before does")
    void testBanjoWhenStringIsSpace(){
        String expected = "  does not play banjo";
        String actual = banjo(" ");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("when given a string starting with a number, expect:  /* number*/ does not play banjo")
    void testBanjoWhenStringIsNumber(){
        String expected = "1 does not play banjo";
        String actual = banjo("1");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("when given a string starting with a symbol, expect: /symbol/ does not play banjo")
    void testBanjoWhenStringIsSymbol(){
        String expected = "? does not play banjo";
        String actual = banjo("?");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("when given a string starting with a letter other than r or R, expect: name +  does not play banjo")
    void testBanjoWhenStringIsNotR(){
        String expected = "Bill does not play banjo";
        String actual = banjo("Bill");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("when given a string starting with a r, expect: name +  plays banjo")
    void testBanjoWhenStringIsLittleR(){
        String expected = "rob plays banjo";
        String actual = banjo("rob");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("when given a string starting with a R, expect: name +  plays banjo")
    void testBanjoWhenStringIsBigR(){
        String expected = "Ronald plays banjo";
        String actual = banjo("Ronald");
        assertEquals(expected, actual);
    }

}
