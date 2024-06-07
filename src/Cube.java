public class Cube implements Calculate{
    private double weight;
    private double height;

    public Cube(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double CalculateArea() {
        return weight * height;
    }
}
