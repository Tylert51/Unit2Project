public class LinearEquation {
    int x1;
    int y1;
    int x2;
    int y2;
    double slope;
    String coord1;
    String coord2;
    public LinearEquation(String coord1, String coord2) {
        this.coord1 = coord1;
        this.coord2 = coord2;
        x1 = getCoordX1();
        y1 = getCoordY1();
        x2 = getCoordX2();
        y2 = getCoordY2();


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

    public int getCoordX1 () {
        int commaPlace = coord1.indexOf(",");
        int closeParenthesisPlace = coord1.indexOf(")");
        return Integer.parseInt(coord1.substring(1, commaPlace));
    }

    public int getCoordY1 () {
        int commaPlace = coord1.indexOf(",");
        int closeParenthesisPlace = coord1.indexOf(")");
        return Integer.parseInt(coord1.substring(commaPlace+1, closeParenthesisPlace));
    }

    public int getCoordX2 () {
        int commaPlace = coord2.indexOf(",");
        int closeParenthesisPlace = coord2.indexOf(")");
        return Integer.parseInt(coord2.substring(1, commaPlace));
    }

    public int getCoordY2 () {
        int commaPlace = coord2.indexOf(",");
        int closeParenthesisPlace = coord2.indexOf(")");
        return Integer.parseInt(coord2.substring(commaPlace+1, closeParenthesisPlace));
    }
    public String toString() {
        return "First pair: " + coord1 + "\nSecond pair: " + coord2 + "\nSlope of line: " + slope + "\nY-intercept: " + yInt() + "\nSlope intercept form: " + slopeIntForm() + "\nDistance between points: " + distanceCalc();
    }
}
