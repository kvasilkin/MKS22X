import java.util.*;
public class MyLinkedList{

  private class LNode{
    LNode next,prev;
    int value;
    public LNode(int value){
      this.value = value;
    }
    public String toString(){
      return value+"";
    }
  }

  LNode head,tail;
  int size;

  public MyLinkedList(){
  }

  public int size(){
    return size;
  }

    
  private LNode getNthNode(int n){




}

  private void addAfter(LNode location, LNode toBeAdded){/*complete this*/  }

  private void remove(LNode target){/*complete this*/}

  public String toString(){ 
      String result = "["  
	  LNode curr = head;
	  for(int i = 0; i < size; i++ ){
	      result += curr.toString;
	      curr = curr.next;
}
	  result += "]"
}

  public boolean add(int value){  
      size ++;
      LNode val = new LNode;
      val.value = value;
      val.prev = tail;
      tail.next = LNode;
      tail = val;
      return true;

}

  public int get(int index){
      LNode curr = head;
      if(size < index){
	  throw IndexOutOfBoundsException;}     
 for (int i = 0; i < index;i++){
	  curr = curr.next;
}
      return curr;


}

  public int set(int index, int value){
      LNode input = new LNode;
      input.value = value;
      LNode iter = head;
      for (int i = 0; i < index; i++ ){
	  iter = iter.next;
      }
      iter.value = value;

}

  public int indexOf(int value){
      LNode iter = start;
      for (int i = 0; i < size; i++){
	  if (iter.value == value){
	      return i;
	  }
	  else{return -1;}
}

}

  public int remove(int index){
      LNode iter = start;
      for (int i = 0; i < index; i++){
	  iter = iter.next;
}
      LNode prevy = iter.prev;
      LNode nexty = iter.next;
      prevy.next = nexty;
      nexty.prev = prevy;
      return iter.value;

}

  public void add(int index,int value){/*complete this*/}


}
