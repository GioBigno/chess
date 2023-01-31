/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import java.awt.Image;

/**
 *
 * @author bigno
 */
public class King extends Piece{
    
    public King(int xp, int yp, boolean isWhite, Image img){
        super(xp, yp, isWhite, img);
    }
    
    public boolean isLegit(int oldXp, int oldYp, int xp, int yp){
        
        if(xp == this.xp && yp == this.yp)
            return false;
        
        //fuori dalla scacchiera
        if(xp < 0 || xp > 7 || yp < 0 || yp > 7)
            return false;
        
        //avanti di uno
        if((oldXp == xp || oldXp == xp+1 || oldXp == xp-1) && (oldYp == yp || oldYp == yp+1 || oldYp == yp-1) && (pieces[yp][xp] == null || pieces[yp][xp].isWhite != isWhite))
            return true;
         
        return false;
    }
            
    public void move(int xp, int yp) {
        
        int oldXp = this.xp;
        int oldYp = this.yp; 
        
        
        System.out.println("oldXp: " + oldXp +" oldYp: " + oldYp);
        System.out.println("xp: " + xp + " yp: " + yp);
        
        if(isLegit(oldXp, oldYp, xp, yp)){
            
            //se c'è qualcosa lo mangio
            if(pieces[yp][xp] != null && pieces[yp][xp].isWhite != isWhite)
                pieces[yp][xp].kill();
            
            go(oldXp, oldYp, xp, yp);
            
            ChessBoard.send("m"+oldXp+oldYp+xp+yp);
            
        }else{
            
            x = oldXp*64;
            y = oldYp*64;
        }    
                
                
        //è sotto scacco
        //TODO
        
        //promozione 
        //TODO
        
    }
    
    
    
}
