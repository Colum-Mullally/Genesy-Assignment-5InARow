/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

/**
 *
 * @author Colum
 */
public class GameBoard {
    
    private String[][] gameBoard;
    private String player1;
    private String player2;
    private String turn;
    private String player1Icon="X";
    private String player2Icon="O";
    private boolean gameOver = false;
    private int NUMBER_OF_COLUMNS;
    private int MINIMUM_CHAIN_TO_WIN = 5;
    private String WinningMessage;
    
    
    public GameBoard(int NUMBER_OF_ROWS, int NUMBER_OF_COLUMNS) {//Generates empty game board.
        int row, column;
        String[][] gameBoard;
        this.NUMBER_OF_COLUMNS=NUMBER_OF_COLUMNS;
        for (row = 0, gameBoard = new String [NUMBER_OF_ROWS][NUMBER_OF_COLUMNS]; row < gameBoard.length; row++) {
            for (column = 0; column < gameBoard[row].length; column++) {
                gameBoard[row][column] = "[ ]";
            }
        }
        this.gameBoard=gameBoard;
    }
    public GameBoard(int NUMBER_OF_ROWS, int NUMBER_OF_COLUMNS, String player1, String player2 ) {//new game with same players game board.
        int row, column;
        String[][] gameBoard;
        for (row = 0, gameBoard = new String [NUMBER_OF_ROWS][NUMBER_OF_COLUMNS]; row < gameBoard.length; row++) {
            for (column = 0; column < gameBoard[row].length; column++) {
                gameBoard[row][column] = "[ ]";
            }
        }
        this.gameBoard=gameBoard;
        this.player1=player1;
        this.player2=player2;
    }
    public String getWinningMessage(){
        return WinningMessage;
    }
    public void quit(String name){
        if(name == player1){
            WinningMessage = "Game Over"+player2+"Won";
        } else {
            WinningMessage = "Game Over"+player1+"Won";
        }
        gameOver = true;
    }
    public void setPlayer(String player){
        if(this.player1==null){
            this.player1=player;
        }else if (this.player2==null) {
            this.player2=player;
        }
    }
    public boolean readyToStart(){
           if(this.player1==null){
            return false;
        }else if (this.player2==null){
            return false;
        } else{
            return true;
        }
    }
    public boolean nameMatches(String name){
        if(player1==null){
            return false;
        }
        if(name.matches(player1)){
            return true;
        }
        else 
            return false;
    }
    public String startGame(){
        if(readyToStart()){
        this.turn=player1;
        return convertBoardToString();
        }   else{
            return "Waiting on other player";
        }
    }
    private String convertBoardToString(){
        String result="";
         for (int row = 0; row < gameBoard.length; row++) {
            for (int column = 0; column < gameBoard[row].length; column++) {
              result += gameBoard[row][column]+"\t";
            }
            result += "\n";
        }
         return result;
    }
    
    public String updateGame(){
        return convertBoardToString();
    }
    public boolean turn(String Name){
        if (Name.matches(this.turn)){
            return true;
        } else 
            return false;
    }
    private void changeTurn(){
        if (turn ==  player1){
            turn = player2;
        } else if (turn == player2) {
            turn = player1;
        }
    }
    public boolean getGameOver(){
        return gameOver;
    }
    
