package lab5;

public class Lab4ProblemA {
    public static void main(String[] args) {
        Icecream obj1=new Icecream();
        obj1.icecreamType="vanilla";
        obj1.icecreamCompany="Igloo";
        obj1.icecreamPrice= 10;
        Icecream obj2=new Icecream();
        obj2.icecreamType="Chocolate";
        obj2.icecreamCompany="Igloo";
        obj2.icecreamPrice=20;
        obj1.toString();
        obj2.toString();
        obj1.display();
        obj2.display();
    }   
}