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

    
  private LNode getNthNode(int n){/*complete this*/}

  private void addAfter(LNode location, LNode toBeAdded){/*complete this*/  }

  private void remove(LNode target){/*complete this*/}

  public String toString(){ /*complete this*/  }

  public boolean add(int value){  /*complete this*/ }

  public int get(int index){/*complete this*/}

  public int set(int index, int value){/*complete this*/}

  public int indexOf(int value){/*complete this*/}

  public int remove(int index){/*complete this*/}

  public void add(int index,int value){/*complete this*/}


}
