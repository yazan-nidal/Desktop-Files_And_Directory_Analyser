package files_and_directory_analyser;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Files_And_Directory_Analyser {


    public static void main(String[] args) {
        
         new GUI(). addWindowListener(new WindowAdapter()       
         {   
         @Override
        public void windowClosed(WindowEvent we) {
        System.exit(0); }
         }    
         );
        
    }
    
}
