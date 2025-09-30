public abstract class GeometricFigure implements Drawable, Fillable{
    private int area;

    public GeometricFigure(int area) {
        this.area = area;
    }

    public abstract void draw (int area);
    public abstract void fill (int area);
}
