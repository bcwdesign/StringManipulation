package com.bluecry.Basic;

public class Main {

	/*This program is used for reversing the order of a string passed into it. 
	 * For example passing the argument "manipulation" should return 
	 * "manipulation is noitalupinam in reverse!"
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sorting sRT = new Sorting(args);
		
		try {
			//Grab the String length
			int stringLen = args[0].length();
			
			//Verify that only one string was entered
			if(args.length != 1){
				throw new IllegalArgumentException("Please only enter one string as a parameter.");
			}else{
				String firstString = args[0];
				
				//Define variable to hold new String
				String backwardString="";
				
				/*Loop through String in reverse order, grab each 
				  character and build new string*/
				for (int i=stringLen-1;i>=0;i--){
					char currentChar = args[0].charAt(i);
					backwardString += currentChar;
				}
				
				//Print out new string
				System.out.println(firstString +" is "+backwardString + " in reverse!");
			}
		} catch (IllegalArgumentException illegalError){
			//Display error for invalid number of strings
			System.out.print(illegalError.getMessage());
		} catch (Exception error){
			System.out.print("Error! Please try again with different value or contact administrator");
		}
	}

}
