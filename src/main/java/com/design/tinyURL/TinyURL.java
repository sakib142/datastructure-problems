package com.design.tinyURL;

/**
 * @author sakib
 * 
 * http://blog.gainlo.co/index.php/2016/03/08/system-design-interview-question-create-tinyurl-system/
 * 
 * https://www.careercup.com/question?id=5185808560553984
 *
 */
public class TinyURL {
	private static final String ALPHABET_MAP = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final int BASE = ALPHABET_MAP.length();

	public static String encode(int IndexNum) {
		StringBuilder sb = new StringBuilder();

		while (IndexNum > 0) {
			sb.append(ALPHABET_MAP.charAt(IndexNum % BASE));
			IndexNum /= BASE;
		}
		return sb.reverse().toString();
	}

	public static int decode(String str) {
		int Num = 0;
		StringBuilder strNew = new StringBuilder(str);
		String rev_str = strNew.reverse().toString();
		for (int i = 0, len = rev_str.length(); i < len; i++) {
			//Num = Num * BASE + ALPHABET_MAP.indexOf(str.charAt(i));
			Num = (int) (Num + ALPHABET_MAP.indexOf(rev_str.charAt(i))*Math.pow(62, i));
			
		}
		return Num;
	}

	public static void main(String[] args) {
		System.out.println ( "Encoding for 123 is " + encode(123) ) ;
		System.out.println ( "Decoding for b9 is " + decode ("b9" ) ) ;

		//assertEquals("b9", encode(123));
		//assertEquals(123, decode("b9"));
	}
}
