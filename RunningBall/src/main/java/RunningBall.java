import processing.core.PApplet;

public class RunningBall extends PApplet{

 private int diameter;
private int circleX=0;
private int startingPointY;
 RunningBall(int diameter,int startingPointY){
    this.setDiameter(diameter);
    this.setStartingPointY(startingPointY);
    this.setCircleX(getCircleX());

 }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getCircleX() {
        return circleX;
    }

    public void setCircleX(int circleX) {
        this.circleX = circleX;
    }

    public int getStartingPointY() {
        return startingPointY;
    }

    public void setStartingPointY(int startingPointY) {
        this.startingPointY = startingPointY;
    }

// public void tryBall(){
//     tryProcessing(diameter,startingPointY,)
// }
//
//    public static void main(String args[]){
//
//        PApplet.main("RunningBall",args);
//
//    }
//@Override
//public void setup() {
//    super.setup();
//    // ellipse(circleX,HEIGHT,10,10);
//    ellipse(circleX,Y,10,10);
//}
//
//    @Override
//    public void draw(){
//        //drawCircle();
//        // ellipse(circleX,HEIGHT,10,10);
//        ellipse(circleX,Y,10,10);
//        circleX=circleX+2;
//    }
//


}
