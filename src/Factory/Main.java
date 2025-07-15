package Factory;

public class Main {

        public static void main(String[] args){
        ShapeFactory sf = new ShapeFactory();
        Shape c = sf.getShape("Circle");
        Shape r = sf.getShape("Rectangle");
        Shape t = sf.getShape("Triangle");

        System.out.println(c.areaFormula());
        System.out.println(r.areaFormula());
        System.out.println(t.areaFormula());
    }
}
