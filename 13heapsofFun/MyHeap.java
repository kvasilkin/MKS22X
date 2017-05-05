Public Class MyHeap{
    public static ArrayList<String> holder;
    public static boolean dir; 
    public MyHeap(){
holder =  new ArrayList<String>();
dir = true;
}
    // - construct empty max heap
    public  MyHeap(boolean in){
holder =  new ArrayList<String>();
dir = in;
}
    // - true: construct empty max heap, false: construct empty min heap.
    //Methods



    public void add(String s){
	int n = holder.size();
	holder.add(n, s);
	pushUp(n);

}

    public  String remove(){
    
	int n =    holder.size();    
	String	result = holder.get(1);
	swap(1, n);
	holder.remove(n);
	pushDown(1);   
	return result;

}

    public String peek(){
	return holder.get(1);
}

    //Private methods:

    public  void pushUp(int ind){
	if(holder.get(ind / 2) < holder.get(ind)){
	    swap(ind, ind/2);
		pushUp(ind/2);}

}

public void pushDown(int ind){}


public void swap(int first, int second){
    int temp = holder.get(first);
    holder.set(first, second);
    holder.set(second, temp);

}
}
