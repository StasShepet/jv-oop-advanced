package core.basesyntax.fiqures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea() + "sq.units, radius: "
                + radius + ", color: " + getColor());
    }
}
