import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(calc(input));
	}
	public static String calc(String input){
		int a, b, c;
		String [] strings = input.split(" ");
		if(strings.length != 3){
			return("throws Exception");
		}
		char t = '1';
		for (char ch : input.toCharArray()) {
			t = ch;
		}
		if(t == ' '){
			return("throws Exception");
		}
		if((strings[0].compareTo("1") != 0) && (strings[0].compareTo("2") != 0) && (strings[0].compareTo("3") != 0) && (strings[0].compareTo("4") != 0) && (strings[0].compareTo("5") != 0) && (strings[0].compareTo("6") != 0) && (strings[0].compareTo("7") != 0) && (strings[0].compareTo("8") != 0) && (strings[0].compareTo("9") != 0) && (strings[0].compareTo("10") != 0)){	
			return("throws Exception");
		}
		if((strings[2].compareTo("1") != 0) && (strings[2].compareTo("2") != 0) && (strings[2].compareTo("3") != 0) && (strings[2].compareTo("4") != 0) && (strings[2].compareTo("5") != 0) && (strings[2].compareTo("6") != 0) && (strings[2].compareTo("7") != 0) && (strings[2].compareTo("8") != 0) && (strings[2].compareTo("9") != 0) && (strings[2].compareTo("10") != 0)){	
			return("throws Exception");
		}
		try{
            a = Integer.parseInt(strings[0]);
			b = Integer.parseInt(strings[2]);
			if((a > 10) || (b > 10) ||(a < 1)||(b < 1)){
				return("throws Exception");
			}
			switch (strings[1]){
				case "+":
			    	c = a + b;
			    	return String.valueOf(c);
				case "-":
				    c = a - b;
					return String.valueOf(c);
				case "*":
					c = a * b;
					return String.valueOf(c);
				case "/":
					c = a/b;
					return String.valueOf(c);
				default:
					return("throws Exception");
			}
		}
		catch(NumberFormatException e){
			return("throws Exception");
		}
	}
}