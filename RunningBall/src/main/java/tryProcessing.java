import processing.core.PApplet;



public class tryProcessing extends PApplet{

    public static final int WIDTH=648;

    public static final int HEIGHT=480;
   // int circleX=0;
    int diameter=100;
    RunningBall[] balls=new RunningBall[4];

//    tryProcessing(){
//        this.width=width;
//        this.height=height;
//        circleX=0;
//        this.ball = ball;
//    }


    public static void main(String args[]){

        PApplet.main("tryProcessing",args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
        int tempHeight=110;
        for(int i=0;i<4;i++){
            balls[i]= new RunningBall(10,tempHeight);
            tempHeight+=110;
        }

        //balls[2]= new RunningBall(circleX,height/15);
       // balls[3]= new RunningBall(circleX,height/20);
    }

    @Override
    public void setup() {
        super.setup();
       // ellipse(circleX,HEIGHT,10,10);
        for(int i=0;i<balls.length;i++) {
            ellipse(0, balls[i].getStartingPointY(), balls[i].getDiameter(), balls[i].getDiameter());
        }



    }



    @Override
    public void draw(){
        int runningSpeed=2;
        for(int i=0;i<4;i++,runningSpeed+=2) {
            update(balls[i],runningSpeed);
            show(balls[i]);

        }
//        update(balls[0]);
//        show(balls[0]);

    }
    public void update(RunningBall ball,int runningSpeed){
       ball.setCircleX(ball.getCircleX() +runningSpeed);
    }
    public void show(RunningBall ball){

      ellipse(ball.getCircleX(), ball.getStartingPointY(), ball.getDiameter(), ball.getDiameter());
    }

}

