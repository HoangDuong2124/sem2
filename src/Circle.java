public class Circle {
    double radius =1.0 ;

    public Circle(){
        radius = 2.0;
    }
    public Circle( double radius){
        this.radius = radius;
    }
    double getRadius(){
      return radius;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
   double getCircumference(){
        return 2*Math.PI*radius;
   }
    public String toString(){
        return "Circle[radius= " +radius+ "]";
  }
}
