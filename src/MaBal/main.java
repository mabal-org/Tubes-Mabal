package MaBal;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    	CountWords countwords = new CountWords();
    	TextSpecification textspec = new TextSpecification();
    	
        Menu start = new Menu();
        
		start.mainMenu(countwords, textspec);
    }
}
