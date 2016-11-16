package com.bluecry.Basic;

public class FileSummation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			/*Check to see if three paramaters were passed*/
			if (args.length != 3){
				new IllegalArgumentException("Please enter three strings as parameters.");
			}
			
			//Validate parameters
			
			//Set the key values
			int totalCount = Integer.parseInt(args[0]);
			int startCount = Integer.parseInt(args[1]);
			
			
			System.out.print("TotalCount: "+totalCount + " StatrCount:"+startCount);
			
		
		} catch(IllegalArgumentException iae) {
			System.out.print(iae.getMessage());
		} catch(Exception me) {
			System.out.print(me.getMessage());
		}		
		
	}

}
