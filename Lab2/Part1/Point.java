public class Point{
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRadius(){
        return Math.hypot(x, y);
    }

    public double getAngle(){
        return Math.atan2( y ,x);
    }

    public Point rotate90(){
		return new Point(-y, x);
		}
	
}