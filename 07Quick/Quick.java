
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

	public static int select(int[] input, int k  ){
	return selecter(input, k,  0 , input.length -1 );
	}
	
public static int selecter (int[] input, int k, int min, int max){
	int ind = Part(input, min,max); 
	if (ind == k ){
return input [ind];
	}
	if (ind < k ){
		return selecter(input, k, ind + 1, max);
	}
	if (ind > k){
		return selecter(input, k, min, ind);
}
return input[k];
				}





		    public static void swap (int  [] arr, int i, int j){
			int hold = arr[i];
			arr[i] = arr[j];
			arr[j] = hold;
	}


			 public static void main(String[] args) {
			 
			/** int[] ary = {9,8,8,8,7,7,7,6,5,4,4,4,3,2,1,1,1,0};
			  int len = 30;
			  ex = new int [len];
			  for (int i = 0; i < len - 1; i ++){
	ex [i] = new Random().nextInt(7);	
			  }
			    
			     System.out.println(Part(ex, 0, len  ));
		System.out.println(Arrays.toString(ex)); */


		int[]ary = { 2, 10, 15, 23, 0,  5};
System.out.println (select( ary , 0 )); //would return 0
System.out.println (select( ary , 1 ));  //would return 2
System.out.println (select( ary , 2 ));  //would return 5
System.out.println (select( ary , 3 ));  //would return 10
System.out.println (select( ary , 4 ));  //would return 15
System.out.println (select( ary , 5 ));  //would return 23
			}
		}