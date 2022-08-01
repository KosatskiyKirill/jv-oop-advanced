package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorRandom = new ColorSupplier();
        switch (FigureType.values()[new Random().nextInt(FigureType.values().length)].name()) {
            case "CIRCLE":
                return new Circle(random.nextDouble(), random.nextDouble(),
                        colorRandom.getRandomColor());
            case "SQUAR":
                return new Square(random.nextDouble(), random.nextDouble(),
                        colorRandom.getRandomColor());
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(random.nextDouble(),
                        random.nextDouble(), random.nextDouble(),
                        random.nextDouble(), colorRandom.getRandomColor());
            case "RECTANGLE":
                return new Rectangle(random.nextDouble(), random.nextDouble(),
                        random.nextDouble(),
                        colorRandom.getRandomColor());
            case "RIGHT_TRIANGLE":
                return new RightTriangle(random.nextDouble(), random.nextDouble(),
                        random.nextDouble(), colorRandom.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10.0, 10.0 * 3.14, Color.WHITE.name());
    }
}
