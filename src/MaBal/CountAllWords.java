package MaBal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class CountAllWords {
	
	public CountAllWords() throws FileNotFoundException, IOException {
		File file = new File("D:\\Tubes-Mabal\\test.txt");
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line; 
			  
			// Initializing counters 

			int countAllWords = 0; 
			// Reading line by line from the  
			// file until a null is returned 
			
			while((line = reader.readLine()) != null) { //Read the content of the file, using the following while loop 
			    if(line.equals("")) 
			    { 
			        
			    } else { 
			        // \\s+ is the space delimiter in java 
			        String[] wordList = line.split("\\s+"); 
			          
			        countAllWords += wordList.length;

			    } 
			} 
			System.out.println("Total words count = " + countAllWords); 
		
		} 
    }
}
