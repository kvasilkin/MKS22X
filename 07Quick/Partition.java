
		import java.util.*; 
		import java.io.*; 
	public class Partition {
public static int[] ex = {7, 1 ,2 ,3,2, 4, 8, 11, 12, 1212, 56454, 3434, 9, 6, 5};
	 

	    public static int  Part (int [] input, int start, int end){
	int 	 ind = new Random().nextInt(end - start);	
		int num = input[ind];
		int temp = 0;
		//	int beg = start;
		//	int fin = end;
	for (int i = start; i < end; i++){
	    if ( i != ind){
		if(input[i] < num){
		    temp = input[end];
		    input[end] = input[start];
		    input[start] = temp;
		    start ++;
}

	if(input[i] > num){
	temp = input[end];
		    input[end] = input[start];
		    input[start] = temp;	
	end --;
	}
	}



	}
	
	return input[ind];}

		 public static void main(String[] args) {
		  
		    
		     System.out.println(Part(ex, 0, 7));
	System.out.println(Arrays.toString(ex));
		}
	}
