import java.util.*;
public class Quiz2Redux{  
  /*Returns an ArrayList<String> that contains all subsets of the
   *characters of String s. Assume s has no duplicate characters.
   *the characters should appear in the same order that they occur 
   *in the original string.
   */

  public static ArrayList<String> combinations(String s){
   ArrayList<String>words = new ArrayList<String>();
      words.add("");
      help( words , s );
      Collections.sort(words);
      return words;
  }
  
  private static void help( ArrayList<String> words,  String s){
    int len = words.size();
    if(s.length() == 0){
      words.add("");
    }
    else {
      for (int i = 0; i < len; i++){
words.add(words.get(i) + s.charAt(0));

      }
      help(words, s.substring(1));
    }
    
  }


     public static void main(String[] args) {
      
      System.out.println(combinations("ab"));  

      System.out.println(combinations("abc")); 
      
     
    

  
    }
}
