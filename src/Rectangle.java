public class Rectangle extends GeometricFigure{
    public Rectangle(int area) {
        super(area);
    }

    @Override
    public void draw (int area){
        System.out.println("You just draw a rectangle with" + area + " cm2");
    }
    @Override
    public void fill (int area){
        System.out.println("You just filled a rectangle with" + area + " cm2");
    }
}
