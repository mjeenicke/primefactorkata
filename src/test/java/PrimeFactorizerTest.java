import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 */
@RunWith(Parameterized.class)
public class PrimeFactorizerTest {

  private long number;
  private List expected;

  public PrimeFactorizerTest(long number, List expected) {
    this.expected = expected;
    this.number = number;
  }

  @Test
  public void testAll() throws Exception {
    assertEquals(expected, PrimeFactorizer.generate(number));
  }

  @Parameterized.Parameters
  public static List<Object[]> data() {
    return Arrays.asList(new Object[][]{
            {0, Collections.emptyList()} ,
            {1, Collections.emptyList()} ,
            {2, Arrays.asList(2L)},
            {3, Arrays.asList(3L)},
            {4, Arrays.asList(2L,2L)},
            {55, Arrays.asList(5L,11L)},
            {5587793257325L, Arrays.asList(5L,5L,457L,1031L,474379L)},
            //10 millionth prime, which is worst case for the algorithm
            {179424673L, Arrays.asList(179424673L)},
    });
  }
}
