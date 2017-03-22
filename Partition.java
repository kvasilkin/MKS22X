
		import java.util.*; 
		import java.io.*; 
	public class Partition {
public static int[] ex = {8,9,10,11, 12, 13,14,15,0,1, 2,3, 4,5, 6,7};
	 

	    public static int  Part (int [] input, int start, int end){
	if (start == end) {

		return start;} 
	int ind = new Random().nextInt(end - start + 1) + start;	
	swap(input, start, ind);
	int small = start;
	int big = end;
	for (int i = start; i < end ; i++){
if (input[i] > input[start]){
	swap(input, i, big);
	big --;
}



	}
swap (input, start, small);

	return input [small]; }


public static void  swap (int [] arr, int num1, int num2){
	int hold = arr[num1]; 
	arr[num1] = arr[num2];
	arr[num2] = hold;


}



		 public static void main(String[] args) {
		  
		    
		     System.out.println(Part(ex, 0, 14));
	System.out.println(Arrays.toString(ex));
		}
	}