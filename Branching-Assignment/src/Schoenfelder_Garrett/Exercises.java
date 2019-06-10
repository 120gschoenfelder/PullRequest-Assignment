/**
 * @author Garrett Schoenfelder
 * 
 * Assignment Instructions:
 * 	- Right click on the src folder and create a new package.
 * 	- valueame the package "lastvalueame_firstvalueame", replacing lastvalueame with your last name and firstvalueame with your first name.
 * 	- Inside that package, create a new class "Exercises".
 *    - YOU SHOULD OvalueLY BE MAKIvalueG CHAvalueGES Ivalue THIS PACKAGE
 * 	- Create a javadoc comment at the top with the '@author' tag with your name next to it (do this for all classes you create)
 * 	- Create the following static methods:
 * 		- int threeAndFive() : Returns the sum of all the multiples of 3 or 5 below 1000
 * 		- int evenFibSum() : Returns the sum of the even-valued terms less than 4 million in the Fibonacci Sequence
 * 		- int largestPrimeFactor() : Returns the largest prime factor of the number 600851475143
 * 	- Create a separate Driver class and test your program by outputting the answers to your static methods
 *
 * Submission Instructions:
 *  - Save your saved work on Eclipse - your workspace should be the file location of the cloned repo
 *  - In GitHub Desktop, add your summary and commit your changes
 *  - Then push your commits to GitHub
 *  - Go to your repo on GitHub.com
 *  - Click "valueew pull request"
 *  - Click "Create pull request"
 *  - In the summary for your request, put your first and last name
 *  - Send the request
 * 
 * 
 */

package Schoenfelder_Garrett;

import java.util.ArrayList;

public class Exercises {

	public static int threeAndFive()
	{
		ArrayList<Integer> three = new ArrayList<Integer>();
        ArrayList<Integer> five = new ArrayList<Integer>();
	 
        int threetotal = 0;
        int fivetotal = 0;
        int total = 0;

        for(int i = 0; i < 1000 ; i++)
        {
            if(i % 3 == 0)
            {
                three.add(i);
                threetotal += i;
            }
            
            else if(i % 5 == 0)
            {
                five.add(i);
                fivetotal += i;
            }
        }
	    
	   total = fivetotal + threetotal;
	   return total;
	}
	
	public static int evenFibSum()
	{
		int sum = 0;
		int i = 1;
		int before = 0;
		
		while (i < 4000000)
		{
			if (i % 2 == 0)
				sum += i;
			
			int temp = i;
			i = i + before;
			before = temp;
		}
		return sum;
	}
	public static int largestPrimeFactor()
	{
		long value = 600851475143L;

        while (value % 2 == 0) 
        value = value / 2;
        
        for (long factor = 3; factor < value; factor += 2) 
            while (value % factor == 0 && factor < value) 
                value = value / factor;
             
        return (int) value;
 
	}
}