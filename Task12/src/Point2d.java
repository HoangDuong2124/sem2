public class Point2d {
    private int x,y;
    public Point2d(){
        this.x=0;
        this.y=0;
    }
    public Point2d(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public  String toString(){
        return "("+this.x+","+this.y+")";
    }
}
