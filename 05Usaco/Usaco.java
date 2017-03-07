public class MakeLake{
    private int[][] field;  
    private static ArrayList<Int> R_s = new ArrayList<Int>(); 
private static ArrayList<Int> C_s = new ArrayList<Int>(); 
private static ArrayList<Int> D_s = new ArrayList<Int>(); 
    private int volume;
    private int R;
    private int C;
    private int E;
    private int N;



    public Broze (String fileName){
	 
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
}
 catch (FileNotFoundException e){
        	System.out.println("File Does Not Exist");
        	System.exit(1);
 }
}


    public void  stomper (int r, int c, int depth){} 
}
