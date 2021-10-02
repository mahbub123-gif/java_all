package lab5;
public class Icecream {
    String icecreamType;
    String icecreamCompany;
    double icecreamPrice;
   Icecream()
   {
       icecreamType=" ";
       icecreamCompany=" ";
       icecreamPrice=0;
   }
   Icecream(String icecreamType, String icecreamCompany,double icecreamPrice)
   {
       this.icecreamType=icecreamType;
       this.icecreamCompany=icecreamCompany;
       this.icecreamPrice=icecreamPrice;
   }   
   public String toString(){  
	   return icecreamType+" "+icecreamCompany+" "+icecreamPrice;  
   }
	  
   void display() {
System.out.println(icecreamType+" "+icecreamCompany+" "+icecreamPrice);

   }
   }
