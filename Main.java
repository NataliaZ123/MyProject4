import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner scan = new Scanner(System.in);
        System.out.println(Calculator(scan.nextLine()));
    }
    static String Calculator(String s) throws MyException {
        int a = 0, b = 0, c;
        boolean bb = false;
        String[] roman = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] numbers = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String [] strings = s.split(" ");
        if (strings.length != 3){
            throw new MyException();
        }
        for(int i = 1; i < roman.length; i++){
            if(strings[0].equals(roman[i])){
                a = i;
            }
        }
        if(a != 0){
            for(int i = 1; i < roman.length; i++){
                if(strings[2].equals(roman[i])){
                    b = i;
                    bb = true;
                }
            }
        }
        if(b == 0 && a == 0){
            for(int i = 1; i < numbers.length; i++){
                if(strings[0].equals(numbers[i])){
                    a = i;
                }
            }
            if(a != 0){
                for(int i = 1; i < numbers.length; i++){
                    if(strings[2].equals(numbers[i])){
                        b = i;
                    }
                }
            }
        }
        if(b == 0 || a == 0){
            throw new MyException();
        }
        switch(strings[1]){
            case "+":
                c = a+b;
                break;
            case "-":
                c = a-b;
                break;
            case "/":
                c = a/b;
                break;
            case "*":
                c = a*b;
                break;
            default:
                throw new MyException();
        }
        if (bb == true){
            if(c<1){
                throw new MyException();
            }
            String s3 = "";
            String[] strings1 = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            if(c == 100){
                return "C";
            }
            else{
                s3 += strings1[c/10];
                s3 += roman[c%10];
                return s3;
            }
        }
        else{
            return String.valueOf(c);
        }
    }
}
