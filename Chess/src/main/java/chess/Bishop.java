/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import static chess.ChessBoard.pieces;
import java.awt.Image;

/**
 *
 * @author bigno
 */
public class Bishop extends Piece{
    
    public Bishop(int xp, int yp, boolean isWhite, Image img){
        super(xp, yp, isWhite, img);
    }
    
    public void move(int xp, int yp) {
        
        int oldXp = this.xp;
        int oldYp = this.yp;
        
        if(xp < 0 || xp > 7 || yp < 0 || yp > 7){
               x = this.xp*64;
               y = this.yp*64;
               return;
        }
        
        //se tramite una mossa legit vado su un pezzo avversario lo mangio
        if(pieces[yp][xp] != null){
            
            if(pieces[yp][xp].isWhite != isWhite){
                pieces[yp][xp].kill();
            }else{
                x = oldXp*64;
                y = oldYp*64;
               return;
            }      
        }
        
        
        pieces[this.yp][this.xp] = null;     
        this.xp = xp;
        this.yp = yp;
        x = xp*64;
        y = yp*64;
        pieces[this.yp][this.xp] = this;
        
        
    }
    
    
    
}
