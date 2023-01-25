/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Finestra extends JFrame implements ActionListener {

    private JPanel pannello;
    
    public Finestra() throws IOException{
       
        setBounds(10, 10, 560, 560);
                
        
        ArrayList<Piece> pieces = new ArrayList<Piece>();
        
        
        
        BufferedImage all = ImageIO.read(new File(Finestra.class.getResource("../images/chess.png").getFile()));
        Image imgs[] = new Image[12];
        int index = 0;
        for(int y=0; y<400; y+=200){
            for(int x=0; x<1200; x+=200){
                imgs[index] = all.getSubimage(x, y, 200, 200).getScaledInstance(64, 64, BufferedImage.SCALE_SMOOTH);
                index++;
            }
        }
        
        
        
        Piece brook=new Piece(0, 0, false, "rook", pieces);
        Piece bkinght=new Piece(1, 0, false, "knight", pieces);
        Piece bbishop=new Piece(2, 0, false, "bishop", pieces);
        Piece bqueen=new Piece(3, 0, false, "queen", pieces);
        Piece bking=new Piece(4, 0, false, "king", pieces);
        Piece bbishop2=new Piece(5, 0, false, "bishop", pieces);
        Piece bkight2=new Piece(6, 0, false, "knight", pieces);
        Piece brook2=new Piece(7, 0, false, "rook", pieces);
        Piece bpawn1=new Piece(1, 1, false, "pawn", pieces);
        Piece bpawn2=new Piece(2, 1, false, "pawn", pieces);
        Piece bpawn3=new Piece(3, 1, false, "pawn", pieces);
        Piece bpawn4=new Piece(4, 1, false, "pawn", pieces);
        Piece bpawn5=new Piece(5, 1, false, "pawn", pieces);
        Piece bpawn6=new Piece(6, 1, false, "pawn", pieces);
        Piece bpawn7=new Piece(7, 1, false, "pawn", pieces);
        Piece bpawn8=new Piece(0, 1, false, "pawn", pieces);
        
        Piece wrook=new Piece(0, 7, true, "rook", pieces);
        Piece wkinght=new Piece(1, 7, true, "knight", pieces);
        Piece wbishop=new Piece(2, 7, true, "bishop", pieces);
        Piece wqueen=new Piece(3, 7, true, "queen", pieces);
        Piece wking=new Piece(4, 7, true, "king", pieces);
        Piece wbishop2=new Piece(5, 7, true, "bishop", pieces);
        Piece wkight2=new Piece(6, 7, true, "knight", pieces);
        Piece wrook2=new Piece(7, 7, true, "rook", pieces);
        Piece wpawn1=new Piece(1, 6, true, "pawn", pieces);
        Piece wpawn2=new Piece(2, 6, true, "pawn", pieces);
        Piece wpawn3=new Piece(3, 6, true, "pawn", pieces);
        Piece wpawn4=new Piece(4, 6, true, "pawn", pieces);
        Piece wpawn5=new Piece(5, 6, true, "pawn", pieces);
        Piece wpawn6=new Piece(6, 6, true, "pawn", pieces);
        Piece wpawn7=new Piece(7, 6, true, "pawn", pieces);
        Piece wpawn8=new Piece(0, 6, true, "pawn", pieces);
        
        
        
        ChessBoard chessBoard = new ChessBoard(pieces, imgs);
       
        add(chessBoard);  
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        
      
        
    }
    
}