public class QueenBoard{
    private int[][]board;
    private int solutionCount;
    //private int blength; 


    public QueenBoard(int size){
    board = new int[size][size];
    //blength = size;
    for(int  i = 0; i < size - 1; i++){
        for(int j = 0; j < size - 1 ; j++){
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
    int counter = 0;
    for(int w = 0; w < board.length ; w ++ ){
        board[w][c] ++;}
    for(int m = 0; m < board.length ; m ++ ){
        board[r][m] ++;}
   boolean willAdd = true;
    while(willAdd){
        willAdd = false; 
        if (r - counter > - 1 && c - counter > - 1){
        board[r - counter][c - counter ]++;
        willAdd = true;
                }
        if(r - counter > -1 && c + counter != board.length){
        board[r - counter][c + counter]++;
                willAdd = true;
                }
        if(r + counter != board.length && c + counter != board.length){
        board[r + counter][c + counter]++;      
                willAdd = true;
                }
        if(r + counter != board.length && c - counter > -1){        
        board[r + counter][c - counter]++;
              willAdd = true;
          }

counter++;
    }


    board[r][c] = -1;}




/**    public void removeQueen(int r, int c){
for(int w = 0; w < size -1; w ++ ){
        board[w][c] --;}
    for(int m = 0; m < size -1; m ++ ){
        board[r][m] --;}

while(willAdd){
        willAdd = false; 
        if (r - counter != 0 && c - counter != 0){
        board[r - counter][c - counter ]--;
        willAdd = true;
                }
        if(r - counter != 0 && c + counter != board.length()){
        board[r - counter][c + counter]--;
                willAdd = true;
                }
        if(r + counter != board.length() && c + counter != board.length()){
        board[r + counter][c + counter]--;      
                willAdd = true;
                }
        if(r + counter != board.length() && c - counter != 0){        
        board[r + counter][c - counter]--;
              willAdd = true;
          }

counter++;
    }
    board[r][c] = 0;}
*/

  /**  public void solve()
    {
    return solveH(0);
    }

    private boolean solveH(int col){
    return false;
    }
*/
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
    String result = "";
    for (int k = 0; k < board.length; k ++){
        for (int j = 0; j < board.length; j ++){
            if(board[k][j] == -1){
                result += "Q ";
            }

            else{
                result += board[k][j] + " ";
            }
        }
        result += '\n';
    }
   return result; }





    public static void main(String[] args){
QueenBoard bord = new QueenBoard(9);
bord.addQueen(4,4);
bord.addQueen(5,5);
System.out.println(bord);
        
       // addQueen(5, 6);
     //  System.out.println(Arrays.deepToString(board));
     }

}