import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(calc(input));
	}
	
	public static String calc(String input) {
		try{
			int a, b, c;
			String [] strings = input.split(" ");
			if(strings.length != 3){
				throw new MyException();
			}
			char t = '1';
			for (char ch : input.toCharArray()) {
				t = ch;
			}
			if(t == ' '){
				throw new MyException();
			}
			if((strings[0].compareTo("1") != 0) && (strings[0].compareTo("2") != 0) && (strings[0].compareTo("3") != 0) && (strings[0].compareTo("4") != 0) && (strings[0].compareTo("5") != 0) && (strings[0].compareTo("6") != 0) && (strings[0].compareTo("7") != 0) && (strings[0].compareTo("8") != 0) && (strings[0].compareTo("9") != 0) && (strings[0].compareTo("10") != 0)){	
				throw new MyException();
			}
			if((strings[2].compareTo("1") != 0) && (strings[2].compareTo("2") != 0) && (strings[2].compareTo("3") != 0) && (strings[2].compareTo("4") != 0) && (strings[2].compareTo("5") != 0) && (strings[2].compareTo("6") != 0) && (strings[2].compareTo("7") != 0) && (strings[2].compareTo("8") != 0) && (strings[2].compareTo("9") != 0) && (strings[2].compareTo("10") != 0)){	
				throw new MyException();
			}
			try{
				a = Integer.parseInt(strings[0]);
				b = Integer.parseInt(strings[2]);
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
						c = a / b;
						return String.valueOf(c);
					default:
						throw new MyException();
				}
			}
			catch(NumberFormatException e){
				System.out.println("throws Exception");
			}
		}
		catch(MyException e){
			System.out.println("throws Exception");
		}
		return "0";
	}
}