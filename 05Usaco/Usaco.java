import java.util.*; 
import java.io.*; 

public class Usaco{
    private int[][] field;  
    private static ArrayList<int> R_s = new ArrayList<int>(); 
private static ArrayList<int> C_s = new ArrayList<int>(); 
private static ArrayList<int> D_s = new ArrayList<int>(); 
    private static int volume;
    private static int R;
    private static int C;
    private static int E;
    private static int N;



    public int Bronze (String fileName){
	 
	try{  Scanner text = new  Scanner(new File(fileName));
	    R = text.nextInt(); 
	    C = text.nextInt();
	    E = text.nextInt(); 
	    N = text.nextInt(); 
	     field = new int[R][C];
	     int count = 0;
	     while (count < R){ 
	    while (text.hasNextLine()) {
		for(int row = 0; row < R; row ++ )
		    {	count ++; 
	for(int col = 0; col < C; col++){
	    field[row][col] = text.nextInt();}

		} //end for


	    }//end adding while

	     } //end count while

	     while (text.hasNext()){
	    R_s.add((text.next()));
  C_s.add((text.next()));
  D_s.add((text.next()));
}}
 catch (FileNotFoundException e){
        	System.out.println("File Does Not Exist");
        	System.exit(1);
 }
return 4;}


    public void  stomper (int r, int c, int depth){
    	volume = r * c * depth;
    } 
 public static void main(String[] args) {
Bronze("input.txt");
 	System.out.println(R);
 	System.out.println(C);
 	System.out.println(E);
 	System.out.println(N);
 	System.out.println(field);
 	System.out.println(R_s);
 	System.out.println(C_s);
 	System.out.println(D_s);
}
}