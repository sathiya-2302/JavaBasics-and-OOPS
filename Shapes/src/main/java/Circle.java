public class Circle {

    private int X;
    private int Y;
    private int Diameter;
    private int Height;
Circle(int X,int Y,int Diameter,int Height){
    this.X=X;
    this.Y=Y;
    this.Diameter=Diameter;
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

    public int getDiameter() {
        return Diameter;
    }

    public void setDiameter(int diameter) {
        Diameter = diameter;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }
}

