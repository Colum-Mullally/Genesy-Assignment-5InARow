/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoapConnector;

import webservice.WebService5InARow;
import webservice.WebService5InARow_Service;

/**
 *
 * @author Colum
 */
public class WebserviceAPI {
        static WebService5InARow_Service web;
       
        private WebService5InARow port;
    public WebserviceAPI(){
        web = new WebService5InARow_Service();
        port = web.getWebService5InARowPort();
   }
   public String dropPiece(int column){
       return port.dropPiece(column);
   }
   
   public String join(String name){
       return port.join(name);
   }
      
   public String updateBoard(){
       return port.upadteBoard();
   }
   
   public boolean turn(String name){
       return port.turn(name);
   }
   public boolean readyToStart(){
       return port.readyToStart();
   }
   public boolean getGameOver(){
       return port.gameOver();
   }
   public void restart(){
       port.resetServer();
   }
   public void quit(String name){
       port.quit(name);
   }
   public boolean nameCheck(String name){
    return port.nameCheck(name);
   }
    
}
