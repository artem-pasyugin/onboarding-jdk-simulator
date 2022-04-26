import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;

public class SomeClassTest extends AbstractOutputTest {
    SomeClass someClass = new SomeClass();

    @Override
    void testSolution(ByteArrayOutputStream output) {
        someClass.a();
        Assertions.assertEquals("42", output.toString().trim(), "Некорректное совпадение");
    }
}
