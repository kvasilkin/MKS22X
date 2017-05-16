public class Location implements Comparable<Location>{
    private int row,col;
     private int distToGoal;
     private int distToStart; 
     private Location previous; //(used to trace the solution)
     private boolean aStar;// : when this is true, compareTo will use: previousDistance + distanceToGoal
     //   when this is false, compareTo will use the distanceToGoal only.}
     public void Location(int r, int c, Location prev, int toStart, int toGoal, boolean AStar){
	 row = r;
	 col = c;
	 previous = prev;
	 distToStart =toStart;
	 distToGoal = toGoal;
	 aStar = AStar;

}
     public int  CompareTo( Location other){ //-> decide what number to compare using the aStar boolean.
	 if(aStar){
return ((this.distanceToGoal + this.distanceToStart) - ( other.distanceToGoal + other.distanceToStart));
}
	 else{
	     return ( this.distanceToGoal - other.distanceToGoal);}
	     
     }










}
