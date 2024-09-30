package Jart;

import java.awt.Color;

class Line implements Drawable {
    private Point start, end;
    private Color color;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        this.color = Color.BLACK;
    }

    public static Line random(int width, int height) {
        return new Line(Point.random(width, height), Point.random(width, height));
    }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(start.getX(), start.getY(), color);
        displayable.display(end.getX(), end.getY(), color);
    }

    @Override
    public Color getColor() {
        return color;
    }
}