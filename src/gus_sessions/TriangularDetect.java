package gus_sessions;

public class TriangularDetect {
    private boolean pre_truth = true;
    private double[][] coordinates;
    private double slope;
    private double y_intercept;
    private boolean post_truth;

    public TriangularDetect(double[][] coordinates_in) {
        coordinates = coordinates_in;
        integrity_check(coordinates);
    }

    public void integrity_check(double[][] coordinates_in) {
        if (coordinates_in.length == 3) {
            for (double[] x_y :
                    coordinates) {
                pre_truth = pre_truth && (x_y.length == 2);
            }
        } else pre_truth = false;
    }


    public void calculate_slope() {
        slope = coordinates[1][1] - coordinates[0][1] / coordinates[1][0] - coordinates[0][0];
    }

    public void calculate_y_intercept() {
        calculate_slope();
        y_intercept = coordinates[1][1] - slope * coordinates[1][0];
    }

    public boolean TriangleQ() {
        if (pre_truth) {
            calculate_y_intercept();
            post_truth = !(coordinates[2][1] == slope * coordinates[2][0] + y_intercept);
        } else {
            post_truth = false;
        }
        return post_truth;
    }

    public boolean get_pre_truth() {
        return pre_truth;
    }

    public double get_slope() {
        return slope;
    }


    public static void main(String[] args) {
        double[][] my_coordinates = new double[][]{{0, 0}, {1, 1}, {2, 2}};
        TriangularDetect triangularDetect = new TriangularDetect(my_coordinates);
        System.out.println("The initialization truth is " + triangularDetect.get_pre_truth());
        System.out.println("Checking if the given triplet is a Triangle:" + triangularDetect.TriangleQ());
    }

}

