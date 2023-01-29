
package chess;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ChessBoard extends JPanel{
    
    //public static ArrayList<Piece> pieces = new ArrayList<Piece>();
    public static Piece[][] pieces = new Piece[8][8];
    
    public ChessBoard() throws IOException{
        
        BufferedImage all = ImageIO.read(new File(ChessBoard.class.getResource("../images/chess.png").getFile()));
        Image imgs[] = new Image[12];
        int index = 0;
        for(int y=0; y<400; y+=200){
            for(int x=0; x<1200; x+=200){
                imgs[index] = all.getSubimage(x, y, 200, 200).getScaledInstance(64, 64, BufferedImage.SCALE_SMOOTH);
                index++;
            }
        }
        
        Piece.pieces = pieces;
        
        pieces[0][0] = new Rook(0, 0, false, imgs[10]);
        pieces[0][1] = new Knight(1, 0, false, imgs[9]);
        pieces[0][2] = new Bishop(2, 0, false, imgs[8]);
        pieces[0][3] = new Queen(3, 0, false, imgs[7]);
        pieces[0][4] = new King(4, 0, false, imgs[6]);
        pieces[0][5] = new Bishop(5, 0, false, imgs[8]);
        pieces[0][6] = new Knight(6, 0, false, imgs[9]);
        pieces[0][7] = new Rook(7, 0, false, imgs[10]);
        pieces[1][0] = new Pawn(0, 1, false, imgs[11]);
        pieces[1][1] = new Pawn(1, 1, false, imgs[11]);
        pieces[1][2] = new Pawn(2, 1, false, imgs[11]);
        pieces[1][3] = new Pawn(3, 1, false, imgs[11]);
        pieces[1][4] = new Pawn(4, 1, false, imgs[11]);
        pieces[1][5] = new Pawn(5, 1, false, imgs[11]);
        pieces[1][6] = new Pawn(6, 1, false, imgs[11]);
        pieces[1][7] = new Pawn(7, 1, false, imgs[11]);
        
        pieces[7][0] = new Rook(0, 7, true, imgs[4]);
        pieces[7][1] = new Knight(1, 7, true, imgs[3]);
        pieces[7][2] = new Bishop(2, 7, true, imgs[2]);
        pieces[7][3] = new Queen(3, 7, true, imgs[1]);
        pieces[7][4] = new King(4, 7, true, imgs[0]);
        pieces[7][5] = new Bishop(5, 7, true, imgs[2]);
        pieces[7][6] = new Knight(6, 7, true, imgs[3]);
        pieces[7][7] = new Rook(7, 7, true, imgs[4]);
        pieces[6][0] = new Pawn(0, 6, true, imgs[5]);
        pieces[6][1] = new Pawn(1, 6, true, imgs[5]);
        pieces[6][2] = new Pawn(2, 6, true, imgs[5]);
        pieces[6][3] = new Pawn(3, 6, true, imgs[5]);
        pieces[6][4] = new Pawn(4, 6, true, imgs[5]);
        pieces[6][5] = new Pawn(5, 6, true, imgs[5]);
        pieces[6][6] = new Pawn(6, 6, true, imgs[5]);
        pieces[6][7] = new Pawn(7, 6, true, imgs[5]);
        
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
        
        
        for(Piece[] row : pieces){
            for(Piece p: row){
                if(p != null){
                    System.out.print("x ");
                    g.drawImage(p.img, p.x, p.y, this);
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
        
        System.out.println("fine");
           
    }
    
    public static Piece getPiece(int x, int y){
        
       for(Piece[] row : pieces){
            for(Piece p: row){
                if(p != null){
                    if(x/64 == p.xp && (y-40)/64 == p.yp){
                        return p;
                    }
                }
            }
       }
        return null;
    }
    
}
