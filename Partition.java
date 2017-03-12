		import java.util.*; 
		import java.io.*; 
	public class Partition {
public static int[] ex = {7, 1 ,2 ,3,2, 4, 5, 4, 8, 11, 12, 1212, 56454, 3434, 9, 6, 5};
public static int[] result;

	public static int [] Part (int [] input, int ind){
	result = new int[input.length];
	int big = input.length - 1;
	int small = 0;
	int num = input[ind];
	for (int i = 0; i < result.length; i++){
	if ( i != ind){
	if(input[i] < num){
		result[small] = input[i];
	small ++; }

	if(input[i] > num){
		result[big] = input[i];
	big --;
	}
	}



	}

	result[small] = input[ind];
return result;}

		 public static void main(String[] args) {
		 	Part (ex, 0);
		System.out.println(Arrays.toString(result));

	
		}
	}