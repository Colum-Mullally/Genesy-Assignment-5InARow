/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Colum
 */
@WebService(serviceName = "WebService5InARow")
public class WebService5InARow {
    private GameBoard gameBoard =new GameBoard(6,9);

    /**
     * This is a sample web service operation
     */
     @WebMethod(operationName = "turn")
    public boolean turn(@WebParam(name = "name") String name) {
       return gameBoard.turn(name);
    }
    
       @WebMethod(operationName = "readyToStart")
    public boolean readyToStart() {
       return gameBoard.readyToStart();
    }
    
           @WebMethod(operationName = "gameOver")
    public boolean gameOver() {
       return gameBoard.getGameOver();
    }
    
    @WebMethod(operationName = "join")
    public String join(@WebParam(name = "name") String name) {
       gameBoard.setPlayer(name);
       return gameBoard.startGame();
    }
    
    @WebMethod(operationName = "upadteBoard")
    public String upadteBoard(){
        gameBoard.checkForWin();
        if(!gameBoard.getGameOver()){
        return gameBoard.updateGame();
        }
        else
        return gameBoard.getWinningMessage();
    }
    @WebMethod(operationName = "dropPiece")
    public String dropPiece(@WebParam(name = "column") int column){
        gameBoard.checkForWin();
        if(!gameBoard.getGameOver()){
        
            return gameBoard.dropPiece(column);
        }
        else
        return gameBoard.getWinningMessage();
    }
    @WebMethod(operationName = "resetServer")
    public void resetServer(){
        gameBoard =new GameBoard(6,9);
    }
    @WebMethod(operationName = "quit")
    public void quit(@WebParam(name = "name") String name) {
       gameBoard.quit(name);
    }
    @WebMethod(operationName = "nameCheck")
    public boolean nameCheck(@WebParam(name = "name") String name) {
       return gameBoard.nameMatches(name);
    }
}
