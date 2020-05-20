import java.text.DecimalFormat;

public class Barycenter {
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        DecimalFormat df = new DecimalFormat("#.####");
        double[] opt = new double[2];

        opt[0] = Double.valueOf(df.format((x[0] + y[0] + z[0]) / 3.0)).doubleValue();
        opt[1] = Double.valueOf(df.format((x[1] + y[1] + z[1]) / 3.0)).doubleValue();

        return opt;
    }
}
