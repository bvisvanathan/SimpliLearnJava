package javabasics;

public class TypeCasting {
	
	public static void main(String[] args) {
		// WAP for converting a short value (height= 6) to other implicit types
		//	short -> int , float, double , 
		
		// WAP to convert a double value ( weight = 200.34 ) to other explicit types
		// double -> float -> int -> short -> byte
		// implicit type conversion
		
		short height = 6;
		int heightInt = height;
		float heightFloat = height;
		double heightDouble = height;
		
		System.out.println("the value of integer - "+ heightInt);
		System.out.println("the value of float - "+ heightFloat);
		System.out.println("the value of double - "+ heightDouble);
		
		double weight = 200.34;
		float weightFloat = (float)weight;
		int weightInt = (int)weight;
		short weightShort = (short)weight;
		byte weightByte = (byte)weight;
		
		System.out.println("the value of weightfloat - "+ weightFloat);
		System.out.println("the value of weightint - "+ weightInt);
		System.out.println("the value of weightshort - "+ weightShort);
		System.out.println("the value of weightbyte - "+ weightByte);
		
		System.out.println("*************");
		
		
		int number = 10;
		byte age = 2;
		System.out.println("the value of integer - "+ number);
		float floatNumber = number;
		System.out.println("the value of float - "+ floatNumber);
		double doubleNumber = number;		
		System.out.println("the value of double - "+ doubleNumber);
		short ageShort = age;
		long  ageLong = ageShort;
		// expllicit type conversion
		double price = 150.75;
		float priceFloat = (float)price;
		System.out.println("the value of double - "+ priceFloat);
		int priceInt = (int) price;
		System.out.println("the value of double - "+ priceInt);
		
		
	}

}
