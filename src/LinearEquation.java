public class LinearEquation {
    //instance variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double slope;
    private String coord1;
    private String coord2;
    //constructor
    public LinearEquation(String coord1, String coord2) {
        this.coord1 = coord1;
        this.coord2 = coord2;
        x1 = getCoordX1();
        y1 = getCoordY1();
        x2 = getCoordX2();
        y2 = getCoordY2();
    }

    //calculates slope
    public String slopeCalc() {
        int rise = y2 - y1;
        int run = x2 - x1;
        slope = (double) rise/run;
        return rise + "/" + run;
    }

    //calculates y-intercept
    public double yInt() {
        return y1 - (slope * x1);

    }

    //calculates the equation in slope intercept from
    public String slopeIntForm() {
        return "y = " + slopeCalc() + "x" + " + " + yInt();
    }

    //calculates the distance between the two points
    public double distanceCalc() {
        return Math.sqrt((Math.pow((x2 - x1),2) + Math.pow((y2-y1),2)));
    }

    //calculates the coordinate pair for a third x value
    public String calcThirdPoint (double x3) {
        double y3 = (slope * x3) + yInt();
        return "(" + x3 + "," + roundTo(y3,2) + ")";
    }

    //gets the integer value of x1 from coord1
    public int getCoordX1 () {
        int commaPlace = coord1.indexOf(",");
        return Integer.parseInt(coord1.substring(1, commaPlace));
    }

    //gets the integer value of y1 from coord1
    public int getCoordY1 () {
        int commaPlace = coord1.indexOf(",");
        int closeParenthesisPlace = coord1.indexOf(")");
        return Integer.parseInt(coord1.substring(commaPlace+1, closeParenthesisPlace));
    }

    //gets the integer value of x2 from coord2
    public int getCoordX2 () {
        int commaPlace = coord2.indexOf(",");
        return Integer.parseInt(coord2.substring(1, commaPlace));
    }

    //gets the integer value of y2 from coord2
    public int getCoordY2 () {
        int commaPlace = coord2.indexOf(",");
        int closeParenthesisPlace = coord2.indexOf(")");
        return Integer.parseInt(coord2.substring(commaPlace+1, closeParenthesisPlace));
    }

    //prints the values that were calcualted from the two pairs of coordinate points
    public String toString() {
        slopeCalc();
        return "First pair: " + coord1 + "\nSecond pair: " + coord2 + "\nSlope of line: " + roundTo(slope,2) + "\nY-intercept: " + yInt() + "\nSlope intercept form: " + slopeIntForm() + "\nDistance between points: " + roundTo(distanceCalc(),2);
    }

    public double roundTo(double number, int decimalPlaces) {
        return Double.parseDouble(String.format(("%." + decimalPlaces + "f"), number));
    }
}
