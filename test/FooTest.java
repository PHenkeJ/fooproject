import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooTest {

  @Test
  void testFooAdd() {
    Foo f1 = new Foo();
    Assertions.assertEquals(7, f1.add(4,3));
  }
}
