import java.util.*; 
import java.io.*; 

public class Merge{


    public static void mergesort(int []ary){   //not enough parameters
	//   mergesort the leftHalf
	// mergesort the rightHalf
	//  mergeTheTwoHalvesIntoTheOriginalArray
    }
    public static void merge(int[]a,int[]b,int[]destination){
	int i = 0;
	int j = 0;
	int l = 0; 
	while(l < destination.length &&
	     i < a.length && j< b.length  ){
	    if(a[i] < b[j]){
		destination[l] = a[i];
		i++;
		l++;

	    }
	    else   if(a[i] > b[j] ){
		destination[l] = b[j];
		j++;
		l++;
	    }
	    else   if(a[i] == b[j]){
		destination[l] = a[i];
		l++;
		i++;
		destination[l] = b[j];
		l++;
		j++;
	    }
	    if(a.length > b.length){
		for(int k = a.length  - b.length - 1; k < a.length; k++){
		    destination[l] = a[k];
		}}
	
    if(b.length > a.length){
		for(int k = b.length  - a.length - 1 ; k < b.length; k++){
		    destination[l] = b[k];}}
	}

    }



    public static void main(String[] args){
	int [] Karl = {1, 3,  5, 7, 9, 11, 13 };
	int [] Marx = {2, 4, 6, 8, 10 };
	int[] dest = new int[Karl.length + Marx.length];
	merge (Karl, Marx, dest);
	System.out.println(Arrays.toString(dest));

    }



    
}

