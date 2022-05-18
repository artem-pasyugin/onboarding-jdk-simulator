import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;

public class TaskTest extends AbstractOutputTest {

    @Override
    void testSolution(ByteArrayOutputStream output) {
        Task.main(new String[0]);
        Assertions.assertEquals("2\n1", output.toString().trim());
    }

}