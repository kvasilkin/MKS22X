
		import java.util.*; 
		import java.io.*; 
	public class Quick {

	 public  static int [] ex;

	    public static int  Part (int [] input, int start, int end){
	int 	 ind = start + new Random().nextInt(end - start);	
	int lt = start ;
	int gt = end;
	int check = input [ind];
	int i = start;
while (i < gt){
if (input[i] == check ){
			i ++;
						}
else if  (input[i] < check){
	swap (input, i, lt);
	lt++;
	i++;
}

else {
	swap (input, i, gt);
	gt--;
}

	

	}
return ind;}
	    public static void swap (int  [] arr, int i, int j){
		int hold = arr[i];
		arr[i] = arr[j];
		arr[j] = hold;
}


		 public static void main(String[] args) {
		  int len = 20;
		  ex = new int [len];
		  for (int i = 0; i < len - 1; i ++){
ex [i] = new Random().nextInt(5);	
		  }
		    
		     System.out.println(Part(ex, 0, len -1 ));
	System.out.println(Arrays.toString(ex));
		}
	}