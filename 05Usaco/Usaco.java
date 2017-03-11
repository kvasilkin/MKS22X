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
		stomper(R_s - 1, C_s - 1, D_s);}}
			   



		 catch (FileNotFoundException e){
		        	System.out.println("File Does Not Exist");
		        	System.exit(1);
		 }
		return Volume;}


		    public static void  stomper (int r, int c, int depth){

		    }





		    

		public static int maxer (int r, int c){
		int result = 0;
		for (int i = 0; i < 3 ; i++){
			for(int j = 0; j < 3; j ++ ){
				if (field [i][j] > result){
					result = field [i][j];
				}
		}}
		return result; 
		}

		 public static void main(String[] args) {
		Bronze("input.txt");
		 	System.out.println(R);
		 	System.out.println(C);
		 	System.out.println(E);
		 	System.out.println(N);
		 	System.out.println(R_s);
		 	System.out.println(C_s);
		 	System.out.println(D_s);
			System.out.println(Volume);
		System.out.println(Arrays.deepToString(field));
		}
		}
