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
    public static String foil(int a, int b, int c, int d, String n) {
        int coefficient1 = a*c;
        int coefficient2 = a*d + b*c;
        int coefficient3 = b*d;
        String answer= (coefficient1 + n +"^2 + "+coefficient2 + n +"+" + coefficient3);
    	return answer;
    }
    public static boolean isDivisibleBy(int a, int b) {
    	if(a%b == 0) {
            return true;
    }else {
    	return false;}
    }  
    public static double absValue(double a) {
    	if(a > 0) {
    		double answer = a;
    		return answer;
    	}else {
    		double answer = -a;
    		return answer;
    	}
  }
    public static double max(double a, double b) {
    	if(a>b) {
    		double answer = a;
    		return answer;	
    	}else {
    		double answer = b;
    		return answer;
    	}
    }
    public static double max (double a, double b, double c) {
    	if(a>b && b>c) {
    		double answer = a;
    		return answer;
    	}else if(b>c){
    		double answer = b;
    		return answer;
    	}else if(b<c){
    		double answer = c;
    		return answer;
    	}else {
    		double answer = a;
    		return answer;
    	}
    }
    public static int min(int a, int b) {
    	if(a<b) {
    		int answer = a;
    		return answer;
    	}else {
    		int answer = b;
    		return answer;
    	}
    }
    public static double round2(double a) {
        double coefficient3 = 100 * (a + 0.005);
        double coefficient4 = (int) coefficient3;
        double answer = coefficient4 / 100;
    	return answer;
    }
    public static double exponent(double a, int b) {
    	 double result = 1;
    	 for(int c=1; c<=b; c++) {
    		result = result * a;
    	 }
    		return result;
    }
    
    public static int factorial(int a) {
    	int result = a;
    	for(int b=1; b<a; b++) {
    		result = result*b;
    	}
    	return result;
    }
    public static boolean isPrime(int a) {
    	 for(int b =2; b<a; b++) {
    		 boolean c = isDivisibleBy(a,b);
    		if(c == true) {
    			return false;
    		}
    	 }
    	 return true;
    	}
    public static int gcf(int a, int b) {
    	int result = 1;
    	for(int factor = 2; factor<a && factor<b; factor++){
    	  boolean c = isDivisibleBy(a,factor);
    	  boolean d = isDivisibleBy(b,factor);
          if(c == true && d == true) {
    		 result = factor;
    	}
    }
    	return result;

    }
    public static double sqrt(double number) {
    	double result = 1;
    	for(double a = 1; number-result*result>=0.005 || result*result-number>=0.005; a++) {
    		result = 0.5*(number/a+a);
    	}
    	
    	return result;
    }
    		
  }
    	
    