    public String dropPiece (int column) {//Drops game piece into selected column.
        int row;
        outerLoop:
        for (row = gameBoard.length - 1; row >= -1; row--) {
            if (row < 0) {//If chosen column is full, asks for a different column.
                return convertBoardToString() + "\n"+"Selected Column is full please select another column";
            }
            if (gameBoard[row][column].equals("[ ]")) {//Drops game piece into next available row of the selected column.
                if (player1 == turn) {
                    gameBoard[row][column] = "[" + player1Icon + "]";
                    changeTurn();
                    break outerLoop;
                }
                else if (player2 == turn) {
                    gameBoard[row][column] = "[" + player2Icon + "]";
                    changeTurn();
                    break outerLoop;
                }
            }
        }
        return convertBoardToString();
    }
    public void checkForWin () {//Checks game board for winning conditions.
        int row, column, player1MaximumChain, player2MaximumChain, diagonalStartPoint, player1Wins, player2Wins, columnNumber, fullColumns;

        horizontalOuterLoop://Scanning in lines from left to right, checks game board for horizontal chains. Starts checking at top-left and stops checking at bottom-left.
        for (row = 0, player1MaximumChain = 1, player2MaximumChain = 1; row < gameBoard.length; row++) {
            for (column = 0; column < gameBoard[row].length - 1; column++){
                if (gameBoard[row][column].equals("[" + player1Icon + "]") && gameBoard[row][column + 1].equals("[" + player1Icon + "]")) {
                    player1MaximumChain++;
                    if (player1MaximumChain >= MINIMUM_CHAIN_TO_WIN) {//Checks if Player 1 won horizontally.
                        WinningMessage = "\n"+player1+" won horizontally!";
                        gameOver = true;
                        break horizontalOuterLoop;
                    }
                }
                else if (gameBoard[row][column].equals("[" + player2Icon + "]") && gameBoard[row][column + 1].equals("[" + player2Icon + "]")) {
                    player2MaximumChain++;
                    if (player2MaximumChain >= MINIMUM_CHAIN_TO_WIN) {//Checks if Player 2 won horizontally.
                        WinningMessage = "\n"+player2+" won horizontally!";
                        gameOver = true;
                        break horizontalOuterLoop;
                    }
                } else {
                    player1MaximumChain = 1;
                    player2MaximumChain = 1;
                }
            }
            player1MaximumChain = 1;
            player2MaximumChain = 1;
        }
        verticalOuterLoop://Scanning in lines from top to bottom, checks game board for vertical chains. Starts checking at top-left and stops checking at top-right.
        for (row = 0, column = 0, player1MaximumChain = 1, player2MaximumChain = 1; column < gameBoard[row].length; column++) {
            for (row = 0; row < gameBoard.length - 1; row++){
                if (gameBoard[row][column].equals("[" + player1Icon + "]") && gameBoard[row + 1][column].equals("[" + player1Icon + "]")) {
                    player1MaximumChain++;
                    if (player1MaximumChain >= MINIMUM_CHAIN_TO_WIN) {//Checks if Player 1 won vertically.
                        WinningMessage = "\n"+player1+" won vertically!";
                        gameOver = true;
                        break verticalOuterLoop;
                    }
                }
                else if (gameBoard[row][column].equals("[" + player2Icon + "]") && gameBoard[row + 1][column].equals("[" + player2Icon + "]")) {
                    player2MaximumChain++;
                    if (player2MaximumChain >= MINIMUM_CHAIN_TO_WIN) {//Checks if Player 2 won vertically.
                        WinningMessage = "\n"+player2+" won vertically!";
                        gameOver = true;
                        break verticalOuterLoop;
                    }
                }
                else {
                    player1MaximumChain = 1;
                    player2MaximumChain = 1;
                }
            }
            player1MaximumChain = 1;
            player2MaximumChain = 1;
        }
        diagonalDownRightOuterLoop1://Scanning in lines from top-left to bottom-right, checks game board for diagonal chains. Starts checking at bottom-left and stops checking at top-left.
        for (diagonalStartPoint = gameBoard.length - 2, player1MaximumChain = 1, player2MaximumChain = 1; diagonalStartPoint >= 0; diagonalStartPoint--) {
            for (row = diagonalStartPoint, column = 0; row < gameBoard.length - 1 && column < gameBoard[row].length - 1; row++, column++) {
                if (gameBoard[row][column].equals("[" + player1Icon + "]") && gameBoard[row + 1][column + 1].equals("[" + player1Icon + "]")) {
                    player1MaximumChain++;
                    if (player1MaximumChain >= MINIMUM_CHAIN_TO_WIN) {//Checks if Player 1 won diagonally.
                        WinningMessage = "\n"+player1+" won diagonally!";
                        gameOver = true;
                        break diagonalDownRightOuterLoop1;
                    }
                }
                else if (gameBoard[row][column].equals("[" + player2Icon + "]") && gameBoard[row + 1][column + 1].equals("[" + player2Icon + "]")) {
                    player2MaximumChain++;
                    if (player2MaximumChain >= MINIMUM_CHAIN_TO_WIN) {//Checks if Player 2 won diagonally.
                        WinningMessage = "\n"+player2+" won diagonally!";
                        gameOver = true;
                        break diagonalDownRightOuterLoop1;
                    }
                }
                else {
                    player1MaximumChain = 1;
                    player2MaximumChain = 1;
                }
            }
            player1MaximumChain = 1;
            player2MaximumChain = 1;
        }
        diagonalDownRightOuterLoop2://Scanning in lines from top-left to bottom-right, checks game board for diagonal chains. Starts checking at top-left and stops checking at top-right.
        for (diagonalStartPoint = 1, player1MaximumChain = 1, player2MaximumChain = 1; diagonalStartPoint < gameBoard[0].length - 1; diagonalStartPoint++) {
            for (row = 0, column = diagonalStartPoint; row < gameBoard.length - 1 && column < gameBoard[row].length - 1; row++, column++) {
                if (gameBoard[row][column].equals("[" + player1Icon + "]") && gameBoard[row + 1][column + 1].equals("[" + player1Icon + "]")) {
                    player1MaximumChain++;
                    if (player1MaximumChain >= MINIMUM_CHAIN_TO_WIN) {//Checks if Player 1 won diagonally.
                        WinningMessage = "\n"+player1+" won diagonally!";
                        gameOver = true;
                        break diagonalDownRightOuterLoop2;
                    }
                }
                else if (gameBoard[row][column].equals("[" + player2Icon + "]") && gameBoard[row + 1][column + 1].equals("[" + player2Icon + "]")) {
                    player2MaximumChain++;
                    if (player2MaximumChain >= MINIMUM_CHAIN_TO_WIN) {//Checks if Player 2 won diagonally.
                        WinningMessage = "\n"+player2+" won diagonally!";
                        gameOver = true;
                        break diagonalDownRightOuterLoop2;
                    }
                }
                else {
                    player1MaximumChain = 1;
                    player2MaximumChain = 1;
                }
            }
            player1MaximumChain = 1;
            player2MaximumChain = 1;
        }
        diagonalDownLeftOuterLoop1://Scanning in lines from top-right to bottom-left, checks game board for diagonal chains. Starts checking at bottom-right and stops checking at top-right.
        for (diagonalStartPoint = gameBoard.length - 2, player1MaximumChain = 1, player2MaximumChain = 1; diagonalStartPoint >= 0; diagonalStartPoint--) {
            for (row = diagonalStartPoint, column = gameBoard[row].length - 1; row < gameBoard.length - 1 && column > 0; row++, column--) {
                if (gameBoard[row][column].equals("[" + player1Icon + "]") && gameBoard[row + 1][column - 1].equals("[" + player1Icon + "]")) {
                    player1MaximumChain++;
                    if (player1MaximumChain >= MINIMUM_CHAIN_TO_WIN) {//Checks if Player 1 won diagonally.
                        WinningMessage = "\n"+player1+" won diagonally!";
                        gameOver = true;
                        break diagonalDownLeftOuterLoop1;
                    }
                }
                else if (gameBoard[row][column].equals("[" + player2Icon + "]") && gameBoard[row + 1][column - 1].equals("[" + player2Icon + "]")) {
                    player2MaximumChain++;
                    if (player2MaximumChain >= MINIMUM_CHAIN_TO_WIN) {//Checks if Player 2 won diagonally.
                        WinningMessage = "\n"+player2+" won diagonally!";
                        gameOver = true;
                        break diagonalDownLeftOuterLoop1;
                    }
                }
                else {
                    player1MaximumChain = 1;
                    player2MaximumChain = 1;
                }
            }
            player1MaximumChain = 1;
            player2MaximumChain = 1;
        }
        diagonalDownLeftOuterLoop2://Scanning in lines from top-right to bottom-left, checks game board for diagonal chains. Starts checking at top-right and stops checking at top-left.
        for (diagonalStartPoint = gameBoard[0].length - 2, player1MaximumChain = 1, player2MaximumChain = 1; diagonalStartPoint > 0; diagonalStartPoint--) {
            for (row = 0, column = diagonalStartPoint; row < gameBoard.length - 1 && column > 0; row++, column--) {
                if (gameBoard[row][column].equals("[" + player1Icon + "]") && gameBoard[row + 1][column - 1].equals("[" + player1Icon + "]")) {
                    player1MaximumChain++;
                    if (player1MaximumChain >= MINIMUM_CHAIN_TO_WIN) {//Checks if Player 1 won diagonally.
                        WinningMessage = "\n"+player1+" won diagonally!";
                        gameOver = true;
                        break diagonalDownLeftOuterLoop2;
                    }
                }
                else if (gameBoard[row][column].equals("[" + player2Icon + "]") && gameBoard[row + 1][column - 1].equals("[" + player2Icon + "]")) {
                    player2MaximumChain++;
                    if (player2MaximumChain >= MINIMUM_CHAIN_TO_WIN) {//Checks if Player 2 won diagonally.
                        WinningMessage = "\n"+player2+" won diagonally!";
                        gameOver = true;
                        break diagonalDownLeftOuterLoop2;
                    }
                }
                else {
                    player1MaximumChain= 1;
                    player2MaximumChain = 1;
                }
            }
            player1MaximumChain = 1;
            player2MaximumChain = 1;
        }
        for (columnNumber = 0, fullColumns = 0; gameOver != true && columnNumber < NUMBER_OF_COLUMNS; columnNumber++) {//If the game board is full but neither player has won, the game is drawn.
            if (!gameBoard[0][columnNumber].equals("[ ]")) {
                fullColumns++;
                if (fullColumns >= NUMBER_OF_COLUMNS) {
                    gameOver = true;
                    WinningMessage = "\nPlayer 1 and Player 2 drew the game!";
                    
                }
            }
        }
    }
}
