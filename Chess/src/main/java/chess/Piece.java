package chess;

import java.util.ArrayList;


public class Piece {
    
    public int x;
    public int y;
    public boolean isWhite;
    private ArrayList<Piece> pieces;
    public String name;

    public Piece(int x, int y, boolean isWhite, String name, ArrayList<Piece> pieces) {
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
        this.name = name;
        pieces.add(this);
    }
    
    public void move(int xp, int yp){
        
        for(Piece p: pieces){
             
            if(p.x == x && p.y == y){
        //        p.kill();
            }
            
        }
        
        this.x = x;
        this.y = y;
        
    }
    
    public void kill(){
        pieces.remove(this);
    }
    
}
