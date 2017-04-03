import java.util.*; 
import java.io.*; 

public class Merge{


    public static void mergesort(int []ary){  
if(ary.length < 2){
	return;
}

int []  left = new int[ary.length / 2];
int [] right = new int[ary.length - left.length];

for(int k = 0; k < left.length; k++){
	left[k] = ary[k];
} 

for(int k = 0; k < right.length; k++){
	right[k] = ary[left.length + k];
}

mergesort(left);
mergesort(right);
merge(left, right, ary);
    }



    public static void merge(int[]a,int[]b,int[]destination){
	int i = 0;
	int j = 0;
	while(i <= a.length && j <= b.length && i + j < destination.length ){
	    if (i == a.length){
			destination[i +j] = b[j];
			j++;
	  			  }
	    else if (j == b.length){
			destination[i + j] = a[i];
			i++;
	  			  }
	    else if (a[i] <= b[j]){
			destination[i + j] = a[i];
			i++;
	   			 }
	    else if(b[j] < a[i]){
			destination[i + j] = b[j];
			j++;	    }
	}
    }



    public static void main(String[] args){
	int [] Karl = { 13 };
	int [] Marx = {23, 23, 23, 1, 2, 12, 323, 12,  2324,32,1, 2, 1, 1, 1, 1,1 ,2, 2, 2, 3, 2, 1, 1, 1, 2, 3, 123, 3 ,2 };
//	System.out.println(Karl.length);
//	int[] dest = new int[Karl.length + Marx.length];
//	merge (Karl, Marx, dest);
mergesort(Marx);
	System.out.println(Arrays.toString(Marx));

    }



    
}
