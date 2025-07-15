package Factory;

public class Triangle implements Shape {

    @Override
    public String areaFormula() {
        return "0.5 * base * height";
    }
    
}
