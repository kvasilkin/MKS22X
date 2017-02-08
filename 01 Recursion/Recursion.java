public class Recursion{
    //returns name
 public static String name(){
     return	 "Vasilkin,Katherine";}

    //calls helper function
    public static double sqrt(double n){
	if(n < 0){
	    throw new  IllegalArgumentException("n cannot be negative");
	}
	if(n == 0){return 0;}
	return helper(n, n/2);
    }
   
    //helper function
    public static double helper(double n, double guess){
       
	if(Math.abs((guess * guess) - n) / n <= .00000000001){
	    return guess;
	}
	else{	return helper(n, ( n / guess + guess) / 2);}	

    }
    public static void main(String[] args){
	System.out.println(name());

	System.out.println(sqrt(0));
	System.out.println(sqrt(10));
	System.out.println(sqrt(900));
	System.out.println(sqrt(11));
	System.out.println(sqrt(2));
	System.out.println(sqrt(100));
	System.out.println(sqrt(9));
	System.out.println(sqrt(90));
	System.out.println(sqrt(900));
	System.out.println(sqrt(16));
	System.out.println(sqrt(1000000));
		System.out.println(sqrt(-11));

	    }
    
}
