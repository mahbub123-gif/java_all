public class Arrange extends Thread {
	private char charToProcess; 
	
	char inputArray[];
	
	public StringBuilder resultString=new StringBuilder();
	
	public Arrange(char charToProcess, char[] inputString) {
		this.charToProcess = charToProcess;
		this.inputArray = inputString;
	}
	
	
	
	public void run() 
	{
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i] == charToProcess)
			{
				resultString.append(inputArray[i]);
			}
		}
	}
	
	public String getThreadResult()
	{
		return resultString.toString();
	}


}