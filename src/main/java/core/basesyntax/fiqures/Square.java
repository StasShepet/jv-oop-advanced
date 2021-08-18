package core.basesyntax.fiqures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
        setColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea() + "sq.units, side: "
                + side + ", color: " + getColor());
    }
}
