public class QueenBoard{
    private int[][]board;
    private int solutionCount;
    
    public QueenBoard(int size){
	board = new int[size][size];
	for(int  i = 0; i < size - 1; i++){
	    for(int j= 0; i < size - 1; j++){
		board[i][j] = 0;}
}
    }

    /**
     *precondition: board is filled with 0's only.
     *@return false when the board is not solveable. true otherwise.
     *postcondition: 
     *if false: board is still filled with 0's
     *if true: board is filled with the 
     *final configuration of the board after adding 
     *all n queens. Uses solveH
     */

    public  void  addQueen(int r, int c) {
	for(int w = 0; w < size -1; w ++ ){
	    board[w][c] ++;}
	for(int m = 0; m < size -1; m ++ ){
	    board[r][m] ++;}
	while()


	board[r][c] = -1;}




    public void removeQueen(int r, int c){
for(int w = 0; w < size -1; w ++ ){
	    board[w][c] --;}
	for(int m = 0; m < size -1; m ++ ){
	    board[r][m] --;}


	board[r][c] = 0;}

}
    public void solve()
    {
	return solveH(0);
    }

    private boolean solveH(int col){
	return false;
    }

    /**
     *@return the number of solutions found, or -1 if the board was never solved.
     *The board should be reset after this is run.    
     */
    public void  getSolutionCount(){
       solutionCount = 0 ;
    }
    /**toString
     *and all nunbers that represent queens are replaced with 'Q' 
     *all others are displayed as underscores '_'
     */
    public String toString(){
	return " ";  
    }
    public static void main(String[] args){
		QueenBoard(9);
		addQueen(5, 6);
     }

}
