package sedgewick_java;

public class program_1_2_1 {
    public static void main(String[] args) {
        String ruler = "1";
        for (int i = 2; i < 10; i++) {
            ruler = ruler + i + ruler;
            System.out.println(ruler);
        }
    }
}
