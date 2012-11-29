/*
Name:		Casey Carnnia
Date: 		10.09.2012
Scope:		Problem 1:
			Write a program that would display the following:
										
			*    *    *    *    *    *    *    *    *    *
			*    *    *    *    *    *    *    *    *
			.
			.
			.
			*    *    *
			*    *
			*
			
			Modify the previous program to display the following:
			*    *     *    *     *    *    *    *     *    *
			*          *           *         *           *
			*          *           *         *
			*          *           *
			*          *
			*
			
			Problem 2:
			Display the following table
			
			1          2      6         24   
			2          6    24       120   
			6        24    20        840
			24    120    840    7560

Solution: 	Problem 1 (part1): Implement a loop that goes from 10 to 0
									Implement a loop that goes from (current value of outterloop's counter) to 0
									and in each iteration print a line of that many "+\t" without a line brake
						and in each iteration it prints a line brake
						
			Problem 1 (part2): Implement a loop that goes from 10 to 0
									if current value of outterloop's counter is 10
										Implement a loop that goes from (current value of outterLoop's counter) to 0
										and in each iteration print a line of that many "+\t\t" without a line brake
										
										prints a line brake when it comes out of inner-loop
									else 
										Implement a loop that goes from [ (current value of outterLoop's counter) - 4 ] to 0
										and in each iteration print a line of that many "+\t\t" without a line brake
										
										prints a line brake when it comes out of inner-loop 
			Problem 2: Implement a loop that goes from 10 to 0
									Implement a loop that goes from (current value of outterloop's counter) to 0
									and in each iteration print a line of that many "+\t" without a line brake
						and in each iteration it prints a line brake
			 
									
				
				
*/
 
// declare class
public class Exercise2Loops{
	//declare the main method
	public static void main(String[] args) {
		 //problem 1.1 using a while loop
		 int x = 0;
		 while( x < 10 ){
			 int y = x;
			 while( y > 0 ){
				 System.out.print("*\t" );
		         y--;
			 }//Inner while loop END
			 System.out.print("\n");
		         x++;
		}//Border while loop END
		
		System.out.println("Nice bet nor correct, try again Casey.");
		
		//problem 1.1 using a while loop
		 int outterCounter = 10;
		 while( outterCounter > 0 ){
			 int innerCounter = outterCounter;
			 while( innerCounter < 10 ){
				 System.out.print("*\t" );
		         innerCounter++;
			 }//Inner while loop END
			 System.out.print("\n");
			 outterCounter--;
		}//Border while loop END
		
		 System.out.println("Still not correct, try again Casey.");
		 
		//problem 1.1 using a while loop
		 int outterLoop = 10;
		 while (outterLoop > 0){
			 int innerLoop = outterLoop;
			 while( innerLoop > 0 ){
				 System.out.print("*\t" );
		         innerLoop--;
			 }//Inner while loop END
			 
			 System.out.print("\n");
			 outterLoop--;
		 }//outter while loop END
		
		 System.out.println("OK you got it Casey. Now do it with FOR loop.");
		 
		//problem 1.1 using a for loop
		 int outCounter, inCounter;
		 for (outCounter = 10; outCounter > 0; outCounter--){
			 for(inCounter = outCounter; inCounter > 0; inCounter--){
				 System.out.print("*\t" );
			 }//inner-forloop END
			 System.out.print("\n");
		 }//outter-forloop END
		  
		 System.out.println("OK you got it Casey. Go to part 2 of problem 1.");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 
		//problem 1.2 using a while loop
		 int outW1, inW1;
		 outW1 = 10;
		 while (outW1 > 0){
			 if (outW1 == 10){
				 inW1 = outW1;
				 while (inW1 > 0){
					 System.out.print("*\t" );
					 inW1--;
				 }//inner-while-loop IF leg END
				 System.out.print("\n");
			 }
			 else{//i found the -4 by try/error
				 inW1 = outW1 - 4;
				 while (inW1 > 0){
					 System.out.print("*\t\t");
					 inW1--;
				 }//inner-while-loop else leg END
				 System.out.print("\n");
			 }//if END
			 outW1--; 
		 }//outter-while-loop END
		  
		 System.out.println("OK you got it Casey. Now do it with a for loop.");
 
		 
		//problem 1.2 using a for loop
		 int out2Counter, in2Counter;
		 for (out2Counter = 10; out2Counter > 0; out2Counter--){
			 if (out2Counter == 10){
				 for(in2Counter = out2Counter; in2Counter > 0; in2Counter--){
					 System.out.print("*\t" );
				 }//inner-forloop IF leg END
				 System.out.print("\n");
			 }
			 else{//i found the -4 by try/error
				 for(in2Counter = out2Counter - 4 ; in2Counter > 0; in2Counter--){
					 System.out.print("*\t\t");
				 }//inner-forloop else leg END
				 System.out.print("\n");
			 }//if END
			
			 
		 }//outter-forloop END
		  
		 System.out.println("OK you got it Casey. Go to problem 2 of problem 1.");
		 int factorialA, factorialB, factorialC;
		 factorialA = 1;
		 while (factorialA < 5){
			 System.out.print(factorialA * (factorialA + 1) + "\t");
			 factorialA ++;
			 System.out.print("\n");
		 }//while for factorialA END
 
		
		  
  
	}//main END
}//class END

 