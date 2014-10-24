package Stage;


import Tile.Board;
import Tile.Player;
import java.awt.Point;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i13029
 */
public class Stage1 extends Board {
    
    private Player player;
    
    /**
     * 
     */
    public Stage1(String name){
        player = new Player(name);
        this.chipsNeeded = 3;
        setMap();
    }

    /**
     * 
     */
    @Override
    public void setMap() {
        for(int i=0;i<mapBoard.length;i++){
            for(int j=0;j<mapBoard[i].length;i++){
                
            }
        }
    }

    @Override
    public void move(Point newPosition) {
        if (mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].canStep()==true){
            if(mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].isDanger()==true){
                player.setLife(false);
            }
        }else{
            
        }
    }
    

}
