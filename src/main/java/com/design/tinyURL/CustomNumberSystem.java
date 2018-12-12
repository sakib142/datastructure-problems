package com.design.tinyURL;

/**
 * @author sakib
 *
 */
public class CustomNumberSystem {
	
	/**
	 * This function will convert decimal number into the respective Binary and OCTA
	 * Decimal(0-9) to Binary(0,1)
	 * Decimal(0-9) to OCTAL(0,7)
	 * 
	 */
	 
	public static String encodeDecimalnumberToBinaryHexa(int decimalNumber, int base) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		while(decimalNumber>0) {
			
			/*
			 * Take to Modular Deviser of the DecimalNumber with the base - This will return the remainder
			 * 
			 * 122%2 = 0
			 * 
			 * 61%2 = 1
			 * 
			 */
			int remainder = decimalNumber%base;
			
			// Append the remainder to the String
			stringBuilder.append(remainder);
			
			// Every time Divide the number with the base
			decimalNumber = decimalNumber/base;
			
		}
		
		String covertedNumber = stringBuilder.reverse().toString();
		
		return covertedNumber;
	}
	
	
	/**
	 * This function will convert decimal number into the respective HEXA and CustomBASE -62
 	 * Decimal(0-9) to HEXA(0,9a-f)
	 * Decimal(0-9) to 62 BASE - For this we have to write a custom Number system [0-9a-zA-z]
	 * 
	 * For this we have to define our own Number System
	 */
	public static String encodeDecimalnumberToHexaAndCustomBase(int decimalNumber, int base) {
		
		String aphabetMapNumbersystem= "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder stringBuilder = new StringBuilder();
		
		while(decimalNumber>0) {
			
			int remainder = decimalNumber%base;
			
			// Here get the value from the customNumberSystem
			stringBuilder.append(aphabetMapNumbersystem.charAt(remainder));
			
			// Every time Divide the number with the base
			decimalNumber = decimalNumber/base;
			
		}
		
		// Reverse the string into MSB
		String covertedNumber = stringBuilder.reverse().toString();
		
		return covertedNumber;
	}
	
	private static String decodeTOdecimalNumber(String number, int base) {

		int decodedNumber = 0;

		StringBuilder stringBuilder = new StringBuilder(number);
		String s = stringBuilder.reverse().toString();

		for (int i = 0; i < number.length(); i++) {
			String customNumberSystem = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			int num = customNumberSystem.indexOf(s.charAt(i));
			
			/*
			 * 1011011 to Decimal
			 * 1*2^6 + 0*2^5 + 1*2^4 + 1*2^3 + 0*2^2 + 1*2^1 + 1*2^0
			 * 	
			 * 354 to OCTAL
			 * 3*8^2 + 5*8^1 + 4*8^0
			 * 
			 * 9AF to HEXA
			 * 9*16^2 + 10*16^1 + 15*16^0
			 * 
			 */
			decodedNumber = decodedNumber + (int) (num * (Math.pow(base, i)));
		}

		return "" + decodedNumber;

	}
	
	private static void decodeTOdecimalNumberForBinaryOcta(String number, int base) {/*

		int decodedNumber = 0;

		StringBuilder stringBuilder = new StringBuilder(number);
		String s = stringBuilder.reverse().toString();

		for (int i = 0; i < number.length(); i++) {
			int num = s.charAt(i);
			decodedNumber = decodedNumber + (int) (num * (Math.pow(base, i)));
		}

		return "" + decodedNumber;

	*/}
	
	public static void main(String[] args) {
		
		/*String ecodeToBinary = encodeDecimalnumberToBinaryHexa(122, 2);
		System.out.println(ecodeToBinary);
		
		String ecodeToOcta = encodeDecimalnumberToBinaryHexa(122, 8);
		System.out.println(ecodeToOcta);
		
		String ecodeToHexa = encodeDecimalnumberToHexaAndCustomBase(122, 16);
		System.out.println(ecodeToHexa);
		
		String ecodeTo62 = encodeDecimalnumberToHexaAndCustomBase(122, 62);
		System.out.println(ecodeTo62);*/
		
		String decodeToDeciam = decodeTOdecimalNumber("aZ2", 62);
		System.out.println(decodeToDeciam);
		
	}
}
