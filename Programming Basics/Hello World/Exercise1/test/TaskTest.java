import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;


public class TaskTest extends AbstractOutputTest {

    @Override
    void testSolution(ByteArrayOutputStream output) {
        Task.main(new String[2]);
        Assertions.assertEquals("Hello, Java!", output.toString().trim());
    }
}
