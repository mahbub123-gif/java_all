package final_exam;
interface A {
	 void toLowerCase();
	 void sort();

}

public class question_1 implements A {

    

    public static void main(String[] args) {
        {
            String S1 = new String("UPPERCASE CONVERTED TO LOWERCASE");
            //Convert to LowerCase
            System.out.println(S1.toLowerCase());
            
            int [] arrayName = new int[10];
            for (int i = 0; i < arrayName.length; i++) {
              arrayName[i] = (int)(Math.random()*100);
            }

            System.out.println (sort(1,2,3,4));

    }
        

    
       
        
    static void  sort (int [] arrayName){
            int temp;
            for (int i = 0; i < arrayName.length-1; i++)
            {
                if(arrayName[i] > arrayName[i+1])
                {
                    temp=arrayName[i];
                    arrayName[i]=arrayName[i+1];
                    arrayName[i+1]=temp;
                    i=-1;}
}
}





	@Override
	public void toLowerCase() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
    }