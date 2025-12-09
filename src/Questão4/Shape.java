package Questão4;

public class Shape {
    protected final String name;
    protected final String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }
    public final String getDescription() {
        return "Forma: " + name + "  Cor: " + color;
    }
}
