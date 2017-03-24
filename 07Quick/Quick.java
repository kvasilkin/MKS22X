
		import java.util.*; 
		import java.io.*; 
	public class Quick {

	 public  static int [] ex;

	    public static int  Part (int [] input, int start, int end){
if (start == end) {
	    return start;
	}

	int ind = start + new Random().nextInt(end - start);
	int lt = start ;
	int gt = end -1 ;
	int check = input [ind];
	int i = start + 1;
	swap(input, lt, ind);
while (i <= gt){
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
return lt;}


	    public static void swap (int  [] arr, int i, int j){
		int hold = arr[i];
		arr[i] = arr[j];
		arr[j] = hold;
}


		 public static void main(String[] args) {
		 
		 int[] ary = {9,8,8,8,7,7,7,6,5,4,4,4,3,2,1,1,1,0};
		  int len = 30;
		  ex = new int [len];
		  for (int i = 0; i < len - 1; i ++){
ex [i] = new Random().nextInt(7);	
		  }
		    
		     System.out.println(Part(ary, 0, ary.length  ));
	System.out.println(Arrays.toString(ary));
		}
	}