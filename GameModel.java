import java.util.Random;


/**
 * The class <b>GameModel</b> holds the model, the state of the systems. 
 * It stores the followiung information:
 * - the state of all the ``dots'' on the board (color, captured or not)
 * - the size of the board
 * - the number of steps since the last reset
 * - the current color of selection
 *
 * The model provides all of this informations to the other classes trough 
 *  appropriate Getters. 
 * The controller can also update the model through Setters.
 * Finally, the model is also in charge of initializing the game
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */
public class GameModel {


    /**
     * predefined values to capture the color of a DotInfo
     */
    public static final int COLOR_0           = 0;
    public static final int COLOR_1           = 1;
    public static final int COLOR_2           = 2;
    public static final int COLOR_3           = 3;
    public static final int COLOR_4           = 4;
    public static final int COLOR_5           = 5;
    public static final int NUMBER_OF_COLORS  = 6;


	private int size;
	private DotInfo[][] dot;
	private Random rand;
	private int turn;
	private int color;
	private boolean finish = true;

    /**
     * Constructor to initialize the model to a given size of board.
     * 
     * @param size
     *            the size of the board
     */
    public GameModel(int size) {
		
		this.size = size;

		//Size of board in terms of x and y (like grid)
		dot = new DotInfo[size][size];


    }


    /**
     * Resets the model to (re)start a game. The previous game (if there is one)
     * is cleared up . 
     */
    public void reset(){
		
		//for random int
		int num;
		
		
		dot = new DotInfo[size];
		
		for (int i=0; i<dot.lenth; i++){
			for (int j=0; j<dot.length; j++{
				//corresponds to the color
				num = rand.nextInt(6);
				
				// Determine what color is the dot will be for next bord
				if (num == 0){
					dot[i][j] = COLOR_0;
				}
				if (num == 1){
					dot[i][j] = COLOR_1;
				}
				if (num == 2){
					dot[i][j] = COLOR_2;
				}
				if (num == 3){
					dot[i][j] = COLOR_3;
				}
				if (num == 4){
					dot[i][j] = COLOR_4;
				}
				if (num == 5){
					dot[i][j] = COLOR_5;
				}
			}
		
		}
		
		// Reset turn counter to zero 
		turn == 0;
    }


    /**
     * Getter method for the size of the game
     * 
     * @return the value of the attribute sizeOfGame
     */   
    public int getSize(){

		return size;

    }

    /**
     * returns the current color  of a given dot in the game
     * 
     * @param i
     *            the x coordinate of the dot
     * @param j
     *            the y coordinate of the dot
     * @return the status of the dot at location (i,j)
     */   
    public int getColor(int i, int j){
		// not sure!!!
		//dots = new DotInfo(i,j,COLOR_0);
		return dot[i][j].getColor();

    }

    /**
     * returns true is the dot is captured, false otherwise
    * 
     * @param i
     *            the x coordinate of the dot
     * @param j
     *            the y coordinate of the dot
     * @return the status of the dot at location (i,j)
     */   
    public boolean isCaptured(int i, int j){

    	return dot[i][j].isCaptured();
    }

    /**
     * Sets the status of the dot at coordinate (i,j) to captured
     * 
     * @param i
     *            the x coordinate of the dot
     * @param j
     *            the y coordinate of the dot
     */   
    public void capture(int i, int j){

    	dot[i][j].setCaptured(true);
   }


    /**
     * Getter method for the current number of steps
     * 
     * @return the current number of steps
     */   
    public int getNumberOfSteps(){
		this.turn = turn;
		return turn;

// ADD YOUR CODE HERE

    }

    /**
     * Setter method for currentSelectedColor
     * 
     * @param val
     *            the new value for currentSelectedColor
    */   
    public void setCurrentSelectedColor(int val) {
		this.color = color

// ADD YOUR CODE HERE

    }

    /**
     * Getter method for currentSelectedColor
     * 
     * @return currentSelectedColor
     */   
    public int getCurrentSelectedColor() {

// ADD YOUR CODE HERE

    }


    /**
     * Getter method for the model's dotInfo reference
     * at location (i,j)
     *
      * @param i
     *            the x coordinate of the dot
     * @param j
     *            the y coordinate of the dot
     *
     * @return model[i][j]
     */   
    public DotInfo get(int i, int j) {
		DotInfo i = new dotInfo(getX());
		DotInfo j = new dotInfo(getY());
		
		return i, j; 
		
		///////////////////////////////////////////DOUBLE CHECK THE DOT INFO PART

    }


   /**
     * The metod <b>step</b> updates the number of steps. It must be called 
     * once the model has been updated after the payer selected a new color.
     */
     public void step(){
		turn++;
// ADD YOUR CODE HERE

    }
 
   /**
     * The metod <b>isFinished</b> returns true iff the game is finished, that
     * is, all the dats are captured.
     *
     * @return true if the game is finished, false otherwise
     */
    public boolean isFinished(){
		
		while (finish = true){
			for (int i = 0; i < size; i++){
				for (int j = 0; j < size; j++){
					finish = dot.isCaptured(i,j);
					
					if (finish == false){
						return finish;
					}
					
				}
				
			}
			
			
		}
		return finish;

    }

   /**
     * Builds a String representation of the model
     *
     * @return String representation of the model
     */
    public String toString(){
		
	
		
		return("The number of turns you used is:" + turn )

// ADD YOUR CODE HERE

    }
}