public class Circle {
   private double radius; 

   //constraction method
    
    Circle (double radius) {
    this.radius= radius;
   }

   public double getArea (){
    return radius*radius*3,14;
   }

   public double getPerimeter (){
    return 2*3,14*radius;
   }

   public void setRadius (double radius) {
    this.radius=radius;
   }
}

public class Test {
    public static void main(String[]args){
        Circle value= new Circle(5.4);
        Circle.setRadius(x);
        System.out.println(Circle.getArea());
        System.out.println(Circle.getPerimeter());
    }
}
