public class TestingClass {


	public static void main(String[] args) throws InterruptedException {
		
		char input[] = {'X','O','O','O','X','X','O','X','X','X'};
		
		Arrange thread1 = new Arrange('X', input);
		Arrange thread2 = new Arrange('O', input);
		
		thread1.start();
		thread2.start();
	
		thread1.join();
		thread2.join();
		
		char[] out = new char[input.length];
		
		String outputString =  thread1.getThreadResult()+thread2.getThreadResult();
		
		for(int i=0;i<outputString.length();i++)
		{
			out[i]  = outputString.charAt(i);
		}
		System.out.println(out);
	}


}