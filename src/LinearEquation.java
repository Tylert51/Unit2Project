public class LinearEquation {
    int x1;
    int y1;
    int x2;
    int y2;
    double slope;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String slopeCalc() {
        int rise = y2 - y1;
        int run = x2 - x1;
        slope = (double) rise/run;
        return rise + "/" + run;
    }

    public double yInt() {
        return y1 - (slope * x1);

    }

    public String slopeIntForm() {
        return "y = " + slope + "x" + yInt();
    }

    public double distanceCalc() {
        return Math.sqrt((Math.pow((x2 - x1),2) + Math.pow((y2-y1),2)));
    }

    public String calcThirdPoint (double x3) {
        double y3 = (slope * x3) + yInt();
        return "(" + x3 + "," + y3 + ")";
    }
}
