
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class TaskTest {
    Task task = new Task();

    @Test
    public void testSolution() {
        Assertions.assertEquals(task.length(), Task.result.length());
        Assertions.assertEquals(task.textPlus(" Java!"), Task.result + " Java!");
        Assertions.assertEquals(task.textNew(), Task.result);
        Assertions.assertNotSame(task.textNew(), Task.result);
        Assertions.assertTrue(task.textEquals(Task.result));
        Assertions.assertEquals(task.textUpperCase(), Task.result.toUpperCase(Locale.ROOT));
    }
}