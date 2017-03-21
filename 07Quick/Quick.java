
		import java.util.*; 
		import java.io.*; 
	public class Quick.java {
public static int[] ex = {7, 1 ,2 ,3,2, 4, 8, 11, 12, 1212, 56454, 3434, 9, 6, 5};
	 

	    public static int  Part (int [] input, int start, int end){
	int 	 ind = new Random().nextInt(end - start);	
	int small = start + 1;
	int big = end;
	int lt = start + 1;
	int gt = end;
	int check = input [ind];
	swap(input, ind ,lt);
	for (i = start + 1; i < end; i++){
	    if (start == end){return start;}

	    if (input[i] > check){
		swap(input, big, i);
		big --;
}
	    if (input [i] == check){
		swap(input,lt, i  );
}

}
	}
	    public static void swap (int  [] arr, int i, int j){
		int hold = arr[i];
		arr[i] = arr[j];
		arr[j] = hold;
}


		 public static void main(String[] args) {
		  
		    
		     System.out.println(Part(ex, 0, 10));
	System.out.println(Arrays.toString(ex));
		}
	}
