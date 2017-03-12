import java.util.*;
public class Quiz2Redux{  
  /*Returns an ArrayList<String> that contains all subsets of the
   *characters of String s. Assume s has no duplicate characters.
   *the characters should appear in the same order that they occur 
   *in the original string.
   */
  public static ArrayList<String> combinations(String s){
      ArrayList<String>words = new ArrayList<String>();
      words.add(" ");
      help( words , 0, s );
      Collections.sort(words);
      return words;
  }
  
  private static void help( ArrayList<String> word, int ind , String s){
    int len = word.size();
    if(ind > s.length()){
      word.add(" ");
    }
    else {
      for (int i = 0; i < len; i++){
word.add(word.get(i) + s.charAt(ind) );

      }
      help(word, ind ++, s);

    }
    
  }


     public static void main(String[] args) {
        
      System.out.println(combinations("fuc"));
    

  
    }
}
