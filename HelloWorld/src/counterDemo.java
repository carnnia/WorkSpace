/*
Name:  Casey Carnnia
Date:  012.13.2012
Scope: Write a program to test your class definition: Counter
*/

public class counterDemo
{
	//- declare the main method
	public static void main (String[] args)
	{
	Counter myCounter = new Counter();
	System.out.println("First value of counter after instantiating the new object is: " + myCounter.getCounterValue());
	
	//show counter going up
	for (int x = 0; x < 5; x++)
	{
		myCounter.increaseCounter();
		System.out.println("Counter ++ " + myCounter.getCounterValue());
	}
	//ask counter to write to screen
	System.out.println("we upped the counter 5 times, so:");
    myCounter.tostringCounter();
	
	//show counter going down 
	for (int x = 0; x < 5; x++)
	{
		myCounter.decreaseCounter();
		System.out.println("Counter -- " + myCounter.getCounterValue());
	}
	//ask counter to write to screen
	System.out.println("we downed the counter 5 times, so:");
	myCounter.tostringCounter();
	//test for negative value
    System.out.println("Can counter go below 0? ");
	myCounter.decreaseCounter();
	
	//test the setter
    System.out.println("We can reset the counter which is curently at " + myCounter.getCounterValue() + " to zero: ");
	myCounter.resetCounter();
	System.out.println("So now the counter is " + myCounter.getCounterValue());
	
	}//main END
}//class END