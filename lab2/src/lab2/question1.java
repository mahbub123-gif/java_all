package lab2;
class Geometric{
	double radius;
	double length;
	double width;

}
class circle extends Geometric{
	circle(double radius){
		this.radius=radius;
	}
	double circlearea() {
		return Math.PI*radius*radius;
	}
	double diameter() {
		return 2*radius;
	}
}
class rectangle extends Geometric{
    rectangle(double radius,double length,double width){
    this.radius=radius;
    this.length=length;
 this.width=width;
}
    double rectarea(){
        return length*width;
    }
    double perimeter(){
        return 2*width*length;
    }
}

public class question1 {

	public static void main(String[] args) {
		circle m=new circle(30);
	       rectangle n=new rectangle(44,12,32);
	        System.out.println("area of circle is : "+m.circlearea());
	        System.out.println("diameter of circle is : "+m.diameter());
	        System.out.println("area of rectangle is :"+n.rectarea());
	    System.out.println("perimeter of rectangle is : "+n.perimeter());
	    }
}
	   
