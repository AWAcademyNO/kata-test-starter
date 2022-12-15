import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

    @Test
    public void shouldSayHello() {
        Greeter greeter = new Greeter();

        String greeting = greeter.sayHello();

        assertEquals("Hello Brights!", greeting);
    }
}
