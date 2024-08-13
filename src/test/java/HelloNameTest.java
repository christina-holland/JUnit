import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloNameTest {

    @Test
    public void testHelloName() {
        HelloName helloName = new HelloName();
        String result = helloName.helloName("World");
        assertEquals("Hello World!", result, "The greeting should be 'Hello World!'");
    }

    @Test
    public void testHelloNameEmpty() {
        HelloName helloName = new HelloName();
        String result = helloName.helloName("");
        assertEquals("Hello !", result, "The greeting should be 'Hello !' for an empty name");
    }

    @Test
    public void testHelloNameSpecialChars() {
        HelloName helloName = new HelloName();
        String result = helloName.helloName("!@#$%");
        assertEquals("Hello !@#$%!", result, "The greeting should handle special characters correctly");
    }
}

