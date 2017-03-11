import java.util.*; 
import java.io.*; 

public class Usaco{
    private static int[][] field;  
	private static int Volume;
    private static int R;
    private static int C;
    private static int E;
    private static int N;
    private static int R_s;
	private static int C_s;
	private static int D_s;




    public static int Bronze (String fileName){
	 
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

	   try{  for(int i = 0; i < n; i++)
	    R_s = text.nextInt;
        C_s = text.nextInt;
        D_s = text.nextInt;
stomper(R_s, C_s, D_s);
}

  catch(NoSuchElementException e){
	    }


 catch (FileNotFoundException e){
        	System.out.println("File Does Not Exist");
        	System.exit(1);
 }
return Volume;}}


    public void  stomper (int r, int c, int depth){
    	volume = r * c * depth;
    } 
 public static void main(String[] args) {
Bronze br = Bronze("input.txt");
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