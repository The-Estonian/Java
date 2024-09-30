package Jart;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

class Image implements Displayable {
    private int width, height;
    private List<Drawable> shapes;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        this.shapes = new ArrayList<>();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Method to add shapes to the image
    public void addShape(Drawable shape) {
        shapes.add(shape);
    }

    @Override
    public void display(int x, int y, Color color) {
        // Mock display logic, e.g., draw pixel at (x, y) with the given color.
        System.out.println("Displaying at (" + x + ", " + y + ") with color " + color);
    }

    @Override
    public void save(String filename) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();

        // Set background color
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        // Draw all the shapes onto the image
        for (Drawable shape : shapes) {
            shape.draw(this);
        }

        g2d.dispose(); // Finish drawing

        // Save the image to a file
        try {
            ImageIO.write(image, "png", new File(filename));
            System.out.println("Image saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving image: " + e.getMessage());
        }
    }

}