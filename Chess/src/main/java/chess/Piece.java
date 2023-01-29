package chess;

import java.awt.Image;
import java.util.ArrayList;


public class Piece {
    
    public static Piece[][] pieces;
    
    //position on the board
    public int xp; 
    public int yp;
    //position on the screen
    public int x;
    public int y;
    public boolean isWhite;
    public Image img;

    public Piece(int xp, int yp, boolean isWhite, Image img) {
        this.xp = xp;
        this.yp = yp;
        x = xp*64;
        y = yp*64;
        this.isWhite = isWhite;
        this.img = img;
    }
    
    public void move(int xp, int yp){}
    
    public void kill(){
        pieces[yp][xp] = null;
        System.out.println("kill " + xp + " " + yp);
    }
    
}

