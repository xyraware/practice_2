public class Ball {
    double x=0.0,y=0.0;
    public void Ball(double x1,double y1){
        this.x=x1;
        this.y=y1;
    }
    public void Ball()throws Throwable{
        System.out.println("Object is destroyed by the Garbage Collector");
    }
    public double getX() {return x;}
    public void setX(double x1){this.x=x1;}
    public double getY(){return y;}
    public void setY(double y1){this.y=y1;}
    public void setXY(double x1,double y1){this.x=x1;this.y=y1;}
    public void move(double xDisp,double yDisp){this.x=this.x+xDisp;this.y=this.y+yDisp;}

    @Override
    public String toString() {
        return "Ball {" + "x=" + x + ", y=" + y + '}';
    }
}
