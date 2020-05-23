public class Charge { //class name
    private final double rx, ry;
    private final double q;
	 public Charge(double x0, double y0, double q0) {
        rx = x0;
        ry = y0;
        q  = q0;
    }
	 public double potentialAt(double x, double y) { //instance method
        double k = 8.99e09;
        double dx = x - rx; //instancevariable
        double dy = y - ry;
        return k * q / Math.sqrt(dx*dx + dy*dy);
    }
    public String toString() { //instance method
        return q + " at (" + rx + ", " + ry + ")";
    }
		  public static void main(String[] args) { //mainclass
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
		  Charge c1 = new Charge(0.51, 0.63, 21.3); // invoke constructor
        Charge c2 = new Charge(0.13, 0.94, 81.9);
        double v1 = c1.potentialAt(x, y);
        double v2 = c2.potentialAt(x, y);
        System.out.printf("%.2e\n",(v1+v2));
    }
}
