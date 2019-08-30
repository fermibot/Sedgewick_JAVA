package sedgewick_java;

public class program_1_2_21_e {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Math.sin(0.01 * i) + Math.sin(0.01 * i));
        }
    }
}
