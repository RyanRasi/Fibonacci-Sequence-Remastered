package Fibonacci;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger beforeA = new BigInteger("0"); 	 	//Int is too small to hold a number this big so had to import BigIntegers
		BigInteger beforeB = new BigInteger("1"); 		//
		BigInteger currentNumber = new BigInteger("0"); //These variables hold the number in a larger storage medium to calculate all the numbers till you reach the desired term
		
	     float phi = (float) 1.618033989; //Sets variables for the Wolfram equation for solving the fibonacci sequences terms
	     float curr = 1;
	     float noOfDigits = 0; //Starts at 0 and counts to 999

	     float fiveSqrt = (float) Math.sqrt(5);
	     long roundedNumber = 0;
		
	     while(noOfDigits < 999){ //Loops 999 times to avoid an extra loop 
	    	 noOfDigits = (float) ((curr*Math.log10(phi)) - Math.log10(fiveSqrt)); //Wolfram Alpha equation in java form
	    	 roundedNumber = (long)noOfDigits + 1; //The amount of digits thus far
	    	 curr++; //Counts the terms
	    	 }
    	 System.out.println("curr : " + (curr -1) + " Digits : " + Math.round(roundedNumber)); //Have to minus 1 as the while loop will recur one more time than we want
		
		for (int i = 0; i < curr-2 ; i++) { //Minus 2 as we miss 0 and 1 in the sequence as we have to initialise the variables with them and so they are not counted
			currentNumber = beforeA.add(beforeB);//This bit basically swaps the variables round so C becomes A + B then A becomes B then B becomes C then loops around
			beforeA = beforeB; //The variables get stored in big integers to cope with the size
			beforeB = currentNumber;		
		}
		System.out.println("The 1000th term is: \n" + currentNumber); //Final out put of the 1000'th term in the sequence
	

}
}

