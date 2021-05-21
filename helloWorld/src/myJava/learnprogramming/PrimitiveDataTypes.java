package myJava.learnprogramming;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
	
		int myValue = 1000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Int min Value = " + myMinIntValue);
		System.out.println("Int min Value = " + myMaxIntValue);
		System.out.println("Busted max value =" + (myMaxIntValue + 1)  );
		
		int myMaxIntTest = 2_147_287_183;
		
		byte myMinByteV = Byte.MIN_VALUE;
		byte myMaxbyteV = Byte.MAX_VALUE;
		System.out.println("Byte min Value = " + myMinByteV);
		System.out.println("Byte max Value = " + myMaxbyteV);

		short myMinShortV = Short.MIN_VALUE;
		short myMaxShortV = Short.MAX_VALUE;
		System.out.println("Short min Value = " + myMinShortV);
		System.out.println("Short max Value = " + myMaxShortV);
		
		long myLongValue = 100L;
		long myMinLongV = Long.MIN_VALUE;
		long myMaxLongV = Long.MAX_VALUE;
		System.out.println("Long min Value = " + myMinLongV);
		System.out.println("Long max Value = " + myMaxLongV);
		 
		// These two hole my numbers but more memory. 
		float myMinfloatValue = Float.MIN_VALUE;
		float myMaxfloatValue = Float.MAX_VALUE;
		System.out.println("float min Value = " + myMinfloatValue);
		System.out.println("float max Value = " + myMaxfloatValue);
		
		double myMindoubleValue = Double.MIN_VALUE;
		double myMaxdoubleValue = Double.MAX_VALUE;
		System.out.println("double min Value = " + myMindoubleValue);
		System.out.println("double max Value = " + myMaxdoubleValue);
		
		int myIntValue = 5;
		float myfloatValue = (float) 5.34;
		double mydoubleValue = 5d;
		
		
		//How you could convert Pounds to kg
		double numberOfPounds = 200d;
		double convertedKilograms = numberOfPounds * 0.45359237d;
		System.out.println("Coverted kg = " + convertedKilograms );
		
	
		char myChar = 'D';
		char myUnicode = '\u0165';
		System.out.println(myUnicode);
		
		boolean mytrue = true;
		boolean myfalse = false;
	
		// Primitive Data Types 
		
		// byte  
		// short
		// int
		// long
		// float 
		// double
		// char 
		// boolean
		
		// Class Data Types
		
		// String;
		
		
		
		
	}

}
