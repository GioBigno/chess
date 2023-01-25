
package chess;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JPanel;

public class ChessBoard extends JPanel{
    
    private ArrayList<Piece> pieces;
    private Image imgs[];
    
    public ChessBoard(ArrayList<Piece> pieces, Image imgs[]) {
        this.pieces = pieces;
        this.imgs = imgs;
    }
    
    
    
    public void paint(Graphics g){
        
        for(int y=0; y<8; y++){
            for(int x=0; x<8; x++){
                
                if(y%2 == x%2){
                    g.setColor(new Color(255, 235, 166));
                }else{
                    g.setColor(new Color(178, 143, 27));
                }
                   
                g.fillRect(x*64, y*64, 64, 64);
                
            }
        }
        
        
        for(Piece p: pieces){
            int index=0;
            if(p.name.equals("king")){
                index = 0;
            }
            if(p.name.equals("queen")){
                index = 1;
            }
            if(p.name.equals("bishop")){
                index = 2;
            }
            if(p.name.equals("knight")){
                index = 3;
            }
            if(p.name.equals("rook")){
                index = 4;
            }
            if(p.name.equals("pawn")){
                index = 5;
            }
            if(!p.isWhite){
                index += 6;
            }
            
            System.out.println("draw " + p.name + " at index " + index);
            
            g.drawImage(imgs[index], p.x*64, p.y*64, this);
        }
           
    }
    
}
