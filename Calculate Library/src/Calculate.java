//This class contains methods that perform various operations
//@author LilyChen
// September 6,2018

public class Calculate {
	//return the square to input
	public static int square(int number) {
		int answer;
		answer = number*number;
       return answer;
       //return number*number;
	}
	public static int cube(int number) {
		int answer;
		answer = number*number*number;
		return answer;
		//return number*number*number;
	}
	public static double average(double number1,double number2) {
		double answer = 0.5*(number1 + number2);
		return answer;
	}
	public static double overloading(double number1,double number2, double number3) {
		double answer = (number1 + number2 + number3)/3;
		return answer;
	}
	public static double toDegrees(double number) {
		double answer = 180/3.14159*(number);
		return answer;
	}
	public static double toRadians(double number) {
		double answer = 3.14159/180*(number);
		return answer;
	}
	public static double discriminant(double a,double b,double c) {
		double answer = (b*b-4*a*c)/2/a;
		return answer;
	}
	public static String toImproperFrac(int a, int b, int c) {
		String answer = (a*c + b)+"/" + c;
		return answer;
	}
    public static String toMixedNum(int a, int b) {
    	String answer = (a/b) +"_" + ( a%b + "/" + b);
    	return answer;
    } 
    public static String foil(int a, int b, int c, int d) {
    	foil(a, b, c, d);
    	String answer = (a*c)*n + (b*c - a*d)*n + -b*d;
    	return answer;
    }
    public static boolean isDivisibleBy(int a, int b) {
    	if(a > b) {
    		System.out.println("true");
    	}else {
    		System.out.println("false");
    	}
    	boolean answer = true || false;
    	return answer;
    }
}
