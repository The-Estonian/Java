package Jart;

import java.awt.Color;

class Circle implements Drawable {
    private Point center;
    private int radius;
    private Color color;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        this.color = Color.BLUE;
    }

    public static Circle random(int width, int height) {
        Point center = Point.random(width, height);
        int radius = (int) (Math.random() * 100);
        return new Circle(center, radius);
    }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(center.getX(), center.getY(), color);
    }

    @Override
    public Color getColor() {
        return color;
    }
}