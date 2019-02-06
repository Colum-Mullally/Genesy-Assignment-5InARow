/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5inarowclient;

import SoapConnector.WebserviceAPI;
import static java.lang.Thread.sleep;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Colum
 */
class GameThread extends Thread {
    private WebserviceAPI FiveInARow;
    GameThread(WebserviceAPI webserviceAPI) {
        FiveInARow=webserviceAPI;
    }
    public void run(){
        Scanner in= new Scanner(System.in);
        boolean sameName=true;
        String name = " ";
        while(sameName){
            System.out.println("Enter Displayname");
            name = in.nextLine();
            sameName = FiveInARow.nameCheck(name);
            if(sameName){
                System.out.println("Name is already taken please select another");
            }
        }
        boolean quit = false;
        
        String result = null;
        result =FiveInARow.join(name);
        System.out.println(result);
        System.out.println("Enter q at any Time to quit the game and end the program");
        quitLoop:
        while(!FiveInARow.getGameOver()||!quit){
            while(FiveInARow.readyToStart()&&FiveInARow.turn(name)){
                    FiveInARow.updateBoard();
                    if(FiveInARow.getGameOver()){
                        break quitLoop;
                    }
                    System.out.println(FiveInARow.updateBoard());
                    System.out.println("Enter Selection between 1-9");
                    System.out.println("Enter q to quit the game and end the program");
                    String input=in.nextLine();
                    if(input.matches("[1-9]")){
                    System.out.println(FiveInARow.dropPiece(Integer.parseInt(input)-1));
                    }
                    else if(input.matches("q")){
                        quit=true;
                        FiveInARow.quit(name);
                      break quitLoop;
                    }
                }
                if (FiveInARow.getGameOver()){
                    break quitLoop;
                }
            }
            System.out.println(FiveInARow.updateBoard());
            if(FiveInARow.turn(name)){
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
            }
               FiveInARow.restart(); 
            }
    }
}