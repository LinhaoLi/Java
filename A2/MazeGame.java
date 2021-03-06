import java.io.*;
import java.util.*;

/**
 * Maze Game
 *
 * INFO1103 Assignment 2
 * 2017 Semester 1
 *
 * The Maze Game.
 * In this assignment you will be designing a maze game.
 * You will have a maze board and a player moving around the board.
 * The player can step left, right, up or down.
 * However, you need to complete the maze within a given number of steps.
 *
 * As in any maze, there are walls that you cannot move through. If you try to
 * move through a wall, you lose a life. You have a limited number of lives.
 * There is also gold on the board that you can collect if you move ontop of it.
 *
 * Please implement the methods provided, as some of the marks are allocated to
 * testing these methods directly.
 *
 * @author Linhao Li
 * @date 24 April 2017
 *
 */
public class MazeGame {
    /* You can put variables that you need throughout the class up here.
     * You MUST INITIALISE ALL of these class variables in your initialiseGame
     * method.
     */

    // A sample variable to show you can put variables here.
    // You would initialise it in initialiseGame method.
    // e.g. Have the following line in the initialiseGame method.
    // sampleVariable = 1;
    static int sampleVariable;
    static ArrayList<String> currentMap = new ArrayList<>();

    private static int lives;
    private static int steps;
    private static int golds;
    private static int rows;
    private static int cols;




    /**
     * Set the given place in the Maze to a given symbol
     *
     * @args x The x coordinate.
     * @args y The y coordinate.
     * @args c the symbol which is going to replace the current one
     */
    public static void setCood(int x,int y,char c){
        String currentString = currentMap.get(y);
        String newString = currentString.substring(0,x)+ c + currentString.substring(x+1);
        currentMap.set(y,newString);
    }






    /**
     * Initialises the game from the given configuration file.
     * This includes the number of lives, the number of steps, the starting gold
     * and the board.
     *
     * If the configuration file name is "DEFAULT", load the default
     * game configuration.
     *
     * NOTE: Please also initialise all of your class variables.
     *
     * @args configFileName The name of the game configuration file to read from.
     * @throws IOException If there was an error reading in the game.
     *         For example, if the input file could not be found.
     */
    public static void initialiseGame(String configFileName) throws IOException {


            File file = new File(configFileName);
            Scanner rp = new Scanner(file);

            while(rp.hasNext()){
                currentMap.add(rp.nextLine());
            }

            String partial[] = currentMap.get(0).split(" ");

            lives = Integer.parseInt(partial[0]);
            steps = Integer.parseInt(partial[1]);
            golds = Integer.parseInt(partial[2]);
            rows = Integer.parseInt(partial[3]);

            currentMap.remove(0);
            cols = currentMap.get(0).length();
            rp.close();



    }

    /**
     * Save the current board to the given file name.
     * Note: save it in the same format as you read it in.
     * That is:
     *
     * <number of lives> <number of steps> <amount of gold> <number of rows on the board>
     * <BOARD>
     *
     * @args toFileName The name of the file to save the game configuration to.
     * @throws IOException If there was an error writing the game to the file.
     */
    public static void saveGame(String toFileName) throws IOException {
        File file = new File(toFileName);
        PrintWriter wp = new PrintWriter(file);

		wp.printf("%d %d %d %d\n",lives,steps,golds,rows);
        for(String currentRow: currentMap){
            wp.println(currentRow);
        }
	    wp.close();
        System.out.println("Successfully saved the current game configuration to \'"+toFileName+"\'.");

    }

