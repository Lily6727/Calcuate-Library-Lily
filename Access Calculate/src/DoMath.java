//This class contains methods to  perform various mathematical topic
//@author LilyChen
//@ September,6th,2018

public class DoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(Calculate.square(5));
       System.out.println(Calculate.cube(5));
       System.out.println(Calculate.average(5,6));
       System.out.println(Calculate.average(5,6,7));
       System.out.println(Calculate.toDegrees(10*3.14159));
       System.out.println(Calculate.toRadians(30));
       System.out.println(Calculate.discriminant(1,2,1));
       System.out.println(Calculate.toImproperFrac(3,1,2));
       System.out.println(Calculate.toMixedNum(7 , 2));
       System.out.println(Calculate.foil(2, 3, 6, 7, "n"));
       System.out.println(Calculate.isDivisibleBy(2, 4));
       System.out.println(Calculate.absValue(-1));
       System.out.println(Calculate.max(9,3));
       System.out.println(Calculate.max(3, 6, 4));
       System.out.println(Calculate.min(4, 6));
       System.out.println(Calculate.round2(4.56398));
       System.out.println(Calculate.exponent(2.5, 6));
       System.out.println(Calculate.factorial(25));
       System.out.println(Calculate.isPrime(5));
       System.out.println(Calculate.gcf(6, 9));
       System.out.println(Calculate.sqrt(0.0625));
	}

}
