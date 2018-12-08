package arrays;//: arrays/MultidimensionalPrimitiveArray.java
// Creating multidimensional arrays.
import java.util.*;

public class MultidimensionalPrimitiveArray {
  public static void main(String[] args) {
    int[][] a = {
      { 1, 2, 3, },
      { 4, 5, 6, },
    };
    int[][][] b = {
            { {1,1}, {2,2},{3} },
            { {4}, {5},{6}  },
    };
    char[][][] c = new char[2][2][3];
    System.out.println(Arrays.deepToString(a));
    System.out.println(Arrays.deepToString(b));
    System.out.println(Arrays.deepToString(c));
  }
} /* Output:
[[1, 2, 3], [4, 5, 6]]
*///:~