    /**
     * Gets the current x position of the player.
     *
     * @return The players current x position.
     */
    public static int getCurrentXPosition() {
        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < cols;j++){
                char currentSymbol = currentMap.get(i).charAt(j);

                if(currentSymbol == '&'){
                    return j;
                }
            }
        }
        return -1;
    }

    /**
     * Gets the current y position of the player.
     *
     * @return The players current y position.
     */
    public static int getCurrentYPosition() {
        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < cols; j++){
                char currentSymbol = currentMap.get(i).charAt(j);
                if(currentSymbol == '&'){
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Gets the number of lives the player currently has.
     *
     * @return The number of lives the player currently has.
     */
    public static int numberOfLives() {
        // TODO: Implement this method.

        return lives;
    }

    /**
     * Gets the number of remaining steps that the player can use.
     *
     * @return The number of steps remaining in the game.
     */
    public static int numberOfStepsRemaining() {
        // TODO: Implement this method.
        return steps;
    }

    /**
     * Gets the amount of gold that the player has collected so far.
     *
     * @return The amount of gold the player has collected so far.
     */
    public static int amountOfGold() {
        // TODO: Implement this method.
        return golds;
    }


    /**
     * Checks to see if the player has completed the maze.
     * The player has completed the maze if they have reached the destination.
     *
     * @return True if the player has completed the maze.
     */
    public static boolean isMazeCompleted() {
        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < cols; j++){
                char currentSymbol = currentMap.get(i).charAt(j);

                if(currentSymbol == '@'){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks to see if it is the end of the game.
     * It is the end of the game if one of the following conditions is true:
     *  - There are no remaining steps.
     *  - The player has no lives.
     *  - The player has completed the maze.
     *
     * @return True if any one of the conditions that end the game is true.
     */
    public static boolean isGameEnd() {

        return (lives == 0)||(steps == 0)||(isMazeCompleted());

    }

    /**
     * Checks if the coordinates (x, y) are valid.
     * That is, if they are on the board.
     *
     * @args x The x coordinate.
     * @args y The y coordinate.
     * @return True if the given coordinates are valid (on the board),
     *         otherwise, false (the coordinates are out or range).
     */
    public static boolean isValidCoordinates(int x, int y) {
        return (( x >= 0 && x < cols ) && (y>=0 && y < rows));
    }

    /**
     * Checks if a move to the given coordinates is valid.
     * A move is invalid if:
     *  - It is move to a coordinate off the board.
     *  - There is a wall at that coordinate.
     *  - The game is ended.
     *
     * @args x The x coordinate to move to.
     * @args y The y coordinate to move to.
     * @return True if the move is valid, otherwise false.
     */
    public static boolean canMoveTo(int x, int y) {
        if(x<0||y<0||x>=cols||y>=rows){
            return false;
        }
        char currentSymbol = currentMap.get(y).charAt(x);

    return isValidCoordinates(x,y)&&currentSymbol!='#'&&!isGameEnd();
    }

    /**
     * Move the player to the given coordinates on the board.
     * After a successful move, it prints "Moved to (x, y)."
     * where (x, y) were the coordinates given.
     *
     * If there was gold at the position the player moved to,
     * the gold should be collected and the message "Plus n gold."
     * should also be printed, where n is the amount of gold collected.
     *
     * If it is an invalid move, a life is lost.
     * The method prints: "Invalid move. One life lost."
     *
     * @args x The x coordinate to move to.
     * @args y The y coordinate to move to.
     */
    public static void moveTo(int x, int y) {
        if(!canMoveTo(x, y)){
            System.out.println("Invalid move. One life lost.");
            lives--;
        }
        else{
            System.out.println("Moved to (" + x + ", " + y + ").");
            if(Character.isDigit(currentMap.get(y).charAt(x))){
                int goldGain = (int)(currentMap.get(y).charAt(x)-'0');
                System.out.println("Plus "+ goldGain +" gold.");
                golds += goldGain;
            }
            setCood(x,y,'&');

        }


        // TODO: Implement this method.
    }

    /**
     * Prints out the help message.
     */
    public static void printHelp() {

        System.out.println("Usage: You can type one of the following commands.");
        System.out.println("help         Print this help message.");
        System.out.println("board        Print the current board.");
        System.out.println("status       Print the current status.");
        System.out.println("left         Move the player 1 square to the left.");
        System.out.println("right        Move the player 1 square to the right.");
        System.out.println("up           Move the player 1 square up.");
        System.out.println("down         Move the player 1 square down.");
        System.out.println("save <file>  Save the current game configuration to the given file.");

    }

    /**
     * Prints out the status message.
     */
    public static void printStatus() {
        // TODO: Implement this method.

        System.out.printf("Number of live(s): %d\n", lives);
        System.out.printf("Number of step(s) remaining: %d\n",steps);
        System.out.printf("Amount of gold: %d\n",golds);

    }

    /**
     * Prints out the board.
     */
    public static void printBoard() {
        for(String currentRow: currentMap){

            System.out.println(currentRow);
        }
        // TODO: Implement this method.
    }

    /**
     * Performs the given action by calling the appropriate helper methods.
     * [For example, calling the printHelp() method if the action is "help".]
     *
     * The valid actions are "help", "board", "status", "left", "right",
     * "up", "down", and "save".
     * [Note: The actions are case insensitive.]
     * If it is not a valid action, an IllegalArgumentException should be thrown.
     *
     * @args action The action we are performing.
     * @throws IllegalArgumentException If the action given isn't one of the
     *         allowed actions.
     */
    public static void performAction(String action) throws IllegalArgumentException {
        // TODO: Implement this method.

        String[] userInputSection = action.split(" ");
        String command = userInputSection[0].toLowerCase();
        if(userInputSection.length == 2 && command.equals("save")){
            try{
                saveGame(userInputSection[1]);
            }
            catch(IOException ioe){
                System.out.println("Could not save the current game configuration to \'" + userInputSection[1] + "\'");
                return;
            }

        }
        else if(userInputSection.length==1){
            int x = getCurrentXPosition();
            int y = getCurrentYPosition();
            switch(command){
                case "help":
                    printHelp();
                    break;
                case "board":
                    printBoard();
                    break;
                case "status":
                    printStatus();
                    break;
                case "left":
                    if(canMoveTo(x-1, y)){
                        setCood(x,y,'.');
                    }
                    moveTo(x-1, y);
                    steps--;
                    break;
                case "right":
                    if(canMoveTo(x+1, y)){
                        setCood(x,y,'.');
                    }
                    moveTo(x+1,y);
                    steps--;
                    break;
                case "up":
                    if(canMoveTo(x, y-1)){
                        setCood(x,y,'.');
                    }
                    moveTo(x,y-1);
                    steps--;
                    break;
                case "down":
                    if(canMoveTo(x, y+1)){
                        setCood(x,y,'.');
                    }
                    moveTo(x,y+1);
                    steps--;
                    break;
                case " ":

                    break;
                case "debug":
                    System.out.println(cols);
                    System.out.println(rows);
                    break;

                default:
                    throw new IllegalArgumentException("Error: Input invalid");
            }
        }
        else{
            throw new IllegalArgumentException("Error: Input invalid");
        }
    }

    /**
     * The main method of your program.
     *
     * @args args[0] The game configuration file from which to initialise the
     *       maze game. If it is DEFAULT, load the default configuration.
     */
    public static void main(String[] args) {
        // Run your program (reading in from args etc) from here.
        try{
            if(args.length!=1){
                Exception commandLineException = new Exception("Error: Incorrect number of argument given");
                throw commandLineException;
            }
            initialiseGame(args[0]);
        }
        catch(IOException e){
            System.err.println("Error: Could not load the game configuration from '" + args[0] +"'.");
            return;
            //e.printStackTrace();
        }
        catch(Exception e){
            if(args.length<1){
                System.out.println("Error: Too few arguments given. Expected 1 argument, found 0.");
            }
            else{
                System.out.println("Error: Too many arguments given. Expected 1 argument, found "+ args.length + ".");
            }
            System.out.println("Usage: MazeGame [<game configuration file>|DEFAULT]");
            return;
        }

        Scanner keyboard = new Scanner(System.in);
        String userInput = new String();

        while(true){
            try{
                userInput = keyboard.nextLine();
                performAction(userInput);
                if(isGameEnd()){
                    if(isMazeCompleted()){
                        System.out.println("Congratulations! You completed the maze!");
                        System.out.println("Your final status is:");
                        printStatus();

                    }
                    else if(lives == 0&&steps == 0){
                        System.out.println("Oh no! You have no lives and no steps left.");
                        System.out.println("Better luck next time!");
                    }
                    else if(steps ==0){
                        System.out.println("Oh no! You have no steps left.");
                        System.out.println("Better luck next time!");

                    }
                    else{
                        System.out.println("Oh no! You have no lives left.");
                        System.out.println("Better luck next time!");
                    }

                    return;
                }
            }
            catch(IllegalArgumentException e){
            System.out.println("Error: Could not find command '"+ userInput +"'.");
            System.out.println("To find the list of valid commands, please type \'help\'.");
            }
            catch(NoSuchElementException e){
                System.out.println("You did not complete the game.");
                return;
            }
        }
    }
}
