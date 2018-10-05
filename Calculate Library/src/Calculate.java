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
	//return 0.5*(number1+number2);
	
	public static double average(double number1,double number2, double number3) {
		double answer = (number1 + number2 + number3)/3;
		return answer;
	}
	//return (number1+number2+number3)/3;
	
	public static double toDegrees(double number) {
		double answer = 180/3.14159*(number);
		return answer;
	}
	//return the result of formula;
	
	public static double toRadians(double number) {
		double answer = 3.14159/180*(number);
		return answer;
	}
	//use the formula 3.14159/180*(number)to calculate the result;
	//then return result;

	public static double discriminant(double a,double b,double c) {
		double answer = (b*b-4*a*c)/2/a;
		return answer;
	}
	//create a class, call a method, and put a,b,c in the formula(b*b-4a*c)/2/a;
	
	public static String toImproperFrac(int a, int b, int c) {
		if(c == 0)throw new IllegalArgumentException("Denominator cannot be zero");
		String answer = (a*c + b)+"/" + c;
		return answer;
	}
	//create the class, and put a,b,c in (a*c + b)+"/" +c; (because the form of the answer looks like 7/2, need to print "/";
	
    public static String toMixedNum(int a, int b) {
    	String answer = (a/b) +"_" + ( a%b + "/" + b);
    	return answer;
    } 
    //create the class, put a,b,c in(a/b)+"_"+(a%b[reminder]+"/"+b);
    public static String foil(int a, int b, int c, int d, String n) {
        int coefficient1 = a*c;
        int coefficient2 = a*d + b*c;
        int coefficient3 = b*d;
        String answer= (coefficient1 + n +"^2 + "+coefficient2 + n +"+" + coefficient3);
    	return answer;
    }
    //create a class, accept the String, because String cannot accept this symbol"^", use coefficient, create 3 different coefficient, then use them to calculate;
    public static boolean isDivisibleBy(int a, int b) {
    	if(a==0)throw new IllegalArgumentException("Cannot be calculated with a factor of zero");
    	if(a%b == 0) {
            return true;
    }else {
    	return false;}
    }  
    // first write the header, then use if because this method is used to judge whether a%b = 0,if a%b equals zero, return true, else return false.
    
    public static double absValue(double a) {
    	if(a > 0) {
    		double answer = a;
    		return answer;
    	}else {
    		double answer = -a;
    		return answer;
    	}
  }
    //create the class, write the header and method, for running, use if statement, if a>0, double answer = a,return a; if a<0,double answer = -a, return -a;
   
    public static double max(double a, double b) {
    	if(a == b)throw new IllegalArgumentException("Cannot run");
    	if(a>b) {
    		double answer = a;
    		return answer;	
    	}else {
    		double answer = b;
    		return answer;
    	}
    }
    //create a class, write the method and header, use if statement to do that;
    //if a>b, return a;
    //else return b (because only two possibilities)
    
    public static double max (double a, double b, double c) {
    	if(a == b && b == c)throw new IllegalArgumentException("Cannot run");
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
    // overloading method, use if & else if statement;
    //if a>b && b>c, return a, if a is less, compare b and c;
    //if b>c, answer = b;
    //if b<c, answer = c
    //final, return answer a ;
    
    public static int min(int a, int b) {
    	if(a == b)throw new IllegalArgumentException("Cannot run");
    	if(a<b) {
    		int answer = a;
    		return answer;
    	}else {
    		int answer = b;
    		return answer;
    	}
    }
    // like max, put two integers, then compare;
    // if a<b, return answer a, else, return b. (because only two numbers);
    
    public static double round2(double a) {
        double coefficient3 = 100 * (a + 0.005);
        double coefficient4 = (int) coefficient3;
        double answer = coefficient4 / 100;
    	return answer;
    }
    //it accepts a double, first, add 0.005 for 4 or 5 in the third place, then times 100, this is coefficient3;
    //for coefficient4, get the int part of coefficient3;
    //double answer equals to coefficieent4/100;
    //return answer;
    
    public static double exponent(double a, int b) {
    	if(a<0)throw new IllegalArgumentException("Do not accept negative numbers");
    	 double result = 1;
    	 for(int c=1; c<=b; c++) {
    		result = result * a;
    	 }
    		return result;
    }
    //create a class, give an initial called 1, initial c = 1, if c less than b, then result = a^c, when c >b, stop running. 
    
    public static int factorial(int a) {
    	if(a<0)throw new IllegalArgumentException("Could not have negative numbers");
    	int result = a;
    	for(int b=1; b<a; b++) {
    		result = result*b;
    	}
    	return result;
    }
    // create a class, give an initial called b = 1, when b less than a, the result equals to a^b, if it is true, b++,then run.
   
    public static boolean isPrime(int a) {
    	if(a<0)throw new IllegalArgumentException("Different way to calculate");
    	 for(int b =2; b<a; b++) {
    		 boolean c = isDivisibleBy(a,b);
    		if(c == true) {
    			return false;
    		}
    	 }
    	 return true;
    	}
    // create a class, for isPrime, it has one number can divide, so use isDivisibleBy to judge, create a boolean c called (a,b), if c == true, means a is not a prime, else, c == false, means a is a prime.  
    
    public static int gcf(int a, int b) {
    	if(a<0)throw new IllegalArgumentException("Cannot calculate with negative numbers");
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
    // create a class, create a cup called "integer" result = 1, for for loops, give an initial called integer factor = 2, if factor<a && factor<b.
    // then run boolean c and boolean d, if both of them are true, result = factor, then update, run again.
    
    public static double sqrt(double number) {
    	if(number < 0)throw new IllegalArgumentException("Could not have a negative square root");
    	double result = 0.01;
    	for(double a = 0.01; number-result*result>=0.005 || result*result-number>=0.005; a+=0.001) {
    		double coefficient6 = 0.5*(number/a+a);
    		result = round2(coefficient6);
    	   
    		
    	}
    	return result;
    }
    // create a class, create a cup called double result = 1, for for loop, give an initial called double a = 1, then give the test
    // which is number - result*result>=0.005 ||result*result - number>=0.005, then use the law, double coefficient6 = 0.5*(number/a+a)
    //final do the round 2 to round the answer , then update and run again.
    
    public static double min2(double a, double b) {
    	if(a>b) {
    		return a;
    	}else {
    		return b;
    	}
    }
    
    public static String quadForm(int a, int b, int c){
    	//part 4
    	//uses the quadratic formula to approximate the real roots.
    	if((discriminant(a,b,c)>=0)) {
    		double d = round2((-b + sqrt(discriminant(a,b,c)))/-2/a);
    		double e = round2((-b + sqrt(discriminant(a,b,c)))/-2/a);
    		double rt1st;
    		double rt2nd;
    		if(d != e) {
    			rt1st = min2(d,e);
    		}else {
    			rt1st = d;
    		}
    		if(rt1st == d) {
    			rt2nd = e;
    		}else {
    			rt2nd = d;
    		}
    		String root1 = Double.toString(rt1st);
    		String root2 = Double.toString(rt2nd);
    		if(rt1st == rt2nd) {
    			return root1;
    		}else {
    			return root1 + "and" + root2;
    		}
    	}else {
    		return "no real roots.";
    	}
    	
    }
    
    public static int rangeOfNumbers(int a, int b){
		if(a<b) {
			while(a<b) {
				System.out.print(a+" ");
				a++;
			}
			int answer = a;
			return answer;
		}else if(a>b){
			while(a>b) {
		      System.out.print(a+" " );
		      a--;
		}
			int answer = a;
		return answer;
	}else if(a == b) {
		int answer = a;
		return answer;
	}
		return a;
	}
    
    //part5
    
 }
    	
    
