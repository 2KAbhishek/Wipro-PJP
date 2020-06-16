import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UnitTest {
    @Test
    public void testStringConcat(){
        Demo1 demo1 = new Demo1();
        assertEquals("Result", "Hello World!", demo1.stringConcat("Hello ", "World!"));
    }
}
