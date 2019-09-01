package sedgewick_java;

import static com.sedgewick.math_objects.QFunctions.GreaterAll;

public class program_1_1_28 {
    public static void main(String[] args) {
        double[] list1 = {1, 2, 3};
        double[] list2 = {3, 2, 1, -1};
        System.out.println(GreaterAll(list1));
        System.out.println(GreaterAll(list2));
    }
}
