import java.lang.System;
public class Cylinder {
    private int X;
    private int Y;
    private int Width;
    private int Height;
    private Circle circle;
Cylinder(Circle circle,int Height){
    this.X=circle.getX()-(circle.getDiameter()/2);
    this.Y=circle.getY();
    this.Width=circle.getDiameter();
    this.Height=Height;

}

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
}
