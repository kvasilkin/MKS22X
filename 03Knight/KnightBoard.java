public class KnightBoard{

    public int board [][];


    public KnightBoard(int startingRows,int startingCols) {
	board = new int [startingRows][startingCols];
	for(int i = 0; i < startingRows; i ++){
	    for(int k = 0; k < startingCols; k++){
		board[i][k] = 0;
	    }
	}
}

    public String toString(){} //blank if you never called solve or when there is no solution

    public void solve() {}

    private boolean solveH(int row ,int col, int level){}// level is the # of the knight
}
