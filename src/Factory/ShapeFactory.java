package Factory;

public class ShapeFactory {
    public Shape getShape(String shape){
        if(shape.equals("Circle"))
        {
            return new Circle();
        }
        else if(shape.equals("Triangle"))
        {
            return new Triangle();
        }
        else if(shape.equals("Rectangle"))
        {
            return new Rectangle();
        }
        return null;
    }
}
