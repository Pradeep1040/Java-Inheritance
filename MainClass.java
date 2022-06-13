package org.jsp.BasicsInheritance;

public class MainClass 
{
	public static void main(String[] args) 
	{
		ParentTrip p1 = new ParentTrip();
		p1.vehicle();//bus
		p1.place();//kashi
		
		ChildTrip c1 = new ChildTrip();
		c1.vehicle();
		c1.place();
		
	}

}
