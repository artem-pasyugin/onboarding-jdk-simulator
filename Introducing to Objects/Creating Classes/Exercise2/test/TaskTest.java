import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;

public class TaskTest extends AbstractOutputTest {

    @Override
    void testSolution(ByteArrayOutputStream output) {
        Task.main(new String[2]);
        Assertions.assertTrue(output.toString().trim().length() > 0, "Пустой ответ");
        Assertions.assertFalse(output.toString().trim().contains("@"), "В адресе не должно быть знака '@'");
    }
}