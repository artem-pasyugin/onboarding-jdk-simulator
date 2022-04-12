import org.junit.Assert;
import org.junit.Test;

public class Tests {

  @Test
  public void testSolution() {
    Task task = new Task();
    Assert.assertEquals(task.getVariableByte(), Byte.MAX_VALUE);
    Assert.assertEquals(task.getVariableShort(), Short.MAX_VALUE);
    Assert.assertEquals(task.getVariableInt(), Integer.MAX_VALUE);
    Assert.assertEquals(task.getVariableLong(), Long.MAX_VALUE);
    Assert.assertEquals(task.getVariableFloat(), Float.MAX_VALUE, 0);
    Assert.assertEquals(task.getVariableDouble(), Double.MAX_VALUE, 0);
    Assert.assertFalse(task.getVariableBoolean());
  }
}