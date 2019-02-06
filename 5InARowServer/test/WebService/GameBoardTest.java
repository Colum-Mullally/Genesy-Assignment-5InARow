/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Colum
 */
public class GameBoardTest {
    
    public GameBoardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setPlayer method, of class GameBoard.
     */
    @Test
    public void Joiner() {
        System.out.println("setPlayer");
        String player1 = "player1";
        GameBoard instance = new GameBoard(6,9);
        instance.setPlayer(player1);
        String expResult = "Waiting on other player";
        String result = instance.startGame();
       
        assertEquals(expResult, result);
        
        String player2 = "player2";
        instance.setPlayer(player2);
        expResult = "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "It is "+player1+"'s turn\n";
        result = instance.startGame();
        assertEquals(expResult, result);
    }
    @Test
        public void checkName() {
        System.out.println("checkPlayer");
        String player1 = "player1";
        GameBoard instance = new GameBoard(6,9);
        System.out.println(instance.nameMatches(player1));
        instance.setPlayer(player1);
        System.out.println(instance.nameMatches(player1));
        instance.setPlayer(player1);
        String expResult = "Waiting on other player";
        String result = instance.startGame();
       

        expResult = "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "It is "+player1+"'s turn\n";
    
        result = instance.startGame();
        assertEquals(expResult, result);
    }
    /**
     * Test of readyToStart method, of class GameBoard.
     */
    @Test
    public void testReadyToStart() {
        System.out.println("readyToStart");
        GameBoard instance = new GameBoard(6,9);
        boolean expResult = false;
        boolean result = instance.readyToStart();
        assertEquals(expResult, result);
        
        instance.setPlayer("player1");
        result = instance.readyToStart();
        assertEquals(expResult, result);
        
        instance.setPlayer("player2");
        expResult=true;
        result = instance.readyToStart();
        assertEquals(expResult, result);
    }

    

    /**
     * Test of updateGame method, of class GameBoard.
     */
    @Test
    public void testUpdateGame() {
        System.out.println("updateGame");
        GameBoard instance = new GameBoard(6,9);
        String result = instance.updateGame();
        String expResult = "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n"+
                    "It is "+null+"'s turn\n";
        assertEquals(expResult, result);
        String player1 = "player1";
        String player2 = "player2";
        instance.setPlayer(player1);
        instance.setPlayer(player2);
        instance.startGame();
        System.out.println(instance.dropPiece(0));
        expResult = "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n"+
                    "It is "+player2+"'s turn\n";
        result = instance.updateGame();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
        expResult = "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[O]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n"+
                    "It is "+player1+"'s turn\n";
        result = instance.updateGame();
        System.out.println(result);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of turn method, of class GameBoard.
     */
    @Test
    public void testTurn() {
        System.out.println("turn");
        GameBoard instance = new GameBoard(6,9);
        String player1 = "player1";
        String player2 = "player2";
        instance.setPlayer(player1);
        instance.setPlayer(player2);
        instance.startGame();
        boolean expResult = true;
        boolean result = instance.turn(player1);
        assertEquals(expResult, result);
        
        expResult = false;
        result = instance.turn(player2);
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
        expResult = false;
        result = instance.turn(player1);
        assertEquals(expResult, result);
        
         expResult = true;
        result = instance.turn(player2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getGameOver method, of class GameBoard.
     */
    @Test
    public void testGetGameOver() {
        System.out.println("getGameOver");
        GameBoard instance = new GameBoard(6,9);
        String player1 = "player1";
        String player2 = "player2";
        instance.setPlayer(player1);
        instance.setPlayer(player2);
        instance.startGame();
        boolean expResult = false;
        boolean result = instance.getGameOver();
        // vertical Win player 1
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
        expResult = true;
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        // vertical win player 2
        instance=new GameBoard(5,9);
        instance.setPlayer(player1);
        instance.setPlayer(player2);
        instance.startGame();
        expResult = false;
        System.out.println(instance.dropPiece(0));
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(2));
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
        expResult = true;
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        //horizontal win player 1
        instance=new GameBoard(5,9);
        instance.setPlayer(player1);
        instance.setPlayer(player2);
        instance.startGame();
        expResult = false;
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(2));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(3));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(4));
        expResult = true;
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        // horizontal win player 2
        instance=new GameBoard(5,9);
        instance.setPlayer(player1);
        instance.setPlayer(player2);
        instance.startGame();
        expResult = false;
        System.out.println(instance.dropPiece(8));
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(2));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(3));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(2));
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(4));
        expResult = true;
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        //diagnol win player 1
        instance=new GameBoard(5,9);
        instance.setPlayer(player1);
        instance.setPlayer(player2);
        instance.startGame();
        expResult = false;
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(2));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(4));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(2));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(2));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(3));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(3));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(3));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(3));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(4));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(4));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(4));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(4));
        expResult = true;
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        // diagnoal win player 2
        instance=new GameBoard(5,9);
        instance.setPlayer(player1);
        instance.setPlayer(player2);
        instance.startGame();
        expResult = false;
        System.out.println(instance.dropPiece(8));
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(0));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));//
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(1));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(2));//
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(2));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(3));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(2));
         instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(3));
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(3));
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(4));
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(3));
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(4));
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(4));
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(4));
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        System.out.println(instance.dropPiece(4));
        expResult = true;
        instance.checkForWin();
        result = instance.getGameOver();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of dropPiece method, of class GameBoard.
     */
    @Test
    public void testDropPiece() {
        int column = 0;
        GameBoard instance = new GameBoard(6,9);
        String player1 = "player1";
        String player2 = "player2";
        instance.setPlayer(player1);
        instance.setPlayer(player2);
        instance.startGame();
        String result =instance.dropPiece(column);
        String expResult = "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n"+
                    "It is "+player2+"'s turn\n";
        assertEquals(expResult, result);
        result =instance.dropPiece(column);
        expResult = "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[O]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n"+
                    "It is "+player1+"'s turn\n";
        assertEquals(expResult, result);
        result =instance.dropPiece(column);
        expResult = "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[O]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n"+
                    "It is "+player2+"'s turn\n";
        assertEquals(expResult, result);
        result =instance.dropPiece(column);
        expResult = "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[O]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[O]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n"+
                    "It is "+player1+"'s turn\n";
        assertEquals(expResult, result);
        result =instance.dropPiece(column);
        expResult = "[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[O]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[O]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n"+
                    "It is "+player2+"'s turn\n";
        assertEquals(expResult, result);
        result =instance.dropPiece(column);
        expResult = "[O]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[O]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[O]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n"+
                    "It is "+player1+"'s turn\n";
        assertEquals(expResult, result);
        result =instance.dropPiece(column);
                expResult = "[O]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[O]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[O]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "[X]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	[ ]	\n" +
                    "It is "+player1+"'s turn\n"+
                    "\nSelected Column is full please select another column";
         System.out.println(result);
        System.out.println(expResult);
        assertEquals(expResult, result);
    }
}
