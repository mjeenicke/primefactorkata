import java.util.ArrayList;
import java.util.List;

/**
 * kata
 */
public class PrimeFactorizer {

  public static List generate(long number) {
    ArrayList result = new ArrayList();
    if (number > 1) {
      
      for (long i = 2; i <= number; i++) {
        while (number % i == 0) {
          result.add(i);
          number= number/i;
        }

      }
    }
    return result;
  }

}
