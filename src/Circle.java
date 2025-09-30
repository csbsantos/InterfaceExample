public class Circle extends GeometricFigure{

    public Circle(int area) {
        super(area);
    }

    @Override
    public void draw(int area) {
        System.out.println("You just draw a circle with " + area + " cm2");

    }

    @Override
    public void fill(int area) {
        System.out.println("You just filled  a circle with " + area + " cm2");

    }


}
