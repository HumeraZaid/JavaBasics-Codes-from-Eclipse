package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<15;i++)
		{
			System.out.println("Hello");
			
			if(i==3)
			{
				break;
			}
		}
		
		// break - breaks the loop and it is usually used inside some type of conditions
		
		boolean hungry=true;
		while(hungry)
		{
			System.out.println("Give me food");
			break;	
		}
		System.out.println("End");
	}

}
