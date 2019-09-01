package sedgewick_java;

import static com.sedgewick.math_objects.RandomFunctions.RandomGaussian;

public class program_1_2_27_e {
    public static void main(String[] args) {
        for (double random :
                RandomGaussian(10)) {
            System.out.println(random);
        }
    }
}
