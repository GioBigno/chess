/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author bigno
 */
public class Pawn extends Piece{
    
    private boolean firstMove = true;
    
    public Pawn(int xp, int yp, boolean isWhite, Image img){
        super(xp, yp, isWhite, img);
    }
    
    public void move(int xp, int yp) {
        
        int oldXp = this.xp;
        int oldYp = this.yp;
        
        //fuori dalla scacchiera
        if(xp < 0 || xp > 7 || yp < 0 || yp > 7){
               x = oldXp*64;
               y = oldYp*64;
               return;
        }
        
        boolean legit = true;
        
        //è legit?
            
            System.out.println("oldXp: " + oldXp +" oldYp: " + oldYp);
            System.out.println("xp: " + xp + " yp: " + yp);
        
            //avanti di uno
            if(oldXp == xp && oldYp == yp+1 && pieces[yp][xp] == null){
                legit = true;
            }
            
            //avanti di due
            else if(oldXp == xp && oldYp == yp+2 && firstMove == true && pieces[yp][xp] == null){
                legit = true;
            }
            
            //cattura in diagonale
            else if((oldXp == xp+1 || oldXp == xp-1) && oldYp == yp+1 && pieces[yp][xp] != null && pieces[yp][xp].isWhite != isWhite){
                pieces[yp][xp].kill();
                legit = true;
            }
            
            else{
                legit = false;
            }
            
        //è sotto scacco
        //TODO
        
        //promozione 
        //TODO
        
            
        if(legit == false){
            x = oldXp*64;
            y = oldYp*64;
            return;
        }
        
        
        firstMove = false;
 
        //aggiorno la posizione del pezzo nella matrice
        pieces[oldYp][oldXp] = null;
        this.xp = xp;
        this.yp = yp;
        x = xp*64;
        y = yp*64;
        pieces[this.yp][this.xp] = this;
        
    }
    
    
    
}
