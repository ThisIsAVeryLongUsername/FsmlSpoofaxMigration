import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;

public class example01 {
  public static void main(String[] args) {
      System.out.println(eval());
  }
  public static Boolean eval() {
    
    return ((Function<BigDecimal, Boolean>) x -> ((Function<BigDecimal, Boolean>) y -> ((Function<BigDecimal, Boolean>) z -> (x.add(y).pow(z.intValueExact()).compareTo(new BigDecimal("3")) < 0)).apply(new BigDecimal("3"))).apply(new BigDecimal("66.37777"))).apply(new BigDecimal("130"));
  }
}
