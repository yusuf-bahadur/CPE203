import java.util.List;
import java.util.ArrayList;

public class Polygon {
    private final List<Point> points;

    public Polygon (List<Point> points)
    {
        this.points = points;
    }

    public List<Point> getPoints()

    {
        return points;
    }
}
