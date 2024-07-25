import processing.core.PApplet;

public class TestMain extends PApplet {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 480;
    public Circle circle1;
    public Cylinder cylinder1;

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
        //circle1=new Circle(250,100,100,20);
        circle1=new Circle(300,100,100,20);
        cylinder1=new Cylinder(circle1,200);



    }
@Override
 public  void setup() {
        ellipse(circle1.getX(),circle1.getY(),circle1.getDiameter(),circle1.getHeight());// Create the shape group
        rect(cylinder1.getX(),cylinder1.getY(),cylinder1.getWidth(),cylinder1.getHeight());
        ellipse(circle1.getX(),circle1.getY()+cylinder1.getHeight(),circle1.getDiameter(),circle1.getHeight());
//    ellipse(250, 100, 100, 20);
//    rect(250,100,100,300);
//    ellipse(250, 100, 100, 20);
    }



@Override
    public void draw() {
//        background(204);
//        translate(50, 15);
      //  shape(alien); // Draw the group
    }
    public static void main(String[] args){
        PApplet.main("TestMain",args);
    }
}