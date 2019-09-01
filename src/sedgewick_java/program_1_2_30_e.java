package sedgewick_java;

import static com.sedgewick.math_objects.RandomFunctions.RandomReal;
import static com.sedgewick.math_objects.Statistics.Mean;

public class program_1_2_30_e {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(Mean(RandomReal(0, 1,5)));
        }
    }
}
