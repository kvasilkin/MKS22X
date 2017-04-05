import java.util.*;
public class MyLinkedList{

  private class LNode{
    LNode next,prev;
    int value;
    public LNode(int value){
      this.value=value;
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

  public int set(int index, int value){/*complete this*/}

  public int indexOf(int value){/*complete this*/}

  public int remove(int index){/*complete this*/}

  public void add(int index,int value){/*complete this*/}


}
