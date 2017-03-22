		import java.util.*; 
		import java.io.*; 
//Partner: Asim Kapparova
		public class Usaco{


//Bronze
		    private static int[][] field;  
			private static int Volume;
		    private static int R;
		    private static int C;
		    private static int E;
		    private static int N;
		    private static int R_s;
			private static int C_s;
			private static int D_s;
// Silver
private static int[][] pasture;
private static int[][] plot;
private static int row;
private static int col;
private static int sec;
private static int cx1;
private static int cx2;
private static int cy1;
private static int cy2;


//private static int R1; 
//private static int C1; 
//private static int R2; 
//private static int C2; 
//private static int R1; 
		    public static int Bronze (String fileName){
			 Volume = 0;
			try{  Scanner text = new  Scanner(new File(fileName));
			    R = text.nextInt(); 
			    C = text.nextInt();
			    E = text.nextInt(); 
			    N = text.nextInt(); 
			     field = new int[R][C];
			 
			 
		      	for(int row = 0; row < R; row ++ )
				    {	
			for(int col = 0; col < C; col++){
			    field[row][col] = text.nextInt();}}

		        
		 for(int i = 0; i < N; i++){
			    R_s = text.nextInt();
		        C_s = text.nextInt();
		        D_s = text.nextInt();
		stomper(R_s - 1, C_s - 1, D_s);
		//maxer (2,2 );   
	}}

			   



		 catch (FileNotFoundException e){
		        	System.out.println("File Does Not Exist");
		        	System.exit(1);
		 }


for (int k = 0; k < R; k ++){
        for (int j = 0; j < C; j ++){
        	if (field[k][j] < E) {
Volume += E - field[k][j];
        	}
		}
	}
		Volume = Volume * 72 * 72;
		return Volume;}


		    public static void  stomper (int r, int c, int depth){
int max = maxer( r, c);

for (int i = 0; i < 3 ; i++){
			for(int j = 0; j < 3; j ++ ){
				if (( r + i  > -1) && (r + i < R) && (c + j > -1) &&( c + j < C )){
					if (max - field[r + i ][c + j] <= D_s ){

						field [r + i][c  + j] = (field[r + i][c + j] -  (depth - (max - field [r + i][c + j])));
}

					}
			}}

}





		    

		public static int maxer (int r1, int c1){
		int result = 0;
		for (int i = 0; i < 3 ; i++){
			for(int j = 0; j < 3; j ++ ){
				if (( r1 + i  > -1) && (r1 + i < R) && (c1 + j > -1) &&( c1 + j < C )){
					if (field [r1 + i][c1 + j ] > result )
						{result = field [r1 +  i][c1 + j];
				}}
		}}
		return result; 
		}


 public static String printerB(int [][] f ){
    String result = "";
    for (int k = 0; k < R; k ++){
        for (int j = 0; j < C; j ++){
            
                result += field [k][j] + " ";
           
            }
        
        result += '\n';
    }
   return result; }


 public static String printerS(int [][] f ){
    String result = "";
    for (int k = 0; k < row; k ++){
        for (int j = 0; j < col; j ++){
            
                result += pasture [k][j] + " ";
           
            }
        
        result += '\n';
    }
   return result; }


public static int Silver (String fileName){
	try{  Scanner text = new  Scanner(new File(fileName));
			    row = text.nextInt(); 
			    col = text.nextInt();
			    sec = text.nextInt(); 
			    
			     pasture  = new int[row][col];
			 
			 
		      	for(int r = 0; r < row ; r ++ )
				    {	String  inputS = text.next();
			for(int c = 0; c < col ; c++){
			   
if (inputS.charAt(c) == '*'){

	pasture[r][c] = -1; 
plot[r][c] = -1;}

else {pasture[r][c] = 0;
plot[r][c] = 0;}
			}}

		        
		 
			    cx1 = text.nextInt() - 1;
		        cy1 = text.nextInt() - 1;
		        cx2 = text.nextInt() - 1;
		        cy2 = text.nextInt() - 1 ;
		pasture[cx1][cy1] = 1;
		plot[cx1][cy1] = 1;

		  for(int s = 0; s < sec; s ++){}
		  	for(int r = 0; r < row ; r ++ )
				    {	
			for(int c = 0; c < col ; c++){
	if (field [r][c] != -1) {
		mover(r, c);
		} 

			}
				}

				for (int i = 0; i < row; i++){
				for (int k = 0; k < col; k++){
				   plot[i][k] = pasture[i][k];	}}}
			   



		 catch (FileNotFoundException e){
		        	System.out.println("File Does Not Exist");
		        	System.exit(1);
		 }

return cy2;}



public static void mover (int i , int j){
int result = 0;
if ((i + 1 < row) && (plot[i + 1][j] != -1)){
			result += plot[i + 1][j];
		}
		if ((i - 1 >= 0) && (plot[i - 1][j] != -1)){
			result += plot[i - 1][j];
		}
		if ((j - 1 >= 0) && (plot[i][j - 1] != -1)){
			result += plot[i][j - 1];
		}
		if ((j + 1 < col) && (plot[i][j + 1] != -1)){
			result += plot[i][j + 1];
		}
		pasture[i][j] = result;

}


		 public static void main(String[] args) {
		//Bronze("makelake.5.in");	
			//System.out.println(Volume);
Silver("field1.txt");
System.out.println(printerS(pasture));	


	
		}
		}
