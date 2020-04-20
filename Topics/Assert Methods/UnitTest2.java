import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest2 {
    Demo2 demo2 = new Demo2();

    @Test
    public void testPalindromeCheck() {
        assertTrue("Result: ", demo2.palindromeCheck("madam"));
        assertTrue("Result: ", demo2.palindromeCheck("mom"));
        assertTrue("Result: ", demo2.palindromeCheck("dad"));
        assertTrue("Result: ", demo2.palindromeCheck("malayalam"));
        assertFalse("Result: ", demo2.palindromeCheck("abhsihek"));
    }

}
