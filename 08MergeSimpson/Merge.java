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
       while(l < destination.length ){
	   if(a[i] < b[j]){
	       destination[l] = a[i];
	       i++;
	       l++;

	   }
	   if(a[i] > b[j] ){
	       destination[l] = b[j];
	       j++;
	       l++;
	   }
	   if(a[i] == b[j]){
	       destination[l] = a[i];
	       l++;
	       i++;
	       destination[l] = b[j];
	       l++;
	       j++;
}
}



}
    //Postcondition:
    //destination contains all of the elements of a and b, and is sorted. 
    //Preconditions:
    // a is sorted, b is sorted
    //destination.length == a.length + b.length
}

