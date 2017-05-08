import java.util.*;
public class MyHeap{
    public static ArrayList<Integer> holder  =  new ArrayList<Integer>();
    public static boolean dir; 
    public MyHeap(){
dir = true;
}
    // - construct empty max heap
    public  MyHeap(boolean in){

dir = in;
}
    // - true: construct empty max heap, false: construct empty min heap.
    //Methods



    public void add(int  s){
	int n = holder.size();
	holder.add(n, s);
	pushUp(n);

}

    public  int  remove(){
    
	int n =    holder.size();    
	int result = holder.get(1);
	swap(1, n);
	holder.remove(n);
	pushDown(1);   
	return result;

}

    public int  peek(){
	return holder.get(1);
}

    //Private methods:

    public  void pushUp(int ind){
	if(dir){

	if(holder.get(ind / 2) < holder.get(ind)){
	    swap(ind, ind/2);
		pushUp(ind/2);
	}
	}
	else
{	if(holder.get(ind / 2) > holder.get(ind)){
		swap(ind, ind/2);
		pushUp(ind/2);
}
}
}

public void pushDown(int ind){
if(dir){
	if(holder.get(ind * 2) < holder.get(ind)){
	    swap(ind, ind * 2);
		pushDown(ind * 2);

	if(holder.get(ind * 2 + 1) < holder.get(ind)){
	    swap(ind, ind * 2 + 1);
		pushDown(ind * 2 + 1);

}

	else{	if(holder.get(ind * 2) > holder.get(ind)){
		swap(ind, ind * 2);
		pushDown(ind * 2);
}
	if(holder.get(ind * 2 + 1 ) > holder.get(ind)){
		swap(ind, ind * 2 + 1);
		pushDown(ind * 2 + 1 );
}
}
}
}



public void swap(int first, int second){
    int temp = holder.get(first);
    holder.set(first, second);
    holder.set(second, temp);

}

public static void main(String[] args){



}

}
