import java.util.Scanner;

public class QuestionOne {
	public static void main (String [] args){
		Scanner reader = new Scanner(System.in);
		String inputString = reader.next();
		// Reverse and Reshuffle print to console
		System.out.println(reverse(inputString));
		System.out.println(reshuffle(inputString));
		
	}
	// Can use StringBuilder or StringBuffer
	// Using Basic loop
	public static String reverse(String input){
	    char[] inChar = input.toCharArray();
	    char temp;
	    for(int i = 0; i < inChar.length/2; i++){
	    	temp = inChar[i];
	    	inChar[i] = inChar[inChar.length-1-i];
	    	inChar[inChar.length-1-i] = temp;
	    }
	    return new String(inChar);
	}
	
	public static String reshuffle(String s){
        String newString = ""; 
        while (s.length() != 0)
        {
            int index = (int) Math.floor(Math.random() * s.length());
            char c = s.charAt(index);
            s = s.substring(0,index)+s.substring(index+1);
            newString += c;
        }
        return newString;
    }
}
