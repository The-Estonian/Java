package Jart;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle implements Drawable {
    private Point p1, p2;
    private Color color;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = Color.GREEN; // Set a default color
    }

    @Override
    public void draw(Displayable displayable) {
        if (displayable instanceof Image) {
            Image img = (Image) displayable;
            BufferedImage image = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = image.createGraphics();

            // Set color
            g2d.setColor(color);

            // Draw rectangle (left-top corner and width/height calculated)
            int x = Math.min(p1.getX(), p2.getX());
            int y = Math.min(p1.getY(), p2.getY());
            int width = Math.abs(p2.getX() - p1.getX());
            int height = Math.abs(p2.getY() - p1.getY());

            g2d.fillRect(x, y, width, height);
            g2d.dispose(); // Dispose graphics context after drawing
        }
    }

    @Override
    public Color getColor() {
        return color;
    }
}