import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Task task = new Task();
    Assert.assertEquals(task.plus(10), 10);
    Assert.assertEquals(task.minus(5), 5);
    Assert.assertEquals(task.divide(5), 1);
    Assert.assertEquals(task.multi(10), 10);
    Assert.assertEquals(task.reset(), 0);
  }
}