//************ Total Marks for PolyLine class: 10 marks
/*
 * The PolyLine class used for storing multiple lines in a stroke
 */
public class PolyLine{
	private int[] Xs;
	private int[] Ys;	
	private int coordinateCount;
	
	/*
	 * Default constructor
	 */
	public PolyLine(){
		new PolyLine(100);
		
	}
	/*
	 * Constructor that takes an amount of x and y coordinate
	 */
	public PolyLine(int size){
		Xs = new int[size];
		Ys = new int[size];
		coordinateCount = 0;		
	}
	
	/*
	 * The clone method for returning a copy of the current instance	 * 
	 */
	public PolyLine clone(){
		PolyLine temp = new PolyLine(getSize());		
		
		for(int i=0;i<getSize();i++){
			temp.addCoordinate(Xs[i], Ys[i]);
		}
		return temp;
	}
	/*
	 * Accessor method for the X coordinates
	 */
	public int[] getXs() {
		return Xs;
	}
	/*
	 * Mutator method for X coordinates
	 */
	public void setXs(int[] x) {
		Xs = x;
	}
	/*
	 * Accessor method for Y
	 */
	public int[] getYs() {
		return Ys;
	}
	/*
	 * Mutator method for Y
	 */
	public void setYs(int[] y) {
		Ys = y;
	}
	
	/*
	 * Adds a new Coordinate to the X and Y arrays that form part of a stroke
	 * It also checks to see if the array is full and doubles the size of the array.
	 * ********** 10 marks ****************************
	 */
	public void addCoordinate(int x, int y){
		
		//COMPLETE CODE HERE
		
	}
	/*
	 * Returns the amount of coordinates in the stroke
	 */
	public int getSize(){
		return coordinateCount+1;
	}
	
	/*
	 * The overridden toString method for a String-based representation of 
	 * a Coordinate
	 */
	@Override
	public String toString(){
		String s = "";
		for(int i=0;i<coordinateCount;i++){
			s+="("+Xs[i]+","+Ys[i]+")";
		}
		return s;
	}	
}
