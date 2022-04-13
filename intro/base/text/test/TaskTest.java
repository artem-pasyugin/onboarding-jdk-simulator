import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class TaskTest {
    Task task = new Task();

    @Test
    public void testSolution() {
        Assert.assertEquals(task.length(), Task.result.length());
        Assert.assertEquals(task.textPlus(" Java!"), Task.result + " Java!");
        Assert.assertEquals(task.textNew(), Task.result);
        Assert.assertNotSame(task.textNew(), Task.result);
        Assert.assertTrue(task.textEquals(Task.result));
        Assert.assertEquals(task.textUpperCase(), Task.result.toUpperCase(Locale.ROOT));
    }
}