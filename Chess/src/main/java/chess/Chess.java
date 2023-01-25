package chess;

import java.io.IOException;

/**
 *
 *  
 * @author bignosoft
 * 
 */
public class Chess {

    public static void main(String[] args) throws IOException{
        System.out.println("Hello World!");
        
        Finestra f = new Finestra();
        f.setTitle("Bignosoft chess");
        f.setVisible(true);         
    }
}
