package gumpsboxofchocolates;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GumpsBoxOfChocolates {
    public static void main(String[] args) {    
        System.out.println("Hello " + (Math.floor(Math.random()*2)<1?"Steven":"Στέλιος"));
        int x=0;int y=0;int GRID_DIM=5;
        do {System.out.println("row="+y+",col="+x);} while ((++x>GRID_DIM?x=(++y>GRID_DIM?x:0):x)<=GRID_DIM);
        if(Sanity.check()){System.out.println("true is true");}else{try {throw new AnyException();}catch(AnyException ex){System.err.print(ex.getStackTrace());};}
    }
}


