package Jart;

import java.awt.Color;

class Triangle implements Drawable {
    private Point p1, p2, p3;
    private Color color;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = Color.RED;
    }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(p1.getX(), p1.getY(), color);
        displayable.display(p2.getX(), p2.getY(), color);
        displayable.display(p3.getX(), p3.getY(), color);
    }

    @Override
    public Color getColor() {
        return color;
    }
}